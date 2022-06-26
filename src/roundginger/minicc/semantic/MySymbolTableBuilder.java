package roundginger.minicc.semantic;

import bit.minisys.minicc.parser.ast.*;

import java.util.*;

public class MySymbolTableBuilder implements ASTVisitor{
    Stack<String> errorStack;
    LinkedList<HashMap<String, HashMap<String,String>>> symbolTables;
    HashMap<String,HashMap<String,String>> currentScope;
    HashMap<String,String> curValue;

    String specifierTypeForDeclarator; // ��specifier��declarator֮�䴫���������ƣ������������ȫ�ֱ���
    boolean funcHasReturn; // �жϺ����Ƿ���return����ȫ�ֱ���
    boolean insideOfIteration; // �ж��Ƿ���ѭ�����ڲ���ȫ�ֱ���

    public MySymbolTableBuilder(Stack<String> errorStack){
        this.errorStack = errorStack;
        this.symbolTables = new LinkedList<>();

    }

    @Override
    public void visit(ASTCompilationUnit program) throws Exception {
        symbolTables.push(new HashMap<>()); //ѹ��ȫ�ַ��ű�
        for (ASTNode node : program.items) {
            if (node instanceof ASTFunctionDefine) {
                this.visit((ASTFunctionDefine) (node));
            } else if (node instanceof ASTDeclaration) {
                this.visit((ASTDeclaration) node);
            } else {
                errorStack.push("program's items should be Declaration or FunctionDefine");
            }
        }
    }

    @Override
    public void visit(ASTFunctionDefine functionDefine) throws Exception {
        currentScope = symbolTables.peek();
        //System.out.println(currentScope.toString());
        if (currentScope != symbolTables.getLast()){
            errorStack.push("function can only be defined global");
        }else {
            String funcName = functionDefine.declarator.getName();
            if (!currentScope.containsKey(funcName)){//ȫ�ַ��ű��в����ں�������
                HashMap<String,String> value = new HashMap<>();
                value.put("type","function");
                currentScope.put(funcName,value);
                // �ں�������ʱ���������Լ��ķ��ű�
                symbolTables.push(new HashMap<>());//push �� pop ���ű����ɶԳ���

                //�ڵ���declarator���visit����֮ǰ������д�������ͣ���specifier�л��
                specifierTypeForDeclarator = getSpecifiersType(functionDefine.specifiers);
                //visit declarator �ڵ㣬���º����ķ��ű�,��ʱ����ͨ��ȫ�ֱ���specifierTypeForDeclarator����
                this.visit(functionDefine.declarator);

                //��visit������body
                funcHasReturn = false; //���躯��û��return������������ʱ���ܷ��ҵ�return
                insideOfIteration = false; // �ڽ�����ʽ֮ǰ����break��־��ʼ��
                for (ASTNode node : functionDefine.body.blockItems) {
                    //ֻ�������ֿ��ܣ�declaration����statement
                    if(node instanceof ASTDeclaration){
                        visit((ASTDeclaration)node);
                    }else if(node instanceof ASTStatement){
                        visit((ASTStatement)node);
                    }
                }

                if(!funcHasReturn){
                    errorStack.push(String.format("ES08: function [%s] has no return!",funcName));
                }

                //push �� pop ���ű����ɶԳ���,�Ƴ���ǰ�����ķ��ű�
                symbolTables.pop();

            }else{//ȫ�ַ��ű��д��ں�������
                String type = currentScope.get(funcName).get("type");
                if (type.equals("function")){
                    errorStack.push(String.format("ES02:function [%s] defined again!",funcName));
                }
            }
        }
    }

    @Override
    public void visit(ASTDeclarator declarator) throws Exception {
        if(declarator instanceof ASTFunctionDeclarator){
            this.visit((ASTFunctionDeclarator) declarator);
        }else if (declarator instanceof ASTVariableDeclarator){
            this.visit((ASTVariableDeclarator)declarator);
        }
    }

    @Override
    public void visit(ASTFunctionDeclarator functionDeclarator) throws Exception {
        currentScope = symbolTables.peek();
        for (ASTParamsDeclarator item : functionDeclarator.params) {
            visit((item.declarator));
        }
    }

    @Override
    public void visit(ASTVariableDeclarator variableDeclarator) throws Exception {
        currentScope = symbolTables.peek();
        String varName = variableDeclarator.identifier.value;
        assert currentScope != null;
        if(!currentScope.containsKey(varName)){//����δ����
            curValue = new HashMap<>();
            curValue.put("type",specifierTypeForDeclarator);//��Ԥ�����úõ�ȫ�ֱ����л�ȡ����
            currentScope.put(varName,curValue);
        }else{//�����Ѿ��ڷ��ű��г���
            String type = currentScope.get(varName).get("type");
            if(type.equals(specifierTypeForDeclarator)){
                errorStack.push(String.format("ES02:variable [%s] defined again!",varName));
            }
        }
    }

    @Override
    public void visit(ASTFunctionCall funcCall) throws Exception {
        currentScope = symbolTables.peek();
        String funcName = ((ASTIdentifier)funcCall.funcname).value;
        if(!symbolTables.getLast().containsKey(funcName)){//symbolTables.getLast()��ȫ�ַ��ű�
            errorStack.push(String.format("ES01: function [%s] call before defination!",funcName));
        }else{//�����Ƿ��Ǻ��������Ƶļ�飬�������ò������ͼ���ƥ��
            //todo
        }
    }

    @Override
    public void visit(ASTDeclaration declaration) throws Exception {
        specifierTypeForDeclarator = getSpecifiersType(declaration.specifiers);//��ǰΪdeclarator��ס����
        for(ASTInitList list : declaration.initLists){
            visit(list);
        }

    }

    @Override
    public void visit(ASTArrayDeclarator arrayDeclarator) throws Exception {

    }


    @Override
    public void visit(ASTParamsDeclarator paramsDeclarator) throws Exception {

    }

    @Override
    public void visit(ASTArrayAccess arrayAccess) throws Exception {

    }

    @Override
    public void visit(ASTBinaryExpression binaryExpression) throws Exception {
        // op expr1 expr2
        visit(binaryExpression.expr1);
        visit(binaryExpression.expr2);
    }

    @Override
    public void visit(ASTBreakStatement breakStat) throws Exception {
        if(!insideOfIteration){
            errorStack.push("ES03: break statement must be in the loop");
        }
    }

    @Override
    public void visit(ASTContinueStatement continueStatement) throws Exception {

    }

    @Override
    public void visit(ASTCastExpression castExpression) throws Exception {

    }

    @Override
    public void visit(ASTCharConstant charConst) throws Exception {

    }

    @Override
    public void visit(ASTCompoundStatement compoundStat) throws Exception {
        symbolTables.push(new HashMap<>()); // ��Ҫ�ڽ���ʱpop
        for (ASTNode node : compoundStat.blockItems) {
            //ֻ�������ֿ��ܣ�declaration����statement
            if(node instanceof ASTDeclaration){
                visit((ASTDeclaration)node);
            }else if(node instanceof ASTStatement) {
                visit((ASTStatement)node);
            }
        }
        symbolTables.pop();
    }

    @Override
    public void visit(ASTConditionExpression conditionExpression) throws Exception {

    }

    @Override
    public void visit(ASTExpression expression) throws Exception {
        if(expression instanceof ASTBinaryExpression){
            visit((ASTBinaryExpression) expression);
        }else if(expression instanceof ASTIdentifier){
            visit((ASTIdentifier) expression);
        }else if(expression instanceof ASTFunctionCall){
            visit((ASTFunctionCall) expression);
        }
    }

    @Override
    public void visit(ASTExpressionStatement expressionStat) throws Exception {
        for(ASTExpression expr: expressionStat.exprs){
            visit(expr);
        }
    }

    @Override
    public void visit(ASTFloatConstant floatConst) throws Exception {

    }


    @Override
    public void visit(ASTGotoStatement gotoStat) throws Exception {

    }

    @Override
    public void visit(ASTIdentifier identifier) throws Exception {
        //�����ͱ��������ʱ�򶼲�������һ��visit��ֻ�е�������õ�ʱ��Ż��������֧
        //��ֻ�б������û�����һ֧���������õ�identifier��funcCall���Լ�������
        String varName = identifier.value;
        boolean find = false;
        Iterator<HashMap<String, HashMap<String, String>>> it = symbolTables.iterator();
        while(!find&&it.hasNext()){//��ǰ����������
            currentScope = it.next();
            if(currentScope.containsKey(varName)){
                find = true;
            }
        }
        if(!find){
            System.out.println(String.format("ES01: variable [%s] not defined",varName));
        }

    }

    @Override
    public void visit(ASTInitList initList) throws Exception {
        //InitList ���� ��������declarator�� �Լ� ���ʽ ��exprs�����ȴ�������ı��ʽ
        for(ASTExpression expr : initList.exprs){
            visit(expr);
        }
        visit(initList.declarator);

    }

    @Override
    public void visit(ASTIntegerConstant intConst) throws Exception {

    }

    @Override
    public void visit(ASTIterationDeclaredStatement iterationDeclaredStat) throws Exception {

    }

    @Override
    public void visit(ASTIterationStatement iterationStat) throws Exception {
        // (init, cond , step) stat , Ϊ���ж�break��λ�ã�ֻ��Ҫstat�򼴿�
        insideOfIteration = true; //��ʱ������ѭ����
        visit(iterationStat.stat);
        insideOfIteration = false; //��ʱ�˳���ѭ����
    }

    @Override
    public void visit(ASTLabeledStatement labeledStat) throws Exception {

    }

    @Override
    public void visit(ASTMemberAccess memberAccess) throws Exception {

    }

    @Override
    public void visit(ASTPostfixExpression postfixExpression) throws Exception {

    }

    @Override
    public void visit(ASTReturnStatement returnStat) throws Exception {
        funcHasReturn = true;
        //todo ����expr��ֵ
    }

    @Override
    public void visit(ASTSelectionStatement selectionStat) throws Exception {

    }

    @Override
    public void visit(ASTStringConstant stringConst) throws Exception {

    }

    @Override
    public void visit(ASTTypename typename) throws Exception {

    }

    @Override
    public void visit(ASTUnaryExpression unaryExpression) throws Exception {

    }

    @Override
    public void visit(ASTUnaryTypename unaryTypename) throws Exception {

    }


    @Override
    public void visit(ASTStatement statement) throws Exception {
        if(statement instanceof ASTReturnStatement){
            visit((ASTReturnStatement)statement);
        }else if (statement instanceof ASTIterationStatement){
            visit((ASTIterationStatement) statement);
        }else if(statement instanceof ASTBreakStatement){
            visit((ASTBreakStatement) statement);
        }else if (statement instanceof ASTCompoundStatement){
            visit((ASTCompoundStatement) statement);
        }else if (statement instanceof ASTExpressionStatement){
            visit((ASTExpressionStatement) statement);
        }
    }

    @Override
    public void visit(ASTToken token) throws Exception {

    }

    //������������һ���� �� public static int xxxx;���ֻ��Ҫ����specifiers�����һ����ֵ����
    String getSpecifiersType(List<ASTToken> specifiers){
        return specifiers.get(specifiers.size()-1).value;
    }
}

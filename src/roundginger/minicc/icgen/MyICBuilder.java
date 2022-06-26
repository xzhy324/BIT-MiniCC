package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.*;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyICBuilder implements ASTVisitor {
    private final Map<ASTNode, ASTNode> map;				// ʹ��map�洢�ӽڵ�ķ���ֵ��key��Ӧ�ӽڵ㣬value��Ӧ����ֵ��valueĿǰ������ASTIdentifier,ASTIntegerConstant,TemportaryValue...
    private final List<MyQuat> quats;						// ���ɵ���Ԫʽ�б�
    private Integer tmpId;							// ��ʱ�������
    private final LinkedList<HashMap<String, HashMap<String,String>>> symbolTables;   //���ű�

    private String specifierTypeForDeclarator;                                  // ��specifier��declarator֮�䴫���������ƣ������������ȫ�ֱ���
    private HashMap<String,String> value;                                       //��ʱ����
    private HashMap<String,HashMap<String,String>> scope;                       //��ʱ����

    public MyICBuilder(){
        map = new HashMap<>();
        quats = new LinkedList<>();
        tmpId = 0;
        symbolTables = new LinkedList<>();
    }

    public List<MyQuat> getQuats() {
        return quats;
    }

    //������������һ���� �� public static int var1;���ֻ��Ҫ����specifiers�����һ����ֵ����
    private String getSpecifiersType(List<ASTToken> specifiers){
        return specifiers.get(specifiers.size()-1).value;
    }

    @Override
    public void visit(ASTCompilationUnit program) throws Exception {
        symbolTables.push(new HashMap<>()); //ѹ��ȫ�ַ��ű�
        for (ASTNode node : program.items) {
            if (node instanceof ASTFunctionDefine) {
                this.visit((ASTFunctionDefine) (node));
            } else if (node instanceof ASTDeclaration) {
                this.visit((ASTDeclaration) node);
            }
        }
        symbolTables.pop();
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
    public void visit(ASTVariableDeclarator variableDeclarator) throws Exception {
        map.put(variableDeclarator,variableDeclarator.identifier);
    }

    @Override
    public void visit(ASTFunctionDeclarator functionDeclarator) throws Exception {
        //functionDeclarator���� declarator��int main�� �� params��int argc��char* argv[]��
        for (ASTParamsDeclarator item : functionDeclarator.params) {//todo �Ӷ�ջ�л�ȡ����
            specifierTypeForDeclarator = getSpecifiersType(item.specfiers);
            String op = "decl";
            ASTNode res = null;
            ASTNode opnd1 = new MyString(specifierTypeForDeclarator);
            ASTNode opnd2 = new MyString("@params");

            visit((item.declarator));
            res = map.get(item.declarator);
            quats.add(new MyQuat(op,opnd1,opnd2,res));
            //(decl, type:int, , identifier:main )
        }
    }

    @Override
    public void visit(ASTParamsDeclarator paramsDeclarator) throws Exception {

    }

    @Override
    public void visit(ASTArrayAccess arrayAccess) throws Exception {

    }

    @Override
    public void visit(ASTBinaryExpression binaryExpression) throws Exception {
        String op = binaryExpression.op.value;
        ASTNode res = null;
        ASTNode opnd1 = null;
        ASTNode opnd2 = null;

        if(op.equals("=")){
            //�������Ҫ�����洢
            //(op:"=����opnd1:expr2,null,res:expr1)
            visit(binaryExpression.expr1);
            res = map.get(binaryExpression.expr1);
            visit(binaryExpression.expr2);
            opnd1 = map.get(binaryExpression.expr2);


        }else if(op.equals("+") || op.equals("-")||op.equals("*")||op.equals("/")||op.equals("%")){
            //�����Ҫ�����洢,opȡԭ�����ַ���
            //(op:"+",opnd1:expr1,opnd2:expr2,res:tmp)
            visit(binaryExpression.expr1);
            opnd1 = map.get(binaryExpression.expr1);
            visit(binaryExpression.expr2);
            opnd2 = map.get(binaryExpression.expr2);
            res = new MyTempValue(++tmpId);
        }else if(op.equals("==")){
            //�����Ҫ�����洢��opȡ�Զ�����ַ���
            op = "cmp";
            visit(binaryExpression.expr1);
            opnd1 = map.get(binaryExpression.expr1);
            visit(binaryExpression.expr2);
            opnd2 = map.get(binaryExpression.expr2);
            res = new MyTempValue(++tmpId);
        }else if(op.equals(">")||op.equals("<")||op.equals(">=")||op.equals("<=")){
            visit(binaryExpression.expr1);
            opnd1 = map.get(binaryExpression.expr1);
            visit(binaryExpression.expr2);
            opnd2 = map.get(binaryExpression.expr2);
            res = new MyTempValue(++tmpId);
        }

        quats.add(new MyQuat(op,opnd1,opnd2,res));
        map.put(binaryExpression,res);
    }

    @Override
    public void visit(ASTBreakStatement breakStat) throws Exception {

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
            visit((ASTBinaryExpression)expression);
        }else if (expression instanceof ASTIntegerConstant){
            visit((ASTIntegerConstant) expression);
        }else if(expression instanceof ASTIdentifier){
            visit((ASTIdentifier) expression);
        }else if(expression instanceof ASTFunctionCall){
            visit((ASTFunctionCall)expression);
        }else if(expression instanceof ASTPostfixExpression){
            visit((ASTPostfixExpression) expression);
        }else if(expression instanceof ASTStringConstant){
            visit((ASTStringConstant) expression);
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
    public void visit(ASTFunctionCall funcCall) throws Exception {

        String op = "call";
        ASTNode res = null;
        ASTNode opnd1 = funcCall.funcname;//��������
        ASTNode opnd2 = new MyNumber(funcCall.argList.size());//��������

        for(ASTExpression expr: funcCall.argList){
            visit(expr);
            ASTNode param =  map.get(expr);
            quats.add(new MyQuat("push",null,null,param));//����ѹջ����
        }

        res = new MyTempValue(++tmpId);
        map.put(funcCall,res);
        quats.add(new MyQuat(op,opnd1,opnd2,res));

        for(ASTExpression expr: funcCall.argList){
            quats.add(new MyQuat("pop",null,null,null));//����������ɶ�ջƽ��
        }
    }

    @Override
    public void visit(ASTGotoStatement gotoStat) throws Exception {
        quats.add(new MyQuat("jmp",null,null, gotoStat.label));
    }

    @Override
    public void visit(ASTIdentifier identifier) throws Exception {
        map.put(identifier,identifier);
    }

    @Override
    public void visit(ASTInitList initList) throws Exception {
        ASTNode res = null;
        ASTNode opnd1 = new MyString(specifierTypeForDeclarator);
        ASTNode opnd2 = null;
        String op = "decl"; // ��ǰ�����˱�ʶ��
        //InitList ���� ��������declarator�� �Լ� ���ʽ ��exprs�����ȴ����׺�ı��ʽ
        for(ASTExpression expr : initList.exprs){
            visit(expr);
            opnd2 = map.get(expr);
        }
        visit(initList.declarator);
        res = map.get(initList.declarator);
        quats.add(new MyQuat(op,opnd1,opnd2,res));
        //( decl , specifier:int , expr_result:fibonacci(5) , identifier:var1)
    }

    @Override
    public void visit(ASTIntegerConstant intConst) throws Exception {
        map.put(intConst,intConst);
    }

    @Override
    public void visit(ASTIterationDeclaredStatement iterationDeclaredStat) throws Exception {

    }

    @Override
    public void visit(ASTIterationStatement iterationStat) throws Exception {
        ASTNode cond = null;
        //e1.code
        for(ASTExpression expr: iterationStat.init){
            visit(expr);
        }
        //L1
        int L1 = quats.size();
        //e2.code
        for(ASTExpression expr: iterationStat.cond){
            visit(expr);
            cond = map.get(expr);
        }
        quats.add(new MyQuat("jez",cond,null,null));//��ת��L3������
        quats.add(new MyQuat("jmp",null,null,null));//��ת��L2������
        //L4
        int L4 = quats.size();
        //e3.code
        for(ASTExpression expr: iterationStat.step){
            visit(expr);
        }
        quats.add(new MyQuat("jmp",null,null,new MyIRIndex(L1)));
        //L2
        int L2 = quats.size();
        //s.code
        visit(iterationStat.stat);
        quats.add(new MyQuat("jmp",null,null,new MyIRIndex(L4)));
        //L3
        int L3 = quats.size();
        //����L2��L3
        MyQuat jmpL2 = quats.get(L4-1);
        MyQuat jmpL3 = quats.get(L4-2);
        jmpL2.setRes(new MyIRIndex(L2));
        jmpL3.setRes(new MyIRIndex(L3));


    }

    @Override
    public void visit(ASTLabeledStatement labeledStat) throws Exception {
        quats.add(new MyQuat("label",null,null,labeledStat.label));
        visit(labeledStat.stat);
    }

    @Override
    public void visit(ASTMemberAccess memberAccess) throws Exception {

    }

    @Override
    public void visit(ASTPostfixExpression postfixExpression) throws Exception {
        visit(postfixExpression.expr);
        ASTNode res = map.get(postfixExpression.expr);
        quats.add(new MyQuat(postfixExpression.op.value,null,null,res));
    }

    @Override
    public void visit(ASTReturnStatement returnStat) throws Exception {
        ASTNode res = null;
        ASTNode opnd1 =null;
        ASTNode opnd2 = null;
        String op = "ret";

        //ASTNode�Ķ�����С���⣬returnStat������ASTExpression���б�ֻ����һ��ASTExpression
        ASTExpression expr = returnStat.expr.peek();
        visit(expr);
        res = map.get(expr);

        quats.add(new MyQuat(op,opnd1,opnd2,res));
    }

    @Override
    public void visit(ASTSelectionStatement selectionStat) throws Exception {
        ASTNode cond = null;
        for(ASTExpression expr:selectionStat.cond){
            visit(expr);
            cond = map.get(expr);
        }

        //��ʱ��־�Ĵ����Ѿ���cond��䴦�����
        int startIndex = quats.size();

        quats.add(new MyQuat("jez", cond,null,null));//Ԥ����λ
        visit(selectionStat.then);//�ȱ�������ʱquats���Ѿ�������then������������
        quats.add(new MyQuat("jmp",null,null,null));//Ԥ����λ
        int thenIndex = quats.size();//����then����һ�е��к�

        MyQuat then_jez = quats.get(startIndex);//ȡδ����ת��������
        then_jez.setRes(new MyIRIndex(thenIndex));//����

        visit(selectionStat.otherwise);
        int otherwiseIndex = quats.size();//����otherwise����һ�е��к�

        MyQuat otherwise_jmp = quats.get(thenIndex-1);//ȡδ����ת��������
        otherwise_jmp.setRes(new MyIRIndex(otherwiseIndex));
    }

    @Override
    public void visit(ASTStringConstant stringConst) throws Exception {
        map.put(stringConst,new MyString(stringConst.value));
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
    public void
    visit(ASTFunctionDefine functionDefine) throws Exception {
        scope = symbolTables.peek();
        //System.out.println(currentScope.toString());
        String funcName = functionDefine.declarator.getName();
        assert scope != null;
        if (!scope.containsKey(funcName)){//ȫ�ַ��ű��в����ں�������
            quats.add(new MyQuat("proc",null,null,new MyString(funcName)));//ͨ��proc��endp����ʶ
            //�ڵ���declarator���visit����֮ǰ������д�������ͣ���specifier�л��
            specifierTypeForDeclarator = getSpecifiersType(functionDefine.specifiers);
            value = new HashMap<>();
            value.put("type","function");
            value.put("ret",specifierTypeForDeclarator);
            scope.put(funcName,value);
            //visit declarator �ڵ㣬���º����ķ��ű�,��ʱ����ͨ��ȫ�ֱ���specifierTypeForDeclarator����
            visit(functionDefine.declarator);
            //��visit������body
            visit(functionDefine.body);
            quats.add(new MyQuat("endp",null,null,new MyString(funcName)));//ͨ��proc��endp����ʶ
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
        }else if(statement instanceof ASTSelectionStatement){
            visit((ASTSelectionStatement) statement);
        }else if(statement instanceof ASTLabeledStatement){
            visit((ASTLabeledStatement) statement);
        }else if(statement instanceof ASTGotoStatement){
            visit((ASTGotoStatement) statement);
        }
    }

    @Override
    public void visit(ASTToken token) throws Exception {

    }
}

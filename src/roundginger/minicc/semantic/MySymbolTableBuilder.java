package roundginger.minicc.semantic;

import bit.minisys.minicc.parser.ast.*;

import java.util.*;

public class MySymbolTableBuilder implements ASTVisitor{
    Stack<String> errorStack;
    LinkedList<HashMap<String, HashMap<String,String>>> symbolTables;
    HashMap<String,HashMap<String,String>> currentScope;
    HashMap<String,String> curValue;

    String specifierTypeForDeclarator; // 在specifier和declarator之间传递类型名称，不得已引入的全局变量
    boolean funcHasReturn; // 判断函数是否有return语句的全局变量
    boolean insideOfIteration; // 判断是否在循环体内部的全局变量

    public MySymbolTableBuilder(Stack<String> errorStack){
        this.errorStack = errorStack;
        this.symbolTables = new LinkedList<>();

    }

    @Override
    public void visit(ASTCompilationUnit program) throws Exception {
        symbolTables.push(new HashMap<>()); //压入全局符号表
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
            if (!currentScope.containsKey(funcName)){//全局符号表中不存在函数定义
                HashMap<String,String> value = new HashMap<>();
                value.put("type","function");
                currentScope.put(funcName,value);
                // 在函数定义时创建函数自己的符号表
                symbolTables.push(new HashMap<>());//push 和 pop 符号表必须成对出现

                //在调用declarator域的visit方法之前，先填写对象类型，从specifier中获得
                specifierTypeForDeclarator = getSpecifiersType(functionDefine.specifiers);
                //visit declarator 节点，更新函数的符号表,此时类型通过全局变量specifierTypeForDeclarator填入
                this.visit(functionDefine.declarator);

                //再visit函数的body
                funcHasReturn = false; //假设函数没有return，看看遍历的时候能否找到return
                insideOfIteration = false; // 在进入表达式之前，将break标志初始化
                for (ASTNode node : functionDefine.body.blockItems) {
                    //只有两大种可能：declaration或者statement
                    if(node instanceof ASTDeclaration){
                        visit((ASTDeclaration)node);
                    }else if(node instanceof ASTStatement){
                        visit((ASTStatement)node);
                    }
                }

                if(!funcHasReturn){
                    errorStack.push(String.format("ES08: function [%s] has no return!",funcName));
                }

                //push 和 pop 符号表必须成对出现,推出当前函数的符号表
                symbolTables.pop();

            }else{//全局符号表中存在函数定义
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
        if(!currentScope.containsKey(varName)){//变量未声明
            curValue = new HashMap<>();
            curValue.put("type",specifierTypeForDeclarator);//从预先设置好的全局变量中获取类型
            currentScope.put(varName,curValue);
        }else{//名称已经在符号表中出现
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
        if(!symbolTables.getLast().containsKey(funcName)){//symbolTables.getLast()是全局符号表
            errorStack.push(String.format("ES01: function [%s] call before defination!",funcName));
        }else{//先做是否是函数的名称的检查，再做调用参数类型检查的匹配
            //todo
        }
    }

    @Override
    public void visit(ASTDeclaration declaration) throws Exception {
        specifierTypeForDeclarator = getSpecifiersType(declaration.specifiers);//提前为declarator记住类型
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
        symbolTables.push(new HashMap<>()); // 需要在结束时pop
        for (ASTNode node : compoundStat.blockItems) {
            //只有两大种可能：declaration或者statement
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
        //函数和变量定义的时候都不会走这一个visit，只有当后面调用的时候才会走这个分支
        //且只有变量调用会走这一支，函数调用的identifier在funcCall中自己处理了
        String varName = identifier.value;
        boolean find = false;
        Iterator<HashMap<String, HashMap<String, String>>> it = symbolTables.iterator();
        while(!find&&it.hasNext()){//从前往后逐层查找
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
        //InitList 包含 变量名（declarator） 以及 表达式 （exprs），先处理后续的表达式
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
        // (init, cond , step) stat , 为了判断break的位置，只需要stat域即可
        insideOfIteration = true; //此时进入了循环体
        visit(iterationStat.stat);
        insideOfIteration = false; //此时退出了循环体
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
        //todo 计算expr的值
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

    //声明符可能是一长串 如 public static int xxxx;因此只需要返回specifiers的最后一个的值即可
    String getSpecifiersType(List<ASTToken> specifiers){
        return specifiers.get(specifiers.size()-1).value;
    }
}

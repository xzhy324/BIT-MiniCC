package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.ASTNode;

// ��Ԫʽ��ʽ���м����, �������ͷ���ֵ�Ľṹֱ��ʹ��AST�ڵ㣬Ҳ�����Զ���IR�ڵ�
public class MyQuat {
    private String op;
    private ASTNode res;
    private ASTNode opnd1;
    private ASTNode opnd2;
    public MyQuat(String op, ASTNode opnd1, ASTNode opnd2,ASTNode res) {
        this.op = op;
        this.res = res;
        this.opnd1 = opnd1;
        this.opnd2 = opnd2;

    }

    public void setRes(ASTNode node){
        this.res = node;
    }

    public String getOp() {
        return op;
    }
    public ASTNode getOpnd1() {
        return opnd1;
    }
    public ASTNode getOpnd2() {
        return opnd2;
    }
    public ASTNode getRes() {
        return res;
    }
}

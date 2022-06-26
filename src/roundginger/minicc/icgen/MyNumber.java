package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.ASTNode;
import bit.minisys.minicc.parser.ast.ASTVisitor;

public class MyNumber extends ASTNode {
    private int num;

    public String getNum() {
        return num+"";
    }

    public MyNumber(int index){
        super("MyNumber");
        num = index;
    }

    public MyNumber(String type) {
        super(type);
    }

    @Override
    public void accept(ASTVisitor visitor) throws Exception {

    }
}

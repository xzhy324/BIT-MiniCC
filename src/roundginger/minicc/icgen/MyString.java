package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.ASTNode;
import bit.minisys.minicc.parser.ast.ASTVisitor;

public class MyString extends ASTNode {
    private final String str;

    public String getStr() {
        return str;
    }

    public MyString(String str){
        super("MyNumber");
        this.str = str;
    }


    @Override
    public void accept(ASTVisitor visitor) throws Exception {

    }
}

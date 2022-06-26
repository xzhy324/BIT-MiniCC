package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.ASTNode;
import bit.minisys.minicc.parser.ast.ASTVisitor;

public class MyIRIndex extends ASTNode {
    private Integer rowIndex;

    public String getIndex() {
        return rowIndex+"";
    }

    public MyIRIndex(Integer index){
        super("MyIRIndex");
        rowIndex = index;
    }

    public MyIRIndex(String type) {
        super(type);
    }

    @Override
    public void accept(ASTVisitor visitor) throws Exception {

    }
}

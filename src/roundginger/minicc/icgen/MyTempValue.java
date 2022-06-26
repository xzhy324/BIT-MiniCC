package roundginger.minicc.icgen;

import bit.minisys.minicc.parser.ast.ASTNode;
import bit.minisys.minicc.parser.ast.ASTVisitor;

// ¡Ÿ ±±‰¡ø
public class MyTempValue extends ASTNode{

    private Integer id;

    public String name() {
        return "%"+id;
    }
    @Override
    public void accept(ASTVisitor visitor) throws Exception {

    }
    public MyTempValue(Integer id) {
        super("MyTempValue");
        this.id = id;
    }
    public MyTempValue(String type) {
        super(type);
    }
}

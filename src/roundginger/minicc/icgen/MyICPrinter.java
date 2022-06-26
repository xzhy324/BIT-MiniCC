package roundginger.minicc.icgen;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


import bit.minisys.minicc.parser.ast.ASTIdentifier;
import bit.minisys.minicc.parser.ast.ASTIntegerConstant;
import bit.minisys.minicc.parser.ast.ASTNode;

public class MyICPrinter {
    private final List<MyQuat> quats;
    public MyICPrinter(List<MyQuat> quats) {
        this.quats = quats;
    }
    public void print(String filename) {
        StringBuilder sb = new StringBuilder();
        for (MyQuat quat : quats) {
            String op = quat.getOp();
            String res = astStr(quat.getRes());
            String opnd1 = astStr(quat.getOpnd1());
            String opnd2 = astStr(quat.getOpnd2());
            sb.append("("+op+","+ opnd1+","+opnd2 +"," + res+")\n");
        }
        // write
        try {
            FileWriter fileWriter = new FileWriter(new File(filename));
            fileWriter.write(sb.toString());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String astStr(ASTNode node) {
        if (node == null) {
            return " ";
        }else if (node instanceof ASTIdentifier) {
            return ((ASTIdentifier)node).value;
        }else if (node instanceof ASTIntegerConstant) {
            return ((ASTIntegerConstant)node).value+"";
        }else if (node instanceof MyTempValue) {
            return ((MyTempValue)node).name();
        }else if(node instanceof MyIRIndex){
            return "L"+((MyIRIndex)node).getIndex();
        }else if(node instanceof MyNumber){
            return ((MyNumber)node).getNum();
        }else if(node instanceof MyString){
            return ((MyString)node).getStr();
        } else {
            return "";
        }
    }
}


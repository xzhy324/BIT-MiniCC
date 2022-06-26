package roundginger.minicc.semantic;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;
import bit.minisys.minicc.pp.internal.M;
import bit.minisys.minicc.semantic.IMiniCCSemantic;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.antlr.v4.gui.TreeViewer;
import org.python.indexer.ast.NPrint;

import java.io.File;
import java.util.Arrays;
import java.util.Stack;

public class MySemanticAnalyzer implements IMiniCCSemantic {

    @Override
    public String run(String iFile) throws Exception {
        System.out.println("In Semantic...");
        ObjectMapper mapper =new ObjectMapper();
        ASTCompilationUnit program=(ASTCompilationUnit) mapper.readValue(new File(iFile), ASTCompilationUnit.class);

        Stack<String> errorStack = new Stack<>();
        MySymbolTableBuilder stb = new MySymbolTableBuilder(errorStack);

        program.accept(stb);

        while(!errorStack.empty()){
            System.out.println(errorStack.pop());
        }

        System.out.println("4. RR'S Semantic Finished!");
        return iFile;  //中间代码生成仍然使用 ast树的json文件
    }
}
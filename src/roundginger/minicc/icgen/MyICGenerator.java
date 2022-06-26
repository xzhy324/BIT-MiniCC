package roundginger.minicc.icgen;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.icgen.IMiniCCICGen;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.ast.ASTCompilationUnit;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class MyICGenerator implements IMiniCCICGen {
    @Override
    //输入是ast树的json文件
    public String run(String iFile) throws Exception {
        System.out.println("In ICgen...");
        // iFile is xx.ast.json
        // fetch AST Tree
        ObjectMapper mapper = new ObjectMapper();
        ASTCompilationUnit program = (ASTCompilationUnit)mapper.readValue(new File(iFile), ASTCompilationUnit.class);

        /*
         *  You should build SymbolTable here or get it from semantic analysis ..
         *  This ic generator skips this step because it only implements addition and subtraction
         */

        // use visitor pattern to build IR
        MyICBuilder builder = new MyICBuilder();
        program.accept(builder);

        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_ICGEN_OUTPUT_EXT;
        MyICPrinter printer = new MyICPrinter(builder.getQuats());
        printer.print(oFile);

        System.out.println("5. RR's ICGen finished!");
        return oFile;
    }
}

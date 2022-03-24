package roundginger.minicc.scanner;

import bit.minisys.minicc.scanner.IMiniCCScanner;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.scanner.IMiniCCScanner;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import org.antlr.v4.gui.TestRig;


public class MyScanner implements IMiniCCScanner {
    public MyScanner(){

    }

    /**
     * 词法分析器的运行入口
     * @param iFile String 输入c文件的路径
     * @return 输出文件(.tokens)的路径
     */
    @Override
    public String run(String iFile) throws Exception {
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;

        File fp = new File(oFile);
        fp.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fp);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);

        //TODO 在这个位置使用antlr，并弄清楚为什么需要修改输出流
        String[] antlr_settings = new String[]{"bit.minisys.minicc.parser.internal.antlr.C", "compilationUnit", "-tokens", iFile};
        TestRig testRig = new TestRig(antlr_settings);
        testRig.process();

        fileOutputStream.close();
        printStream.close();
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        System.out.println("2. RR's LexAnalyse finished!");
        return oFile;
    }
}

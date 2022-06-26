package roundginger.minicc.scanner;

import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.scanner.IMiniCCScanner;

import bit.minisys.minicc.MiniCCCfg;

import java.io.*;

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
        System.out.println("In LexScanning...");
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;

        File fp = new File(oFile);
        fp.createNewFile();
        //将输出流改为写文件，以便将token属性字流保存下来
        FileOutputStream fileOutputStream = new FileOutputStream(fp);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);

        //@param1: grammerName
        //@param2: startRuleName (公理)
        //@param that is not started with '-' : inputFileName
        //@param "-xxxx": extra params (gui/tree,tokens, etc.)
        String[] antlr_settings = new String[]{"roundginger.minicc.parser.myAntlr.myC", "compilationUnit", "-tokens", iFile};
        //特别注意，使用antlr生成的java代码，需要手动在每个生成类的前面指定我们自己调用的包：即roundginger.minicc.scanner.antlr
        TestRig testRig = new TestRig(antlr_settings);
        testRig.process();

        fileOutputStream.close();
        printStream.close();
        //将输出流改为stdout
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));//FileDescriptor.out就是标准输出流
        System.out.println("2. RR's LexAnalyse finished!");
        return oFile;
    }
}

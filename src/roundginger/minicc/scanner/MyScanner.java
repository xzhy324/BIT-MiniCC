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
     * �ʷ����������������
     * @param iFile String ����c�ļ���·��
     * @return ����ļ�(.tokens)��·��
     */
    @Override
    public String run(String iFile) throws Exception {
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;

        File fp = new File(oFile);
        fp.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(fp);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);

        //TODO �����λ��ʹ��antlr����Ū���Ϊʲô��Ҫ�޸������
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

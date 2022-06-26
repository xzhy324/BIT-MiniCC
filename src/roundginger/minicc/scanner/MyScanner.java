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
     * �ʷ����������������
     * @param iFile String ����c�ļ���·��
     * @return ����ļ�(.tokens)��·��
     */
    @Override
    public String run(String iFile) throws Exception {
        System.out.println("In LexScanning...");
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_SCANNER_OUTPUT_EXT;

        File fp = new File(oFile);
        fp.createNewFile();
        //���������Ϊд�ļ����Ա㽫token����������������
        FileOutputStream fileOutputStream = new FileOutputStream(fp);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);

        //@param1: grammerName
        //@param2: startRuleName (����)
        //@param that is not started with '-' : inputFileName
        //@param "-xxxx": extra params (gui/tree,tokens, etc.)
        String[] antlr_settings = new String[]{"roundginger.minicc.parser.myAntlr.myC", "compilationUnit", "-tokens", iFile};
        //�ر�ע�⣬ʹ��antlr���ɵ�java���룬��Ҫ�ֶ���ÿ���������ǰ��ָ�������Լ����õİ�����roundginger.minicc.scanner.antlr
        TestRig testRig = new TestRig(antlr_settings);
        testRig.process();

        fileOutputStream.close();
        printStream.close();
        //���������Ϊstdout
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));//FileDescriptor.out���Ǳ�׼�����
        System.out.println("2. RR's LexAnalyse finished!");
        return oFile;
    }
}

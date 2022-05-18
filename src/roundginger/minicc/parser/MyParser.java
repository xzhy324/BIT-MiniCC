package roundginger.minicc.parser;

import bit.minisys.minicc.MiniCCCfg;
import bit.minisys.minicc.internal.util.MiniCCUtil;
import bit.minisys.minicc.parser.IMiniCCParser;


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import roundginger.minicc.parser.myAntlr.myCLexer;
import roundginger.minicc.parser.myAntlr.myCParser;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MyParser implements IMiniCCParser {

    /**�﷨������
     * @param iFile String �����ļ���.tokens����·��
     * @return ����ļ���.ast.json����·��
     */
    @Override
    public String run(String iFile) throws Exception {
        System.out.println("Parsing...");
        String oFile = MiniCCUtil.removeAllExt(iFile) + MiniCCCfg.MINICC_PARSER_OUTPUT_EXT;

        String originCFile = MiniCCUtil.removeAllExt(iFile) + ".c";

        FileInputStream fileInputStream = new FileInputStream(originCFile);
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(fileInputStream);

        Lexer lexer = new myCLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        myCParser parser = new myCParser(tokens);

        ParseTree treeRoot = parser.translationUnit();

        //���ӻ�gui
        TreeViewer treeViewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), treeRoot);
        treeViewer.open();

        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener listener = new MyListener();
        walker.walk(listener,treeRoot);//�����﷨�����������������MyListener Overide�ķ���

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(oFile), listener.rootNode);

        System.out.println("3.RR's ParseAnalysis Finished!");
        return oFile;
    }
}

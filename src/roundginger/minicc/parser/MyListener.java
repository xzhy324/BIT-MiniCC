package roundginger.minicc.parser;

import bit.minisys.minicc.parser.ast.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import roundginger.minicc.parser.myAntlr.myCLexer;
import roundginger.minicc.parser.myAntlr.myCParser;
import roundginger.minicc.parser.myAntlr.myCBaseListener;

import java.util.List;
import java.util.Stack;

public class MyListener extends myCBaseListener{
    ASTNode rootNode;
    ASTNode curNode;
    ASTNode parentNode;
    Class<?> parentType;
    Stack <ASTNode> stack;

    public MyListener(){
        rootNode = new ASTCompilationUnit();
        stack = new Stack<>();
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        parentNode = stack.peek();
        parentType = parentNode.getClass();
        switch(node.getSymbol().getType()){
            case myCLexer.Identifier:
                if(parentType == ASTFunctionDefine.class){
                    ((ASTFunctionDefine)parentNode).specifiers = (List<ASTToken>) node.getSymbol();

                }

        }
    }
}
// Generated from C:/projects/BIT-MiniCC/src/roundginger/minicc/parser/myAntlr\myC.g4 by ANTLR 4.9.2
package roundginger.minicc.parser.myAntlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link myCParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface myCVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link myCParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(myCParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(myCParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_pass(myCParser.PostfixExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall_(myCParser.FunctionCall_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixExpression_(myCParser.PostfixExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAceess_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAceess_(myCParser.ArrayAceess_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentExpressionList(myCParser.ArgumentExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_pass(myCParser.UnaryExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression_(myCParser.UnaryExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryTypename_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryTypename_(myCParser.UnaryTypename_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(myCParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression_(myCParser.CastExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastExpression_pass(myCParser.CastExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_(myCParser.MultiplicativeExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression_pass(myCParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_pass(myCParser.AdditiveExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression_(myCParser.AdditiveExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#shiftExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShiftExpression(myCParser.ShiftExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_pass(myCParser.RelationalExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression_(myCParser.RelationalExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_pass(myCParser.EqualityExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression_(myCParser.EqualityExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#andExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(myCParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExclusiveOrExpression(myCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclusiveOrExpression(myCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(myCParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(myCParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression_pass}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression_pass(myCParser.ConditionalExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditionalExpression_}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalExpression_(myCParser.ConditionalExpression_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression_pass(myCParser.AssignmentExpression_passContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentExpression_(myCParser.AssignmentExpression_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(myCParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(myCParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(myCParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(myCParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers(myCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifiers2(myCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationSpecifier(myCParser.DeclarationSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclaratorList(myCParser.InitDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#initDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitDeclarator(myCParser.InitDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageClassSpecifier(myCParser.StorageClassSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(myCParser.TypeSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnionSpecifier(myCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structOrUnion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructOrUnion(myCParser.StructOrUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(myCParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(myCParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecifierQualifierList(myCParser.SpecifierQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(myCParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(myCParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumSpecifier(myCParser.EnumSpecifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#enumeratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumeratorList(myCParser.EnumeratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#enumerator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerator(myCParser.EnumeratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumerationConstant(myCParser.EnumerationConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#typeQualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifier(myCParser.TypeQualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarator(myCParser.DeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(myCParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayDeclarator(myCParser.ArrayDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarator(myCParser.FunctionDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(myCParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeQualifierList(myCParser.TypeQualifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterTypeList(myCParser.ParameterTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(myCParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterDeclaration(myCParser.ParameterDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(myCParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#typeName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeName(myCParser.TypeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractDeclarator(myCParser.AbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectAbstractDeclarator(myCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#typedefName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypedefName(myCParser.TypedefNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(myCParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#initializerList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializerList(myCParser.InitializerListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#designation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignation(myCParser.DesignationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#designatorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignatorList(myCParser.DesignatorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#designator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesignator(myCParser.DesignatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(myCParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#labeledStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabeledStatement(myCParser.LabeledStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(myCParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#blockItemList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItemList(myCParser.BlockItemListContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(myCParser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#expressionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionStatement(myCParser.ExpressionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#selectionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectionStatement(myCParser.SelectionStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationWhileStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationWhileStatement_(myCParser.IterationWhileStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationDoStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationDoStatement_(myCParser.IterationDoStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationDeclaredStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationDeclaredStatement_(myCParser.IterationDeclaredStatement_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code iterationStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationStatement_(myCParser.IterationStatement_Context ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#forDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForDeclaration(myCParser.ForDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(myCParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotoStatement(myCParser.GotoStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStatement(myCParser.ContinueStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStatement(myCParser.BreakStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(myCParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(myCParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#translationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslationUnit(myCParser.TranslationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternalDeclaration(myCParser.ExternalDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#functionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefinition(myCParser.FunctionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link myCParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(myCParser.DeclarationListContext ctx);
}
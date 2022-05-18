// Generated from .\src\roundginger\minicc\parser\myAntlr\myC.g4 by ANTLR 4.8
package roundginger.minicc.parser.myAntlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link myCParser}.
 */
public interface myCListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link myCParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(myCParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(myCParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(myCParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(myCParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_pass(myCParser.PostfixExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_pass}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_pass(myCParser.PostfixExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall_(myCParser.FunctionCall_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall_(myCParser.FunctionCall_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression_(myCParser.PostfixExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixExpression_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression_(myCParser.PostfixExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAceess_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAceess_(myCParser.ArrayAceess_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAceess_}
	 * labeled alternative in {@link myCParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAceess_(myCParser.ArrayAceess_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentExpressionList(myCParser.ArgumentExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#argumentExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentExpressionList(myCParser.ArgumentExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_pass(myCParser.UnaryExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_pass}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_pass(myCParser.UnaryExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression_(myCParser.UnaryExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpression_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression_(myCParser.UnaryExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryTypename_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryTypename_(myCParser.UnaryTypename_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryTypename_}
	 * labeled alternative in {@link myCParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryTypename_(myCParser.UnaryTypename_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(myCParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(myCParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression_(myCParser.CastExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression_}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression_(myCParser.CastExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression_pass(myCParser.CastExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code castExpression_pass}
	 * labeled alternative in {@link myCParser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression_pass(myCParser.CastExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_(myCParser.MultiplicativeExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_(myCParser.MultiplicativeExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression_pass(myCParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplicativeExpression_pass}
	 * labeled alternative in {@link myCParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression_pass(myCParser.MultiplicativeExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_pass(myCParser.AdditiveExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_pass}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_pass(myCParser.AdditiveExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression_(myCParser.AdditiveExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code additiveExpression_}
	 * labeled alternative in {@link myCParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression_(myCParser.AdditiveExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(myCParser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(myCParser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_pass(myCParser.RelationalExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_pass}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_pass(myCParser.RelationalExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression_(myCParser.RelationalExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code relationalExpression_}
	 * labeled alternative in {@link myCParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression_(myCParser.RelationalExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_pass(myCParser.EqualityExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_pass}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_pass(myCParser.EqualityExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression_(myCParser.EqualityExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpression_}
	 * labeled alternative in {@link myCParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression_(myCParser.EqualityExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(myCParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(myCParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(myCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(myCParser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(myCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(myCParser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(myCParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(myCParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(myCParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(myCParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression_pass}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression_pass(myCParser.ConditionalExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression_pass}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression_pass(myCParser.ConditionalExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditionalExpression_}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression_(myCParser.ConditionalExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code conditionalExpression_}
	 * labeled alternative in {@link myCParser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression_(myCParser.ConditionalExpression_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression_pass(myCParser.AssignmentExpression_passContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression_pass}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression_pass(myCParser.AssignmentExpression_passContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression_(myCParser.AssignmentExpression_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentExpression_}
	 * labeled alternative in {@link myCParser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression_(myCParser.AssignmentExpression_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(myCParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(myCParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(myCParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(myCParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(myCParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(myCParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(myCParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(myCParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers(myCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declarationSpecifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers(myCParser.DeclarationSpecifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifiers2(myCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declarationSpecifiers2}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifiers2(myCParser.DeclarationSpecifiers2Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationSpecifier(myCParser.DeclarationSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declarationSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationSpecifier(myCParser.DeclarationSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclaratorList(myCParser.InitDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#initDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclaratorList(myCParser.InitDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitDeclarator(myCParser.InitDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#initDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitDeclarator(myCParser.InitDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageClassSpecifier(myCParser.StorageClassSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#storageClassSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageClassSpecifier(myCParser.StorageClassSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(myCParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(myCParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnionSpecifier(myCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structOrUnionSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnionSpecifier(myCParser.StructOrUnionSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void enterStructOrUnion(myCParser.StructOrUnionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structOrUnion}.
	 * @param ctx the parse tree
	 */
	void exitStructOrUnion(myCParser.StructOrUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(myCParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(myCParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(myCParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(myCParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterSpecifierQualifierList(myCParser.SpecifierQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#specifierQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitSpecifierQualifierList(myCParser.SpecifierQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(myCParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(myCParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(myCParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(myCParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumSpecifier(myCParser.EnumSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#enumSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumSpecifier(myCParser.EnumSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorList(myCParser.EnumeratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#enumeratorList}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorList(myCParser.EnumeratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(myCParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(myCParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationConstant(myCParser.EnumerationConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#enumerationConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationConstant(myCParser.EnumerationConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifier(myCParser.TypeQualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#typeQualifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifier(myCParser.TypeQualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(myCParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(myCParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(myCParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(myCParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterArrayDeclarator(myCParser.ArrayDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitArrayDeclarator(myCParser.ArrayDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarator(myCParser.FunctionDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarator}
	 * labeled alternative in {@link myCParser#directDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarator(myCParser.FunctionDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(myCParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(myCParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void enterTypeQualifierList(myCParser.TypeQualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#typeQualifierList}.
	 * @param ctx the parse tree
	 */
	void exitTypeQualifierList(myCParser.TypeQualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void enterParameterTypeList(myCParser.ParameterTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#parameterTypeList}.
	 * @param ctx the parse tree
	 */
	void exitParameterTypeList(myCParser.ParameterTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(myCParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(myCParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterDeclaration(myCParser.ParameterDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#parameterDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterDeclaration(myCParser.ParameterDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(myCParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(myCParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(myCParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(myCParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractDeclarator(myCParser.AbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#abstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractDeclarator(myCParser.AbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterDirectAbstractDeclarator(myCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#directAbstractDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitDirectAbstractDeclarator(myCParser.DirectAbstractDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void enterTypedefName(myCParser.TypedefNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#typedefName}.
	 * @param ctx the parse tree
	 */
	void exitTypedefName(myCParser.TypedefNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(myCParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(myCParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void enterInitializerList(myCParser.InitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#initializerList}.
	 * @param ctx the parse tree
	 */
	void exitInitializerList(myCParser.InitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#designation}.
	 * @param ctx the parse tree
	 */
	void enterDesignation(myCParser.DesignationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#designation}.
	 * @param ctx the parse tree
	 */
	void exitDesignation(myCParser.DesignationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void enterDesignatorList(myCParser.DesignatorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#designatorList}.
	 * @param ctx the parse tree
	 */
	void exitDesignatorList(myCParser.DesignatorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#designator}.
	 * @param ctx the parse tree
	 */
	void enterDesignator(myCParser.DesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#designator}.
	 * @param ctx the parse tree
	 */
	void exitDesignator(myCParser.DesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(myCParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(myCParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(myCParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(myCParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(myCParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(myCParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void enterBlockItemList(myCParser.BlockItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#blockItemList}.
	 * @param ctx the parse tree
	 */
	void exitBlockItemList(myCParser.BlockItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(myCParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(myCParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(myCParser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(myCParser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionStatement(myCParser.SelectionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#selectionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionStatement(myCParser.SelectionStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationWhileStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationWhileStatement_(myCParser.IterationWhileStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationWhileStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationWhileStatement_(myCParser.IterationWhileStatement_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationDoStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationDoStatement_(myCParser.IterationDoStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationDoStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationDoStatement_(myCParser.IterationDoStatement_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationDeclaredStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationDeclaredStatement_(myCParser.IterationDeclaredStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationDeclaredStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationDeclaredStatement_(myCParser.IterationDeclaredStatement_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code iterationStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationStatement_(myCParser.IterationStatement_Context ctx);
	/**
	 * Exit a parse tree produced by the {@code iterationStatement_}
	 * labeled alternative in {@link myCParser#iterationStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationStatement_(myCParser.IterationStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForDeclaration(myCParser.ForDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#forDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForDeclaration(myCParser.ForDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(myCParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(myCParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterGotoStatement(myCParser.GotoStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GotoStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitGotoStatement(myCParser.GotoStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(myCParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(myCParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(myCParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(myCParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(myCParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link myCParser#jumpStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(myCParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(myCParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(myCParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationUnit(myCParser.TranslationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#translationUnit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationUnit(myCParser.TranslationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExternalDeclaration(myCParser.ExternalDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#externalDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExternalDeclaration(myCParser.ExternalDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDefinition(myCParser.FunctionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#functionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDefinition(myCParser.FunctionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link myCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(myCParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link myCParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(myCParser.DeclarationListContext ctx);
}
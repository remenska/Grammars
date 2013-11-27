// Generated from info/remenska/PASS/monitor/mCRL2/mucalculus.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mucalculusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mucalculusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationStateFrm(@NotNull mucalculusParser.ImplicationStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsStateFrm(@NotNull mucalculusParser.BracketsStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#multAct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultAct(@NotNull mucalculusParser.MultActContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#varsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsDecl(@NotNull mucalculusParser.VarsDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierDataExpr(@NotNull mucalculusParser.UniversalQuantifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueExpressionActionFrm(@NotNull mucalculusParser.DataValueExpressionActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBagComprehensionDataExpr(@NotNull mucalculusParser.SetBagComprehensionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FiniteSetSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiniteSetSort(@NotNull mucalculusParser.FiniteSetSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSort(@NotNull mucalculusParser.ListSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ParenthesisSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisSort(@NotNull mucalculusParser.ParenthesisSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull mucalculusParser.IdListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSnocDataExpr(@NotNull mucalculusParser.ListSnocDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FiniteBagSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiniteBagSort(@NotNull mucalculusParser.FiniteBagSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyBagDataExpr(@NotNull mucalculusParser.EmptyBagDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsDataExpr(@NotNull mucalculusParser.BracketsDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NuStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuStateFrm(@NotNull mucalculusParser.NuStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConsDataExpr(@NotNull mucalculusParser.ListConsDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#bagEnumElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumElt(@NotNull mucalculusParser.BagEnumEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#dataSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSpec(@NotNull mucalculusParser.DataSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NaturalNumSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalNumSort(@NotNull mucalculusParser.NaturalNumSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueExpressionStateFrm(@NotNull mucalculusParser.DataValueExpressionStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiamondModalityStateFrm(@NotNull mucalculusParser.DiamondModalityStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#idsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsDecl(@NotNull mucalculusParser.IdsDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#eqnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnSpec(@NotNull mucalculusParser.EqnSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull mucalculusParser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FalseDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseDataExpr(@NotNull mucalculusParser.FalseDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#globVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobVarSpec(@NotNull mucalculusParser.GlobVarSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierStateFrm(@NotNull mucalculusParser.UniversalQuantifierStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierDataExpr(@NotNull mucalculusParser.ExistentialQuantifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#mapSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapSpec(@NotNull mucalculusParser.MapSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerEqualDataExpr(@NotNull mucalculusParser.SmallerEqualDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#projDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjDeclList(@NotNull mucalculusParser.ProjDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPBESVariableStateFrm(@NotNull mucalculusParser.PBESVariableStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierStateFrm(@NotNull mucalculusParser.ExistentialQuantifierStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#constrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrDecl(@NotNull mucalculusParser.ConstrDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#dataValExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValExpr(@NotNull mucalculusParser.DataValExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityDataExpr(@NotNull mucalculusParser.InequalityDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDivDataExpr(@NotNull mucalculusParser.IntegerDivDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsActionFrm(@NotNull mucalculusParser.BracketsActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#bagEnumEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumEltList(@NotNull mucalculusParser.BagEnumEltListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarAssignmentList(@NotNull mucalculusParser.StateVarAssignmentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierActionFrm(@NotNull mucalculusParser.ExistentialQuantifierActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#MultiAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAction(@NotNull mucalculusParser.MultiActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySetDataExpr(@NotNull mucalculusParser.EmptySetDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#actionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionList(@NotNull mucalculusParser.ActionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityDataExpr(@NotNull mucalculusParser.EqualityDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationDataExpr(@NotNull mucalculusParser.ImplicationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull mucalculusParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtOperatorActionFrm(@NotNull mucalculusParser.AtOperatorActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayOpStateFrm(@NotNull mucalculusParser.DelayOpStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierDataExpr(@NotNull mucalculusParser.IdentifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#eqnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnDecl(@NotNull mucalculusParser.EqnDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#UnionOfActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOfActions(@NotNull mucalculusParser.UnionOfActionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NegationStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationStateFrm(@NotNull mucalculusParser.NegationStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#consSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsSpec(@NotNull mucalculusParser.ConsSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(@NotNull mucalculusParser.VarSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#sortSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSpec(@NotNull mucalculusParser.SortSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYaledOpStateFrm(@NotNull mucalculusParser.YaledOpStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierActionFrm(@NotNull mucalculusParser.UniversalQuantifierActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BracketsRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsRegForm(@NotNull mucalculusParser.BracketsRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDataExpr(@NotNull mucalculusParser.LambdaDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#sortDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDecl(@NotNull mucalculusParser.SortDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionUpdateDataExpr(@NotNull mucalculusParser.FunctionUpdateDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumerationDataExpr(@NotNull mucalculusParser.SetEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationDataExpr(@NotNull mucalculusParser.MultiplicationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConcatenationDataExpr(@NotNull mucalculusParser.ListConcatenationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#varsDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsDeclList(@NotNull mucalculusParser.VarsDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeCompositionRegForm(@NotNull mucalculusParser.AlternativeCompositionRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull mucalculusParser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#projDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjDecl(@NotNull mucalculusParser.ProjDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionOfActions(@NotNull mucalculusParser.IntersectionOfActionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NegationActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationActionFrm(@NotNull mucalculusParser.NegationActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#LargerDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargerDataExpr(@NotNull mucalculusParser.LargerDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#PositiveNumSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveNumSort(@NotNull mucalculusParser.PositiveNumSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusDataExpr(@NotNull mucalculusParser.UnaryMinusDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NuOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuOperator(@NotNull mucalculusParser.NuOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClauseDataExpr(@NotNull mucalculusParser.WhereClauseDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSizeDataExpr(@NotNull mucalculusParser.ListSizeDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#stateVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarAssignment(@NotNull mucalculusParser.StateVarAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#TrueStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionDataExpr(@NotNull mucalculusParser.SubtractionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#TrueDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueDataExpr(@NotNull mucalculusParser.TrueDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NumberDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDataExpr(@NotNull mucalculusParser.NumberDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FalseStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStateFrm(@NotNull mucalculusParser.FalseStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#Implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(@NotNull mucalculusParser.ImplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionDataExpr(@NotNull mucalculusParser.ConjunctionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionDataExpr(@NotNull mucalculusParser.DisjunctionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#TrueActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueActionFrm(@NotNull mucalculusParser.TrueActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionDataExpr(@NotNull mucalculusParser.DivisionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#RealSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealSort(@NotNull mucalculusParser.RealSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#MuStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuStateFrm(@NotNull mucalculusParser.MuStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationSetComplementDataExpr(@NotNull mucalculusParser.NegationSetComplementDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BagSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagSort(@NotNull mucalculusParser.BagSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SetSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSort(@NotNull mucalculusParser.SetSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#MuOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuOperator(@NotNull mucalculusParser.MuOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NilRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilRegForm(@NotNull mucalculusParser.NilRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionStateFrm(@NotNull mucalculusParser.ConjunctionStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FalseActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseActionFrm(@NotNull mucalculusParser.FalseActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull mucalculusParser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IntegerSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSort(@NotNull mucalculusParser.IntegerSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionDataExpr(@NotNull mucalculusParser.AdditionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#constrDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrDeclList(@NotNull mucalculusParser.ConstrDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SortReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortReference(@NotNull mucalculusParser.SortReferenceContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(@NotNull mucalculusParser.AssignmentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEnumerationDataExpr(@NotNull mucalculusParser.ListEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumerationDataExpr(@NotNull mucalculusParser.BagEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionStateFmr(@NotNull mucalculusParser.DisjunctionStateFmrContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerDataExpr(@NotNull mucalculusParser.SmallerDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#BooleanSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSort(@NotNull mucalculusParser.BooleanSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerModDataExpr(@NotNull mucalculusParser.IntegerModDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargerEqualDataExpr(@NotNull mucalculusParser.LargerEqualDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#stateVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarDecl(@NotNull mucalculusParser.StateVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#IterationRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListDataExpr(@NotNull mucalculusParser.EmptyListDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberShipSetBagDataExpr(@NotNull mucalculusParser.MemberShipSetBagDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#hashArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashArgs(@NotNull mucalculusParser.HashArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#StructuredSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredSort(@NotNull mucalculusParser.StructuredSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#sortExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExpr(@NotNull mucalculusParser.SortExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#dataExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExprList(@NotNull mucalculusParser.DataExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElemPositionDataExpr(@NotNull mucalculusParser.ListElemPositionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mucalculusParser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApplicationDataExpr(@NotNull mucalculusParser.FunctionApplicationDataExprContext ctx);
}
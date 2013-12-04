// Generated from info/remenska/PASS/monitor/mCRL2/mucalculus.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mucalculusParser}.
 */
public interface mucalculusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterImplicationStateFrm(@NotNull mucalculusParser.ImplicationStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitImplicationStateFrm(@NotNull mucalculusParser.ImplicationStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsStateFrm(@NotNull mucalculusParser.BracketsStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsStateFrm(@NotNull mucalculusParser.BracketsStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#multAct}.
	 * @param ctx the parse tree
	 */
	void enterMultAct(@NotNull mucalculusParser.MultActContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#multAct}.
	 * @param ctx the parse tree
	 */
	void exitMultAct(@NotNull mucalculusParser.MultActContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarsDecl(@NotNull mucalculusParser.VarsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarsDecl(@NotNull mucalculusParser.VarsDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierDataExpr(@NotNull mucalculusParser.UniversalQuantifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierDataExpr(@NotNull mucalculusParser.UniversalQuantifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterDataValueExpressionActionFrm(@NotNull mucalculusParser.DataValueExpressionActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitDataValueExpressionActionFrm(@NotNull mucalculusParser.DataValueExpressionActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetBagComprehensionDataExpr(@NotNull mucalculusParser.SetBagComprehensionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetBagComprehensionDataExpr(@NotNull mucalculusParser.SetBagComprehensionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FiniteSetSort}.
	 * @param ctx the parse tree
	 */
	void enterFiniteSetSort(@NotNull mucalculusParser.FiniteSetSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FiniteSetSort}.
	 * @param ctx the parse tree
	 */
	void exitFiniteSetSort(@NotNull mucalculusParser.FiniteSetSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListSort}.
	 * @param ctx the parse tree
	 */
	void enterListSort(@NotNull mucalculusParser.ListSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListSort}.
	 * @param ctx the parse tree
	 */
	void exitListSort(@NotNull mucalculusParser.ListSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ParenthesisSort}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSort(@NotNull mucalculusParser.ParenthesisSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ParenthesisSort}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSort(@NotNull mucalculusParser.ParenthesisSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull mucalculusParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull mucalculusParser.IdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListSnocDataExpr(@NotNull mucalculusParser.ListSnocDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListSnocDataExpr(@NotNull mucalculusParser.ListSnocDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FiniteBagSort}.
	 * @param ctx the parse tree
	 */
	void enterFiniteBagSort(@NotNull mucalculusParser.FiniteBagSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FiniteBagSort}.
	 * @param ctx the parse tree
	 */
	void exitFiniteBagSort(@NotNull mucalculusParser.FiniteBagSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyBagDataExpr(@NotNull mucalculusParser.EmptyBagDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyBagDataExpr(@NotNull mucalculusParser.EmptyBagDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketsDataExpr(@NotNull mucalculusParser.BracketsDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketsDataExpr(@NotNull mucalculusParser.BracketsDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NuStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterNuStateFrm(@NotNull mucalculusParser.NuStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NuStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitNuStateFrm(@NotNull mucalculusParser.NuStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListConsDataExpr(@NotNull mucalculusParser.ListConsDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListConsDataExpr(@NotNull mucalculusParser.ListConsDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#bagEnumElt}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumElt(@NotNull mucalculusParser.BagEnumEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#bagEnumElt}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumElt(@NotNull mucalculusParser.BagEnumEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#dataSpec}.
	 * @param ctx the parse tree
	 */
	void enterDataSpec(@NotNull mucalculusParser.DataSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#dataSpec}.
	 * @param ctx the parse tree
	 */
	void exitDataSpec(@NotNull mucalculusParser.DataSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NaturalNumSort}.
	 * @param ctx the parse tree
	 */
	void enterNaturalNumSort(@NotNull mucalculusParser.NaturalNumSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NaturalNumSort}.
	 * @param ctx the parse tree
	 */
	void exitNaturalNumSort(@NotNull mucalculusParser.NaturalNumSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDataValueExpressionStateFrm(@NotNull mucalculusParser.DataValueExpressionStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDataValueExpressionStateFrm(@NotNull mucalculusParser.DataValueExpressionStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDiamondModalityStateFrm(@NotNull mucalculusParser.DiamondModalityStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDiamondModalityStateFrm(@NotNull mucalculusParser.DiamondModalityStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#idsDecl}.
	 * @param ctx the parse tree
	 */
	void enterIdsDecl(@NotNull mucalculusParser.IdsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#idsDecl}.
	 * @param ctx the parse tree
	 */
	void exitIdsDecl(@NotNull mucalculusParser.IdsDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#eqnSpec}.
	 * @param ctx the parse tree
	 */
	void enterEqnSpec(@NotNull mucalculusParser.EqnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#eqnSpec}.
	 * @param ctx the parse tree
	 */
	void exitEqnSpec(@NotNull mucalculusParser.EqnSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull mucalculusParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull mucalculusParser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FalseDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseDataExpr(@NotNull mucalculusParser.FalseDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FalseDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseDataExpr(@NotNull mucalculusParser.FalseDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#globVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterGlobVarSpec(@NotNull mucalculusParser.GlobVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#globVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitGlobVarSpec(@NotNull mucalculusParser.GlobVarSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierStateFrm(@NotNull mucalculusParser.UniversalQuantifierStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierStateFrm(@NotNull mucalculusParser.UniversalQuantifierStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierDataExpr(@NotNull mucalculusParser.ExistentialQuantifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierDataExpr(@NotNull mucalculusParser.ExistentialQuantifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 */
	void enterActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 */
	void exitActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#mapSpec}.
	 * @param ctx the parse tree
	 */
	void enterMapSpec(@NotNull mucalculusParser.MapSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#mapSpec}.
	 * @param ctx the parse tree
	 */
	void exitMapSpec(@NotNull mucalculusParser.MapSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEqualDataExpr(@NotNull mucalculusParser.SmallerEqualDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEqualDataExpr(@NotNull mucalculusParser.SmallerEqualDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#projDeclList}.
	 * @param ctx the parse tree
	 */
	void enterProjDeclList(@NotNull mucalculusParser.ProjDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#projDeclList}.
	 * @param ctx the parse tree
	 */
	void exitProjDeclList(@NotNull mucalculusParser.ProjDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterPBESVariableStateFrm(@NotNull mucalculusParser.PBESVariableStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitPBESVariableStateFrm(@NotNull mucalculusParser.PBESVariableStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierStateFrm(@NotNull mucalculusParser.ExistentialQuantifierStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierStateFrm(@NotNull mucalculusParser.ExistentialQuantifierStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#constrDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstrDecl(@NotNull mucalculusParser.ConstrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#constrDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstrDecl(@NotNull mucalculusParser.ConstrDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#dataValExpr}.
	 * @param ctx the parse tree
	 */
	void enterDataValExpr(@NotNull mucalculusParser.DataValExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#dataValExpr}.
	 * @param ctx the parse tree
	 */
	void exitDataValExpr(@NotNull mucalculusParser.DataValExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterInequalityDataExpr(@NotNull mucalculusParser.InequalityDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitInequalityDataExpr(@NotNull mucalculusParser.InequalityDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDivDataExpr(@NotNull mucalculusParser.IntegerDivDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDivDataExpr(@NotNull mucalculusParser.IntegerDivDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsActionFrm(@NotNull mucalculusParser.BracketsActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsActionFrm(@NotNull mucalculusParser.BracketsActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#bagEnumEltList}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumEltList(@NotNull mucalculusParser.BagEnumEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#bagEnumEltList}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumEltList(@NotNull mucalculusParser.BagEnumEltListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 */
	void enterStateVarAssignmentList(@NotNull mucalculusParser.StateVarAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 */
	void exitStateVarAssignmentList(@NotNull mucalculusParser.StateVarAssignmentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierActionFrm(@NotNull mucalculusParser.ExistentialQuantifierActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierActionFrm(@NotNull mucalculusParser.ExistentialQuantifierActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#MultiAction}.
	 * @param ctx the parse tree
	 */
	void enterMultiAction(@NotNull mucalculusParser.MultiActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#MultiAction}.
	 * @param ctx the parse tree
	 */
	void exitMultiAction(@NotNull mucalculusParser.MultiActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetDataExpr(@NotNull mucalculusParser.EmptySetDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetDataExpr(@NotNull mucalculusParser.EmptySetDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#actionList}.
	 * @param ctx the parse tree
	 */
	void enterActionList(@NotNull mucalculusParser.ActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#actionList}.
	 * @param ctx the parse tree
	 */
	void exitActionList(@NotNull mucalculusParser.ActionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityDataExpr(@NotNull mucalculusParser.EqualityDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityDataExpr(@NotNull mucalculusParser.EqualityDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplicationDataExpr(@NotNull mucalculusParser.ImplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplicationDataExpr(@NotNull mucalculusParser.ImplicationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull mucalculusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull mucalculusParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterAtOperatorActionFrm(@NotNull mucalculusParser.AtOperatorActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitAtOperatorActionFrm(@NotNull mucalculusParser.AtOperatorActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDelayOpStateFrm(@NotNull mucalculusParser.DelayOpStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDelayOpStateFrm(@NotNull mucalculusParser.DelayOpStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierDataExpr(@NotNull mucalculusParser.IdentifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierDataExpr(@NotNull mucalculusParser.IdentifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#eqnDecl}.
	 * @param ctx the parse tree
	 */
	void enterEqnDecl(@NotNull mucalculusParser.EqnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#eqnDecl}.
	 * @param ctx the parse tree
	 */
	void exitEqnDecl(@NotNull mucalculusParser.EqnDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#UnionOfActions}.
	 * @param ctx the parse tree
	 */
	void enterUnionOfActions(@NotNull mucalculusParser.UnionOfActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#UnionOfActions}.
	 * @param ctx the parse tree
	 */
	void exitUnionOfActions(@NotNull mucalculusParser.UnionOfActionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NegationStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterNegationStateFrm(@NotNull mucalculusParser.NegationStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NegationStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitNegationStateFrm(@NotNull mucalculusParser.NegationStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#consSpec}.
	 * @param ctx the parse tree
	 */
	void enterConsSpec(@NotNull mucalculusParser.ConsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#consSpec}.
	 * @param ctx the parse tree
	 */
	void exitConsSpec(@NotNull mucalculusParser.ConsSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(@NotNull mucalculusParser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(@NotNull mucalculusParser.VarSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#sortSpec}.
	 * @param ctx the parse tree
	 */
	void enterSortSpec(@NotNull mucalculusParser.SortSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#sortSpec}.
	 * @param ctx the parse tree
	 */
	void exitSortSpec(@NotNull mucalculusParser.SortSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterYaledOpStateFrm(@NotNull mucalculusParser.YaledOpStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitYaledOpStateFrm(@NotNull mucalculusParser.YaledOpStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierActionFrm(@NotNull mucalculusParser.UniversalQuantifierActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierActionFrm(@NotNull mucalculusParser.UniversalQuantifierActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BracketsRegForm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsRegForm(@NotNull mucalculusParser.BracketsRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BracketsRegForm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsRegForm(@NotNull mucalculusParser.BracketsRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDataExpr(@NotNull mucalculusParser.LambdaDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDataExpr(@NotNull mucalculusParser.LambdaDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void enterSortDecl(@NotNull mucalculusParser.SortDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void exitSortDecl(@NotNull mucalculusParser.SortDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUpdateDataExpr(@NotNull mucalculusParser.FunctionUpdateDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUpdateDataExpr(@NotNull mucalculusParser.FunctionUpdateDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetEnumerationDataExpr(@NotNull mucalculusParser.SetEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetEnumerationDataExpr(@NotNull mucalculusParser.SetEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationDataExpr(@NotNull mucalculusParser.MultiplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationDataExpr(@NotNull mucalculusParser.MultiplicationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListConcatenationDataExpr(@NotNull mucalculusParser.ListConcatenationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListConcatenationDataExpr(@NotNull mucalculusParser.ListConcatenationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#varsDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarsDeclList(@NotNull mucalculusParser.VarsDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#varsDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarsDeclList(@NotNull mucalculusParser.VarsDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull mucalculusParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull mucalculusParser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeCompositionRegForm(@NotNull mucalculusParser.AlternativeCompositionRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeCompositionRegForm(@NotNull mucalculusParser.AlternativeCompositionRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#projDecl}.
	 * @param ctx the parse tree
	 */
	void enterProjDecl(@NotNull mucalculusParser.ProjDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#projDecl}.
	 * @param ctx the parse tree
	 */
	void exitProjDecl(@NotNull mucalculusParser.ProjDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOfActions(@NotNull mucalculusParser.IntersectionOfActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOfActions(@NotNull mucalculusParser.IntersectionOfActionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NegationActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterNegationActionFrm(@NotNull mucalculusParser.NegationActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NegationActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitNegationActionFrm(@NotNull mucalculusParser.NegationActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#LargerDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLargerDataExpr(@NotNull mucalculusParser.LargerDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#LargerDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLargerDataExpr(@NotNull mucalculusParser.LargerDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#PositiveNumSort}.
	 * @param ctx the parse tree
	 */
	void enterPositiveNumSort(@NotNull mucalculusParser.PositiveNumSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#PositiveNumSort}.
	 * @param ctx the parse tree
	 */
	void exitPositiveNumSort(@NotNull mucalculusParser.PositiveNumSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusDataExpr(@NotNull mucalculusParser.UnaryMinusDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusDataExpr(@NotNull mucalculusParser.UnaryMinusDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NuOperator}.
	 * @param ctx the parse tree
	 */
	void enterNuOperator(@NotNull mucalculusParser.NuOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NuOperator}.
	 * @param ctx the parse tree
	 */
	void exitNuOperator(@NotNull mucalculusParser.NuOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhereClauseDataExpr(@NotNull mucalculusParser.WhereClauseDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhereClauseDataExpr(@NotNull mucalculusParser.WhereClauseDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#stateVarAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStateVarAssignment(@NotNull mucalculusParser.StateVarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#stateVarAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStateVarAssignment(@NotNull mucalculusParser.StateVarAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListSizeDataExpr(@NotNull mucalculusParser.ListSizeDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListSizeDataExpr(@NotNull mucalculusParser.ListSizeDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#TrueStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#TrueStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionDataExpr(@NotNull mucalculusParser.SubtractionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionDataExpr(@NotNull mucalculusParser.SubtractionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#TrueDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueDataExpr(@NotNull mucalculusParser.TrueDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#TrueDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueDataExpr(@NotNull mucalculusParser.TrueDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NumberDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberDataExpr(@NotNull mucalculusParser.NumberDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NumberDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberDataExpr(@NotNull mucalculusParser.NumberDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FalseStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterFalseStateFrm(@NotNull mucalculusParser.FalseStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FalseStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitFalseStateFrm(@NotNull mucalculusParser.FalseStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#Implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(@NotNull mucalculusParser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#Implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(@NotNull mucalculusParser.ImplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionDataExpr(@NotNull mucalculusParser.ConjunctionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionDataExpr(@NotNull mucalculusParser.ConjunctionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionDataExpr(@NotNull mucalculusParser.DisjunctionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionDataExpr(@NotNull mucalculusParser.DisjunctionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void enterSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void exitSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#TrueActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterTrueActionFrm(@NotNull mucalculusParser.TrueActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#TrueActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitTrueActionFrm(@NotNull mucalculusParser.TrueActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivisionDataExpr(@NotNull mucalculusParser.DivisionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivisionDataExpr(@NotNull mucalculusParser.DivisionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#RealSort}.
	 * @param ctx the parse tree
	 */
	void enterRealSort(@NotNull mucalculusParser.RealSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#RealSort}.
	 * @param ctx the parse tree
	 */
	void exitRealSort(@NotNull mucalculusParser.RealSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#MuStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterMuStateFrm(@NotNull mucalculusParser.MuStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#MuStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitMuStateFrm(@NotNull mucalculusParser.MuStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegationSetComplementDataExpr(@NotNull mucalculusParser.NegationSetComplementDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegationSetComplementDataExpr(@NotNull mucalculusParser.NegationSetComplementDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BagSort}.
	 * @param ctx the parse tree
	 */
	void enterBagSort(@NotNull mucalculusParser.BagSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BagSort}.
	 * @param ctx the parse tree
	 */
	void exitBagSort(@NotNull mucalculusParser.BagSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SetSort}.
	 * @param ctx the parse tree
	 */
	void enterSetSort(@NotNull mucalculusParser.SetSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SetSort}.
	 * @param ctx the parse tree
	 */
	void exitSetSort(@NotNull mucalculusParser.SetSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#MuOperator}.
	 * @param ctx the parse tree
	 */
	void enterMuOperator(@NotNull mucalculusParser.MuOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#MuOperator}.
	 * @param ctx the parse tree
	 */
	void exitMuOperator(@NotNull mucalculusParser.MuOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NilRegForm}.
	 * @param ctx the parse tree
	 */
	void enterNilRegForm(@NotNull mucalculusParser.NilRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NilRegForm}.
	 * @param ctx the parse tree
	 */
	void exitNilRegForm(@NotNull mucalculusParser.NilRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionStateFrm(@NotNull mucalculusParser.ConjunctionStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionStateFrm(@NotNull mucalculusParser.ConjunctionStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FalseActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterFalseActionFrm(@NotNull mucalculusParser.FalseActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FalseActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitFalseActionFrm(@NotNull mucalculusParser.FalseActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull mucalculusParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull mucalculusParser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IntegerSort}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSort(@NotNull mucalculusParser.IntegerSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IntegerSort}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSort(@NotNull mucalculusParser.IntegerSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionDataExpr(@NotNull mucalculusParser.AdditionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionDataExpr(@NotNull mucalculusParser.AdditionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#constrDeclList}.
	 * @param ctx the parse tree
	 */
	void enterConstrDeclList(@NotNull mucalculusParser.ConstrDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#constrDeclList}.
	 * @param ctx the parse tree
	 */
	void exitConstrDeclList(@NotNull mucalculusParser.ConstrDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SortReference}.
	 * @param ctx the parse tree
	 */
	void enterSortReference(@NotNull mucalculusParser.SortReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SortReference}.
	 * @param ctx the parse tree
	 */
	void exitSortReference(@NotNull mucalculusParser.SortReferenceContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(@NotNull mucalculusParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(@NotNull mucalculusParser.AssignmentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListEnumerationDataExpr(@NotNull mucalculusParser.ListEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListEnumerationDataExpr(@NotNull mucalculusParser.ListEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumerationDataExpr(@NotNull mucalculusParser.BagEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumerationDataExpr(@NotNull mucalculusParser.BagEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionStateFmr(@NotNull mucalculusParser.DisjunctionStateFmrContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionStateFmr(@NotNull mucalculusParser.DisjunctionStateFmrContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerDataExpr(@NotNull mucalculusParser.SmallerDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerDataExpr(@NotNull mucalculusParser.SmallerDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#BooleanSort}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSort(@NotNull mucalculusParser.BooleanSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#BooleanSort}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSort(@NotNull mucalculusParser.BooleanSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerModDataExpr(@NotNull mucalculusParser.IntegerModDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerModDataExpr(@NotNull mucalculusParser.IntegerModDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLargerEqualDataExpr(@NotNull mucalculusParser.LargerEqualDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLargerEqualDataExpr(@NotNull mucalculusParser.LargerEqualDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#stateVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterStateVarDecl(@NotNull mucalculusParser.StateVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#stateVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitStateVarDecl(@NotNull mucalculusParser.StateVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#IterationRegForm}.
	 * @param ctx the parse tree
	 */
	void enterIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#IterationRegForm}.
	 * @param ctx the parse tree
	 */
	void exitIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyListDataExpr(@NotNull mucalculusParser.EmptyListDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyListDataExpr(@NotNull mucalculusParser.EmptyListDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterMemberShipSetBagDataExpr(@NotNull mucalculusParser.MemberShipSetBagDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitMemberShipSetBagDataExpr(@NotNull mucalculusParser.MemberShipSetBagDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#hashArgs}.
	 * @param ctx the parse tree
	 */
	void enterHashArgs(@NotNull mucalculusParser.HashArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#hashArgs}.
	 * @param ctx the parse tree
	 */
	void exitHashArgs(@NotNull mucalculusParser.HashArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#StructuredSort}.
	 * @param ctx the parse tree
	 */
	void enterStructuredSort(@NotNull mucalculusParser.StructuredSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#StructuredSort}.
	 * @param ctx the parse tree
	 */
	void exitStructuredSort(@NotNull mucalculusParser.StructuredSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void enterSortExpr(@NotNull mucalculusParser.SortExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#sortExpr}.
	 * @param ctx the parse tree
	 */
	void exitSortExpr(@NotNull mucalculusParser.SortExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#dataExprList}.
	 * @param ctx the parse tree
	 */
	void enterDataExprList(@NotNull mucalculusParser.DataExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#dataExprList}.
	 * @param ctx the parse tree
	 */
	void exitDataExprList(@NotNull mucalculusParser.DataExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListElemPositionDataExpr(@NotNull mucalculusParser.ListElemPositionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListElemPositionDataExpr(@NotNull mucalculusParser.ListElemPositionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mucalculusParser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplicationDataExpr(@NotNull mucalculusParser.FunctionApplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mucalculusParser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplicationDataExpr(@NotNull mucalculusParser.FunctionApplicationDataExprContext ctx);
}
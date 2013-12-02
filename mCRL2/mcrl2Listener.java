// Generated from info/remenska/PASS/monitor/mCRL2/mcrl2.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mcrl2Parser}.
 */
public interface mcrl2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterImplicationStateFrm(@NotNull mcrl2Parser.ImplicationStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitImplicationStateFrm(@NotNull mcrl2Parser.ImplicationStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsStateFrm(@NotNull mcrl2Parser.BracketsStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsStateFrm(@NotNull mcrl2Parser.BracketsStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#multAct}.
	 * @param ctx the parse tree
	 */
	void enterMultAct(@NotNull mcrl2Parser.MultActContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#multAct}.
	 * @param ctx the parse tree
	 */
	void exitMultAct(@NotNull mcrl2Parser.MultActContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#sortSimpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSortSimpleExpr(@NotNull mcrl2Parser.SortSimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#sortSimpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSortSimpleExpr(@NotNull mcrl2Parser.SortSimpleExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarsDecl(@NotNull mcrl2Parser.VarsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#varsDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarsDecl(@NotNull mcrl2Parser.VarsDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierDataExpr(@NotNull mcrl2Parser.UniversalQuantifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierDataExpr(@NotNull mcrl2Parser.UniversalQuantifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterDataValueExpressionActionFrm(@NotNull mcrl2Parser.DataValueExpressionActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitDataValueExpressionActionFrm(@NotNull mcrl2Parser.DataValueExpressionActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetBagComprehensionDataExpr(@NotNull mcrl2Parser.SetBagComprehensionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetBagComprehensionDataExpr(@NotNull mcrl2Parser.SetBagComprehensionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListSort}.
	 * @param ctx the parse tree
	 */
	void enterListSort(@NotNull mcrl2Parser.ListSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListSort}.
	 * @param ctx the parse tree
	 */
	void exitListSort(@NotNull mcrl2Parser.ListSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(@NotNull mcrl2Parser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(@NotNull mcrl2Parser.IdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FunctionSort}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSort(@NotNull mcrl2Parser.FunctionSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FunctionSort}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSort(@NotNull mcrl2Parser.FunctionSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#MapmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterMapmCRL2SpecElt(@NotNull mcrl2Parser.MapmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#MapmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitMapmCRL2SpecElt(@NotNull mcrl2Parser.MapmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListSnocDataExpr(@NotNull mcrl2Parser.ListSnocDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListSnocDataExpr(@NotNull mcrl2Parser.ListSnocDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actIdSet}.
	 * @param ctx the parse tree
	 */
	void enterActIdSet(@NotNull mcrl2Parser.ActIdSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actIdSet}.
	 * @param ctx the parse tree
	 */
	void exitActIdSet(@NotNull mcrl2Parser.ActIdSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#mCRL2Spec}.
	 * @param ctx the parse tree
	 */
	void enterMCRL2Spec(@NotNull mcrl2Parser.MCRL2SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#mCRL2Spec}.
	 * @param ctx the parse tree
	 */
	void exitMCRL2Spec(@NotNull mcrl2Parser.MCRL2SpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyBagDataExpr(@NotNull mcrl2Parser.EmptyBagDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyBagDataExpr(@NotNull mcrl2Parser.EmptyBagDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracketsDataExpr(@NotNull mcrl2Parser.BracketsDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracketsDataExpr(@NotNull mcrl2Parser.BracketsDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NuStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterNuStateFrm(@NotNull mcrl2Parser.NuStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NuStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitNuStateFrm(@NotNull mcrl2Parser.NuStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListConsDataExpr(@NotNull mcrl2Parser.ListConsDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListConsDataExpr(@NotNull mcrl2Parser.ListConsDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#bagEnumElt}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumElt(@NotNull mcrl2Parser.BagEnumEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#bagEnumElt}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumElt(@NotNull mcrl2Parser.BagEnumEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#dataSpec}.
	 * @param ctx the parse tree
	 */
	void enterDataSpec(@NotNull mcrl2Parser.DataSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#dataSpec}.
	 * @param ctx the parse tree
	 */
	void exitDataSpec(@NotNull mcrl2Parser.DataSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDataValueExpressionStateFrm(@NotNull mcrl2Parser.DataValueExpressionStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDataValueExpressionStateFrm(@NotNull mcrl2Parser.DataValueExpressionStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#multActId}.
	 * @param ctx the parse tree
	 */
	void enterMultActId(@NotNull mcrl2Parser.MultActIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#multActId}.
	 * @param ctx the parse tree
	 */
	void exitMultActId(@NotNull mcrl2Parser.MultActIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#renExprSet}.
	 * @param ctx the parse tree
	 */
	void enterRenExprSet(@NotNull mcrl2Parser.RenExprSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#renExprSet}.
	 * @param ctx the parse tree
	 */
	void exitRenExprSet(@NotNull mcrl2Parser.RenExprSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#procDecl}.
	 * @param ctx the parse tree
	 */
	void enterProcDecl(@NotNull mcrl2Parser.ProcDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#procDecl}.
	 * @param ctx the parse tree
	 */
	void exitProcDecl(@NotNull mcrl2Parser.ProcDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actionRenameSpec}.
	 * @param ctx the parse tree
	 */
	void enterActionRenameSpec(@NotNull mcrl2Parser.ActionRenameSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actionRenameSpec}.
	 * @param ctx the parse tree
	 */
	void exitActionRenameSpec(@NotNull mcrl2Parser.ActionRenameSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDiamondModalityStateFrm(@NotNull mcrl2Parser.DiamondModalityStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDiamondModalityStateFrm(@NotNull mcrl2Parser.DiamondModalityStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#dataExprUnit}.
	 * @param ctx the parse tree
	 */
	void enterDataExprUnit(@NotNull mcrl2Parser.DataExprUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#dataExprUnit}.
	 * @param ctx the parse tree
	 */
	void exitDataExprUnit(@NotNull mcrl2Parser.DataExprUnitContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#pbesSpec}.
	 * @param ctx the parse tree
	 */
	void enterPbesSpec(@NotNull mcrl2Parser.PbesSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#pbesSpec}.
	 * @param ctx the parse tree
	 */
	void exitPbesSpec(@NotNull mcrl2Parser.PbesSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ConsmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterConsmCRL2SpecElt(@NotNull mcrl2Parser.ConsmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ConsmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitConsmCRL2SpecElt(@NotNull mcrl2Parser.ConsmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#idsDecl}.
	 * @param ctx the parse tree
	 */
	void enterIdsDecl(@NotNull mcrl2Parser.IdsDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#idsDecl}.
	 * @param ctx the parse tree
	 */
	void exitIdsDecl(@NotNull mcrl2Parser.IdsDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#eqnSpec}.
	 * @param ctx the parse tree
	 */
	void enterEqnSpec(@NotNull mcrl2Parser.EqnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#eqnSpec}.
	 * @param ctx the parse tree
	 */
	void exitEqnSpec(@NotNull mcrl2Parser.EqnSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NaturalSort}.
	 * @param ctx the parse tree
	 */
	void enterNaturalSort(@NotNull mcrl2Parser.NaturalSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NaturalSort}.
	 * @param ctx the parse tree
	 */
	void exitNaturalSort(@NotNull mcrl2Parser.NaturalSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(@NotNull mcrl2Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(@NotNull mcrl2Parser.StartContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FSetSort}.
	 * @param ctx the parse tree
	 */
	void enterFSetSort(@NotNull mcrl2Parser.FSetSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FSetSort}.
	 * @param ctx the parse tree
	 */
	void exitFSetSort(@NotNull mcrl2Parser.FSetSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FalseDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFalseDataExpr(@NotNull mcrl2Parser.FalseDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FalseDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFalseDataExpr(@NotNull mcrl2Parser.FalseDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besExpr}.
	 * @param ctx the parse tree
	 */
	void enterBesExpr(@NotNull mcrl2Parser.BesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besExpr}.
	 * @param ctx the parse tree
	 */
	void exitBesExpr(@NotNull mcrl2Parser.BesExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierStateFrm(@NotNull mcrl2Parser.UniversalQuantifierStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierStateFrm(@NotNull mcrl2Parser.UniversalQuantifierStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#pbesEqnSpec}.
	 * @param ctx the parse tree
	 */
	void enterPbesEqnSpec(@NotNull mcrl2Parser.PbesEqnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#pbesEqnSpec}.
	 * @param ctx the parse tree
	 */
	void exitPbesEqnSpec(@NotNull mcrl2Parser.PbesEqnSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#globVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterGlobVarSpec(@NotNull mcrl2Parser.GlobVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#globVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitGlobVarSpec(@NotNull mcrl2Parser.GlobVarSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierDataExpr(@NotNull mcrl2Parser.ExistentialQuantifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierDataExpr(@NotNull mcrl2Parser.ExistentialQuantifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actionRenameRule}.
	 * @param ctx the parse tree
	 */
	void enterActionRenameRule(@NotNull mcrl2Parser.ActionRenameRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actionRenameRule}.
	 * @param ctx the parse tree
	 */
	void exitActionRenameRule(@NotNull mcrl2Parser.ActionRenameRuleContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 */
	void enterActionFormulaRegForm(@NotNull mcrl2Parser.ActionFormulaRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 */
	void exitActionFormulaRegForm(@NotNull mcrl2Parser.ActionFormulaRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#mapSpec}.
	 * @param ctx the parse tree
	 */
	void enterMapSpec(@NotNull mcrl2Parser.MapSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#mapSpec}.
	 * @param ctx the parse tree
	 */
	void exitMapSpec(@NotNull mcrl2Parser.MapSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerEqualDataExpr(@NotNull mcrl2Parser.SmallerEqualDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerEqualDataExpr(@NotNull mcrl2Parser.SmallerEqualDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#projDeclList}.
	 * @param ctx the parse tree
	 */
	void enterProjDeclList(@NotNull mcrl2Parser.ProjDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#projDeclList}.
	 * @param ctx the parse tree
	 */
	void exitProjDeclList(@NotNull mcrl2Parser.ProjDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterPBESVariableStateFrm(@NotNull mcrl2Parser.PBESVariableStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitPBESVariableStateFrm(@NotNull mcrl2Parser.PBESVariableStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#GlobalVarmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVarmCRL2SpecElt(@NotNull mcrl2Parser.GlobalVarmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#GlobalVarmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVarmCRL2SpecElt(@NotNull mcrl2Parser.GlobalVarmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierStateFrm(@NotNull mcrl2Parser.ExistentialQuantifierStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierStateFrm(@NotNull mcrl2Parser.ExistentialQuantifierStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#EqnmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterEqnmCRL2SpecElt(@NotNull mcrl2Parser.EqnmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#EqnmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitEqnmCRL2SpecElt(@NotNull mcrl2Parser.EqnmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actionRenameRuleSpec}.
	 * @param ctx the parse tree
	 */
	void enterActionRenameRuleSpec(@NotNull mcrl2Parser.ActionRenameRuleSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actionRenameRuleSpec}.
	 * @param ctx the parse tree
	 */
	void exitActionRenameRuleSpec(@NotNull mcrl2Parser.ActionRenameRuleSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#constrDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstrDecl(@NotNull mcrl2Parser.ConstrDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#constrDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstrDecl(@NotNull mcrl2Parser.ConstrDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#fixedPointOperator}.
	 * @param ctx the parse tree
	 */
	void enterFixedPointOperator(@NotNull mcrl2Parser.FixedPointOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#fixedPointOperator}.
	 * @param ctx the parse tree
	 */
	void exitFixedPointOperator(@NotNull mcrl2Parser.FixedPointOperatorContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besInit}.
	 * @param ctx the parse tree
	 */
	void enterBesInit(@NotNull mcrl2Parser.BesInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besInit}.
	 * @param ctx the parse tree
	 */
	void exitBesInit(@NotNull mcrl2Parser.BesInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#dataValExpr}.
	 * @param ctx the parse tree
	 */
	void enterDataValExpr(@NotNull mcrl2Parser.DataValExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#dataValExpr}.
	 * @param ctx the parse tree
	 */
	void exitDataValExpr(@NotNull mcrl2Parser.DataValExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SortRefSort}.
	 * @param ctx the parse tree
	 */
	void enterSortRefSort(@NotNull mcrl2Parser.SortRefSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SortRefSort}.
	 * @param ctx the parse tree
	 */
	void exitSortRefSort(@NotNull mcrl2Parser.SortRefSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterInequalityDataExpr(@NotNull mcrl2Parser.InequalityDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitInequalityDataExpr(@NotNull mcrl2Parser.InequalityDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerDivDataExpr(@NotNull mcrl2Parser.IntegerDivDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerDivDataExpr(@NotNull mcrl2Parser.IntegerDivDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsActionFrm(@NotNull mcrl2Parser.BracketsActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsActionFrm(@NotNull mcrl2Parser.BracketsActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#bagEnumEltList}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumEltList(@NotNull mcrl2Parser.BagEnumEltListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#bagEnumEltList}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumEltList(@NotNull mcrl2Parser.BagEnumEltListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 */
	void enterStateVarAssignmentList(@NotNull mcrl2Parser.StateVarAssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 */
	void exitStateVarAssignmentList(@NotNull mcrl2Parser.StateVarAssignmentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterExistentialQuantifierActionFrm(@NotNull mcrl2Parser.ExistentialQuantifierActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitExistentialQuantifierActionFrm(@NotNull mcrl2Parser.ExistentialQuantifierActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#MultiAction}.
	 * @param ctx the parse tree
	 */
	void enterMultiAction(@NotNull mcrl2Parser.MultiActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#MultiAction}.
	 * @param ctx the parse tree
	 */
	void exitMultiAction(@NotNull mcrl2Parser.MultiActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#propVarInst}.
	 * @param ctx the parse tree
	 */
	void enterPropVarInst(@NotNull mcrl2Parser.PropVarInstContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#propVarInst}.
	 * @param ctx the parse tree
	 */
	void exitPropVarInst(@NotNull mcrl2Parser.PropVarInstContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptySetDataExpr(@NotNull mcrl2Parser.EmptySetDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptySetDataExpr(@NotNull mcrl2Parser.EmptySetDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actionList}.
	 * @param ctx the parse tree
	 */
	void enterActionList(@NotNull mcrl2Parser.ActionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actionList}.
	 * @param ctx the parse tree
	 */
	void exitActionList(@NotNull mcrl2Parser.ActionListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actionRenameRuleRHS}.
	 * @param ctx the parse tree
	 */
	void enterActionRenameRuleRHS(@NotNull mcrl2Parser.ActionRenameRuleRHSContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actionRenameRuleRHS}.
	 * @param ctx the parse tree
	 */
	void exitActionRenameRuleRHS(@NotNull mcrl2Parser.ActionRenameRuleRHSContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#pbesInit}.
	 * @param ctx the parse tree
	 */
	void enterPbesInit(@NotNull mcrl2Parser.PbesInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#pbesInit}.
	 * @param ctx the parse tree
	 */
	void exitPbesInit(@NotNull mcrl2Parser.PbesInitContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#procSpec}.
	 * @param ctx the parse tree
	 */
	void enterProcSpec(@NotNull mcrl2Parser.ProcSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#procSpec}.
	 * @param ctx the parse tree
	 */
	void exitProcSpec(@NotNull mcrl2Parser.ProcSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityDataExpr(@NotNull mcrl2Parser.EqualityDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityDataExpr(@NotNull mcrl2Parser.EqualityDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterBoxModalityStateFrm(@NotNull mcrl2Parser.BoxModalityStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitBoxModalityStateFrm(@NotNull mcrl2Parser.BoxModalityStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterImplicationDataExpr(@NotNull mcrl2Parser.ImplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitImplicationDataExpr(@NotNull mcrl2Parser.ImplicationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull mcrl2Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull mcrl2Parser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterAtOperatorActionFrm(@NotNull mcrl2Parser.AtOperatorActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitAtOperatorActionFrm(@NotNull mcrl2Parser.AtOperatorActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterDelayOpStateFrm(@NotNull mcrl2Parser.DelayOpStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitDelayOpStateFrm(@NotNull mcrl2Parser.DelayOpStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ActmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterActmCRL2SpecElt(@NotNull mcrl2Parser.ActmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ActmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitActmCRL2SpecElt(@NotNull mcrl2Parser.ActmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierDataExpr(@NotNull mcrl2Parser.IdentifierDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierDataExpr(@NotNull mcrl2Parser.IdentifierDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	void enterIfThen(@NotNull mcrl2Parser.IfThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ifThen}.
	 * @param ctx the parse tree
	 */
	void exitIfThen(@NotNull mcrl2Parser.IfThenContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#UnionOfActions}.
	 * @param ctx the parse tree
	 */
	void enterUnionOfActions(@NotNull mcrl2Parser.UnionOfActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#UnionOfActions}.
	 * @param ctx the parse tree
	 */
	void exitUnionOfActions(@NotNull mcrl2Parser.UnionOfActionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#eqnDecl}.
	 * @param ctx the parse tree
	 */
	void enterEqnDecl(@NotNull mcrl2Parser.EqnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#eqnDecl}.
	 * @param ctx the parse tree
	 */
	void exitEqnDecl(@NotNull mcrl2Parser.EqnDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NegationStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterNegationStateFrm(@NotNull mcrl2Parser.NegationStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NegationStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitNegationStateFrm(@NotNull mcrl2Parser.NegationStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#varSpec}.
	 * @param ctx the parse tree
	 */
	void enterVarSpec(@NotNull mcrl2Parser.VarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#varSpec}.
	 * @param ctx the parse tree
	 */
	void exitVarSpec(@NotNull mcrl2Parser.VarSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#consSpec}.
	 * @param ctx the parse tree
	 */
	void enterConsSpec(@NotNull mcrl2Parser.ConsSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#consSpec}.
	 * @param ctx the parse tree
	 */
	void exitConsSpec(@NotNull mcrl2Parser.ConsSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#sortSpec}.
	 * @param ctx the parse tree
	 */
	void enterSortSpec(@NotNull mcrl2Parser.SortSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#sortSpec}.
	 * @param ctx the parse tree
	 */
	void exitSortSpec(@NotNull mcrl2Parser.SortSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ProcmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterProcmCRL2SpecElt(@NotNull mcrl2Parser.ProcmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ProcmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitProcmCRL2SpecElt(@NotNull mcrl2Parser.ProcmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterYaledOpStateFrm(@NotNull mcrl2Parser.YaledOpStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitYaledOpStateFrm(@NotNull mcrl2Parser.YaledOpStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besVar}.
	 * @param ctx the parse tree
	 */
	void enterBesVar(@NotNull mcrl2Parser.BesVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besVar}.
	 * @param ctx the parse tree
	 */
	void exitBesVar(@NotNull mcrl2Parser.BesVarContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BracketsRegForm}.
	 * @param ctx the parse tree
	 */
	void enterBracketsRegForm(@NotNull mcrl2Parser.BracketsRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BracketsRegForm}.
	 * @param ctx the parse tree
	 */
	void exitBracketsRegForm(@NotNull mcrl2Parser.BracketsRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterUniversalQuantifierActionFrm(@NotNull mcrl2Parser.UniversalQuantifierActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitUniversalQuantifierActionFrm(@NotNull mcrl2Parser.UniversalQuantifierActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLambdaDataExpr(@NotNull mcrl2Parser.LambdaDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLambdaDataExpr(@NotNull mcrl2Parser.LambdaDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void enterSortDecl(@NotNull mcrl2Parser.SortDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#sortDecl}.
	 * @param ctx the parse tree
	 */
	void exitSortDecl(@NotNull mcrl2Parser.SortDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionUpdateDataExpr(@NotNull mcrl2Parser.FunctionUpdateDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionUpdateDataExpr(@NotNull mcrl2Parser.FunctionUpdateDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#PositiveSort}.
	 * @param ctx the parse tree
	 */
	void enterPositiveSort(@NotNull mcrl2Parser.PositiveSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#PositiveSort}.
	 * @param ctx the parse tree
	 */
	void exitPositiveSort(@NotNull mcrl2Parser.PositiveSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetEnumerationDataExpr(@NotNull mcrl2Parser.SetEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetEnumerationDataExpr(@NotNull mcrl2Parser.SetEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicationDataExpr(@NotNull mcrl2Parser.MultiplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicationDataExpr(@NotNull mcrl2Parser.MultiplicationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListConcatenationDataExpr(@NotNull mcrl2Parser.ListConcatenationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListConcatenationDataExpr(@NotNull mcrl2Parser.ListConcatenationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#varsDeclList}.
	 * @param ctx the parse tree
	 */
	void enterVarsDeclList(@NotNull mcrl2Parser.VarsDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#varsDeclList}.
	 * @param ctx the parse tree
	 */
	void exitVarsDeclList(@NotNull mcrl2Parser.VarsDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void enterAlternativeCompositionRegForm(@NotNull mcrl2Parser.AlternativeCompositionRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void exitAlternativeCompositionRegForm(@NotNull mcrl2Parser.AlternativeCompositionRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(@NotNull mcrl2Parser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(@NotNull mcrl2Parser.ActionContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 */
	void enterIntersectionOfActions(@NotNull mcrl2Parser.IntersectionOfActionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 */
	void exitIntersectionOfActions(@NotNull mcrl2Parser.IntersectionOfActionsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#projDecl}.
	 * @param ctx the parse tree
	 */
	void enterProjDecl(@NotNull mcrl2Parser.ProjDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#projDecl}.
	 * @param ctx the parse tree
	 */
	void exitProjDecl(@NotNull mcrl2Parser.ProjDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FBagSort}.
	 * @param ctx the parse tree
	 */
	void enterFBagSort(@NotNull mcrl2Parser.FBagSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FBagSort}.
	 * @param ctx the parse tree
	 */
	void exitFBagSort(@NotNull mcrl2Parser.FBagSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NegationActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterNegationActionFrm(@NotNull mcrl2Parser.NegationActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NegationActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitNegationActionFrm(@NotNull mcrl2Parser.NegationActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#LargerDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLargerDataExpr(@NotNull mcrl2Parser.LargerDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#LargerDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLargerDataExpr(@NotNull mcrl2Parser.LargerDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besEqnDecl}.
	 * @param ctx the parse tree
	 */
	void enterBesEqnDecl(@NotNull mcrl2Parser.BesEqnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besEqnDecl}.
	 * @param ctx the parse tree
	 */
	void exitBesEqnDecl(@NotNull mcrl2Parser.BesEqnDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusDataExpr(@NotNull mcrl2Parser.UnaryMinusDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusDataExpr(@NotNull mcrl2Parser.UnaryMinusDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#commExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommExpr(@NotNull mcrl2Parser.CommExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#commExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommExpr(@NotNull mcrl2Parser.CommExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(@NotNull mcrl2Parser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(@NotNull mcrl2Parser.InitContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhereClauseDataExpr(@NotNull mcrl2Parser.WhereClauseDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhereClauseDataExpr(@NotNull mcrl2Parser.WhereClauseDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#stateVarAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStateVarAssignment(@NotNull mcrl2Parser.StateVarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#stateVarAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStateVarAssignment(@NotNull mcrl2Parser.StateVarAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListSizeDataExpr(@NotNull mcrl2Parser.ListSizeDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListSizeDataExpr(@NotNull mcrl2Parser.ListSizeDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#TrueStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterTrueStateFrm(@NotNull mcrl2Parser.TrueStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#TrueStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitTrueStateFrm(@NotNull mcrl2Parser.TrueStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSubtractionDataExpr(@NotNull mcrl2Parser.SubtractionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSubtractionDataExpr(@NotNull mcrl2Parser.SubtractionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#TrueDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterTrueDataExpr(@NotNull mcrl2Parser.TrueDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#TrueDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitTrueDataExpr(@NotNull mcrl2Parser.TrueDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NumberDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterNumberDataExpr(@NotNull mcrl2Parser.NumberDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NumberDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitNumberDataExpr(@NotNull mcrl2Parser.NumberDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FalseStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterFalseStateFrm(@NotNull mcrl2Parser.FalseStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FalseStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitFalseStateFrm(@NotNull mcrl2Parser.FalseStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#Implication}.
	 * @param ctx the parse tree
	 */
	void enterImplication(@NotNull mcrl2Parser.ImplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#Implication}.
	 * @param ctx the parse tree
	 */
	void exitImplication(@NotNull mcrl2Parser.ImplicationContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionDataExpr(@NotNull mcrl2Parser.ConjunctionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionDataExpr(@NotNull mcrl2Parser.ConjunctionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionDataExpr(@NotNull mcrl2Parser.DisjunctionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionDataExpr(@NotNull mcrl2Parser.DisjunctionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void enterSequentialCompositionRegForm(@NotNull mcrl2Parser.SequentialCompositionRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 */
	void exitSequentialCompositionRegForm(@NotNull mcrl2Parser.SequentialCompositionRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#TrueActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterTrueActionFrm(@NotNull mcrl2Parser.TrueActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#TrueActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitTrueActionFrm(@NotNull mcrl2Parser.TrueActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterDivisionDataExpr(@NotNull mcrl2Parser.DivisionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitDivisionDataExpr(@NotNull mcrl2Parser.DivisionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#RealSort}.
	 * @param ctx the parse tree
	 */
	void enterRealSort(@NotNull mcrl2Parser.RealSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#RealSort}.
	 * @param ctx the parse tree
	 */
	void exitRealSort(@NotNull mcrl2Parser.RealSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#MuStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterMuStateFrm(@NotNull mcrl2Parser.MuStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#MuStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitMuStateFrm(@NotNull mcrl2Parser.MuStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterNegationSetComplementDataExpr(@NotNull mcrl2Parser.NegationSetComplementDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitNegationSetComplementDataExpr(@NotNull mcrl2Parser.NegationSetComplementDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SetSort}.
	 * @param ctx the parse tree
	 */
	void enterSetSort(@NotNull mcrl2Parser.SetSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SetSort}.
	 * @param ctx the parse tree
	 */
	void exitSetSort(@NotNull mcrl2Parser.SetSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BagSort}.
	 * @param ctx the parse tree
	 */
	void enterBagSort(@NotNull mcrl2Parser.BagSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BagSort}.
	 * @param ctx the parse tree
	 */
	void exitBagSort(@NotNull mcrl2Parser.BagSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#pbesExpr}.
	 * @param ctx the parse tree
	 */
	void enterPbesExpr(@NotNull mcrl2Parser.PbesExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#pbesExpr}.
	 * @param ctx the parse tree
	 */
	void exitPbesExpr(@NotNull mcrl2Parser.PbesExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#sortExprList}.
	 * @param ctx the parse tree
	 */
	void enterSortExprList(@NotNull mcrl2Parser.SortExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#sortExprList}.
	 * @param ctx the parse tree
	 */
	void exitSortExprList(@NotNull mcrl2Parser.SortExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NilRegForm}.
	 * @param ctx the parse tree
	 */
	void enterNilRegForm(@NotNull mcrl2Parser.NilRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NilRegForm}.
	 * @param ctx the parse tree
	 */
	void exitNilRegForm(@NotNull mcrl2Parser.NilRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 */
	void enterConjunctionStateFrm(@NotNull mcrl2Parser.ConjunctionStateFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 */
	void exitConjunctionStateFrm(@NotNull mcrl2Parser.ConjunctionStateFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 */
	void enterNonEmptyIterationRegForm(@NotNull mcrl2Parser.NonEmptyIterationRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 */
	void exitNonEmptyIterationRegForm(@NotNull mcrl2Parser.NonEmptyIterationRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FalseActionFrm}.
	 * @param ctx the parse tree
	 */
	void enterFalseActionFrm(@NotNull mcrl2Parser.FalseActionFrmContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FalseActionFrm}.
	 * @param ctx the parse tree
	 */
	void exitFalseActionFrm(@NotNull mcrl2Parser.FalseActionFrmContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(@NotNull mcrl2Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(@NotNull mcrl2Parser.VarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besSpec}.
	 * @param ctx the parse tree
	 */
	void enterBesSpec(@NotNull mcrl2Parser.BesSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besSpec}.
	 * @param ctx the parse tree
	 */
	void exitBesSpec(@NotNull mcrl2Parser.BesSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SortmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void enterSortmCRL2SpecElt(@NotNull mcrl2Parser.SortmCRL2SpecEltContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SortmCRL2SpecElt}.
	 * @param ctx the parse tree
	 */
	void exitSortmCRL2SpecElt(@NotNull mcrl2Parser.SortmCRL2SpecEltContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IntegerSort}.
	 * @param ctx the parse tree
	 */
	void enterIntegerSort(@NotNull mcrl2Parser.IntegerSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IntegerSort}.
	 * @param ctx the parse tree
	 */
	void exitIntegerSort(@NotNull mcrl2Parser.IntegerSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditionDataExpr(@NotNull mcrl2Parser.AdditionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditionDataExpr(@NotNull mcrl2Parser.AdditionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actSpec}.
	 * @param ctx the parse tree
	 */
	void enterActSpec(@NotNull mcrl2Parser.ActSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actSpec}.
	 * @param ctx the parse tree
	 */
	void exitActSpec(@NotNull mcrl2Parser.ActSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#constrDeclList}.
	 * @param ctx the parse tree
	 */
	void enterConstrDeclList(@NotNull mcrl2Parser.ConstrDeclListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#constrDeclList}.
	 * @param ctx the parse tree
	 */
	void exitConstrDeclList(@NotNull mcrl2Parser.ConstrDeclListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(@NotNull mcrl2Parser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(@NotNull mcrl2Parser.AssignmentListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#renExprList}.
	 * @param ctx the parse tree
	 */
	void enterRenExprList(@NotNull mcrl2Parser.RenExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#renExprList}.
	 * @param ctx the parse tree
	 */
	void exitRenExprList(@NotNull mcrl2Parser.RenExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListEnumerationDataExpr(@NotNull mcrl2Parser.ListEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListEnumerationDataExpr(@NotNull mcrl2Parser.ListEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterBagEnumerationDataExpr(@NotNull mcrl2Parser.BagEnumerationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitBagEnumerationDataExpr(@NotNull mcrl2Parser.BagEnumerationDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 */
	void enterDisjunctionStateFmr(@NotNull mcrl2Parser.DisjunctionStateFmrContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 */
	void exitDisjunctionStateFmr(@NotNull mcrl2Parser.DisjunctionStateFmrContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#commExprSet}.
	 * @param ctx the parse tree
	 */
	void enterCommExprSet(@NotNull mcrl2Parser.CommExprSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#commExprSet}.
	 * @param ctx the parse tree
	 */
	void exitCommExprSet(@NotNull mcrl2Parser.CommExprSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterSmallerDataExpr(@NotNull mcrl2Parser.SmallerDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitSmallerDataExpr(@NotNull mcrl2Parser.SmallerDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#besEqnSpec}.
	 * @param ctx the parse tree
	 */
	void enterBesEqnSpec(@NotNull mcrl2Parser.BesEqnSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#besEqnSpec}.
	 * @param ctx the parse tree
	 */
	void exitBesEqnSpec(@NotNull mcrl2Parser.BesEqnSpecContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#renExpr}.
	 * @param ctx the parse tree
	 */
	void enterRenExpr(@NotNull mcrl2Parser.RenExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#renExpr}.
	 * @param ctx the parse tree
	 */
	void exitRenExpr(@NotNull mcrl2Parser.RenExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#SortExprSimpleSortExpr}.
	 * @param ctx the parse tree
	 */
	void enterSortExprSimpleSortExpr(@NotNull mcrl2Parser.SortExprSimpleSortExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#SortExprSimpleSortExpr}.
	 * @param ctx the parse tree
	 */
	void exitSortExprSimpleSortExpr(@NotNull mcrl2Parser.SortExprSimpleSortExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#commExprList}.
	 * @param ctx the parse tree
	 */
	void enterCommExprList(@NotNull mcrl2Parser.CommExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#commExprList}.
	 * @param ctx the parse tree
	 */
	void exitCommExprList(@NotNull mcrl2Parser.CommExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#BooleanSort}.
	 * @param ctx the parse tree
	 */
	void enterBooleanSort(@NotNull mcrl2Parser.BooleanSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#BooleanSort}.
	 * @param ctx the parse tree
	 */
	void exitBooleanSort(@NotNull mcrl2Parser.BooleanSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerModDataExpr(@NotNull mcrl2Parser.IntegerModDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerModDataExpr(@NotNull mcrl2Parser.IntegerModDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterLargerEqualDataExpr(@NotNull mcrl2Parser.LargerEqualDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitLargerEqualDataExpr(@NotNull mcrl2Parser.LargerEqualDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#pbesEqnDecl}.
	 * @param ctx the parse tree
	 */
	void enterPbesEqnDecl(@NotNull mcrl2Parser.PbesEqnDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#pbesEqnDecl}.
	 * @param ctx the parse tree
	 */
	void exitPbesEqnDecl(@NotNull mcrl2Parser.PbesEqnDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#stateVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterStateVarDecl(@NotNull mcrl2Parser.StateVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#stateVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitStateVarDecl(@NotNull mcrl2Parser.StateVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#IterationRegForm}.
	 * @param ctx the parse tree
	 */
	void enterIterationRegForm(@NotNull mcrl2Parser.IterationRegFormContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#IterationRegForm}.
	 * @param ctx the parse tree
	 */
	void exitIterationRegForm(@NotNull mcrl2Parser.IterationRegFormContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#actDecl}.
	 * @param ctx the parse tree
	 */
	void enterActDecl(@NotNull mcrl2Parser.ActDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#actDecl}.
	 * @param ctx the parse tree
	 */
	void exitActDecl(@NotNull mcrl2Parser.ActDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterEmptyListDataExpr(@NotNull mcrl2Parser.EmptyListDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitEmptyListDataExpr(@NotNull mcrl2Parser.EmptyListDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#multActIdSet}.
	 * @param ctx the parse tree
	 */
	void enterMultActIdSet(@NotNull mcrl2Parser.MultActIdSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#multActIdSet}.
	 * @param ctx the parse tree
	 */
	void exitMultActIdSet(@NotNull mcrl2Parser.MultActIdSetContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#multActIdList}.
	 * @param ctx the parse tree
	 */
	void enterMultActIdList(@NotNull mcrl2Parser.MultActIdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#multActIdList}.
	 * @param ctx the parse tree
	 */
	void exitMultActIdList(@NotNull mcrl2Parser.MultActIdListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#procExpr}.
	 * @param ctx the parse tree
	 */
	void enterProcExpr(@NotNull mcrl2Parser.ProcExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#procExpr}.
	 * @param ctx the parse tree
	 */
	void exitProcExpr(@NotNull mcrl2Parser.ProcExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterMemberShipSetBagDataExpr(@NotNull mcrl2Parser.MemberShipSetBagDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitMemberShipSetBagDataExpr(@NotNull mcrl2Parser.MemberShipSetBagDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#propVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterPropVarDecl(@NotNull mcrl2Parser.PropVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#propVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitPropVarDecl(@NotNull mcrl2Parser.PropVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#hashArgs}.
	 * @param ctx the parse tree
	 */
	void enterHashArgs(@NotNull mcrl2Parser.HashArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#hashArgs}.
	 * @param ctx the parse tree
	 */
	void exitHashArgs(@NotNull mcrl2Parser.HashArgsContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#StructuredSort}.
	 * @param ctx the parse tree
	 */
	void enterStructuredSort(@NotNull mcrl2Parser.StructuredSortContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#StructuredSort}.
	 * @param ctx the parse tree
	 */
	void exitStructuredSort(@NotNull mcrl2Parser.StructuredSortContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#dataExprList}.
	 * @param ctx the parse tree
	 */
	void enterDataExprList(@NotNull mcrl2Parser.DataExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#dataExprList}.
	 * @param ctx the parse tree
	 */
	void exitDataExprList(@NotNull mcrl2Parser.DataExprListContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#procExprNoIf}.
	 * @param ctx the parse tree
	 */
	void enterProcExprNoIf(@NotNull mcrl2Parser.ProcExprNoIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#procExprNoIf}.
	 * @param ctx the parse tree
	 */
	void exitProcExprNoIf(@NotNull mcrl2Parser.ProcExprNoIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterListElemPositionDataExpr(@NotNull mcrl2Parser.ListElemPositionDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitListElemPositionDataExpr(@NotNull mcrl2Parser.ListElemPositionDataExprContext ctx);

	/**
	 * Enter a parse tree produced by {@link mcrl2Parser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionApplicationDataExpr(@NotNull mcrl2Parser.FunctionApplicationDataExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mcrl2Parser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionApplicationDataExpr(@NotNull mcrl2Parser.FunctionApplicationDataExprContext ctx);
}
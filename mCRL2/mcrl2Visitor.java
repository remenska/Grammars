// Generated from info/remenska/PASS/monitor/mCRL2/mcrl2.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mcrl2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mcrl2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ImplicationStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationStateFrm(@NotNull mcrl2Parser.ImplicationStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BracketsStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsStateFrm(@NotNull mcrl2Parser.BracketsStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#multAct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultAct(@NotNull mcrl2Parser.MultActContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#sortSimpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSimpleExpr(@NotNull mcrl2Parser.SortSimpleExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#varsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsDecl(@NotNull mcrl2Parser.VarsDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierDataExpr(@NotNull mcrl2Parser.UniversalQuantifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DataValueExpressionActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueExpressionActionFrm(@NotNull mcrl2Parser.DataValueExpressionActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SetBagComprehensionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBagComprehensionDataExpr(@NotNull mcrl2Parser.SetBagComprehensionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSort(@NotNull mcrl2Parser.ListSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(@NotNull mcrl2Parser.IdListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FunctionSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSort(@NotNull mcrl2Parser.FunctionSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#MapmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapmCRL2SpecElt(@NotNull mcrl2Parser.MapmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListSnocDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSnocDataExpr(@NotNull mcrl2Parser.ListSnocDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actIdSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActIdSet(@NotNull mcrl2Parser.ActIdSetContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#mCRL2Spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMCRL2Spec(@NotNull mcrl2Parser.MCRL2SpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#EmptyBagDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyBagDataExpr(@NotNull mcrl2Parser.EmptyBagDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BracketsDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsDataExpr(@NotNull mcrl2Parser.BracketsDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NuStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNuStateFrm(@NotNull mcrl2Parser.NuStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListConsDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConsDataExpr(@NotNull mcrl2Parser.ListConsDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#bagEnumElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumElt(@NotNull mcrl2Parser.BagEnumEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#dataSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSpec(@NotNull mcrl2Parser.DataSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DataValueExpressionStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValueExpressionStateFrm(@NotNull mcrl2Parser.DataValueExpressionStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#multActId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultActId(@NotNull mcrl2Parser.MultActIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#renExprSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenExprSet(@NotNull mcrl2Parser.RenExprSetContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#procDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcDecl(@NotNull mcrl2Parser.ProcDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actionRenameSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRenameSpec(@NotNull mcrl2Parser.ActionRenameSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DiamondModalityStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiamondModalityStateFrm(@NotNull mcrl2Parser.DiamondModalityStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#dataExprUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExprUnit(@NotNull mcrl2Parser.DataExprUnitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#pbesSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbesSpec(@NotNull mcrl2Parser.PbesSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ConsmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsmCRL2SpecElt(@NotNull mcrl2Parser.ConsmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#idsDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdsDecl(@NotNull mcrl2Parser.IdsDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#eqnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnSpec(@NotNull mcrl2Parser.EqnSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NaturalSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalSort(@NotNull mcrl2Parser.NaturalSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(@NotNull mcrl2Parser.StartContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FSetSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFSetSort(@NotNull mcrl2Parser.FSetSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FalseDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseDataExpr(@NotNull mcrl2Parser.FalseDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesExpr(@NotNull mcrl2Parser.BesExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierStateFrm(@NotNull mcrl2Parser.UniversalQuantifierStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#pbesEqnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbesEqnSpec(@NotNull mcrl2Parser.PbesEqnSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#globVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobVarSpec(@NotNull mcrl2Parser.GlobVarSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierDataExpr(@NotNull mcrl2Parser.ExistentialQuantifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actionRenameRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRenameRule(@NotNull mcrl2Parser.ActionRenameRuleContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ActionFormulaRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionFormulaRegForm(@NotNull mcrl2Parser.ActionFormulaRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#mapSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapSpec(@NotNull mcrl2Parser.MapSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SmallerEqualDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerEqualDataExpr(@NotNull mcrl2Parser.SmallerEqualDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#projDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjDeclList(@NotNull mcrl2Parser.ProjDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#PBESVariableStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPBESVariableStateFrm(@NotNull mcrl2Parser.PBESVariableStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#GlobalVarmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalVarmCRL2SpecElt(@NotNull mcrl2Parser.GlobalVarmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierStateFrm(@NotNull mcrl2Parser.ExistentialQuantifierStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#EqnmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnmCRL2SpecElt(@NotNull mcrl2Parser.EqnmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actionRenameRuleSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRenameRuleSpec(@NotNull mcrl2Parser.ActionRenameRuleSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#constrDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrDecl(@NotNull mcrl2Parser.ConstrDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#fixedPointOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixedPointOperator(@NotNull mcrl2Parser.FixedPointOperatorContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesInit(@NotNull mcrl2Parser.BesInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#dataValExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataValExpr(@NotNull mcrl2Parser.DataValExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SortRefSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortRefSort(@NotNull mcrl2Parser.SortRefSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#InequalityDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInequalityDataExpr(@NotNull mcrl2Parser.InequalityDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IntegerDivDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerDivDataExpr(@NotNull mcrl2Parser.IntegerDivDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BracketsActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsActionFrm(@NotNull mcrl2Parser.BracketsActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#bagEnumEltList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumEltList(@NotNull mcrl2Parser.BagEnumEltListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#stateVarAssignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarAssignmentList(@NotNull mcrl2Parser.StateVarAssignmentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ExistentialQuantifierActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistentialQuantifierActionFrm(@NotNull mcrl2Parser.ExistentialQuantifierActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#MultiAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiAction(@NotNull mcrl2Parser.MultiActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#propVarInst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropVarInst(@NotNull mcrl2Parser.PropVarInstContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#EmptySetDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptySetDataExpr(@NotNull mcrl2Parser.EmptySetDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionList(@NotNull mcrl2Parser.ActionListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actionRenameRuleRHS}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionRenameRuleRHS(@NotNull mcrl2Parser.ActionRenameRuleRHSContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#pbesInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbesInit(@NotNull mcrl2Parser.PbesInitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#procSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcSpec(@NotNull mcrl2Parser.ProcSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#EqualityDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityDataExpr(@NotNull mcrl2Parser.EqualityDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BoxModalityStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoxModalityStateFrm(@NotNull mcrl2Parser.BoxModalityStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ImplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplicationDataExpr(@NotNull mcrl2Parser.ImplicationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull mcrl2Parser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#AtOperatorActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtOperatorActionFrm(@NotNull mcrl2Parser.AtOperatorActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DelayOpStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayOpStateFrm(@NotNull mcrl2Parser.DelayOpStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IdentifierDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierDataExpr(@NotNull mcrl2Parser.IdentifierDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ActmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActmCRL2SpecElt(@NotNull mcrl2Parser.ActmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ifThen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfThen(@NotNull mcrl2Parser.IfThenContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#UnionOfActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionOfActions(@NotNull mcrl2Parser.UnionOfActionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#eqnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqnDecl(@NotNull mcrl2Parser.EqnDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NegationStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationStateFrm(@NotNull mcrl2Parser.NegationStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#varSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarSpec(@NotNull mcrl2Parser.VarSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#consSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsSpec(@NotNull mcrl2Parser.ConsSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#sortSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortSpec(@NotNull mcrl2Parser.SortSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ProcmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcmCRL2SpecElt(@NotNull mcrl2Parser.ProcmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#YaledOpStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYaledOpStateFrm(@NotNull mcrl2Parser.YaledOpStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesVar(@NotNull mcrl2Parser.BesVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BracketsRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketsRegForm(@NotNull mcrl2Parser.BracketsRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#UniversalQuantifierActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversalQuantifierActionFrm(@NotNull mcrl2Parser.UniversalQuantifierActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#LambdaDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaDataExpr(@NotNull mcrl2Parser.LambdaDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#sortDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDecl(@NotNull mcrl2Parser.SortDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FunctionUpdateDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionUpdateDataExpr(@NotNull mcrl2Parser.FunctionUpdateDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#PositiveSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveSort(@NotNull mcrl2Parser.PositiveSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SetEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumerationDataExpr(@NotNull mcrl2Parser.SetEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#MultiplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicationDataExpr(@NotNull mcrl2Parser.MultiplicationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListConcatenationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListConcatenationDataExpr(@NotNull mcrl2Parser.ListConcatenationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#varsDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsDeclList(@NotNull mcrl2Parser.VarsDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#AlternativeCompositionRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlternativeCompositionRegForm(@NotNull mcrl2Parser.AlternativeCompositionRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(@NotNull mcrl2Parser.ActionContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IntersectionOfActions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntersectionOfActions(@NotNull mcrl2Parser.IntersectionOfActionsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#projDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjDecl(@NotNull mcrl2Parser.ProjDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FBagSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFBagSort(@NotNull mcrl2Parser.FBagSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NegationActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationActionFrm(@NotNull mcrl2Parser.NegationActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#LargerDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargerDataExpr(@NotNull mcrl2Parser.LargerDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besEqnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesEqnDecl(@NotNull mcrl2Parser.BesEqnDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#UnaryMinusDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinusDataExpr(@NotNull mcrl2Parser.UnaryMinusDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#commExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommExpr(@NotNull mcrl2Parser.CommExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull mcrl2Parser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#WhereClauseDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClauseDataExpr(@NotNull mcrl2Parser.WhereClauseDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#stateVarAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarAssignment(@NotNull mcrl2Parser.StateVarAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListSizeDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListSizeDataExpr(@NotNull mcrl2Parser.ListSizeDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#TrueStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueStateFrm(@NotNull mcrl2Parser.TrueStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SubtractionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtractionDataExpr(@NotNull mcrl2Parser.SubtractionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#TrueDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueDataExpr(@NotNull mcrl2Parser.TrueDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NumberDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberDataExpr(@NotNull mcrl2Parser.NumberDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FalseStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseStateFrm(@NotNull mcrl2Parser.FalseStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#Implication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImplication(@NotNull mcrl2Parser.ImplicationContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ConjunctionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionDataExpr(@NotNull mcrl2Parser.ConjunctionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DisjunctionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionDataExpr(@NotNull mcrl2Parser.DisjunctionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SequentialCompositionRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequentialCompositionRegForm(@NotNull mcrl2Parser.SequentialCompositionRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#TrueActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueActionFrm(@NotNull mcrl2Parser.TrueActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DivisionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivisionDataExpr(@NotNull mcrl2Parser.DivisionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#RealSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealSort(@NotNull mcrl2Parser.RealSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#MuStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMuStateFrm(@NotNull mcrl2Parser.MuStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NegationSetComplementDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationSetComplementDataExpr(@NotNull mcrl2Parser.NegationSetComplementDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SetSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSort(@NotNull mcrl2Parser.SetSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BagSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagSort(@NotNull mcrl2Parser.BagSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#pbesExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbesExpr(@NotNull mcrl2Parser.PbesExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#sortExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExprList(@NotNull mcrl2Parser.SortExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NilRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNilRegForm(@NotNull mcrl2Parser.NilRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ConjunctionStateFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjunctionStateFrm(@NotNull mcrl2Parser.ConjunctionStateFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#NonEmptyIterationRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonEmptyIterationRegForm(@NotNull mcrl2Parser.NonEmptyIterationRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FalseActionFrm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseActionFrm(@NotNull mcrl2Parser.FalseActionFrmContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(@NotNull mcrl2Parser.VarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesSpec(@NotNull mcrl2Parser.BesSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IntegerSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerSort(@NotNull mcrl2Parser.IntegerSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SortmCRL2SpecElt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortmCRL2SpecElt(@NotNull mcrl2Parser.SortmCRL2SpecEltContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#AdditionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionDataExpr(@NotNull mcrl2Parser.AdditionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActSpec(@NotNull mcrl2Parser.ActSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#constrDeclList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrDeclList(@NotNull mcrl2Parser.ConstrDeclListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(@NotNull mcrl2Parser.AssignmentListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#renExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenExprList(@NotNull mcrl2Parser.RenExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEnumerationDataExpr(@NotNull mcrl2Parser.ListEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BagEnumerationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBagEnumerationDataExpr(@NotNull mcrl2Parser.BagEnumerationDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#DisjunctionStateFmr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjunctionStateFmr(@NotNull mcrl2Parser.DisjunctionStateFmrContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#commExprSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommExprSet(@NotNull mcrl2Parser.CommExprSetContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SmallerDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerDataExpr(@NotNull mcrl2Parser.SmallerDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#besEqnSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBesEqnSpec(@NotNull mcrl2Parser.BesEqnSpecContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#renExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenExpr(@NotNull mcrl2Parser.RenExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#SortExprSimpleSortExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortExprSimpleSortExpr(@NotNull mcrl2Parser.SortExprSimpleSortExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#commExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommExprList(@NotNull mcrl2Parser.CommExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#BooleanSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanSort(@NotNull mcrl2Parser.BooleanSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IntegerModDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerModDataExpr(@NotNull mcrl2Parser.IntegerModDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#LargerEqualDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargerEqualDataExpr(@NotNull mcrl2Parser.LargerEqualDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#pbesEqnDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPbesEqnDecl(@NotNull mcrl2Parser.PbesEqnDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#stateVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateVarDecl(@NotNull mcrl2Parser.StateVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#IterationRegForm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterationRegForm(@NotNull mcrl2Parser.IterationRegFormContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#actDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActDecl(@NotNull mcrl2Parser.ActDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#EmptyListDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyListDataExpr(@NotNull mcrl2Parser.EmptyListDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#multActIdSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultActIdSet(@NotNull mcrl2Parser.MultActIdSetContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#multActIdList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultActIdList(@NotNull mcrl2Parser.MultActIdListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#procExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcExpr(@NotNull mcrl2Parser.ProcExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#MemberShipSetBagDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberShipSetBagDataExpr(@NotNull mcrl2Parser.MemberShipSetBagDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#propVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropVarDecl(@NotNull mcrl2Parser.PropVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#hashArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashArgs(@NotNull mcrl2Parser.HashArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#StructuredSort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructuredSort(@NotNull mcrl2Parser.StructuredSortContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#dataExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataExprList(@NotNull mcrl2Parser.DataExprListContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#procExprNoIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcExprNoIf(@NotNull mcrl2Parser.ProcExprNoIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#ListElemPositionDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListElemPositionDataExpr(@NotNull mcrl2Parser.ListElemPositionDataExprContext ctx);

	/**
	 * Visit a parse tree produced by {@link mcrl2Parser#FunctionApplicationDataExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionApplicationDataExpr(@NotNull mcrl2Parser.FunctionApplicationDataExprContext ctx);
}
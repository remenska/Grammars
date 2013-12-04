package info.remenska.PASS.monitor.mCRL2;

// Generated from mucalculus.g4 by ANTLR 4.1
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BoxModalityStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BracketsStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.ConjunctionStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.IdListContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.NonEmptyIterationRegFormContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.RegFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.UniversalQuantifierActionFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.ExistentialQuantifierActionFrmContext;

import info.remenska.PASS.monitor.mCRL2.mucalculusParser.VarsDeclContext;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class MyMuCalculusVisitor extends mucalculusBaseVisitor<String> {
	public static BufferedTokenStream tokens;
	public static TokenStreamRewriter rewriter;
	public static LinkedList<String> actions = new LinkedList<String>();
	public static Hashtable<String, String> varDeclarations = new Hashtable<String, String>();
	public static Hashtable<String, ArrayList<String>> actionsDict;
	public static String prepend_UniversalQuantifierStateFrm = new String();
	public static String varList = new String();
	public boolean humanReadable = false;
	public static StringBuffer finalResult = new StringBuffer();

	public MyMuCalculusVisitor(BufferedTokenStream tokens,
			Hashtable<String, ArrayList<String>> actionsDict,
			boolean humanReadable) {
		this.tokens = tokens;
		this.actionsDict = actionsDict;
		rewriter = new TokenStreamRewriter(tokens);
		this.humanReadable = humanReadable;
	}

	Hashtable<String, Integer> monitorProcesses = new Hashtable<String, Integer>();
	int counter = 1;

	@Override
	public String visitStart(@NotNull mucalculusParser.StartContext ctx) {
		String monProc = "Mon_\"" + ctx.getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));

		if (humanReadable){
			finalResult.append("proc Monitor = " + monProc + "; \n\n");
//			System.out.println("proc Monitor = " + monProc + ";");
					
		}
		else{
			finalResult.append("proc Monitor = "
					+ monitorProcesses.get(monProc) + "\n\n");
//			System.out.println("proc Monitor = "
//					+ monitorProcesses.get(monProc));
			
		}
		return visitChildren(ctx);

	}

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override
	public String visitTrueStateFrm(
			@NotNull mucalculusParser.TrueStateFrmContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitActionFormulaRegForm(
			@NotNull mucalculusParser.ActionFormulaRegFormContext ctx) {

		String result = new String("" + visit(ctx.actFrm()) + "");
		String quantifiersPrepend = new String();
		if (ctx.actFrm() instanceof mucalculusParser.UniversalQuantifierActionFrmContext) {
			quantifiersPrepend = "forall "
					+ quantifiersPrepend
					+ ((UniversalQuantifierActionFrmContext) ctx.actFrm())
							.varsDeclList().getText() + ".";
		}
		if (ctx.actFrm() instanceof mucalculusParser.ExistentialQuantifierActionFrmContext) {
			quantifiersPrepend = "exists "
					+ quantifiersPrepend
					+ ((ExistentialQuantifierActionFrmContext) ctx.actFrm())
							.varsDeclList() + ".";
		}

		String monProc = "Mon_\"" + ctx.getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		// example
				// %
				// % proc Proc_alpha = satisfy(p,not(or(action(p),action(r)))) -> p
				// % + satisfy(q,not(or(action(p),action(r)))) -> q
				// % + satisfy(r,not(or(action(p),action(r)))) -> r
				// % ;
		StringBuffer sumOverAllActions = new StringBuffer();

		Enumeration<String> keys = actionsDict.keys();
		StringBuffer modifiedKey = new StringBuffer();
		while (keys.hasMoreElements()) {
			StringBuffer sumOverDataTypes = new StringBuffer();
			String key = keys.nextElement();
			modifiedKey = new StringBuffer(key);
			modifiedKey.append("_mon");
			ArrayList<String> dataTypes = actionsDict.get(key);
			if (dataTypes.size() > 0) {
				modifiedKey.append("(");
				sumOverDataTypes = new StringBuffer("sum ");

				int counter = 1;
				Iterator<String> iter = dataTypes.iterator();
				while (iter.hasNext()) {
					String dt = iter.next();
					sumOverDataTypes.append("arg" + counter++ + ":" + dt);
					modifiedKey.append("arg" + (counter - 1));
					if (iter.hasNext()) {
						sumOverDataTypes.append(",");
						modifiedKey.append(",");
					} else {
						sumOverDataTypes.append(".");
						modifiedKey.append(")");
					}
				}
			}

			sumOverDataTypes = new StringBuffer(sumOverDataTypes + "("
					+ quantifiersPrepend + "satisfy(" + modifiedKey + ", "
					+ result + ")) -> " + modifiedKey + "\n");
			sumOverAllActions.append(sumOverDataTypes);

			if (keys.hasMoreElements())
				sumOverAllActions.append(" + ");
			else
				sumOverAllActions.append(" + internal_mon;\n");
		}
		

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ sumOverAllActions + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ sumOverAllActions + ";\n\n");
		}
		else{
			
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ sumOverAllActions + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ sumOverAllActions + ";\n\n");
			
		}
		return result;
	}

	@Override
	public String visitNonEmptyIterationRegForm(
			@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx) {
		String monProc = "Mon_\"" + ctx.getText() + "\"";
		String monProc1 = "Mon_\"" + ctx.regFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + ". " + monProc + varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + ". " + monProc + varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + ". "
//					+ monitorProcesses.get(monProc) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + ". "
					+ monitorProcesses.get(monProc) + varList + ";\n\n");
		}
			
		return visitChildren(ctx);

	}

	@Override
	public String visitIterationRegForm(
			@NotNull mucalculusParser.IterationRegFormContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitSequentialCompositionRegForm(
			@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx) {
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.regFrm(0).getText() + "\"";
		monProc2 = "Mon_\"" + ctx.regFrm(1).getText() + "\"";

		Token t1 = (Token) ctx.regFrm(0).start;
		Token t2 = (Token) ctx.regFrm(0).stop;

		int i = t1.getTokenIndex();

		if (tokens.get(t2.getTokenIndex() + 1).getText().equals(".")) {
			// transformation
			rewriter.delete(t2.getTokenIndex() + 1);
			rewriter.insertAfter(t2.getTokenIndex(), "][");
			// we're ready
		}

		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if (monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));
		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + "." + monProc2 + varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + "." + monProc2 + varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + "."
//					+ monitorProcesses.get(monProc2) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + "."
					+ monitorProcesses.get(monProc2) + varList + ";\n\n");
		}
		
		return visitChildren(ctx);

	}

	@Override
	public String visitAction(@NotNull mucalculusParser.ActionContext ctx) {
		if (!actions.contains(ctx.getText()))
			actions.add(ctx.getText());
		visitChildren(ctx);
		if(ctx.dataExprList()!=null)
			return new String("action(" + ctx.ID() +"_mon" + "(" + ctx.dataExprList().getText() +")" + ")");
		else
			return new String("action(" + ctx.ID() +"_mon"  + ")");

	}

	@Override
	public String visitBoxModalityStateFrm(
			@NotNull mucalculusParser.BoxModalityStateFrmContext ctx) {
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.regFrm().getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if (monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));
		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + " . " + monProc2 + varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + " . " + monProc2 + varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + " . "
//					+ monitorProcesses.get(monProc2) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + " . "
					+ monitorProcesses.get(monProc2) + varList + ";\n\n");
		}
		
		if (ctx.regFrm() instanceof mucalculusParser.IterationRegFormContext) {

			mucalculusParser.RegFrmContext child1 = ctx.regFrm();
			mucalculusParser.StateFrmContext child2 = ctx.stateFrm();

			mucalculusParser.RegFrmContext child1modified = (RegFrmContext) ctx
					.regFrm().getChild(0);
			Token t1 = (Token) child1.start;
			Token t2 = (Token) child1.stop;
			rewriter.insertAfter(t2.getTokenIndex(), "(nil" + " + "
					+ child1modified.getText() + "+" + ")");
			rewriter.delete(t1.getTokenIndex(), t2.getTokenIndex());

		}
		return visitChildren(ctx);

	}

	@Override
	public String visitConjunctionStateFrm(
			@NotNull mucalculusParser.ConjunctionStateFrmContext ctx) {
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.stateFrm(0).getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm(1).getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if (monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + " + " + monProc2 + varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + " + " + monProc2 + varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + " + "
//					+ monitorProcesses.get(monProc2) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + " + "
					+ monitorProcesses.get(monProc2) + varList + ";\n\n");
		}
		
		return visitChildren(ctx);
	}

	@Override
	public String visitIntersectionOfActions(
			@NotNull mucalculusParser.IntersectionOfActionsContext ctx) {

		String result = new String("and(" + visit(ctx.actFrm(0)) + " , "
				+ visit(ctx.actFrm(1)) + ")");

		return result;
	}

	@Override
	public String visitDisjunctionDataExpr(
			@NotNull mucalculusParser.DisjunctionDataExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitBracketsStateFrm(
			@NotNull mucalculusParser.BracketsStateFrmContext ctx) {
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.stateFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + ";\n\n");
		}
		
		String result = new String("" + visit(ctx.stateFrm()) + "");
		return result;
	}

	@Override
	public String visitDataValueExpressionActionFrm(
			@NotNull mucalculusParser.DataValueExpressionActionFrmContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitBracketsActionFrm(
			@NotNull mucalculusParser.BracketsActionFrmContext ctx) {
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.actFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));

		String result = new String("" + visit(ctx.actFrm()) + "");
		return result;

	}

	@Override
	public String visitActionList(
			@NotNull mucalculusParser.ActionListContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitMultiAction(
			@NotNull mucalculusParser.MultiActionContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitTrueActionFrm(
			@NotNull mucalculusParser.TrueActionFrmContext ctx) {

		String result = new String("True");
		return result;
	}

	@Override
	public String visitFalseActionFrm(
			@NotNull mucalculusParser.FalseActionFrmContext ctx) {
		String result = new String("False");
		return result;

	}

	@Override
	public String visitNegationActionFrm(
			@NotNull mucalculusParser.NegationActionFrmContext ctx) {

		String result = new String("not(" + visit(ctx.actFrm()) + ")");
		return result;

	}

	@Override
	public String visitUniversalQuantifierActionFrm(
			@NotNull mucalculusParser.UniversalQuantifierActionFrmContext ctx) {
		String result = new String(visit(ctx.actFrm()));
		visit(ctx.varsDeclList());

		return result;

	}

	@Override
	public String visitExistentialQuantifierActionFrm(
			@NotNull mucalculusParser.ExistentialQuantifierActionFrmContext ctx) {

		String result = new String(visit(ctx.actFrm()));
		visit(ctx.varsDeclList());
		return result;

	}

	@Override
	public String visitUnionOfActions(
			@NotNull mucalculusParser.UnionOfActionsContext ctx) {
		String result = new String("or(" + visit(ctx.actFrm(0)) + " , "
				+ visit(ctx.actFrm(1)) + ")");
		return result;

	}

	@Override
	public String visitBracketsRegForm(
			@NotNull mucalculusParser.BracketsRegFormContext ctx) {
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.regFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + ";\n\n");
		}
		
		String result = new String("" + visit(ctx.regFrm()) + "");
		return result;
	}

	@Override
	public String visitNilRegForm(
			@NotNull mucalculusParser.NilRegFormContext ctx) {
		String monProc;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ "internal_mon ;");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ "internal_mon ;\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ "internal_mon ;");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ "internal_mon ;\n\n");
		}
		
		return visitChildren(ctx);

	}

	@Override
	public String visitAlternativeCompositionRegForm(
			@NotNull mucalculusParser.AlternativeCompositionRegFormContext ctx) {
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_\"" + ctx.regFrm(0).getText() + "\"";
		monProc2 = "Mon_\"" + ctx.regFrm(1).getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc1) == null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if (monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));

		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
//					+ varList + " + " + monProc2 + varList + ";");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = " + monProc1
					+ varList + " + " + monProc2 + varList + ";\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = "
//					+ monitorProcesses.get(monProc1) + varList + " + "
//					+ monitorProcesses.get(monProc2) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = "
					+ monitorProcesses.get(monProc1) + varList + " + "
					+ monitorProcesses.get(monProc2) + varList + ";\n\n");
		}
		
		return visitChildren(ctx);

	}

	@Override
	public String visitDataValueExpressionStateFrm(
			@NotNull mucalculusParser.DataValueExpressionStateFrmContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitFalseStateFrm(
			@NotNull mucalculusParser.FalseStateFrmContext ctx) {
		String monProc;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (humanReadable){
//			System.out.println("proc " + monProc
//					+ prepend_UniversalQuantifierStateFrm + " = error;");
			finalResult.append("proc " + monProc
					+ prepend_UniversalQuantifierStateFrm + " = error;\n\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ prepend_UniversalQuantifierStateFrm + " = error;");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ prepend_UniversalQuantifierStateFrm + " = error;\n\n");
		}
		
		return visitChildren(ctx);
	}

	@Override
	public String visitUniversalQuantifierStateFrm(
			@NotNull mucalculusParser.UniversalQuantifierStateFrmContext ctx) {

		String monProc, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm().getText() + "\"";
		if (monitorProcesses.get(monProc) == null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if (monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));


		List<VarsDeclContext> vars = ctx.varsDeclList().varsDecl();
		Iterator<VarsDeclContext> it = vars.iterator();
		varList = "(" + varList;
		while (it.hasNext()) {
			VarsDeclContext var = it.next();
			varList = varList + var.idList().getText();
			if (it.hasNext())
				varList = varList + ",";
		}
		varList = varList + ")";
		if (humanReadable){
//			System.out.println("proc " + monProc + " = sum "
//					+ ctx.varsDeclList().getText() + ". " + monProc2 + varList
//					+ ";");
			finalResult.append("proc " + monProc + " = sum "
					+ ctx.varsDeclList().getText() + ". " + monProc2 + varList
					+ ";\n");
		}
		else{
//			System.out.println("proc " + monitorProcesses.get(monProc)
//					+ " = sum " + ctx.varsDeclList().getText() + ". "
//					+ monitorProcesses.get(monProc2) + varList + ";");
			finalResult.append("proc " + monitorProcesses.get(monProc)
					+ " = sum " + ctx.varsDeclList().getText() + ". "
					+ monitorProcesses.get(monProc2) + varList + ";\n\n");
		}
		
		// here get the list of variables
		prepend_UniversalQuantifierStateFrm = "("
				+ prepend_UniversalQuantifierStateFrm
				+ ctx.varsDeclList().getText() + ")";
		return visitChildren(ctx);
	}

	public String visitExistentialQuantifierStateFrm(
			@NotNull mucalculusParser.ExistentialQuantifierStateFrmContext ctx) {
		return visitChildren(ctx);
	}

	public String visitNegationStateFrm(
			@NotNull mucalculusParser.NegationStateFrmContext ctx) {
		return visitChildren(ctx);
	}

	
	@Override
	public String visitIdentifierDataExpr(
			@NotNull mucalculusParser.IdentifierDataExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitUniversalQuantifierDataExpr(
			@NotNull mucalculusParser.UniversalQuantifierDataExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitExistentialQuantifierDataExpr(
			@NotNull mucalculusParser.ExistentialQuantifierDataExprContext ctx) {
		return visitChildren(ctx);
	}

	@Override
	public String visitDataExprList(
			@NotNull mucalculusParser.DataExprListContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitVarsDeclList(
			@NotNull mucalculusParser.VarsDeclListContext ctx) {
		return visitChildren(ctx);

	}

	@Override
	public String visitVarsDecl(@NotNull mucalculusParser.VarsDeclContext ctx) {
		IdListContext idListContext = ctx.idList();
		List<TerminalNode> idList = idListContext.ID();
		for (TerminalNode id : idList) {
			if (!varDeclarations.containsKey(id.getText())) {
				varDeclarations.put(id.getText(), ctx.sortExpr().getText());
			}
		}

		return visitChildren(ctx);
	}

	@Override public String visitMuOperator(@NotNull mucalculusParser.MuOperatorContext ctx) { 
		try {
			throw new NotMonitorableException("MuOperatorContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);
		}
		return visitChildren(ctx);
	}
	
	@Override public String visitNuOperator(@NotNull mucalculusParser.NuOperatorContext ctx)  { 
		try {
			throw new NotMonitorableException("NuOperatorContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}

	@Override public String visitDiamondModalityStateFrm(@NotNull mucalculusParser.DiamondModalityStateFrmContext ctx)  { 
		try {
			throw new NotMonitorableException("DiamondModalityStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}
	
	@Override public String visitDisjunctionStateFmr(@NotNull mucalculusParser.DisjunctionStateFmrContext ctx)  { 
		try {
			throw new NotMonitorableException("DisjunctionStateFmrContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
		return visitChildren(ctx);
	}

	@Override public String visitImplicationStateFrm(@NotNull mucalculusParser.ImplicationStateFrmContext ctx)  { 
		try {
			throw new NotMonitorableException("ImplicationStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}
	
	@Override public String visitPBESVariableStateFrm(@NotNull mucalculusParser.PBESVariableStateFrmContext ctx) { 
		try {
			throw new NotMonitorableException("PBESVariableStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}

	@Override public String visitDelayOpStateFrm(@NotNull mucalculusParser.DelayOpStateFrmContext ctx){ 
		try {
			throw new NotMonitorableException("DelayOpStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}
	
	@Override public String visitYaledOpStateFrm(@NotNull mucalculusParser.YaledOpStateFrmContext ctx){ 
			try {
				throw new NotMonitorableException("YaledOpStateFrmContext: The property is not monitorable! Exiting...");
			} catch (NotMonitorableException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
				System.exit(1);

			}
		
		return visitChildren(ctx);
	}
	
	@Override public String visitMuStateFrm(@NotNull mucalculusParser.MuStateFrmContext ctx){ 
		try {
			throw new NotMonitorableException("YaledOpStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}
	
	@Override public String visitNuStateFrm(@NotNull mucalculusParser.NuStateFrmContext ctx){ 
		try {
			throw new NotMonitorableException("YaledOpStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}

	@Override public String visitAtOperatorActionFrm(@NotNull mucalculusParser.AtOperatorActionFrmContext ctx) { 
		try {
			throw new NotMonitorableException("YaledOpStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}
	
	@Override public String visitImplication(@NotNull mucalculusParser.ImplicationContext ctx) { 
		try {
			throw new NotMonitorableException("YaledOpStateFrmContext: The property is not monitorable! Exiting...");
		} catch (NotMonitorableException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);

		}
		return visitChildren(ctx);
	}


}

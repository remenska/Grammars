package info.remenska.PASS.monitor.mCRL2;

// Generated from mucalculus.g4 by ANTLR 4.1
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BoxModalityStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BracketsStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.ConjunctionStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.IdListContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.NonEmptyIterationRegFormContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.RegFrmContext;

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
    public static Hashtable<String,String> varDeclarations = new Hashtable<String,String>();
	public MyMuCalculusVisitor(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}
	
	 Hashtable<String, Integer> monitorProcesses
     = new Hashtable<String, Integer>();
	 int counter = 1;
	@Override public String visitStart(@NotNull mucalculusParser.StartContext ctx) { 	
//		System.out.println("Visited Start: " + ctx.getText());
		String monProc = "Mon_\"" + ctx.getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		
//		System.out.println("proc Monitor = " + "Mon_" + monitorProcesses.get(monProc) + ";");
			
		System.out.println("proc Monitor = " + "Mon_\"" + ctx.getText()+"\";");
		
		return visitChildren(ctx); 
	
	}

	
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public String visitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx) { 
//	System.out.println("Yay I visited TRUE state formula:" + ctx.getText());
	return visitChildren(ctx); 

	}

	@Override public String visitActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx) { 
//	System.out.println("Visited actionFormulaRegForm: " + ctx.getText());
	return visitChildren(ctx); 

	}


	@Override public String visitNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx) { 
		String monProc = "Mon_\"" + ctx.getText() + "\"";
		String monProc1 = "Mon_\"" + ctx.regFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
//		System.out.println("proc Mon_" +monitorProcesses.get(monProc) + " = Mon_" + monitorProcesses.get(monProc1) + ". Mon_" + monitorProcesses.get(monProc)+ ";");
		System.out.println("proc Mon_\"" + ctx.getText() + "\" = Mon_\"" + ctx.regFrm().getText() + "\". " + "Mon_\"" + ctx.getText() + "\";");
	return visitChildren(ctx); 

	}

	@Override public String visitIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx) { 
	return visitChildren(ctx); 

	}

	@Override public String visitSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx) { 
	String monProc, monProc1, monProc2;
	monProc = "Mon_\"" + ctx.getText() + "\"";
	monProc1 = "Mon_" + ctx.regFrm(0).getText() + "\"";
	monProc2 = "Mon_\"" + ctx.regFrm(1).getText() + "\"";
	
    Token t1 = (Token) ctx.regFrm(0).start;
    Token t2 = (Token) ctx.regFrm(0).stop;

    int i = t1.getTokenIndex();

//    System.out.println("TOKEN start = " + t1.getText()+" end = " + t2.getText());
// if TOKEN.end = * then do the rewrite
    
//    System.out.println("TOKEN INDEX = " + i);
//    System.out.println("Tokens size = " + tokens.size());
//    rewriter.replace(t1, "amaaan");
    
//    if(t2.getText().equals("*") && tokens.get(t2.getTokenIndex()+1).getText().equals(".")){
    if(tokens.get(t2.getTokenIndex()+1).getText().equals(".")){
    	// transformation
//    	System.out.println(tokens.get(t2.getTokenIndex()+1).getText());
    		rewriter.delete(t2.getTokenIndex()+1);
    		rewriter.insertAfter(t2.getTokenIndex(), "][");
//    	return visit(ctx.getParent());
    	//we're ready
    }
    	
    if(monitorProcesses.get(monProc)==null)
		monitorProcesses.put(monProc, new Integer(counter++));
	if(monitorProcesses.get(monProc1)==null)
		monitorProcesses.put(monProc1, new Integer(counter++));
	if(monitorProcesses.get(monProc2) == null)
		monitorProcesses.put(monProc2, new Integer(counter++));
// 	System.out.println("proc Mon_" + monitorProcesses.get(monProc)+ " = Mon_" + monitorProcesses.get(monProc1)+ " . " +  "Mon_"+ monitorProcesses.get(monProc2)+ ";");

 	System.out.println("proc Mon_\"" + ctx.getText() +"\" = " + "Mon_\"" + ctx.regFrm(0).getText() + "\"." + "Mon_\"" + ctx.regFrm(1).getText() + "\";");

	return visitChildren(ctx); 

	}

	@Override public String visitAction(@NotNull mucalculusParser.ActionContext ctx) {
		// TODO: this needs to be modified in case of actions with dataExprList
		String monProc = "Mon_\"" + ctx.getText() + "\"";
//		System.out.println("data? " + ctx.dataExprList());
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
//		System.out.println("proc Mon_" +monitorProcesses.get(monProc) +  " = act_" + ctx.ID().getText() + ";");
		System.out.println("proc Mon_\"" + ctx.getText() + "\" = act_" + ctx.ID().getText() + ";");
		
		if(!actions.contains(ctx.getText()))
			actions.add(ctx.getText());
		
//      return visitChildren(ctx); 
		return new String(ctx.getText());

}
	@Override public String visitBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx) { 
//		System.out.println("Box modality: " + ctx.getText());
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.regFrm().getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if(monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));
		
//		System.out.println("proc Mon_" + monitorProcesses.get(monProc) + " = " + "Mon_"  + monitorProcesses.get(monProc1)+ " . Mon_" + monitorProcesses.get(monProc2)  + ";" );
		System.out.println("proc Mon_\"" + ctx.getText()+"\" = " + "Mon_\"" + ctx.regFrm().getText() +"\" . Mon_\"" + ctx.stateFrm().getText() +"\";" );

	  if (ctx.regFrm() instanceof mucalculusParser.IterationRegFormContext) {
//		  System.out.println("YESS"); //this means expansion is necessary
//		  //[regForm*]stateForm = (stateForm && [regForm+]stateForm)
//		  // build this (...)
//		  BracketsStateFrmContext _localctx = new BracketsStateFrmContext(ctx);
//		  // build this (... && ...)
//		  ConjunctionStateFrmContext _localctx1 = new ConjunctionStateFrmContext(_localctx);
//		  
		  mucalculusParser.RegFrmContext child1 = ctx.regFrm();
		  mucalculusParser.StateFrmContext child2 = ctx.stateFrm();
//		  System.out.println("Child 1:" + child1.getText());
//		  System.out.println("Child 2:" + child2.getText());
		  
		  mucalculusParser.RegFrmContext child1modified = (RegFrmContext) ctx.regFrm().getChild(0);
		  Token t1 = (Token) child1.start;
		  Token t2 = (Token) child1.stop;
//        System.out.println("TOKEN " + t1.getText());
//        System.out.println(rewriter.getText(new Interval(t1.getTokenIndex(), t2.getTokenIndex())));
//        System.out.println(t1.getTokenIndex() + " : " + t2.getTokenIndex());
        rewriter.insertAfter(t2.getTokenIndex(), "(false"+ " + " + child1modified.getText() +"+" +")");
        rewriter.delete(t1.getTokenIndex(), t2.getTokenIndex());
		  // now replace [child1*]child2 = ([nil]child2 && [child1+]child2)
//		  
//		  // build this: regForm+
//		  mucalculusParser.RegFrmContext child1modified = (RegFrmContext) child1.getChild(0);
//		  NonEmptyIterationRegFormContext regPlusCtx = new NonEmptyIterationRegFormContext(child1modified);
//		  regPlusCtx.addChild(child1modified);
//		  
//		  // build this: [regForm+]stateForm
//		  BoxModalityStateFrmContext boxCtx = new BoxModalityStateFrmContext(_localctx1);
//		  
//		  boxCtx.addChild(regPlusCtx);
//		  boxCtx.addChild(child2);
//		  
//		  // build this (stateForm && [regForm+]stateForm
//		  _localctx1.addChild(child2);
//		  _localctx1.addChild(boxCtx);
//		  _localctx.addChild(_localctx1);
//		  
////		  _localctx.addChild(matchedToken)
//		  return visit(_localctx);
//		  
	  }
		  return visitChildren(ctx);

	  }
	
	
	@Override public String visitConjunctionStateFrm(@NotNull mucalculusParser.ConjunctionStateFrmContext ctx) { 
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.stateFrm(0).getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm(1).getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if(monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));
		
//		System.out.println("proc Mon_" + monitorProcesses.get(monProc) + " = " + "Mon_ " + monitorProcesses.get(monProc1) + " + " + "Mon_" + monitorProcesses.get(monProc2)+ ";");

		System.out.println("proc Mon_\"" + ctx.getText() + "\" = " + "Mon_\"" + ctx.stateFrm(0).getText()+"\" + " + "Mon_\"" + ctx.stateFrm(1).getText() + "\";");
		return visitChildren(ctx); 
	}

	@Override public String visitIntersectionOfActions(@NotNull mucalculusParser.IntersectionOfActionsContext ctx) { 
		System.out.println("Visited IntersectionOfActions: " + ctx.getText());
		return visitChildren(ctx); 
		
	}
	
	@Override public String visitDisjunctionDataExpr(@NotNull mucalculusParser.DisjunctionDataExprContext ctx) { 
		return visitChildren(ctx); 
	}

	@Override public String visitBracketsStateFrm(@NotNull mucalculusParser.BracketsStateFrmContext ctx) { 
		
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.stateFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		
	 	System.out.println("proc Mon_\"" + ctx.getText() +"\" = " + "Mon_\"" + ctx.stateFrm().getText() + "\";");
		return visitChildren(ctx); 
	}
	
	@Override public String visitDataValueExpressionActionFrm(@NotNull mucalculusParser.DataValueExpressionActionFrmContext ctx) { 
		return visitChildren(ctx); 
		
	}

	@Override public String visitBracketsActionFrm(@NotNull mucalculusParser.BracketsActionFrmContext ctx) { 
		
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.actFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		
	 	System.out.println("proc Mon_\"" + ctx.getText() +"\" = " + "Mon_\"" + ctx.actFrm().getText() + "\";");
		return visitChildren(ctx); 
		
	}

	@Override public String visitMultiAction(@NotNull mucalculusParser.MultiActionContext ctx) { 
		return visitChildren(ctx); 
	
	}

	@Override public String visitTrueActionFrm(@NotNull mucalculusParser.TrueActionFrmContext ctx) { 
		return visitChildren(ctx); 
		
	}

	
	@Override public String visitFalseActionFrm(@NotNull mucalculusParser.FalseActionFrmContext ctx) { 
		return visitChildren(ctx); 
		
	}

	@Override public String visitNegationActionFrm(@NotNull mucalculusParser.NegationActionFrmContext ctx) { 
		System.out.println("Visited negationActionFormula: " + ctx.actFrm().getText());
//		System.out.println("not(" + visit(ctx.actFrm()) + ")");
		return new String("not(" + visit(ctx.actFrm()) +")"); 
		
	}

	@Override public String visitUniversalQuantifierActionFrm(@NotNull mucalculusParser.UniversalQuantifierActionFrmContext ctx) { return visitChildren(ctx); }

	@Override public String visitExistentialQuantifierActionFrm(@NotNull mucalculusParser.ExistentialQuantifierActionFrmContext ctx) { return visitChildren(ctx); }

	@Override public String visitUnionOfActions(@NotNull mucalculusParser.UnionOfActionsContext ctx) { 
		
		System.out.println("Visited unionOfActions: " + ctx.getText());
//		ctx.actFrm();
//		System.out.println("or(" + visit(ctx.actFrm(0)) +" , "+ visit(ctx.actFrm(1)) + ")");
		return new String("or(" + visit(ctx.actFrm(0)) +" , "+ visit(ctx.actFrm(1)) + ")");

//		return visitChildren(ctx); 
		
	}

	@Override public String visitBracketsRegForm(@NotNull mucalculusParser.BracketsRegFormContext ctx) { 
		String monProc, monProc1;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.regFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		
	 	System.out.println("proc Mon_\"" + ctx.getText() +"\" = " + "Mon_\"" + ctx.regFrm().getText() + "\";");
		return visitChildren(ctx); 
	}

	@Override public String visitNilRegForm(@NotNull mucalculusParser.NilRegFormContext ctx) { return visitChildren(ctx); }

	@Override public String visitAlternativeCompositionRegForm(@NotNull mucalculusParser.AlternativeCompositionRegFormContext ctx) { 
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc1 = "Mon_" + ctx.regFrm(0).getText() + "\"";
		monProc2 = "Mon_\"" + ctx.regFrm(1).getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc1)==null)
			monitorProcesses.put(monProc1, new Integer(counter++));
		if(monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));
		
//		System.out.println("proc Mon_" + monitorProcesses.get(monProc) + " = " + "Mon_ " + monitorProcesses.get(monProc1) + " + " + "Mon_" + monitorProcesses.get(monProc2)+ ";");

	 	System.out.println("proc Mon_\"" + ctx.getText() +"\" = " + "Mon_\"" + ctx.regFrm(0).getText() + "\" + " + "Mon_\"" + ctx.regFrm(1).getText() + "\";");
		return visitChildren(ctx); 
		
	}

	@Override public String visitDataValueExpressionStateFrm(@NotNull mucalculusParser.DataValueExpressionStateFrmContext ctx) { return visitChildren(ctx); }

	@Override
	public String visitFalseStateFrm(
			@NotNull mucalculusParser.FalseStateFrmContext ctx) {
		System.out.println("proc Mon_\""+ ctx.getText()+ "\" = error;");
		return visitChildren(ctx);
	}

	@Override
	public String visitUniversalQuantifierStateFrm(
			@NotNull mucalculusParser.UniversalQuantifierStateFrmContext ctx) {
//		System.out.println("Visited UniversalQuantifierStateFrm: " + ctx.getText()+" = " + ctx.varsDeclList().getText() + "  " + ctx.stateFrm().getText());
		String monProc, monProc1, monProc2;
		monProc = "Mon_\"" + ctx.getText() + "\"";
		monProc2 = "Mon_\"" + ctx.stateFrm().getText() + "\"";
		if(monitorProcesses.get(monProc)==null)
			monitorProcesses.put(monProc, new Integer(counter++));
		if(monitorProcesses.get(monProc2) == null)
			monitorProcesses.put(monProc2, new Integer(counter++));

//		System.out.println("proc Mon_" + monitorProcesses.get(monProc) + " = sum " + ctx.varsDeclList().getText()+". Mon_" + monitorProcesses.get(monProc2)+ ";");
	
		System.out.println("proc Mon_\"" + ctx.getText() + "\" = sum " + ctx.varsDeclList().getText()+". Mon_\""+ ctx.stateFrm().getText()+ "\";");
		
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
	public String visitPBESVariableStateFrm(
			@NotNull mucalculusParser.PBESVariableStateFrmContext ctx) {
		return visitChildren(ctx);
	}
	@Override public String visitIdentifierDataExpr(@NotNull mucalculusParser.IdentifierDataExprContext ctx) { return visitChildren(ctx); }

	@Override public String visitUniversalQuantifierDataExpr(@NotNull mucalculusParser.UniversalQuantifierDataExprContext ctx) { return visitChildren(ctx); }

	@Override public String visitExistentialQuantifierDataExpr(@NotNull mucalculusParser.ExistentialQuantifierDataExprContext ctx) { return visitChildren(ctx); }

	@Override public String visitDataExprList(@NotNull mucalculusParser.DataExprListContext ctx) { return visitChildren(ctx); }

	@Override public String visitVarsDeclList(@NotNull mucalculusParser.VarsDeclListContext ctx) { 
		
		return visitChildren(ctx); 
		
	}

	@Override public String visitVarsDecl(@NotNull mucalculusParser.VarsDeclContext ctx) {
		IdListContext idListContext = ctx.idList();
		List<TerminalNode> idList = idListContext.ID();
		for(TerminalNode id:idList){
			if(!varDeclarations.containsKey(id.getText())){
				varDeclarations.put(id.getText(), ctx.sortExpr().getText());
			}
		}
		
//		ctx.idList();
//		ctx.sortExpr();
		return visitChildren(ctx); 
	}

	}


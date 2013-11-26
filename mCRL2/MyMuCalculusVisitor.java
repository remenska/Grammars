package info.remenska.PASS.monitor.mCRL2;

// Generated from mucalculus.g4 by ANTLR 4.1
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BoxModalityStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.BracketsStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.ConjunctionStateFrmContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.NonEmptyIterationRegFormContext;
import info.remenska.PASS.monitor.mCRL2.mucalculusParser.RegFrmContext;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class MyMuCalculusVisitor extends mucalculusBaseVisitor<String> {

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public String visitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx) { 
	System.out.println("Yay I visited TRUE state formula:" + ctx.getText());
	return visitChildren(ctx); 

	}

	@Override public String visitActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx) { 
	
	System.out.println("Visited actionFormulaRegForm: " + ctx.getText());
	return visitChildren(ctx); 

	}


	@Override public String visitNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx) { 

	System.out.println("Visited non-empty + iterationRegularForm: " + ctx.getText());
	return visitChildren(ctx); 

	}

	@Override public String visitIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx) { 
	System.out.println("Visited * iterationRegularForm: " + ctx.regFrm().getText());
// 	mucalculusParser.RegFrmContext e = ctx.regFrm();
//         System.out.println("AND -> " + e.getText());
    

	return visitChildren(ctx); 

	}

	@Override public String visitSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx) { 
// 	System.out.print(".");
	// note: problem is, traversal is breadth-first!
	// listeners do a depth-first traversal
	System.out.println("Visited sequentialCompositionRegularForm: " + ctx.getText());
// 	rewriter.replace(ctx.mySeqSign(),"][");	
// 	System.out.println(ctx.regFrm().getText());
	return visitChildren(ctx); 

	}

	@Override public String visitAction(@NotNull mucalculusParser.ActionContext ctx) { 
//           System.out.println("proc Monitor_"+ctx.ID() + " = " + ctx.ID() + "_mon ;   % visited action");

	System.out.println("Visited action: " + ctx.getText());
      return visitChildren(ctx); 

}
	@Override public String visitBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx) { 
	  System.out.println("Visited visitBoxModalityStateFrm: " + ctx.getText());
//	  System.out.println("Aman:" + ctx.regFrm().getText());
//	  System.out.println("The rest: " + ctx.stateFrm().getText());
//	  System.out.println(ctx.toStringTre);
	  
	  if (ctx.regFrm() instanceof mucalculusParser.IterationRegFormContext) {
		  System.out.println("YESS"); //this means expansion is necessary
		  //[regForm*]stateForm = (stateForm && [regForm+]stateForm)
		  // build this (...)
		  BracketsStateFrmContext _localctx = new BracketsStateFrmContext(ctx);
		  // build this (... && ...)
		  ConjunctionStateFrmContext _localctx1 = new ConjunctionStateFrmContext(_localctx);
		  
		  mucalculusParser.RegFrmContext child1 = ctx.regFrm();
		  mucalculusParser.StateFrmContext child2 = ctx.stateFrm();
		  
		  // build this: regForm+
		  mucalculusParser.RegFrmContext child1modified = (RegFrmContext) child1.getChild(0);
		  NonEmptyIterationRegFormContext regPlusCtx = new NonEmptyIterationRegFormContext(child1modified);
		  regPlusCtx.addChild(child1modified);
		  
		  // build this: [regForm+]stateForm
		  BoxModalityStateFrmContext boxCtx = new BoxModalityStateFrmContext(_localctx1);
		  boxCtx.addChild(regPlusCtx);
		  boxCtx.addChild(child2);
		  
		  // build this (stateForm && [regForm+]stateForm
		  _localctx1.addChild(child2);
		  _localctx1.addChild(boxCtx);
		  _localctx.addChild(_localctx1);
//		  _localctx.addChild(matchedToken)
		  return visit(_localctx);
		  
	  } else
		  return visitChildren(ctx);
//	  //  instanceof mucalculusParser.NonEmptyIterationRegFormContext
////	  mucalculusParser.BoxModalityStateFrmContext ctx1;
//	  BracketsStateFrmContext _localctx = new BracketsStateFrmContext(ctx);
//	  ConjunctionStateFrmContext _localctx1 = new ConjunctionStateFrmContext(_localctx);
//	  mucalculusParser.RegFrmContext child1 = ctx.regFrm();
//	  mucalculusParser.StateFrmContext child2 = ctx.stateFrm();
////	  ctx.addChild(child1);
////	  ctx.addChild(child2);
//	  _localctx1.addChild(child1);
//	  _localctx1.addChild(child2);
//	  _localctx.addChild(_localctx1);
//
////	  return visit(child1) + "&&" + visit(child2);
//	  	  
//	  return visit(_localctx); 

	  }
	
	@Override public String visitConjunctionStateFrm(@NotNull mucalculusParser.ConjunctionStateFrmContext ctx) { 
		System.out.println("Visited visitConjunctionStateFrm: " + ctx.getText());
		System.out.println("--> ConjunctionStateFrm: children " + ctx.getChild(0).getText() + ","+ ctx.getChild(1).getText());
		return visitChildren(ctx); 
	}

	@Override public String visitIntersectionOfActions(@NotNull mucalculusParser.IntersectionOfActionsContext ctx) { 
		System.out.println("Visited IntersectionOfActions: " + ctx.getText());

		return visitChildren(ctx); 
		
	}
	
	@Override public String visitDisjunctionDataExpr(@NotNull mucalculusParser.DisjunctionDataExprContext ctx) { 
		System.out.println("Visited DisjunctionDataExpr: " + ctx.getText());
		return visitChildren(ctx); 
	}

	@Override public String visitBracketsStateFrm(@NotNull mucalculusParser.BracketsStateFrmContext ctx) { 
		System.out.println("Visited BracketsStateFrm: " + ctx.getText());

		return visitChildren(ctx); 
	}

	
	}


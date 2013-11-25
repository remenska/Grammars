// Generated from mucalculus.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.TokenStreamRewriter;

public class MyMuCalculusVisitor<T> extends mucalculusBaseVisitor<T> {

	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.
	 */
	@Override public T visitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx) { 
	System.out.println("Yay I visited TRUE state formula \\0/");
	return visitChildren(ctx); 

	}

	@Override public T visitActionFormulaRegForm(@NotNull mucalculusParser.ActionFormulaRegFormContext ctx) { 
	
	System.out.println("Visited actionFormulaRegForm");
	return visitChildren(ctx); 

	}


	@Override public T visitNonEmptyIterationRegForm(@NotNull mucalculusParser.NonEmptyIterationRegFormContext ctx) { 

	System.out.println("Visited non-empty + iterationRegularForm");
	return visitChildren(ctx); 

	}

	@Override public T visitIterationRegForm(@NotNull mucalculusParser.IterationRegFormContext ctx) { 
	System.out.println("Visited * iterationRegularForm: " + ctx.regFrm().getText());
// 	mucalculusParser.RegFrmContext e = ctx.regFrm();
//         System.out.println("AND -> " + e.getText());
    

	return visitChildren(ctx); 

	}

	@Override public T visitSequentialCompositionRegForm(@NotNull mucalculusParser.SequentialCompositionRegFormContext ctx) { 
// 	System.out.print(".");
	// note: problem is, traversal is breadth-first!
	// listeners do a depth-first traversal
	System.out.println("Visited sequentialCompositionRegularForm");
// 	rewriter.replace(ctx.mySeqSign(),"][");	
// 	System.out.println(ctx.regFrm().getText());
	return visitChildren(ctx); 

	}

	@Override public T visitAction(@NotNull mucalculusParser.ActionContext ctx) { 
//           System.out.println("proc Monitor_"+ctx.ID() + " = " + ctx.ID() + "_mon ;   % visited action");

	System.out.println("Visited action: " + ctx.ID().getText());
      return visitChildren(ctx); 

}
	@Override public T visitBoxModalityStateFrm(@NotNull mucalculusParser.BoxModalityStateFrmContext ctx) { 
	  System.out.println("Visited visitBoxModalityStateFrm");
	  return visitChildren(ctx); 

	  }

	}


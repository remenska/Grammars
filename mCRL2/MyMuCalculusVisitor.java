// Generated from mucalculus.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

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

}


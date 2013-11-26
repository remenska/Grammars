package info.remenska.PASS.monitor.mCRL2;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class MyMuCalculusListener extends mucalculusBaseListener{
	@Override public void enterTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx) {
	  System.out.println("Entered TRUE \0/ ");
	}
	/**
	 * {@inheritDoc}
	 * <p/>
	 * The default implementation does nothing.
	 */
	@Override public void exitTrueStateFrm(@NotNull mucalculusParser.TrueStateFrmContext ctx) { 
	  System.out.println("Exited TRUE \0/ ");
	}
}

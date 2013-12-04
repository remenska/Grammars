package info.remenska.PASS.monitor.mCRL2;

import info.remenska.PASS.monitor.mCRL2.mcrl2Parser.SortExprContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

// we're using this visitor just to collect action && argument types
public class BeforeInitmcrl2Visitor extends mcrl2BaseVisitor<String>  {
	public static BufferedTokenStream tokens;
    public static TokenStreamRewriter rewriter;


    public BeforeInitmcrl2Visitor(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}
   
	@Override public String visitMCRL2Spec(@NotNull mcrl2Parser.MCRL2SpecContext ctx) { 
		String result = visitChildren(ctx);
		System.out.println("SIZE:" + ctx.mCRL2SpecElt().size());
		System.out.println(">>>>>" + ctx.mCRL2SpecElt().get(2).getText());
		return result; 
	}


}

	
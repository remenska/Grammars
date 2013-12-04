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
public class Mymcrl2Visitor extends mcrl2BaseVisitor<String>  {
	public static BufferedTokenStream tokens;
    public static TokenStreamRewriter rewriter;
    public static Hashtable<String, ArrayList<String>> actionsDict = new Hashtable<String, ArrayList<String>>();
    public static String afterInit = new String();
    public static Hashtable<String,String> varDeclarations = new Hashtable<String,String>();

    public Mymcrl2Visitor(BufferedTokenStream tokens) {
		this.tokens = tokens;
		rewriter = new TokenStreamRewriter(tokens);
	}
    
	@Override public String visitActDecl(@NotNull mcrl2Parser.ActDeclContext ctx) { 
		String ids = visit(ctx.idList());
		
		String types = null;
		ArrayList<String> typesList = null;
		
		ids = ids.replace("[","");
        ids = ids.replace("]","");
        ArrayList<String> idList = new ArrayList<String>(Arrays.asList(ids.split(", ")));
     
        if(ctx.sortExprList()!=null){
			types = visit(ctx.sortExprList());
			types = types.replace("[","");
	        types = types.replace("]","");
	        typesList = new ArrayList<String>(Arrays.asList(types.split(", ")));
		}
		
        
        for(String id:idList){
        	if(typesList!=null){
        		actionsDict.put(id, typesList);
        	}
        	else
        	{
        		actionsDict.put(id, new ArrayList<String>());
        	}
        		
        }
		String result = new String(ids+"->"+types);	
		return result; 
	}
	
	@Override public String visitIdList(@NotNull mcrl2Parser.IdListContext ctx) { 
		List<TerminalNode> ids = ctx.ID();
		String result = new String(ids.toString());
		return result;
		}


	@Override public String visitSortExprList(@NotNull mcrl2Parser.SortExprListContext ctx) { 
		List<SortExprContext> sortList = ctx.sortExpr();
		LinkedList<String> result = new LinkedList<String>();
		for(SortExprContext el:sortList){
			result.add(visit(el));
		}
		return result.toString();
	}

	@Override public String visitSortExprSimpleSortExpr(@NotNull mcrl2Parser.SortExprSimpleSortExprContext ctx) { 
		String result = new String(ctx.getText());
		return result; 
	}
	
	@Override public String visitFunctionSort(@NotNull mcrl2Parser.FunctionSortContext ctx) { 
		String result = new String(ctx.getText());
		return result; 
	}


	
	@Override public String visitSortmCRL2SpecElt(@NotNull mcrl2Parser.SortmCRL2SpecEltContext ctx) {
		return null;
//		return visitChildren(ctx); 
	}
	
	@Override public String visitConsmCRL2SpecElt(@NotNull mcrl2Parser.ConsmCRL2SpecEltContext ctx) { 
		return null;
//		return visitChildren(ctx); 
	}

	@Override public String visitMapmCRL2SpecElt(@NotNull mcrl2Parser.MapmCRL2SpecEltContext ctx) { 
		return null;
//		return visitChildren(ctx); 
	}

	@Override public String visitEqnmCRL2SpecElt(@NotNull mcrl2Parser.EqnmCRL2SpecEltContext ctx) { 
		return null;
//		return visitChildren(ctx); 
	}

	@Override public String visitGlobalVarmCRL2SpecElt(@NotNull mcrl2Parser.GlobalVarmCRL2SpecEltContext ctx) { 
		return null;
//		return visitChildren(ctx); 
	}
	
	@Override public String visitProcmCRL2SpecElt(@NotNull mcrl2Parser.ProcmCRL2SpecEltContext ctx) {
		return null;
//		return visitChildren(ctx); 
	}

	@Override public String visitInit(@NotNull mcrl2Parser.InitContext ctx) {
		afterInit = ctx.procExpr().getText();
		return null;
//		return visitChildren(ctx); 
	}


}

	
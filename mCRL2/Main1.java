package info.remenska.PASS.monitor.mCRL2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

//import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRStringStream;
//import org.antlr.runtime.CharStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.TokenStreamRewriter;
import org.apache.commons.io.IOUtils;

public class Main1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("/home/daniela/Documents/mCRL2_new_models/June2013/ForallExample.mcrl2");
		//TODO: First a visitor to collect all the action declarations of a model, for this we need the 
		//full mCRL2 grammar
		String initialString = IOUtils.toString(is);	
		mcrl2Lexer lexer = new mcrl2Lexer((CharStream) new ANTLRInputStream(initialString));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mcrl2Parser parser = new mcrl2Parser(tokens);
		ParseTree tree = parser.start();
		
//        System.out.println(parser.getState());
		// we're using this visitor just to collect action && argument types
		Mymcrl2Visitor visitor = new Mymcrl2Visitor(tokens);
		visitor.visit(tree);
		System.out.println("AND FINALLY: " + visitor.actionsDict);
		createActionFormulaSort();
		createActionSort(visitor);
	}
	
	public static String createActionSort(Mymcrl2Visitor visitor){
		StringBuffer result = new StringBuffer();
		result.append("sort Action = struct ");
		Hashtable<String, ArrayList<String>> actionsDict = visitor.actionsDict;
		Enumeration<String> keys = actionsDict.keys();
		while(keys.hasMoreElements()){
			String key = keys.nextElement();
			ArrayList<String> dataTypes = actionsDict.get(key);
			result.append(key);
			if(dataTypes.size()>0){
				result.append("(");
				int counter = 1;
				Iterator<String> iter = dataTypes.iterator();
				while(iter.hasNext()){
					String dt = iter.next();
					result.append("arg"+counter++ + ":" + dt);

					if(iter.hasNext())
						result.append(",");
				}
				
				for(String dt:dataTypes){
				}
				result.append(")");
			}
			
			if(keys.hasMoreElements()){
				result.append("\n | ");
			} else
				result.append(";\n\n");
		}
		 
		System.out.println(result.toString());
		return result.toString();
	}
	
	public static String createActionFormulaSort(){
		String result = new String("\n\nsort ActionFormula = struct action(act1:Action)\n" + 
					"| and(phi1:ActionFormula,phi2:ActionFormula) \n" + 
					"| or(phi1:ActionFormula,phi2:ActionFormula)  \n" + 
					"| not(ActionFormula) \n" + 
					"| Forall(ActionFormula) \n" + 
					"| Exists(ActionFormula) \n" +
					     "| True \n" +
					     "| False ; \n\n");	
		
		System.out.println(result);
		return result;
	}
}
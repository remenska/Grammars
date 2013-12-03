package info.remenska.PASS.monitor.mCRL2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
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

public class Main {
	public static void main(String[] args) throws Exception {
		if(args.length<2){
			System.out.println("Usage: java info.remenska.PASS.monitor.mCRL2.Main <mCRL2ModelFile> <muCalculusFile> <humanReadable>");
			System.out.println("\t\t<humanReadable> is optional boolean switch, and if set to true, \n\t\tyields to process names that are not parsable by mCRL2. ");
			System.out.println("\t\tIt should be used this way only for inspecting the translation. Default value is false.");
			System.exit(1);
		}
		// First thing's first
		// "/home/daniela/Documents/mCRL2_new_models/June2013/ForallExample.mcrl2"
		InputStream ismcrl2 = new FileInputStream(args[0]);
		//TODO: First a visitor to collect all the action declarations of a model, for this we need the 
		//full mCRL2 grammar
		String initialStringmcrl2 = IOUtils.toString(ismcrl2);	
		try{ 
		mcrl2Lexer lexermcrl2 = new mcrl2Lexer((CharStream) new ANTLRInputStream(initialStringmcrl2));
		CommonTokenStream tokensmcrl2 = new CommonTokenStream(lexermcrl2);
		mcrl2Parser parsermcrl2 = new mcrl2Parser(tokensmcrl2);
		ParseTree treemcrl2 =  parsermcrl2.start();
		
//        System.out.println(parser.getState());
		// we're using this visitor just to collect action && argument types
		Mymcrl2Visitor visitormcrl2 = new Mymcrl2Visitor(tokensmcrl2);
		
		visitormcrl2.visit(treemcrl2);
		System.out.println("AND FINALLY: " + visitormcrl2.actionsDict);
		createActionSort(visitormcrl2);
		createActionFormulaSort();
		createMappings(visitormcrl2);
		}
		catch(java.lang.NullPointerException e){
			System.out.println("mCRL2 model is not well formed.");
			System.err.println("Exception stack trace=========");
			e.printStackTrace(new PrintStream(System.err));
			System.exit(1);
		}
		// end first thing's first
		// "/home/daniela/IBM/rationalsdp/workspace1/info.remenska.PASS/src/info/remenska/PASS/monitor/mCRL2/test.mu"
		InputStream is = new FileInputStream(args[1]);
		//TODO: First a visitor to collect all the action declarations of a model, for this we need the 
		//full mCRL2 grammar
		String initialString = IOUtils.toString(is);
//		String theString = writer.toString();
		String finalString = initialString;
//		finalString = preprocess(initialString);
//		CharStream cs = new ANTLRStringStream("/home/daniela/IBM/rationalsdp/workspace1/info.remenska.PASS/src/info/remenska/PASS/monitor/mCRL2/test.mu");
		
//		mucalculusLexer lexer = new mucalculusLexer(
//				(finalString.toCharArray());
//		String[] aman = finalString.split("\\.");
//		for(String token:aman)
//				System.out.print(token + ", ");
//		System.out.println();
		System.out.println("Original formula : " + finalString);		
		try{ 
		mucalculusLexer lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mucalculusParser parser = new mucalculusParser(tokens);
		ParseTree tree = parser.start();
//        System.out.println(parser.getState());

		MyMuCalculusVisitorSilent visitor = new MyMuCalculusVisitorSilent(tokens);
		visitor.visit(tree);

		finalString = preprocess(MyMuCalculusVisitorSilent.rewriter.getText());
		
//        System.out.println("JOVO NA NOVO : "+ finalString);
        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
        tokens = new CommonTokenStream(lexer);
        parser = new mucalculusParser(tokens);
        tree = parser.start();
        visitor = new MyMuCalculusVisitorSilent(tokens);
		visitor.visit(tree);
		finalString = preprocess(MyMuCalculusVisitorSilent.rewriter.getText());
		System.out.println("----------------------------------------");
        System.out.println("Modified formula : "+ finalString);
		System.out.println("----------------------------------------");
        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
        tokens = new CommonTokenStream(lexer);
        parser = new mucalculusParser(tokens);
        tree = parser.start();
        MyMuCalculusVisitor visitor1 = null;
        if(args.length==3)
          visitor1 = new MyMuCalculusVisitor(tokens, Mymcrl2Visitor.actionsDict, Boolean.parseBoolean(args[2]));
        else
          visitor1 = new MyMuCalculusVisitor(tokens, Mymcrl2Visitor.actionsDict, false);

        visitor1.visit(tree);
        
		} catch(java.lang.NullPointerException e){
			System.out.println("Mu-calculus formula is not well formed. ");
			System.err.println("Exception stack trace=========");
			e.printStackTrace(new PrintStream(System.err));
			System.exit(1);
		}
		
//		System.out.println(MyMuCalculusVisitor.actions);
//		System.out.println(MyMuCalculusVisitor.varDeclarations);
//        for(int i=0;i<MyMuCalculusVisitor.rewriter.getTokenStream().size();i++)
//        System.out.println("tokens : "+ MyMuCalculusVisitor.rewriter.getTokenStream().get(i));

//        System.out.println(MyMuCalculusVisitor.rewriter.getTokenStream().get(25).getText());
//        lexer.reset();
//        System.out.println("NOVA : "+ MyMuCalculusVisitor.tokens);
        
//        finalString = MyMuCalculusVisitor.rewriter.getText();
//        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
//		tokens = new CommonTokenStream(lexer);
//        tokens = (CommonTokenStream) MyMuCalculusVisitor.rewriter.getTokenStream();
//        parser = new mucalculusParser(tokens);
////        parser.reset();
////        System.out.println(parser.getState());
//        tree = parser.start();
//        visitor = new MyMuCalculusVisitor(tokens);
//		visitor.visit(tree);
//        System.out.println("AMAAAN : "+ MyMuCalculusVisitor.rewriter.getText());
        
//        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
//        System.out.println("New formula: " + finalString);
//        tokens = new CommonTokenStream(lexer);
//        parser = new mucalculusParser(tokens);
//        tree = parser.start();
//        visitor = new MyMuCalculusVisitor(tokens);
//		visitor.visit(tree);
	}
	
	public static String preprocess(String input){
		StringBuffer buffer = new StringBuffer(input);
		
//		buffer = new StringBuffer(buffer.toString().replaceAll("\\s+",""));
		buffer = new StringBuffer(buffer.toString().replaceAll("forall", "forall "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("exists", "exists "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("mu", ",mu "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("nu", "nu "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("lambda", "lambda "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("sort", "sort "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("struct", "struct "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("false", "false "));		
		buffer = new StringBuffer(buffer.toString().replaceAll("nil", "nil "));		

		return buffer.toString();
	}
	
	public static String createActionSort(Mymcrl2Visitor visitor){
		StringBuffer result = new StringBuffer();
		result.append("act error, internal_mon;\n");
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
					result.append(key+"_"+ "arg"+counter++ + ":" + dt);

					if(iter.hasNext())
						result.append(",");
				}
				result.append(")");
			}
			
			if(keys.hasMoreElements()){
				result.append("\n | ");
			} 
		}
		result.append(";\n");

		System.out.println(result.toString());
		return result.toString();
	}
	
	public static String createMappings(Mymcrl2Visitor visitor){
		StringBuffer result = new StringBuffer();
		result.append("map satisfy: Action # ActionFormula -> Bool;\n");
		result.append("var c1,c2:Action;\n");
		result.append("f,g:ActionFormula;\n");
		result.append("eqn\n");
		result.append("satisfy(c1,action(c2)) = (c1 == c2) ;");
		result.append("satisfy(c1,and(f,g)) = satisfy(c1,f) && satisfy(c1,g);\n");
		result.append("satisfy(c1,not(f)) = !satisfy(c1,f);\n");
		result.append("satisfy(c1,or(f,g)) = satisfy(c1,f) || satisfy(c1,g);\n");
		result.append("satisfy(c1,True) = true;\n");
		result.append("satisfy(c1,False) = false;\n");

		result.append("\n");
		
		System.out.println(result.toString());
		return result.toString();
	}
	
	
	public static String createActionFormulaSort(){
		String result = new String("\nsort ActionFormula = struct action(act1:Action)\n" + 
					"| and(phi1:ActionFormula,phi2:ActionFormula) \n" + 
					"| or(phi1:ActionFormula,phi2:ActionFormula)  \n" + 
					"| not(ActionFormula) \n" + 
					     "| True \n" +
					     "| False ; \n\n");	
		
		System.out.println(result);
		return result;
	}
}
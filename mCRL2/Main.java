package info.remenska.PASS.monitor.mCRL2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;

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
		InputStream is = new FileInputStream("/home/daniela/IBM/rationalsdp/workspace1/info.remenska.PASS/src/info/remenska/PASS/monitor/mCRL2/test.mu");
		
		String initialString = IOUtils.toString(is);
//		String theString = writer.toString();
		String finalString = initialString;
//		finalString = preprocess(initialString);
//		CharStream cs = new ANTLRStringStream("/home/daniela/IBM/rationalsdp/workspace1/info.remenska.PASS/src/info/remenska/PASS/monitor/mCRL2/test.mu");
		
//		mucalculusLexer lexer = new mucalculusLexer(
//				(finalString.toCharArray());
		String[] aman = finalString.split("\\.");
		for(String token:aman)
				System.out.print(token + ", ");
		System.out.println();
//		System.out.println("Modified formula: " + finalString);		
		mucalculusLexer lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mucalculusParser parser = new mucalculusParser(tokens);
		ParseTree tree = parser.start();
//        System.out.println(parser.getState());

		MyMuCalculusVisitor visitor = new MyMuCalculusVisitor(tokens);
		visitor.visit(tree);

		finalString = preprocess(MyMuCalculusVisitor.rewriter.getText());
		
        System.out.println("JOVO NA NOVO : "+ finalString);
        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
        tokens = new CommonTokenStream(lexer);
        parser = new mucalculusParser(tokens);
        tree = parser.start();
        visitor = new MyMuCalculusVisitor(tokens);
		visitor.visit(tree);
		
		finalString = preprocess(MyMuCalculusVisitor.rewriter.getText());
		
        System.out.println("JOVO NA NOVO : "+ finalString);
        lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
        tokens = new CommonTokenStream(lexer);
        parser = new mucalculusParser(tokens);
        tree = parser.start();
        visitor = new MyMuCalculusVisitor(tokens);
		visitor.visit(tree);
		System.out.println(MyMuCalculusVisitor.actions);
		System.out.println(MyMuCalculusVisitor.varDeclarations);
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

		return buffer.toString();
	}
}
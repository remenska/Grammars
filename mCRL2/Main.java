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
//		String finalString = preprocess(initialString);
//		CharStream cs = new ANTLRStringStream("/home/daniela/IBM/rationalsdp/workspace1/info.remenska.PASS/src/info/remenska/PASS/monitor/mCRL2/test.mu");
		
//		mucalculusLexer lexer = new mucalculusLexer(
//				(finalString.toCharArray());
		String[] aman = finalString.split("\\.");
		for(String token:aman)
				System.out.print(token + ", ");
		System.out.println();
		System.out.println("Modified formula: " + finalString);		
		mucalculusLexer lexer = new mucalculusLexer((CharStream) new ANTLRInputStream(finalString));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		mucalculusParser parser = new mucalculusParser(tokens);
		ParseTree tree = parser.start();
		MyMuCalculusVisitor visitor = new MyMuCalculusVisitor(tokens);
		visitor.visit(tree);

        System.out.println("AMAAAN : "+ MyMuCalculusVisitor.rewriter.getText());
//		MyMuCalculusListener extractor = new MyMuCalculusListener();
        finalString = MyMuCalculusVisitor.rewriter.getText();
        
	}
	
	public static String preprocess(String input){
		StringBuffer buffer = new StringBuffer(input);
		
		buffer = new StringBuffer(buffer.toString().replaceAll("\\s+",""));
		buffer = new StringBuffer(buffer.toString().replaceAll("\\.", "]["));		
		return buffer.toString();
	}
}
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Main {
    public static void main(String[] args) throws Exception {
        mucalculusLexer lexer = new mucalculusLexer(new ANTLRFileStream("test.mu"));
        mucalculusParser parser = new mucalculusParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        MyMuCalculusVisitor visitor = new MyMuCalculusVisitor();

       MyMuCalculusListener extractor = new MyMuCalculusListener();

        visitor.visit(tree);

	
    }
}
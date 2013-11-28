// Generated from HtmlDoc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlDocParser}.
 */
public interface HtmlDocListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlDocParser#html_body}.
	 * @param ctx the parse tree
	 */
	void enterHtml_body(@NotNull HtmlDocParser.Html_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlDocParser#html_body}.
	 * @param ctx the parse tree
	 */
	void exitHtml_body(@NotNull HtmlDocParser.Html_bodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link HtmlDocParser#html_doc}.
	 * @param ctx the parse tree
	 */
	void enterHtml_doc(@NotNull HtmlDocParser.Html_docContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlDocParser#html_doc}.
	 * @param ctx the parse tree
	 */
	void exitHtml_doc(@NotNull HtmlDocParser.Html_docContext ctx);

	/**
	 * Enter a parse tree produced by {@link HtmlDocParser#html_header}.
	 * @param ctx the parse tree
	 */
	void enterHtml_header(@NotNull HtmlDocParser.Html_headerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlDocParser#html_header}.
	 * @param ctx the parse tree
	 */
	void exitHtml_header(@NotNull HtmlDocParser.Html_headerContext ctx);
}
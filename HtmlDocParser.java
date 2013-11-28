// Generated from HtmlDoc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HtmlDocParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, TEXT=7, DOC=8, TITLE=9, 
		BODY=10;
	public static final String[] tokenNames = {
		"<INVALID>", "'<html>'", "'<title>'", "'</title>'", "'</body>'", "'</html>'", 
		"'<body>'", "TEXT", "DOC", "TITLE", "BODY"
	};
	public static final int
		RULE_html_doc = 0, RULE_html_header = 1, RULE_html_body = 2;
	public static final String[] ruleNames = {
		"html_doc", "html_header", "html_body"
	};

	@Override
	public String getGrammarFileName() { return "HtmlDoc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlDocParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Html_docContext extends ParserRuleContext {
		public Html_bodyContext html_body() {
			return getRuleContext(Html_bodyContext.class,0);
		}
		public Html_headerContext html_header() {
			return getRuleContext(Html_headerContext.class,0);
		}
		public Html_docContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).enterHtml_doc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).exitHtml_doc(this);
		}
	}

	public final Html_docContext html_doc() throws RecognitionException {
		Html_docContext _localctx = new Html_docContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_html_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6); match(1);
			setState(7); html_header();
			setState(8); html_body();
			setState(9); match(5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Html_headerContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(HtmlDocParser.TEXT, 0); }
		public Html_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).enterHtml_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).exitHtml_header(this);
		}
	}

	public final Html_headerContext html_header() throws RecognitionException {
		Html_headerContext _localctx = new Html_headerContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_html_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); match(2);
			setState(12); match(TEXT);
			setState(13); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Html_bodyContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(HtmlDocParser.TEXT, 0); }
		public Html_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).enterHtml_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlDocListener ) ((HtmlDocListener)listener).exitHtml_body(this);
		}
	}

	public final Html_bodyContext html_body() throws RecognitionException {
		Html_bodyContext _localctx = new Html_bodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_html_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); match(6);
			setState(16); match(TEXT);
			setState(17); match(4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3\f\26\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\2"+
		"\5\2\4\6\2\2\22\2\b\3\2\2\2\4\r\3\2\2\2\6\21\3\2\2\2\b\t\7\3\2\2\t\n\5"+
		"\4\3\2\n\13\5\6\4\2\13\f\7\7\2\2\f\3\3\2\2\2\r\16\7\4\2\2\16\17\7\t\2"+
		"\2\17\20\7\5\2\2\20\5\3\2\2\2\21\22\7\b\2\2\22\23\7\t\2\2\23\24\7\6\2"+
		"\2\24\7\3\2\2\2\2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
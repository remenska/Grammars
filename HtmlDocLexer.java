// Generated from HtmlDoc.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HtmlDocLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__5=1, T__4=2, T__3=3, T__2=4, T__1=5, T__0=6, TEXT=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'<html>'", "'<title>'", "'</title>'", "'</body>'", "'</html>'", "'<body>'", 
		"TEXT"
	};
	public static final String[] ruleNames = {
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "TEXT"
	};


	public HtmlDocLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HtmlDoc.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\tF\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\7\bB\n\b\f\b\16\bE\13\b\2\t\3\3\1\5\4\1\7"+
		"\5\1\t\6\1\13\7\1\r\b\1\17\t\1\3\2\3\3\2>>F\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3\21\3\2"+
		"\2\2\5\30\3\2\2\2\7 \3\2\2\2\t)\3\2\2\2\13\61\3\2\2\2\r9\3\2\2\2\17C\3"+
		"\2\2\2\21\22\7>\2\2\22\23\7j\2\2\23\24\7v\2\2\24\25\7o\2\2\25\26\7n\2"+
		"\2\26\27\7@\2\2\27\4\3\2\2\2\30\31\7>\2\2\31\32\7v\2\2\32\33\7k\2\2\33"+
		"\34\7v\2\2\34\35\7n\2\2\35\36\7g\2\2\36\37\7@\2\2\37\6\3\2\2\2 !\7>\2"+
		"\2!\"\7\61\2\2\"#\7v\2\2#$\7k\2\2$%\7v\2\2%&\7n\2\2&\'\7g\2\2\'(\7@\2"+
		"\2(\b\3\2\2\2)*\7>\2\2*+\7\61\2\2+,\7d\2\2,-\7q\2\2-.\7f\2\2./\7{\2\2"+
		"/\60\7@\2\2\60\n\3\2\2\2\61\62\7>\2\2\62\63\7\61\2\2\63\64\7j\2\2\64\65"+
		"\7v\2\2\65\66\7o\2\2\66\67\7n\2\2\678\7@\2\28\f\3\2\2\29:\7>\2\2:;\7d"+
		"\2\2;<\7q\2\2<=\7f\2\2=>\7{\2\2>?\7@\2\2?\16\3\2\2\2@B\n\2\2\2A@\3\2\2"+
		"\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\20\3\2\2\2EC\3\2\2\2\4\2C";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
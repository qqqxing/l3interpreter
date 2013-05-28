// Generated from L3.g4 by ANTLR 4.0
package l3interpreter.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L3Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LC=1, RC=2, DEF=3, LA=4, RA=5, IF=6, ELSE=7, WHILE=8, DO=9, RETURN=10, 
		SEMI=11, BREAK=12, CONTINUE=13, TRUE=14, FALSE=15, COMA=16, LB=17, RB=18, 
		MUL=19, DIV=20, MOD=21, ADD=22, SUB=23, LT=24, GT=25, LET=26, GET=27, 
		AND=28, EQ=29, NEQ=30, OR=31, QM=32, CL=33, ASSIGN=34, Identifier=35, 
		WS=36, STRING=37, LETTER=38, INTEGER=39, FLOAT=40, COMMENT=41, LINE_COMMENT=42;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'{'", "'}'", "'def'", "'('", "')'", "'if'", "'else'", "'while'", "'do'", 
		"'return'", "';'", "'break'", "'continue'", "'true'", "'false'", "','", 
		"'['", "']'", "'*'", "'/'", "'%'", "'+'", "'-'", "'<'", "'>'", "'<='", 
		"'>='", "'&&'", "'=='", "'!='", "'||'", "'?'", "':'", "'='", "Identifier", 
		"WS", "STRING", "LETTER", "INTEGER", "FLOAT", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"LC", "RC", "DEF", "LA", "RA", "IF", "ELSE", "WHILE", "DO", "RETURN", 
		"SEMI", "BREAK", "CONTINUE", "TRUE", "FALSE", "COMA", "LB", "RB", "MUL", 
		"DIV", "MOD", "ADD", "SUB", "LT", "GT", "LET", "GET", "AND", "EQ", "NEQ", 
		"OR", "QM", "CL", "ASSIGN", "Identifier", "WS", "STRING", "LETTER", "INTEGER", 
		"FLOAT", "COMMENT", "LINE_COMMENT", "ESC", "DIGIT"
	};


	public L3Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "L3.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 35: WS_action((RuleContext)_localctx, actionIndex); break;

		case 40: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 41: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: _channel = HIDDEN;  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: _channel = HIDDEN;  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: _channel = HIDDEN;  break;
		}
	}

	public static final String _serializedATN =
		"\2\4,\u0117\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t"+
		"\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\7$\u00cb\n$\f$\16$\u00ce\13"+
		"$\3%\6%\u00d1\n%\r%\16%\u00d2\3%\3%\3&\3&\3&\7&\u00da\n&\f&\16&\u00dd"+
		"\13&\3&\3&\3\'\3\'\3(\6(\u00e4\n(\r(\16(\u00e5\3)\6)\u00e9\n)\r)\16)\u00ea"+
		"\3)\3)\6)\u00ef\n)\r)\16)\u00f0\3*\3*\3*\3*\7*\u00f7\n*\f*\16*\u00fa\13"+
		"*\3*\3*\3*\3*\3*\3+\3+\3+\3+\7+\u0105\n+\f+\16+\u0108\13+\3+\5+\u010b"+
		"\n+\3+\3+\5+\u010f\n+\3+\3+\3,\3,\3,\3-\3-\4\u00db\u00f8.\3\3\1\5\4\1"+
		"\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1"+
		"\33\17\1\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31"+
		"\1\61\32\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%"+
		"\1I&\2K\'\1M(\1O)\1Q*\1S+\3U,\4W\2\1Y\2\1\3\2\7\5\13\f\17\17\"\"\6C\\"+
		"aac|~~\4\f\f\17\17\b$$^^ddppttvv\3\62;\u0120\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3[\3\2\2\2\5]\3"+
		"\2\2\2\7_\3\2\2\2\tc\3\2\2\2\13e\3\2\2\2\rg\3\2\2\2\17j\3\2\2\2\21o\3"+
		"\2\2\2\23u\3\2\2\2\25x\3\2\2\2\27\177\3\2\2\2\31\u0081\3\2\2\2\33\u0087"+
		"\3\2\2\2\35\u0090\3\2\2\2\37\u0095\3\2\2\2!\u009b\3\2\2\2#\u009d\3\2\2"+
		"\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a5\3\2\2\2-\u00a7"+
		"\3\2\2\2/\u00a9\3\2\2\2\61\u00ab\3\2\2\2\63\u00ad\3\2\2\2\65\u00af\3\2"+
		"\2\2\67\u00b2\3\2\2\29\u00b5\3\2\2\2;\u00b8\3\2\2\2=\u00bb\3\2\2\2?\u00be"+
		"\3\2\2\2A\u00c1\3\2\2\2C\u00c3\3\2\2\2E\u00c5\3\2\2\2G\u00c7\3\2\2\2I"+
		"\u00d0\3\2\2\2K\u00d6\3\2\2\2M\u00e0\3\2\2\2O\u00e3\3\2\2\2Q\u00e8\3\2"+
		"\2\2S\u00f2\3\2\2\2U\u0100\3\2\2\2W\u0112\3\2\2\2Y\u0115\3\2\2\2[\\\7"+
		"}\2\2\\\4\3\2\2\2]^\7\177\2\2^\6\3\2\2\2_`\7f\2\2`a\7g\2\2ab\7h\2\2b\b"+
		"\3\2\2\2cd\7*\2\2d\n\3\2\2\2ef\7+\2\2f\f\3\2\2\2gh\7k\2\2hi\7h\2\2i\16"+
		"\3\2\2\2jk\7g\2\2kl\7n\2\2lm\7u\2\2mn\7g\2\2n\20\3\2\2\2op\7y\2\2pq\7"+
		"j\2\2qr\7k\2\2rs\7n\2\2st\7g\2\2t\22\3\2\2\2uv\7f\2\2vw\7q\2\2w\24\3\2"+
		"\2\2xy\7t\2\2yz\7g\2\2z{\7v\2\2{|\7w\2\2|}\7t\2\2}~\7p\2\2~\26\3\2\2\2"+
		"\177\u0080\7=\2\2\u0080\30\3\2\2\2\u0081\u0082\7d\2\2\u0082\u0083\7t\2"+
		"\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086\7m\2\2\u0086\32\3"+
		"\2\2\2\u0087\u0088\7e\2\2\u0088\u0089\7q\2\2\u0089\u008a\7p\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7p\2\2\u008d\u008e\7w\2\2"+
		"\u008e\u008f\7g\2\2\u008f\34\3\2\2\2\u0090\u0091\7v\2\2\u0091\u0092\7"+
		"t\2\2\u0092\u0093\7w\2\2\u0093\u0094\7g\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7h\2\2\u0096\u0097\7c\2\2\u0097\u0098\7n\2\2\u0098\u0099\7u\2\2\u0099"+
		"\u009a\7g\2\2\u009a \3\2\2\2\u009b\u009c\7.\2\2\u009c\"\3\2\2\2\u009d"+
		"\u009e\7]\2\2\u009e$\3\2\2\2\u009f\u00a0\7_\2\2\u00a0&\3\2\2\2\u00a1\u00a2"+
		"\7,\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4*\3\2\2\2\u00a5\u00a6"+
		"\7\'\2\2\u00a6,\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8.\3\2\2\2\u00a9\u00aa"+
		"\7/\2\2\u00aa\60\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\62\3\2\2\2\u00ad\u00ae"+
		"\7@\2\2\u00ae\64\3\2\2\2\u00af\u00b0\7>\2\2\u00b0\u00b1\7?\2\2\u00b1\66"+
		"\3\2\2\2\u00b2\u00b3\7@\2\2\u00b3\u00b4\7?\2\2\u00b48\3\2\2\2\u00b5\u00b6"+
		"\7(\2\2\u00b6\u00b7\7(\2\2\u00b7:\3\2\2\2\u00b8\u00b9\7?\2\2\u00b9\u00ba"+
		"\7?\2\2\u00ba<\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7?\2\2\u00bd>\3"+
		"\2\2\2\u00be\u00bf\7~\2\2\u00bf\u00c0\7~\2\2\u00c0@\3\2\2\2\u00c1\u00c2"+
		"\7A\2\2\u00c2B\3\2\2\2\u00c3\u00c4\7<\2\2\u00c4D\3\2\2\2\u00c5\u00c6\7"+
		"?\2\2\u00c6F\3\2\2\2\u00c7\u00cc\5M\'\2\u00c8\u00cb\5M\'\2\u00c9\u00cb"+
		"\5Y-\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cdH\3\2\2\2\u00ce\u00cc\3\2\2\2"+
		"\u00cf\u00d1\t\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b%\2\2\u00d5"+
		"J\3\2\2\2\u00d6\u00db\7$\2\2\u00d7\u00da\5W,\2\u00d8\u00da\13\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00df\7$\2\2\u00dfL\3\2\2\2\u00e0\u00e1\t\3\2\2\u00e1N\3\2\2\2\u00e2"+
		"\u00e4\5Y-\2\u00e3\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6P\3\2\2\2\u00e7\u00e9\5Y-\2\u00e8\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ee\7\60\2\2\u00ed\u00ef\5Y-\2\u00ee\u00ed\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"R\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f8\3\2\2\2"+
		"\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u00fc\7,\2\2\u00fc\u00fd\7\61\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b*"+
		"\3\2\u00ffT\3\2\2\2\u0100\u0101\7\61\2\2\u0101\u0102\7\61\2\2\u0102\u0106"+
		"\3\2\2\2\u0103\u0105\n\4\2\2\u0104\u0103\3\2\2\2\u0105\u0108\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010e\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0109\u010b\7\17\2\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\3\2\2\2\u010c\u010f\7\f\2\2\u010d\u010f\7\1\2\2\u010e\u010a\3\2"+
		"\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\b+\4\2\u0111"+
		"V\3\2\2\2\u0112\u0113\7^\2\2\u0113\u0114\t\5\2\2\u0114X\3\2\2\2\u0115"+
		"\u0116\t\6\2\2\u0116Z\3\2\2\2\17\2\u00ca\u00cc\u00d2\u00d9\u00db\u00e5"+
		"\u00ea\u00f0\u00f8\u0106\u010a\u010e";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}
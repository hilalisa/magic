// Generated from Simplang.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimplangLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, WHILE=32, 
		FOR=33, IF=34, ELIF=35, ELSE=36, BREAK=37, CONTINUE=38, RET=39, NEW=40, 
		NULL=41, LPAR=42, RPAR=43, LBRACK=44, RBRACK=45, AND=46, OR=47, NOT=48, 
		MUL=49, DIV=50, IDIV=51, REM=52, ADD=53, SUB=54, EXP=55, BOOL=56, INT=57, 
		FLOAT=58, STRING=59, CHAR=60, ID=61, EMPTY_LINE=62, COMMENT=63, LINE_ESCAPE=64, 
		IGNORE_NEWLINE=65, NL=66, LEADING_WS=67, WS=68, DIGIT=69;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'-='", "'&'", "','", "':'", "'&='", "'--'", "'int'", "'<'", "'!='", "'<='", 
		"'void'", "'~='", "'+='", "'float'", "'++'", "'char'", "'*='", "'bool'", 
		"'.'", "'='", "'>'", "'%='", "':='", "'string'", "'/='", "'|='", "'=='", 
		"'~'", "'//='", "'>='", "'|'", "'while'", "'for'", "'if'", "'elif'", "'else'", 
		"'break'", "'continue'", "'return'", "'new'", "'null'", "'('", "')'", 
		"'['", "']'", "AND", "OR", "NOT", "'*'", "'/'", "'//'", "'%'", "'+'", 
		"'-'", "'^'", "BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", 
		"COMMENT", "LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", 
		"DIGIT"
	};
	public static final String[] ruleNames = {
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WHILE", "FOR", "IF", 
		"ELIF", "ELSE", "BREAK", "CONTINUE", "RET", "NEW", "NULL", "LPAR", "RPAR", 
		"LBRACK", "RBRACK", "AND", "OR", "NOT", "MUL", "DIV", "IDIV", "REM", "ADD", 
		"SUB", "EXP", "BOOL", "INT", "FLOAT", "STRING", "CHAR", "ID", "EMPTY_LINE", 
		"COMMENT", "LINE_ESCAPE", "IGNORE_NEWLINE", "NL", "LEADING_WS", "WS", 
		"NUMBER", "DIGIT"
	};


	    int nesting = 0;


	public SimplangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Simplang.g4"; }

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
		case 41: LPAR_action((RuleContext)_localctx, actionIndex); break;

		case 42: RPAR_action((RuleContext)_localctx, actionIndex); break;

		case 43: LBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 44: RBRACK_action((RuleContext)_localctx, actionIndex); break;

		case 61: EMPTY_LINE_action((RuleContext)_localctx, actionIndex); break;

		case 62: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 63: LINE_ESCAPE_action((RuleContext)_localctx, actionIndex); break;

		case 64: IGNORE_NEWLINE_action((RuleContext)_localctx, actionIndex); break;

		case 67: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void EMPTY_LINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: skip();  break;
		}
	}
	private void RBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: nesting--; break;
		}
	}
	private void RPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: nesting--; break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: skip();  break;
		}
	}
	private void LBRACK_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: nesting++; break;
		}
	}
	private void LPAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: nesting++; break;
		}
	}
	private void LINE_ESCAPE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: skip();  break;
		}
	}
	private void IGNORE_NEWLINE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 61: return EMPTY_LINE_sempred((RuleContext)_localctx, predIndex);

		case 64: return IGNORE_NEWLINE_sempred((RuleContext)_localctx, predIndex);

		case 66: return LEADING_WS_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean EMPTY_LINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return getCharPositionInLine()==0;
		}
		return true;
	}
	private boolean IGNORE_NEWLINE_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return nesting>0;
		}
		return true;
	}
	private boolean LEADING_WS_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return getCharPositionInLine()==0;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2G\u01c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3/\5/\u013a\n/\3\60\3\60"+
		"\3\60\3\60\5\60\u0140\n\60\3\61\3\61\3\61\3\61\5\61\u0146\n\61\3\62\3"+
		"\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\3"+
		"9\39\39\39\39\39\39\39\59\u0160\n9\3:\3:\3;\3;\3;\7;\u0167\n;\f;\16;\u016a"+
		"\13;\3<\3<\3<\7<\u016f\n<\f<\16<\u0172\13<\3<\3<\3=\3=\3=\3=\3>\3>\7>"+
		"\u017c\n>\f>\16>\u017f\13>\3?\3?\7?\u0183\n?\f?\16?\u0186\13?\3?\5?\u0189"+
		"\n?\3?\3?\3?\3?\3@\3@\7@\u0191\n@\f@\16@\u0194\13@\3@\3@\3A\3A\3A\3A\3"+
		"A\3B\5B\u019e\nB\3B\3B\3B\3B\3B\3C\5C\u01a6\nC\3C\3C\5C\u01aa\nC\3D\3"+
		"D\6D\u01ae\nD\rD\16D\u01af\3E\6E\u01b3\nE\rE\16E\u01b4\3E\3E\3F\3F\3F"+
		"\7F\u01bc\nF\fF\16F\u01bf\13F\5F\u01c1\nF\3G\3G\2H\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\'"+
		"\1M(\1O)\1Q*\1S+\1U,\2W-\3Y.\4[/\5]\60\1_\61\1a\62\1c\63\1e\64\1g\65\1"+
		"i\66\1k\67\1m8\1o9\1q:\1s;\1u<\1w=\1y>\1{?\1}@\6\177A\7\u0081B\b\u0083"+
		"C\t\u0085D\1\u0087E\1\u0089F\n\u008b\2\1\u008dG\1\3\2\n\3\2$$\3\2))\4"+
		"\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\4\2\f\f\17\17\3\2\63;\3\2\62;\u01d4"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3"+
		"\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2"+
		"\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2"+
		"{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2"+
		"\2\5\u0092\3\2\2\2\7\u0094\3\2\2\2\t\u0096\3\2\2\2\13\u0098\3\2\2\2\r"+
		"\u009b\3\2\2\2\17\u009e\3\2\2\2\21\u00a2\3\2\2\2\23\u00a4\3\2\2\2\25\u00a7"+
		"\3\2\2\2\27\u00aa\3\2\2\2\31\u00af\3\2\2\2\33\u00b2\3\2\2\2\35\u00b5\3"+
		"\2\2\2\37\u00bb\3\2\2\2!\u00be\3\2\2\2#\u00c3\3\2\2\2%\u00c6\3\2\2\2\'"+
		"\u00cb\3\2\2\2)\u00cd\3\2\2\2+\u00cf\3\2\2\2-\u00d1\3\2\2\2/\u00d4\3\2"+
		"\2\2\61\u00d7\3\2\2\2\63\u00de\3\2\2\2\65\u00e1\3\2\2\2\67\u00e4\3\2\2"+
		"\29\u00e7\3\2\2\2;\u00e9\3\2\2\2=\u00ed\3\2\2\2?\u00f0\3\2\2\2A\u00f2"+
		"\3\2\2\2C\u00f8\3\2\2\2E\u00fc\3\2\2\2G\u00ff\3\2\2\2I\u0104\3\2\2\2K"+
		"\u0109\3\2\2\2M\u010f\3\2\2\2O\u0118\3\2\2\2Q\u011f\3\2\2\2S\u0123\3\2"+
		"\2\2U\u0128\3\2\2\2W\u012b\3\2\2\2Y\u012e\3\2\2\2[\u0131\3\2\2\2]\u0139"+
		"\3\2\2\2_\u013f\3\2\2\2a\u0145\3\2\2\2c\u0147\3\2\2\2e\u0149\3\2\2\2g"+
		"\u014b\3\2\2\2i\u014e\3\2\2\2k\u0150\3\2\2\2m\u0152\3\2\2\2o\u0154\3\2"+
		"\2\2q\u015f\3\2\2\2s\u0161\3\2\2\2u\u0163\3\2\2\2w\u016b\3\2\2\2y\u0175"+
		"\3\2\2\2{\u0179\3\2\2\2}\u0180\3\2\2\2\177\u018e\3\2\2\2\u0081\u0197\3"+
		"\2\2\2\u0083\u019d\3\2\2\2\u0085\u01a9\3\2\2\2\u0087\u01ab\3\2\2\2\u0089"+
		"\u01b2\3\2\2\2\u008b\u01c0\3\2\2\2\u008d\u01c2\3\2\2\2\u008f\u0090\7/"+
		"\2\2\u0090\u0091\7?\2\2\u0091\4\3\2\2\2\u0092\u0093\7(\2\2\u0093\6\3\2"+
		"\2\2\u0094\u0095\7.\2\2\u0095\b\3\2\2\2\u0096\u0097\7<\2\2\u0097\n\3\2"+
		"\2\2\u0098\u0099\7(\2\2\u0099\u009a\7?\2\2\u009a\f\3\2\2\2\u009b\u009c"+
		"\7/\2\2\u009c\u009d\7/\2\2\u009d\16\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0"+
		"\7p\2\2\u00a0\u00a1\7v\2\2\u00a1\20\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\22"+
		"\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6\24\3\2\2\2\u00a7"+
		"\u00a8\7>\2\2\u00a8\u00a9\7?\2\2\u00a9\26\3\2\2\2\u00aa\u00ab\7x\2\2\u00ab"+
		"\u00ac\7q\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7f\2\2\u00ae\30\3\2\2\2\u00af"+
		"\u00b0\7\u0080\2\2\u00b0\u00b1\7?\2\2\u00b1\32\3\2\2\2\u00b2\u00b3\7-"+
		"\2\2\u00b3\u00b4\7?\2\2\u00b4\34\3\2\2\2\u00b5\u00b6\7h\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7q\2\2\u00b8\u00b9\7c\2\2\u00b9\u00ba\7v\2\2\u00ba"+
		"\36\3\2\2\2\u00bb\u00bc\7-\2\2\u00bc\u00bd\7-\2\2\u00bd \3\2\2\2\u00be"+
		"\u00bf\7e\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\"\3\2\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\7?\2\2\u00c5$\3\2\2\2"+
		"\u00c6\u00c7\7d\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca"+
		"\7n\2\2\u00ca&\3\2\2\2\u00cb\u00cc\7\60\2\2\u00cc(\3\2\2\2\u00cd\u00ce"+
		"\7?\2\2\u00ce*\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0,\3\2\2\2\u00d1\u00d2\7"+
		"\'\2\2\u00d2\u00d3\7?\2\2\u00d3.\3\2\2\2\u00d4\u00d5\7<\2\2\u00d5\u00d6"+
		"\7?\2\2\u00d6\60\3\2\2\2\u00d7\u00d8\7u\2\2\u00d8\u00d9\7v\2\2\u00d9\u00da"+
		"\7t\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7i\2\2\u00dd"+
		"\62\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7?\2\2\u00e0\64\3\2\2\2\u00e1"+
		"\u00e2\7~\2\2\u00e2\u00e3\7?\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e68\3\2\2\2\u00e7\u00e8\7\u0080\2\2\u00e8:\3\2\2\2\u00e9"+
		"\u00ea\7\61\2\2\u00ea\u00eb\7\61\2\2\u00eb\u00ec\7?\2\2\u00ec<\3\2\2\2"+
		"\u00ed\u00ee\7@\2\2\u00ee\u00ef\7?\2\2\u00ef>\3\2\2\2\u00f0\u00f1\7~\2"+
		"\2\u00f1@\3\2\2\2\u00f2\u00f3\7y\2\2\u00f3\u00f4\7j\2\2\u00f4\u00f5\7"+
		"k\2\2\u00f5\u00f6\7n\2\2\u00f6\u00f7\7g\2\2\u00f7B\3\2\2\2\u00f8\u00f9"+
		"\7h\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb\7t\2\2\u00fbD\3\2\2\2\u00fc\u00fd"+
		"\7k\2\2\u00fd\u00fe\7h\2\2\u00feF\3\2\2\2\u00ff\u0100\7g\2\2\u0100\u0101"+
		"\7n\2\2\u0101\u0102\7k\2\2\u0102\u0103\7h\2\2\u0103H\3\2\2\2\u0104\u0105"+
		"\7g\2\2\u0105\u0106\7n\2\2\u0106\u0107\7u\2\2\u0107\u0108\7g\2\2\u0108"+
		"J\3\2\2\2\u0109\u010a\7d\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7c\2\2\u010d\u010e\7m\2\2\u010eL\3\2\2\2\u010f\u0110\7e\2\2\u0110"+
		"\u0111\7q\2\2\u0111\u0112\7p\2\2\u0112\u0113\7v\2\2\u0113\u0114\7k\2\2"+
		"\u0114\u0115\7p\2\2\u0115\u0116\7w\2\2\u0116\u0117\7g\2\2\u0117N\3\2\2"+
		"\2\u0118\u0119\7t\2\2\u0119\u011a\7g\2\2\u011a\u011b\7v\2\2\u011b\u011c"+
		"\7w\2\2\u011c\u011d\7t\2\2\u011d\u011e\7p\2\2\u011eP\3\2\2\2\u011f\u0120"+
		"\7p\2\2\u0120\u0121\7g\2\2\u0121\u0122\7y\2\2\u0122R\3\2\2\2\u0123\u0124"+
		"\7p\2\2\u0124\u0125\7w\2\2\u0125\u0126\7n\2\2\u0126\u0127\7n\2\2\u0127"+
		"T\3\2\2\2\u0128\u0129\7*\2\2\u0129\u012a\b+\2\2\u012aV\3\2\2\2\u012b\u012c"+
		"\7+\2\2\u012c\u012d\b,\3\2\u012dX\3\2\2\2\u012e\u012f\7]\2\2\u012f\u0130"+
		"\b-\4\2\u0130Z\3\2\2\2\u0131\u0132\7_\2\2\u0132\u0133\b.\5\2\u0133\\\3"+
		"\2\2\2\u0134\u0135\7(\2\2\u0135\u013a\7(\2\2\u0136\u0137\7c\2\2\u0137"+
		"\u0138\7p\2\2\u0138\u013a\7f\2\2\u0139\u0134\3\2\2\2\u0139\u0136\3\2\2"+
		"\2\u013a^\3\2\2\2\u013b\u013c\7~\2\2\u013c\u0140\7~\2\2\u013d\u013e\7"+
		"q\2\2\u013e\u0140\7t\2\2\u013f\u013b\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"`\3\2\2\2\u0141\u0146\7#\2\2\u0142\u0143\7p\2\2\u0143\u0144\7q\2\2\u0144"+
		"\u0146\7v\2\2\u0145\u0141\3\2\2\2\u0145\u0142\3\2\2\2\u0146b\3\2\2\2\u0147"+
		"\u0148\7,\2\2\u0148d\3\2\2\2\u0149\u014a\7\61\2\2\u014af\3\2\2\2\u014b"+
		"\u014c\7\61\2\2\u014c\u014d\7\61\2\2\u014dh\3\2\2\2\u014e\u014f\7\'\2"+
		"\2\u014fj\3\2\2\2\u0150\u0151\7-\2\2\u0151l\3\2\2\2\u0152\u0153\7/\2\2"+
		"\u0153n\3\2\2\2\u0154\u0155\7`\2\2\u0155p\3\2\2\2\u0156\u0157\7h\2\2\u0157"+
		"\u0158\7c\2\2\u0158\u0159\7n\2\2\u0159\u015a\7u\2\2\u015a\u0160\7g\2\2"+
		"\u015b\u015c\7v\2\2\u015c\u015d\7t\2\2\u015d\u015e\7w\2\2\u015e\u0160"+
		"\7g\2\2\u015f\u0156\3\2\2\2\u015f\u015b\3\2\2\2\u0160r\3\2\2\2\u0161\u0162"+
		"\5\u008bF\2\u0162t\3\2\2\2\u0163\u0164\5\u008bF\2\u0164\u0168\7\60\2\2"+
		"\u0165\u0167\5\u008dG\2\u0166\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168"+
		"\u0166\3\2\2\2\u0168\u0169\3\2\2\2\u0169v\3\2\2\2\u016a\u0168\3\2\2\2"+
		"\u016b\u0170\7$\2\2\u016c\u016f\n\2\2\2\u016d\u016f\5\u0085C\2\u016e\u016c"+
		"\3\2\2\2\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\7$"+
		"\2\2\u0174x\3\2\2\2\u0175\u0176\7)\2\2\u0176\u0177\n\3\2\2\u0177\u0178"+
		"\7)\2\2\u0178z\3\2\2\2\u0179\u017d\t\4\2\2\u017a\u017c\t\5\2\2\u017b\u017a"+
		"\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e"+
		"|\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0184\6?\2\2\u0181\u0183\t\6\2\2\u0182"+
		"\u0181\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\5\177@\2\u0188"+
		"\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\u0085"+
		"C\2\u018b\u018c\3\2\2\2\u018c\u018d\b?\6\2\u018d~\3\2\2\2\u018e\u0192"+
		"\7%\2\2\u018f\u0191\n\7\2\2\u0190\u018f\3\2\2\2\u0191\u0194\3\2\2\2\u0192"+
		"\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2\2\2\u0194\u0192\3\2"+
		"\2\2\u0195\u0196\b@\7\2\u0196\u0080\3\2\2\2\u0197\u0198\7^\2\2\u0198\u0199"+
		"\5\u0085C\2\u0199\u019a\3\2\2\2\u019a\u019b\bA\b\2\u019b\u0082\3\2\2\2"+
		"\u019c\u019e\7\17\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f"+
		"\3\2\2\2\u019f\u01a0\7\f\2\2\u01a0\u01a1\6B\3\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a3\bB\t\2\u01a3\u0084\3\2\2\2\u01a4\u01a6\7\17\2\2\u01a5\u01a4\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01aa\7\f\2\2\u01a8"+
		"\u01aa\7\17\2\2\u01a9\u01a5\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u0086\3"+
		"\2\2\2\u01ab\u01ad\6D\4\2\u01ac\u01ae\t\6\2\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u0088\3\2"+
		"\2\2\u01b1\u01b3\t\6\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\bE"+
		"\n\2\u01b7\u008a\3\2\2\2\u01b8\u01c1\7\62\2\2\u01b9\u01bd\t\b\2\2\u01ba"+
		"\u01bc\5\u008dG\2\u01bb\u01ba\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0"+
		"\u01b8\3\2\2\2\u01c0\u01b9\3\2\2\2\u01c1\u008c\3\2\2\2\u01c2\u01c3\t\t"+
		"\2\2\u01c3\u008e\3\2\2\2\25\2\u0139\u013f\u0145\u015f\u0168\u016e\u0170"+
		"\u017d\u0184\u0188\u0192\u019d\u01a5\u01a9\u01af\u01b4\u01bd\u01c0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
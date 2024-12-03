// Generated from C:/Users/kalya/Desktop/Spring_Semester/502/DevLang-Project/DevLang/src/main/java/org/example/CustomLanguageLexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CustomLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			DEV=1, LANG=2, IF=3, ELSE=4, LOOP=5, LOOP_WITH=6, LOOP_RANGE=7, INT=8,
			TOUT=9, OTHERWISE=10, AND=11, OR=12, NOT=13, LET=14, TRUE=15, FALSE=16,
			ASSIGN=17, COMMA=18, OPEN_BRACE=19, CLOSE_BRACE=20, OPEN_PAREN=21, CLOSE_PAREN=22,
			OPEN_BRACKET=23, CLOSE_BRACKET=24, QUESTION=25, COLON=26, LESS_THAN=27,
			GREATER_THAN=28, EQUAL_EQUAL=29, CHARR=30, ADDITION=31, SUBTRACTION=32,
			MULTIPLICATION=33, DIVISION=34, SEMICOLON=35, IDENTIFIER=36, INTEGER=37,
			CHAR=38, STRING=39, BOOL=40, WS=41, COMMENT=42, TOKENLIST=43;
	public static String[] channelNames = {
			"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
			"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
				"DEV", "LANG", "IF", "ELSE", "LOOP", "LOOP_WITH", "LOOP_RANGE", "INT",
				"TOUT", "OTHERWISE", "AND", "OR", "NOT", "LET", "TRUE", "FALSE", "ASSIGN",
				"COMMA", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACKET",
				"CLOSE_BRACKET", "QUESTION", "COLON", "LESS_THAN", "GREATER_THAN", "EQUAL_EQUAL",
				"CHARR", "ADDITION", "SUBTRACTION", "MULTIPLICATION", "DIVISION", "SEMICOLON",
				"IDENTIFIER", "INTEGER", "CHAR", "STRING", "BOOL", "WS", "COMMENT", "TOKENLIST"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
				null, "'dev'", "'lang'", "'if'", "'else'", "'loop'", "'loopwith'", "'looprange'",
				"'int'", "'tout'", "'otherwise'", "'and'", "'or'", "'not'", "'let'",
				"'true'", "'false'", "'='", "','", "'{'", "'}'", "'('", "')'", "'['",
				"']'", "'?'", "':'", "'<'", "'>'", "'=='", "'charr'", "'+'", "'-'", "'*'",
				"'/'", "';'", null, null, null, null, "'bool'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
				null, "DEV", "LANG", "IF", "ELSE", "LOOP", "LOOP_WITH", "LOOP_RANGE",
				"INT", "TOUT", "OTHERWISE", "AND", "OR", "NOT", "LET", "TRUE", "FALSE",
				"ASSIGN", "COMMA", "OPEN_BRACE", "CLOSE_BRACE", "OPEN_PAREN", "CLOSE_PAREN",
				"OPEN_BRACKET", "CLOSE_BRACKET", "QUESTION", "COLON", "LESS_THAN", "GREATER_THAN",
				"EQUAL_EQUAL", "CHARR", "ADDITION", "SUBTRACTION", "MULTIPLICATION",
				"DIVISION", "SEMICOLON", "IDENTIFIER", "INTEGER", "CHAR", "STRING", "BOOL",
				"WS", "COMMENT", "TOKENLIST"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public CustomLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "CustomLanguageLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
			"\u0004\u0000+\u0164\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
					"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
					"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
					"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
					"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
					"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
					"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
					"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
					"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
					"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
					"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
					"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
					"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000"+
					"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
					"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
					"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
					"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
					"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
					"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
					"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
					"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
					"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
					"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
					"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
					"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
					"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
					"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
					"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
					"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
					"\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
					"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
					"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
					" \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#\u0004#\u00da\b#\u000b#\f"+
					"#\u00db\u0001$\u0004$\u00df\b$\u000b$\f$\u00e0\u0001%\u0001%\u0005%\u00e5"+
					"\b%\n%\f%\u00e8\t%\u0001%\u0001%\u0001&\u0001&\u0005&\u00ee\b&\n&\f&\u00f1"+
					"\t&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0004"+
					"(\u00fb\b(\u000b(\f(\u00fc\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0005"+
					")\u0105\b)\n)\f)\u0108\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0003*\u0133\b*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
					"*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u015e\b*\u0005"+
					"*\u0160\b*\n*\f*\u0163\t*\u0000\u0000+\u0001\u0001\u0003\u0002\u0005\u0003"+
					"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
					"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012"+
					"%\u0013\'\u0014)\u0015+\u0016-\u0017/\u00181\u00193\u001a5\u001b7\u001c"+
					"9\u001d;\u001e=\u001f? A!C\"E#G$I%K&M\'O(Q)S*U+\u0001\u0000\u0006\u0002"+
					"\u0000AZaz\u0001\u000009\u0002\u0000\'\'\\\\\u0002\u0000\"\"\\\\\u0003"+
					"\u0000\t\n\r\r  \u0002\u0000\n\n\r\r\u01b7\u0000\u0001\u0001\u0000\u0000"+
					"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
					"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
					"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
					"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
					"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
					"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
					"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
					"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
					"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
					"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
					"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
					"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
					"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
					"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
					"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
					"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
					"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
					"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
					"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
					"\u0001W\u0001\u0000\u0000\u0000\u0003[\u0001\u0000\u0000\u0000\u0005`"+
					"\u0001\u0000\u0000\u0000\u0007c\u0001\u0000\u0000\u0000\th\u0001\u0000"+
					"\u0000\u0000\u000bm\u0001\u0000\u0000\u0000\rv\u0001\u0000\u0000\u0000"+
					"\u000f\u0080\u0001\u0000\u0000\u0000\u0011\u0084\u0001\u0000\u0000\u0000"+
					"\u0013\u0089\u0001\u0000\u0000\u0000\u0015\u0093\u0001\u0000\u0000\u0000"+
					"\u0017\u0097\u0001\u0000\u0000\u0000\u0019\u009a\u0001\u0000\u0000\u0000"+
					"\u001b\u009e\u0001\u0000\u0000\u0000\u001d\u00a2\u0001\u0000\u0000\u0000"+
					"\u001f\u00a7\u0001\u0000\u0000\u0000!\u00ad\u0001\u0000\u0000\u0000#\u00af"+
					"\u0001\u0000\u0000\u0000%\u00b1\u0001\u0000\u0000\u0000\'\u00b3\u0001"+
					"\u0000\u0000\u0000)\u00b5\u0001\u0000\u0000\u0000+\u00b7\u0001\u0000\u0000"+
					"\u0000-\u00b9\u0001\u0000\u0000\u0000/\u00bb\u0001\u0000\u0000\u00001"+
					"\u00bd\u0001\u0000\u0000\u00003\u00bf\u0001\u0000\u0000\u00005\u00c1\u0001"+
					"\u0000\u0000\u00007\u00c3\u0001\u0000\u0000\u00009\u00c5\u0001\u0000\u0000"+
					"\u0000;\u00c8\u0001\u0000\u0000\u0000=\u00ce\u0001\u0000\u0000\u0000?"+
					"\u00d0\u0001\u0000\u0000\u0000A\u00d2\u0001\u0000\u0000\u0000C\u00d4\u0001"+
					"\u0000\u0000\u0000E\u00d6\u0001\u0000\u0000\u0000G\u00d9\u0001\u0000\u0000"+
					"\u0000I\u00de\u0001\u0000\u0000\u0000K\u00e2\u0001\u0000\u0000\u0000M"+
					"\u00eb\u0001\u0000\u0000\u0000O\u00f4\u0001\u0000\u0000\u0000Q\u00fa\u0001"+
					"\u0000\u0000\u0000S\u0100\u0001\u0000\u0000\u0000U\u0132\u0001\u0000\u0000"+
					"\u0000WX\u0005d\u0000\u0000XY\u0005e\u0000\u0000YZ\u0005v\u0000\u0000"+
					"Z\u0002\u0001\u0000\u0000\u0000[\\\u0005l\u0000\u0000\\]\u0005a\u0000"+
					"\u0000]^\u0005n\u0000\u0000^_\u0005g\u0000\u0000_\u0004\u0001\u0000\u0000"+
					"\u0000`a\u0005i\u0000\u0000ab\u0005f\u0000\u0000b\u0006\u0001\u0000\u0000"+
					"\u0000cd\u0005e\u0000\u0000de\u0005l\u0000\u0000ef\u0005s\u0000\u0000"+
					"fg\u0005e\u0000\u0000g\b\u0001\u0000\u0000\u0000hi\u0005l\u0000\u0000"+
					"ij\u0005o\u0000\u0000jk\u0005o\u0000\u0000kl\u0005p\u0000\u0000l\n\u0001"+
					"\u0000\u0000\u0000mn\u0005l\u0000\u0000no\u0005o\u0000\u0000op\u0005o"+
					"\u0000\u0000pq\u0005p\u0000\u0000qr\u0005w\u0000\u0000rs\u0005i\u0000"+
					"\u0000st\u0005t\u0000\u0000tu\u0005h\u0000\u0000u\f\u0001\u0000\u0000"+
					"\u0000vw\u0005l\u0000\u0000wx\u0005o\u0000\u0000xy\u0005o\u0000\u0000"+
					"yz\u0005p\u0000\u0000z{\u0005r\u0000\u0000{|\u0005a\u0000\u0000|}\u0005"+
					"n\u0000\u0000}~\u0005g\u0000\u0000~\u007f\u0005e\u0000\u0000\u007f\u000e"+
					"\u0001\u0000\u0000\u0000\u0080\u0081\u0005i\u0000\u0000\u0081\u0082\u0005"+
					"n\u0000\u0000\u0082\u0083\u0005t\u0000\u0000\u0083\u0010\u0001\u0000\u0000"+
					"\u0000\u0084\u0085\u0005t\u0000\u0000\u0085\u0086\u0005o\u0000\u0000\u0086"+
					"\u0087\u0005u\u0000\u0000\u0087\u0088\u0005t\u0000\u0000\u0088\u0012\u0001"+
					"\u0000\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a\u008b\u0005t\u0000"+
					"\u0000\u008b\u008c\u0005h\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d"+
					"\u008e\u0005r\u0000\u0000\u008e\u008f\u0005w\u0000\u0000\u008f\u0090\u0005"+
					"i\u0000\u0000\u0090\u0091\u0005s\u0000\u0000\u0091\u0092\u0005e\u0000"+
					"\u0000\u0092\u0014\u0001\u0000\u0000\u0000\u0093\u0094\u0005a\u0000\u0000"+
					"\u0094\u0095\u0005n\u0000\u0000\u0095\u0096\u0005d\u0000\u0000\u0096\u0016"+
					"\u0001\u0000\u0000\u0000\u0097\u0098\u0005o\u0000\u0000\u0098\u0099\u0005"+
					"r\u0000\u0000\u0099\u0018\u0001\u0000\u0000\u0000\u009a\u009b\u0005n\u0000"+
					"\u0000\u009b\u009c\u0005o\u0000\u0000\u009c\u009d\u0005t\u0000\u0000\u009d"+
					"\u001a\u0001\u0000\u0000\u0000\u009e\u009f\u0005l\u0000\u0000\u009f\u00a0"+
					"\u0005e\u0000\u0000\u00a0\u00a1\u0005t\u0000\u0000\u00a1\u001c\u0001\u0000"+
					"\u0000\u0000\u00a2\u00a3\u0005t\u0000\u0000\u00a3\u00a4\u0005r\u0000\u0000"+
					"\u00a4\u00a5\u0005u\u0000\u0000\u00a5\u00a6\u0005e\u0000\u0000\u00a6\u001e"+
					"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005f\u0000\u0000\u00a8\u00a9\u0005"+
					"a\u0000\u0000\u00a9\u00aa\u0005l\u0000\u0000\u00aa\u00ab\u0005s\u0000"+
					"\u0000\u00ab\u00ac\u0005e\u0000\u0000\u00ac \u0001\u0000\u0000\u0000\u00ad"+
					"\u00ae\u0005=\u0000\u0000\u00ae\"\u0001\u0000\u0000\u0000\u00af\u00b0"+
					"\u0005,\u0000\u0000\u00b0$\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005{"+
					"\u0000\u0000\u00b2&\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005}\u0000\u0000"+
					"\u00b4(\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005(\u0000\u0000\u00b6*"+
					"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005)\u0000\u0000\u00b8,\u0001\u0000"+
					"\u0000\u0000\u00b9\u00ba\u0005[\u0000\u0000\u00ba.\u0001\u0000\u0000\u0000"+
					"\u00bb\u00bc\u0005]\u0000\u0000\u00bc0\u0001\u0000\u0000\u0000\u00bd\u00be"+
					"\u0005?\u0000\u0000\u00be2\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005:"+
					"\u0000\u0000\u00c04\u0001\u0000\u0000\u0000\u00c1\u00c2\u0005<\u0000\u0000"+
					"\u00c26\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005>\u0000\u0000\u00c48"+
					"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005=\u0000\u0000\u00c6\u00c7\u0005"+
					"=\u0000\u0000\u00c7:\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005c\u0000"+
					"\u0000\u00c9\u00ca\u0005h\u0000\u0000\u00ca\u00cb\u0005a\u0000\u0000\u00cb"+
					"\u00cc\u0005r\u0000\u0000\u00cc\u00cd\u0005r\u0000\u0000\u00cd<\u0001"+
					"\u0000\u0000\u0000\u00ce\u00cf\u0005+\u0000\u0000\u00cf>\u0001\u0000\u0000"+
					"\u0000\u00d0\u00d1\u0005-\u0000\u0000\u00d1@\u0001\u0000\u0000\u0000\u00d2"+
					"\u00d3\u0005*\u0000\u0000\u00d3B\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005"+
					"/\u0000\u0000\u00d5D\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005;\u0000"+
					"\u0000\u00d7F\u0001\u0000\u0000\u0000\u00d8\u00da\u0007\u0000\u0000\u0000"+
					"\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000"+
					"\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000"+
					"\u00dcH\u0001\u0000\u0000\u0000\u00dd\u00df\u0007\u0001\u0000\u0000\u00de"+
					"\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0"+
					"\u00de\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000\u0000\u00e1"+
					"J\u0001\u0000\u0000\u0000\u00e2\u00e6\u0005\'\u0000\u0000\u00e3\u00e5"+
					"\b\u0002\u0000\u0000\u00e4\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001"+
					"\u0000\u0000\u0000\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001"+
					"\u0000\u0000\u0000\u00e7\u00e9\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001"+
					"\u0000\u0000\u0000\u00e9\u00ea\u0005\'\u0000\u0000\u00eaL\u0001\u0000"+
					"\u0000\u0000\u00eb\u00ef\u0005\"\u0000\u0000\u00ec\u00ee\b\u0003\u0000"+
					"\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000"+
					"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000"+
					"\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000"+
					"\u0000\u00f2\u00f3\u0005\"\u0000\u0000\u00f3N\u0001\u0000\u0000\u0000"+
					"\u00f4\u00f5\u0005b\u0000\u0000\u00f5\u00f6\u0005o\u0000\u0000\u00f6\u00f7"+
					"\u0005o\u0000\u0000\u00f7\u00f8\u0005l\u0000\u0000\u00f8P\u0001\u0000"+
					"\u0000\u0000\u00f9\u00fb\u0007\u0004\u0000\u0000\u00fa\u00f9\u0001\u0000"+
					"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
					"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
					"\u0000\u0000\u00fe\u00ff\u0006(\u0000\u0000\u00ffR\u0001\u0000\u0000\u0000"+
					"\u0100\u0101\u0005/\u0000\u0000\u0101\u0102\u0005/\u0000\u0000\u0102\u0106"+
					"\u0001\u0000\u0000\u0000\u0103\u0105\b\u0005\u0000\u0000\u0104\u0103\u0001"+
					"\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104\u0001"+
					"\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109\u0001"+
					"\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010a\u0006"+
					")\u0000\u0000\u010aT\u0001\u0000\u0000\u0000\u010b\u0133\u0003\u0001\u0000"+
					"\u0000\u010c\u0133\u0003\u0003\u0001\u0000\u010d\u0133\u0003\u0005\u0002"+
					"\u0000\u010e\u0133\u0003\u0007\u0003\u0000\u010f\u0133\u0003\t\u0004\u0000"+
					"\u0110\u0133\u0003\u000b\u0005\u0000\u0111\u0133\u0003\r\u0006\u0000\u0112"+
					"\u0133\u0003\u000f\u0007\u0000\u0113\u0133\u0003\u0011\b\u0000\u0114\u0133"+
					"\u0003\u0013\t\u0000\u0115\u0133\u0003\u0015\n\u0000\u0116\u0133\u0003"+
					"\u0017\u000b\u0000\u0117\u0133\u0003\u0019\f\u0000\u0118\u0133\u0003\u001b"+
					"\r\u0000\u0119\u0133\u0003\u001d\u000e\u0000\u011a\u0133\u0003\u001f\u000f"+
					"\u0000\u011b\u0133\u0003!\u0010\u0000\u011c\u0133\u0003%\u0012\u0000\u011d"+
					"\u0133\u0003\'\u0013\u0000\u011e\u0133\u0003)\u0014\u0000\u011f\u0133"+
					"\u0003+\u0015\u0000\u0120\u0133\u0003-\u0016\u0000\u0121\u0133\u0003E"+
					"\"\u0000\u0122\u0133\u0003/\u0017\u0000\u0123\u0133\u00031\u0018\u0000"+
					"\u0124\u0133\u00033\u0019\u0000\u0125\u0133\u0003G#\u0000\u0126\u0133"+
					"\u0003I$\u0000\u0127\u0133\u0003K%\u0000\u0128\u0133\u0003M&\u0000\u0129"+
					"\u0133\u0003O\'\u0000\u012a\u0133\u00035\u001a\u0000\u012b\u0133\u0003"+
					"7\u001b\u0000\u012c\u0133\u00039\u001c\u0000\u012d\u0133\u0003;\u001d"+
					"\u0000\u012e\u0133\u0003=\u001e\u0000\u012f\u0133\u0003?\u001f\u0000\u0130"+
					"\u0133\u0003A \u0000\u0131\u0133\u0003C!\u0000\u0132\u010b\u0001\u0000"+
					"\u0000\u0000\u0132\u010c\u0001\u0000\u0000\u0000\u0132\u010d\u0001\u0000"+
					"\u0000\u0000\u0132\u010e\u0001\u0000\u0000\u0000\u0132\u010f\u0001\u0000"+
					"\u0000\u0000\u0132\u0110\u0001\u0000\u0000\u0000\u0132\u0111\u0001\u0000"+
					"\u0000\u0000\u0132\u0112\u0001\u0000\u0000\u0000\u0132\u0113\u0001\u0000"+
					"\u0000\u0000\u0132\u0114\u0001\u0000\u0000\u0000\u0132\u0115\u0001\u0000"+
					"\u0000\u0000\u0132\u0116\u0001\u0000\u0000\u0000\u0132\u0117\u0001\u0000"+
					"\u0000\u0000\u0132\u0118\u0001\u0000\u0000\u0000\u0132\u0119\u0001\u0000"+
					"\u0000\u0000\u0132\u011a\u0001\u0000\u0000\u0000\u0132\u011b\u0001\u0000"+
					"\u0000\u0000\u0132\u011c\u0001\u0000\u0000\u0000\u0132\u011d\u0001\u0000"+
					"\u0000\u0000\u0132\u011e\u0001\u0000\u0000\u0000\u0132\u011f\u0001\u0000"+
					"\u0000\u0000\u0132\u0120\u0001\u0000\u0000\u0000\u0132\u0121\u0001\u0000"+
					"\u0000\u0000\u0132\u0122\u0001\u0000\u0000\u0000\u0132\u0123\u0001\u0000"+
					"\u0000\u0000\u0132\u0124\u0001\u0000\u0000\u0000\u0132\u0125\u0001\u0000"+
					"\u0000\u0000\u0132\u0126\u0001\u0000\u0000\u0000\u0132\u0127\u0001\u0000"+
					"\u0000\u0000\u0132\u0128\u0001\u0000\u0000\u0000\u0132\u0129\u0001\u0000"+
					"\u0000\u0000\u0132\u012a\u0001\u0000\u0000\u0000\u0132\u012b\u0001\u0000"+
					"\u0000\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132\u012d\u0001\u0000"+
					"\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u012f\u0001\u0000"+
					"\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000"+
					"\u0000\u0000\u0133\u0161\u0001\u0000\u0000\u0000\u0134\u015d\u0003#\u0011"+
					"\u0000\u0135\u015e\u0001\u0000\u0000\u0000\u0136\u015e\u0003\u0001\u0000"+
					"\u0000\u0137\u015e\u0003\u0003\u0001\u0000\u0138\u015e\u0003\u0005\u0002"+
					"\u0000\u0139\u015e\u0003\u0007\u0003\u0000\u013a\u015e\u0003\t\u0004\u0000"+
					"\u013b\u015e\u0003\u000b\u0005\u0000\u013c\u015e\u0003\r\u0006\u0000\u013d"+
					"\u015e\u0003\u000f\u0007\u0000\u013e\u015e\u0003\u0011\b\u0000\u013f\u015e"+
					"\u0003\u0013\t\u0000\u0140\u015e\u0003\u0015\n\u0000\u0141\u015e\u0003"+
					"\u0017\u000b\u0000\u0142\u015e\u0003\u0019\f\u0000\u0143\u015e\u0003\u001b"+
					"\r\u0000\u0144\u015e\u0003\u001d\u000e\u0000\u0145\u015e\u0003\u001f\u000f"+
					"\u0000\u0146\u015e\u0003!\u0010\u0000\u0147\u015e\u0003%\u0012\u0000\u0148"+
					"\u015e\u0003\'\u0013\u0000\u0149\u015e\u0003)\u0014\u0000\u014a\u015e"+
					"\u0003+\u0015\u0000\u014b\u015e\u0003-\u0016\u0000\u014c\u015e\u0003/"+
					"\u0017\u0000\u014d\u015e\u00031\u0018\u0000\u014e\u015e\u00033\u0019\u0000"+
					"\u014f\u015e\u0003G#\u0000\u0150\u015e\u0003I$\u0000\u0151\u015e\u0003"+
					"K%\u0000\u0152\u015e\u0003M&\u0000\u0153\u015e\u0003O\'\u0000\u0154\u015e"+
					"\u00035\u001a\u0000\u0155\u015e\u00037\u001b\u0000\u0156\u015e\u00039"+
					"\u001c\u0000\u0157\u015e\u0003;\u001d\u0000\u0158\u015e\u0003=\u001e\u0000"+
					"\u0159\u015e\u0003?\u001f\u0000\u015a\u015e\u0003A \u0000\u015b\u015e"+
					"\u0003C!\u0000\u015c\u015e\u0003E\"\u0000\u015d\u0135\u0001\u0000\u0000"+
					"\u0000\u015d\u0136\u0001\u0000\u0000\u0000\u015d\u0137\u0001\u0000\u0000"+
					"\u0000\u015d\u0138\u0001\u0000\u0000\u0000\u015d\u0139\u0001\u0000\u0000"+
					"\u0000\u015d\u013a\u0001\u0000\u0000\u0000\u015d\u013b\u0001\u0000\u0000"+
					"\u0000\u015d\u013c\u0001\u0000\u0000\u0000\u015d\u013d\u0001\u0000\u0000"+
					"\u0000\u015d\u013e\u0001\u0000\u0000\u0000\u015d\u013f\u0001\u0000\u0000"+
					"\u0000\u015d\u0140\u0001\u0000\u0000\u0000\u015d\u0141\u0001\u0000\u0000"+
					"\u0000\u015d\u0142\u0001\u0000\u0000\u0000\u015d\u0143\u0001\u0000\u0000"+
					"\u0000\u015d\u0144\u0001\u0000\u0000\u0000\u015d\u0145\u0001\u0000\u0000"+
					"\u0000\u015d\u0146\u0001\u0000\u0000\u0000\u015d\u0147\u0001\u0000\u0000"+
					"\u0000\u015d\u0148\u0001\u0000\u0000\u0000\u015d\u0149\u0001\u0000\u0000"+
					"\u0000\u015d\u014a\u0001\u0000\u0000\u0000\u015d\u014b\u0001\u0000\u0000"+
					"\u0000\u015d\u014c\u0001\u0000\u0000\u0000\u015d\u014d\u0001\u0000\u0000"+
					"\u0000\u015d\u014e\u0001\u0000\u0000\u0000\u015d\u014f\u0001\u0000\u0000"+
					"\u0000\u015d\u0150\u0001\u0000\u0000\u0000\u015d\u0151\u0001\u0000\u0000"+
					"\u0000\u015d\u0152\u0001\u0000\u0000\u0000\u015d\u0153\u0001\u0000\u0000"+
					"\u0000\u015d\u0154\u0001\u0000\u0000\u0000\u015d\u0155\u0001\u0000\u0000"+
					"\u0000\u015d\u0156\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000\u0000"+
					"\u0000\u015d\u0158\u0001\u0000\u0000\u0000\u015d\u0159\u0001\u0000\u0000"+
					"\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
					"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000"+
					"\u0000\u015f\u0134\u0001\u0000\u0000\u0000\u0160\u0163\u0001\u0000\u0000"+
					"\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000"+
					"\u0000\u0162V\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000"+
					"\n\u0000\u00db\u00e0\u00e6\u00ef\u00fc\u0106\u0132\u015d\u0161\u0001\u0006"+
					"\u0000\u0000";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
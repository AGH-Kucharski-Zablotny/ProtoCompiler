// Generated from OurProto.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurProtoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, SYNTAX=4, PACKAGE=5, OPTION=6, SERVICE=7, RPC=8, 
		MESSAGE=9, REPEATED=10, RETURNS=11, DOUBLE=12, FLOAT=13, INT32=14, INT64=15, 
		UINT32=16, UINT64=17, SINT32=18, SINT64=19, FIXED32=20, FIXED64=21, SFIXED32=22, 
		SFIXED64=23, BOOL=24, STRING=25, BYTE=26, ENUM=27, ONEOF=28, MAP=29, LPARA=30, 
		RPARA=31, LCBRA=32, RCBRA=33, EQUAL=34, SEMICOL=35, QUOT=36, PLUS=37, 
		MINUS=38, LT=39, GT=40, COMMA=41, TRUE=42, FALSE=43, LETTER=44, NUMBER=45, 
		WS=46, COMMENT=47, LINE_COMMENT=48;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "SYNTAX", "PACKAGE", "OPTION", "SERVICE", "RPC", 
		"MESSAGE", "REPEATED", "RETURNS", "DOUBLE", "FLOAT", "INT32", "INT64", 
		"UINT32", "UINT64", "SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", 
		"SFIXED64", "BOOL", "STRING", "BYTE", "ENUM", "ONEOF", "MAP", "LPARA", 
		"RPARA", "LCBRA", "RCBRA", "EQUAL", "SEMICOL", "QUOT", "PLUS", "MINUS", 
		"LT", "GT", "COMMA", "TRUE", "FALSE", "LETTER", "NUMBER", "WS", "COMMENT", 
		"LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'\"proto3\"'", "''proto3''", "'.'", "'syntax'", "'package'", "'option'", 
		"'service'", "'rpc'", "'message'", "'repeated'", "'returns'", "'double'", 
		"'float'", "'int32'", "'int64'", "'uint32'", "'uint64'", "'sint32'", "'sint64'", 
		"'fixed32'", "'fixed64'", "'sfixed32'", "'sfixed64'", "'bool'", "'string'", 
		"'bytes'", "'enum'", "'oneofDeff'", "'map'", "'('", "')'", "'{'", "'}'", 
		"'='", "';'", "'\"'", "'+'", "'-'", "'<'", "'>'", "','", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "SYNTAX", "PACKAGE", "OPTION", "SERVICE", "RPC", 
		"MESSAGE", "REPEATED", "RETURNS", "DOUBLE", "FLOAT", "INT32", "INT64", 
		"UINT32", "UINT64", "SINT32", "SINT64", "FIXED32", "FIXED64", "SFIXED32", 
		"SFIXED64", "BOOL", "STRING", "BYTE", "ENUM", "ONEOF", "MAP", "LPARA", 
		"RPARA", "LCBRA", "RCBRA", "EQUAL", "SEMICOL", "QUOT", "PLUS", "MINUS", 
		"LT", "GT", "COMMA", "TRUE", "FALSE", "LETTER", "NUMBER", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
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


	public OurProtoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OurProto.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\62\u0175\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3-\3-\3.\3.\3/\6/\u0157"+
		"\n/\r/\16/\u0158\3/\3/\3\60\3\60\3\60\3\60\7\60\u0161\n\60\f\60\16\60"+
		"\u0164\13\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\7\61\u016f\n"+
		"\61\f\61\16\61\u0172\13\61\3\61\3\61\3\u0162\2\62\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62\3\2\6\5\2C\\aac|\3\2\62;\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\2\u0177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5l\3\2\2\2\7u\3\2\2\2\tw\3\2\2"+
		"\2\13~\3\2\2\2\r\u0086\3\2\2\2\17\u008d\3\2\2\2\21\u0095\3\2\2\2\23\u0099"+
		"\3\2\2\2\25\u00a1\3\2\2\2\27\u00aa\3\2\2\2\31\u00b2\3\2\2\2\33\u00b9\3"+
		"\2\2\2\35\u00bf\3\2\2\2\37\u00c5\3\2\2\2!\u00cb\3\2\2\2#\u00d2\3\2\2\2"+
		"%\u00d9\3\2\2\2\'\u00e0\3\2\2\2)\u00e7\3\2\2\2+\u00ef\3\2\2\2-\u00f7\3"+
		"\2\2\2/\u0100\3\2\2\2\61\u0109\3\2\2\2\63\u010e\3\2\2\2\65\u0115\3\2\2"+
		"\2\67\u011b\3\2\2\29\u0120\3\2\2\2;\u012a\3\2\2\2=\u012e\3\2\2\2?\u0130"+
		"\3\2\2\2A\u0132\3\2\2\2C\u0134\3\2\2\2E\u0136\3\2\2\2G\u0138\3\2\2\2I"+
		"\u013a\3\2\2\2K\u013c\3\2\2\2M\u013e\3\2\2\2O\u0140\3\2\2\2Q\u0142\3\2"+
		"\2\2S\u0144\3\2\2\2U\u0146\3\2\2\2W\u014b\3\2\2\2Y\u0151\3\2\2\2[\u0153"+
		"\3\2\2\2]\u0156\3\2\2\2_\u015c\3\2\2\2a\u016a\3\2\2\2cd\7$\2\2de\7r\2"+
		"\2ef\7t\2\2fg\7q\2\2gh\7v\2\2hi\7q\2\2ij\7\65\2\2jk\7$\2\2k\4\3\2\2\2"+
		"lm\7)\2\2mn\7r\2\2no\7t\2\2op\7q\2\2pq\7v\2\2qr\7q\2\2rs\7\65\2\2st\7"+
		")\2\2t\6\3\2\2\2uv\7\60\2\2v\b\3\2\2\2wx\7u\2\2xy\7{\2\2yz\7p\2\2z{\7"+
		"v\2\2{|\7c\2\2|}\7z\2\2}\n\3\2\2\2~\177\7r\2\2\177\u0080\7c\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7m\2\2\u0082\u0083\7c\2\2\u0083\u0084\7i\2\2"+
		"\u0084\u0085\7g\2\2\u0085\f\3\2\2\2\u0086\u0087\7q\2\2\u0087\u0088\7r"+
		"\2\2\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7p\2\2\u008c\16\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7t\2\2\u0090\u0091\7x\2\2\u0091\u0092\7k\2\2\u0092\u0093\7e\2\2\u0093"+
		"\u0094\7g\2\2\u0094\20\3\2\2\2\u0095\u0096\7t\2\2\u0096\u0097\7r\2\2\u0097"+
		"\u0098\7e\2\2\u0098\22\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b\7g\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7u\2\2\u009d\u009e\7c\2\2\u009e\u009f\7i\2\2"+
		"\u009f\u00a0\7g\2\2\u00a0\24\3\2\2\2\u00a1\u00a2\7t\2\2\u00a2\u00a3\7"+
		"g\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6\7c\2\2\u00a6\u00a7"+
		"\7v\2\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7f\2\2\u00a9\26\3\2\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7w\2\2\u00ae"+
		"\u00af\7t\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7u\2\2\u00b1\30\3\2\2\2\u00b2"+
		"\u00b3\7f\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7w\2\2\u00b5\u00b6\7d\2\2"+
		"\u00b6\u00b7\7n\2\2\u00b7\u00b8\7g\2\2\u00b8\32\3\2\2\2\u00b9\u00ba\7"+
		"h\2\2\u00ba\u00bb\7n\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be"+
		"\7v\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7\65\2\2\u00c3\u00c4\7\64\2\2\u00c4\36\3\2\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\78\2\2"+
		"\u00c9\u00ca\7\66\2\2\u00ca \3\2\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7"+
		"k\2\2\u00cd\u00ce\7p\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7\65\2\2\u00d0"+
		"\u00d1\7\64\2\2\u00d1\"\3\2\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7k\2\2"+
		"\u00d4\u00d5\7p\2\2\u00d5\u00d6\7v\2\2\u00d6\u00d7\78\2\2\u00d7\u00d8"+
		"\7\66\2\2\u00d8$\3\2\2\2\u00d9\u00da\7u\2\2\u00da\u00db\7k\2\2\u00db\u00dc"+
		"\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7\65\2\2\u00de\u00df\7\64\2\2\u00df"+
		"&\3\2\2\2\u00e0\u00e1\7u\2\2\u00e1\u00e2\7k\2\2\u00e2\u00e3\7p\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\78\2\2\u00e5\u00e6\7\66\2\2\u00e6(\3\2\2\2\u00e7"+
		"\u00e8\7h\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea\7z\2\2\u00ea\u00eb\7g\2\2"+
		"\u00eb\u00ec\7f\2\2\u00ec\u00ed\7\65\2\2\u00ed\u00ee\7\64\2\2\u00ee*\3"+
		"\2\2\2\u00ef\u00f0\7h\2\2\u00f0\u00f1\7k\2\2\u00f1\u00f2\7z\2\2\u00f2"+
		"\u00f3\7g\2\2\u00f3\u00f4\7f\2\2\u00f4\u00f5\78\2\2\u00f5\u00f6\7\66\2"+
		"\2\u00f6,\3\2\2\2\u00f7\u00f8\7u\2\2\u00f8\u00f9\7h\2\2\u00f9\u00fa\7"+
		"k\2\2\u00fa\u00fb\7z\2\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7f\2\2\u00fd\u00fe"+
		"\7\65\2\2\u00fe\u00ff\7\64\2\2\u00ff.\3\2\2\2\u0100\u0101\7u\2\2\u0101"+
		"\u0102\7h\2\2\u0102\u0103\7k\2\2\u0103\u0104\7z\2\2\u0104\u0105\7g\2\2"+
		"\u0105\u0106\7f\2\2\u0106\u0107\78\2\2\u0107\u0108\7\66\2\2\u0108\60\3"+
		"\2\2\2\u0109\u010a\7d\2\2\u010a\u010b\7q\2\2\u010b\u010c\7q\2\2\u010c"+
		"\u010d\7n\2\2\u010d\62\3\2\2\2\u010e\u010f\7u\2\2\u010f\u0110\7v\2\2\u0110"+
		"\u0111\7t\2\2\u0111\u0112\7k\2\2\u0112\u0113\7p\2\2\u0113\u0114\7i\2\2"+
		"\u0114\64\3\2\2\2\u0115\u0116\7d\2\2\u0116\u0117\7{\2\2\u0117\u0118\7"+
		"v\2\2\u0118\u0119\7g\2\2\u0119\u011a\7u\2\2\u011a\66\3\2\2\2\u011b\u011c"+
		"\7g\2\2\u011c\u011d\7p\2\2\u011d\u011e\7w\2\2\u011e\u011f\7o\2\2\u011f"+
		"8\3\2\2\2\u0120\u0121\7q\2\2\u0121\u0122\7p\2\2\u0122\u0123\7g\2\2\u0123"+
		"\u0124\7q\2\2\u0124\u0125\7h\2\2\u0125\u0126\7F\2\2\u0126\u0127\7g\2\2"+
		"\u0127\u0128\7h\2\2\u0128\u0129\7h\2\2\u0129:\3\2\2\2\u012a\u012b\7o\2"+
		"\2\u012b\u012c\7c\2\2\u012c\u012d\7r\2\2\u012d<\3\2\2\2\u012e\u012f\7"+
		"*\2\2\u012f>\3\2\2\2\u0130\u0131\7+\2\2\u0131@\3\2\2\2\u0132\u0133\7}"+
		"\2\2\u0133B\3\2\2\2\u0134\u0135\7\177\2\2\u0135D\3\2\2\2\u0136\u0137\7"+
		"?\2\2\u0137F\3\2\2\2\u0138\u0139\7=\2\2\u0139H\3\2\2\2\u013a\u013b\7$"+
		"\2\2\u013bJ\3\2\2\2\u013c\u013d\7-\2\2\u013dL\3\2\2\2\u013e\u013f\7/\2"+
		"\2\u013fN\3\2\2\2\u0140\u0141\7>\2\2\u0141P\3\2\2\2\u0142\u0143\7@\2\2"+
		"\u0143R\3\2\2\2\u0144\u0145\7.\2\2\u0145T\3\2\2\2\u0146\u0147\7v\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7w\2\2\u0149\u014a\7g\2\2\u014aV\3\2\2\2\u014b"+
		"\u014c\7h\2\2\u014c\u014d\7c\2\2\u014d\u014e\7n\2\2\u014e\u014f\7u\2\2"+
		"\u014f\u0150\7g\2\2\u0150X\3\2\2\2\u0151\u0152\t\2\2\2\u0152Z\3\2\2\2"+
		"\u0153\u0154\t\3\2\2\u0154\\\3\2\2\2\u0155\u0157\t\4\2\2\u0156\u0155\3"+
		"\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\b/\2\2\u015b^\3\2\2\2\u015c\u015d\7\61\2\2"+
		"\u015d\u015e\7,\2\2\u015e\u0162\3\2\2\2\u015f\u0161\13\2\2\2\u0160\u015f"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7,\2\2\u0166\u0167\7\61"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\b\60\2\2\u0169`\3\2\2\2\u016a\u016b"+
		"\7\61\2\2\u016b\u016c\7\61\2\2\u016c\u0170\3\2\2\2\u016d\u016f\n\5\2\2"+
		"\u016e\u016d\3\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171"+
		"\3\2\2\2\u0171\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0174\b\61\2\2"+
		"\u0174b\3\2\2\2\6\2\u0158\u0162\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package pl.agh.tkik.antlr4;// Generated from OurProto.g4 by ANTLR 4.7

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OurProtoParser extends Parser {
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
	public static final int
		RULE_protoFileDef = 0, RULE_syntax = 1, RULE_packageDef = 2, RULE_fullIdentifier = 3, 
		RULE_identifier = 4, RULE_option = 5, RULE_optionName = 6, RULE_constant = 7, 
		RULE_intLiteral = 8, RULE_floatLiteral = 9, RULE_strLiteral = 10, RULE_boolLiteral = 11, 
		RULE_definition = 12, RULE_serviceDef = 13, RULE_rpcDef = 14, RULE_messageDef = 15, 
		RULE_messageBody = 16, RULE_field = 17, RULE_fieldType = 18, RULE_type = 19, 
		RULE_enumDefinition = 20, RULE_enumBody = 21, RULE_enumField = 22, RULE_oneofDef = 23, 
		RULE_oneOfField = 24, RULE_mapField = 25, RULE_keyType = 26, RULE_emptyStatement = 27;
	public static final String[] ruleNames = {
		"protoFileDef", "syntax", "packageDef", "fullIdentifier", "identifier", 
		"option", "optionName", "constant", "intLiteral", "floatLiteral", "strLiteral", 
		"boolLiteral", "definition", "serviceDef", "rpcDef", "messageDef", "messageBody", 
		"field", "fieldType", "type", "enumDefinition", "enumBody", "enumField", 
		"oneofDef", "oneOfField", "mapField", "keyType", "emptyStatement"
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

	@Override
	public String getGrammarFileName() { return "OurProto.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OurProtoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProtoFileDefContext extends ParserRuleContext {
		public SyntaxContext syntax() {
			return getRuleContext(SyntaxContext.class,0);
		}
		public TerminalNode EOF() { return getToken(OurProtoParser.EOF, 0); }
		public List<PackageDefContext> packageDef() {
			return getRuleContexts(PackageDefContext.class);
		}
		public PackageDefContext packageDef(int i) {
			return getRuleContext(PackageDefContext.class,i);
		}
		public List<OptionContext> option() {
			return getRuleContexts(OptionContext.class);
		}
		public OptionContext option(int i) {
			return getRuleContext(OptionContext.class,i);
		}
		public List<DefinitionContext> definition() {
			return getRuleContexts(DefinitionContext.class);
		}
		public DefinitionContext definition(int i) {
			return getRuleContext(DefinitionContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public ProtoFileDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protoFileDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterProtoFileDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitProtoFileDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitProtoFileDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProtoFileDefContext protoFileDef() throws RecognitionException {
		ProtoFileDefContext _localctx = new ProtoFileDefContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_protoFileDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			syntax();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PACKAGE) | (1L << OPTION) | (1L << SERVICE) | (1L << MESSAGE) | (1L << ENUM) | (1L << SEMICOL))) != 0)) {
				{
				setState(61);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PACKAGE:
					{
					setState(57);
					packageDef();
					}
					break;
				case OPTION:
					{
					setState(58);
					option();
					}
					break;
				case SERVICE:
				case MESSAGE:
				case ENUM:
					{
					setState(59);
					definition();
					}
					break;
				case SEMICOL:
					{
					setState(60);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(66);
			match(EOF);
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

	public static class SyntaxContext extends ParserRuleContext {
		public TerminalNode SYNTAX() { return getToken(OurProtoParser.SYNTAX, 0); }
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public SyntaxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syntax; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterSyntax(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitSyntax(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitSyntax(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyntaxContext syntax() throws RecognitionException {
		SyntaxContext _localctx = new SyntaxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_syntax);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SYNTAX);
			setState(69);
			match(EQUAL);
			setState(70);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(71);
			match(SEMICOL);
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

	public static class PackageDefContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(OurProtoParser.PACKAGE, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public PackageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterPackageDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitPackageDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitPackageDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PackageDefContext packageDef() throws RecognitionException {
		PackageDefContext _localctx = new PackageDefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_packageDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PACKAGE);
			setState(74);
			fullIdentifier();
			setState(75);
			match(SEMICOL);
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

	public static class FullIdentifierContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FullIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterFullIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitFullIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitFullIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FullIdentifierContext fullIdentifier() throws RecognitionException {
		FullIdentifierContext _localctx = new FullIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fullIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			identifier();
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(78);
				match(T__2);
				setState(79);
				identifier();
				}
				}
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class IdentifierContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(OurProtoParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(OurProtoParser.LETTER, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(OurProtoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OurProtoParser.NUMBER, i);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identifier);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LETTER);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(86);
					_la = _input.LA(1);
					if ( !(_la==LETTER || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
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

	public static class OptionContext extends ParserRuleContext {
		public TerminalNode OPTION() { return getToken(OurProtoParser.OPTION, 0); }
		public OptionNameContext optionName() {
			return getRuleContext(OptionNameContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public OptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_option; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionContext option() throws RecognitionException {
		OptionContext _localctx = new OptionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_option);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OPTION);
			setState(93);
			optionName();
			setState(94);
			match(EQUAL);
			setState(95);
			constant();
			setState(96);
			match(SEMICOL);
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

	public static class OptionNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LPARA() { return getToken(OurProtoParser.LPARA, 0); }
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public TerminalNode RPARA() { return getToken(OurProtoParser.RPARA, 0); }
		public OptionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterOptionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitOptionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitOptionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionNameContext optionName() throws RecognitionException {
		OptionNameContext _localctx = new OptionNameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LETTER:
				{
				setState(98);
				identifier();
				}
				break;
			case LPARA:
				{
				setState(99);
				match(LPARA);
				setState(100);
				fullIdentifier();
				setState(101);
				match(RPARA);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(105);
				match(T__2);
				setState(106);
				identifier();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConstantContext extends ParserRuleContext {
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public IntLiteralContext intLiteral() {
			return getRuleContext(IntLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(OurProtoParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(OurProtoParser.PLUS, 0); }
		public FloatLiteralContext floatLiteral() {
			return getRuleContext(FloatLiteralContext.class,0);
		}
		public StrLiteralContext strLiteral() {
			return getRuleContext(StrLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constant);
		int _la;
		try {
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				fullIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(113);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(116);
				intLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(117);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(120);
				floatLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case QUOT:
					{
					setState(121);
					strLiteral();
					}
					break;
				case TRUE:
				case FALSE:
					{
					setState(122);
					boolLiteral();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
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

	public static class IntLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(OurProtoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OurProtoParser.NUMBER, i);
		}
		public IntLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntLiteralContext intLiteral() throws RecognitionException {
		IntLiteralContext _localctx = new IntLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_intLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(127);
				match(NUMBER);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class FloatLiteralContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(OurProtoParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(OurProtoParser.NUMBER, i);
		}
		public FloatLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_floatLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FloatLiteralContext floatLiteral() throws RecognitionException {
		FloatLiteralContext _localctx = new FloatLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_floatLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(132);
				match(NUMBER);
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(137);
			match(T__2);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				match(NUMBER);
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
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

	public static class StrLiteralContext extends ParserRuleContext {
		public List<TerminalNode> LETTER() { return getTokens(OurProtoParser.LETTER); }
		public TerminalNode LETTER(int i) {
			return getToken(OurProtoParser.LETTER, i);
		}
		public StrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterStrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitStrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitStrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrLiteralContext strLiteral() throws RecognitionException {
		StrLiteralContext _localctx = new StrLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_strLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(QUOT);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				match(LETTER);
				}
				}
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETTER );
			setState(149);
			match(QUOT);
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

	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(OurProtoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OurProtoParser.FALSE, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitBoolLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitBoolLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class DefinitionContext extends ParserRuleContext {
		public List<ServiceDefContext> serviceDef() {
			return getRuleContexts(ServiceDefContext.class);
		}
		public ServiceDefContext serviceDef(int i) {
			return getRuleContext(ServiceDefContext.class,i);
		}
		public List<MessageDefContext> messageDef() {
			return getRuleContexts(MessageDefContext.class);
		}
		public MessageDefContext messageDef(int i) {
			return getRuleContext(MessageDefContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(156);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case SERVICE:
						{
						setState(153);
						serviceDef();
						}
						break;
					case MESSAGE:
						{
						setState(154);
						messageDef();
						}
						break;
					case ENUM:
						{
						setState(155);
						enumDefinition();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
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

	public static class ServiceDefContext extends ParserRuleContext {
		public TerminalNode SERVICE() { return getToken(OurProtoParser.SERVICE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LCBRA() { return getToken(OurProtoParser.LCBRA, 0); }
		public TerminalNode RCBRA() { return getToken(OurProtoParser.RCBRA, 0); }
		public List<RpcDefContext> rpcDef() {
			return getRuleContexts(RpcDefContext.class);
		}
		public RpcDefContext rpcDef(int i) {
			return getRuleContext(RpcDefContext.class,i);
		}
		public ServiceDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serviceDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterServiceDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitServiceDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitServiceDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceDefContext serviceDef() throws RecognitionException {
		ServiceDefContext _localctx = new ServiceDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_serviceDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(SERVICE);
			setState(161);
			identifier();
			setState(162);
			match(LCBRA);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RPC) {
				{
				{
				setState(163);
				rpcDef();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			match(RCBRA);
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

	public static class RpcDefContext extends ParserRuleContext {
		public TerminalNode RPC() { return getToken(OurProtoParser.RPC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> LPARA() { return getTokens(OurProtoParser.LPARA); }
		public TerminalNode LPARA(int i) {
			return getToken(OurProtoParser.LPARA, i);
		}
		public List<FullIdentifierContext> fullIdentifier() {
			return getRuleContexts(FullIdentifierContext.class);
		}
		public FullIdentifierContext fullIdentifier(int i) {
			return getRuleContext(FullIdentifierContext.class,i);
		}
		public List<TerminalNode> RPARA() { return getTokens(OurProtoParser.RPARA); }
		public TerminalNode RPARA(int i) {
			return getToken(OurProtoParser.RPARA, i);
		}
		public TerminalNode RETURNS() { return getToken(OurProtoParser.RETURNS, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public RpcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rpcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterRpcDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitRpcDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitRpcDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpcDefContext rpcDef() throws RecognitionException {
		RpcDefContext _localctx = new RpcDefContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_rpcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(RPC);
			setState(172);
			identifier();
			setState(173);
			match(LPARA);
			setState(174);
			fullIdentifier();
			setState(175);
			match(RPARA);
			setState(176);
			match(RETURNS);
			setState(177);
			match(LPARA);
			setState(178);
			fullIdentifier();
			setState(179);
			match(RPARA);
			setState(180);
			match(SEMICOL);
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

	public static class MessageDefContext extends ParserRuleContext {
		public TerminalNode MESSAGE() { return getToken(OurProtoParser.MESSAGE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MessageBodyContext messageBody() {
			return getRuleContext(MessageBodyContext.class,0);
		}
		public MessageDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterMessageDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitMessageDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitMessageDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageDefContext messageDef() throws RecognitionException {
		MessageDefContext _localctx = new MessageDefContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_messageDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(MESSAGE);
			setState(183);
			identifier();
			setState(184);
			messageBody();
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

	public static class MessageBodyContext extends ParserRuleContext {
		public TerminalNode LCBRA() { return getToken(OurProtoParser.LCBRA, 0); }
		public TerminalNode RCBRA() { return getToken(OurProtoParser.RCBRA, 0); }
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public List<EnumDefinitionContext> enumDefinition() {
			return getRuleContexts(EnumDefinitionContext.class);
		}
		public EnumDefinitionContext enumDefinition(int i) {
			return getRuleContext(EnumDefinitionContext.class,i);
		}
		public List<MessageDefContext> messageDef() {
			return getRuleContexts(MessageDefContext.class);
		}
		public MessageDefContext messageDef(int i) {
			return getRuleContext(MessageDefContext.class,i);
		}
		public List<OneofDefContext> oneofDef() {
			return getRuleContexts(OneofDefContext.class);
		}
		public OneofDefContext oneofDef(int i) {
			return getRuleContext(OneofDefContext.class,i);
		}
		public List<MapFieldContext> mapField() {
			return getRuleContexts(MapFieldContext.class);
		}
		public MapFieldContext mapField(int i) {
			return getRuleContext(MapFieldContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public MessageBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_messageBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterMessageBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitMessageBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitMessageBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MessageBodyContext messageBody() throws RecognitionException {
		MessageBodyContext _localctx = new MessageBodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_messageBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(LCBRA);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MESSAGE) | (1L << REPEATED) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << BYTE) | (1L << ENUM) | (1L << ONEOF) | (1L << MAP) | (1L << SEMICOL) | (1L << LETTER))) != 0)) {
				{
				setState(193);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REPEATED:
				case DOUBLE:
				case FLOAT:
				case INT32:
				case INT64:
				case UINT32:
				case UINT64:
				case SINT32:
				case SINT64:
				case FIXED32:
				case FIXED64:
				case SFIXED32:
				case SFIXED64:
				case BOOL:
				case STRING:
				case BYTE:
				case LETTER:
					{
					setState(187);
					field();
					}
					break;
				case ENUM:
					{
					setState(188);
					enumDefinition();
					}
					break;
				case MESSAGE:
					{
					setState(189);
					messageDef();
					}
					break;
				case ONEOF:
					{
					setState(190);
					oneofDef();
					}
					break;
				case MAP:
					{
					setState(191);
					mapField();
					}
					break;
				case SEMICOL:
					{
					setState(192);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(RCBRA);
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

	public static class FieldContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(OurProtoParser.NUMBER, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public TerminalNode REPEATED() { return getToken(OurProtoParser.REPEATED, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REPEATED) {
				{
				setState(200);
				match(REPEATED);
				}
			}

			setState(203);
			fieldType();
			setState(204);
			identifier();
			setState(205);
			match(EQUAL);
			setState(206);
			match(NUMBER);
			setState(207);
			match(SEMICOL);
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

	public static class FieldTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FullIdentifierContext fullIdentifier() {
			return getRuleContext(FullIdentifierContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitFieldType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitFieldType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_fieldType);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE:
			case FLOAT:
			case INT32:
			case INT64:
			case UINT32:
			case UINT64:
			case SINT32:
			case SINT64:
			case FIXED32:
			case FIXED64:
			case SFIXED32:
			case SFIXED64:
			case BOOL:
			case STRING:
			case BYTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				type();
				}
				break;
			case LETTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				fullIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(OurProtoParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(OurProtoParser.FLOAT, 0); }
		public TerminalNode INT32() { return getToken(OurProtoParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(OurProtoParser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(OurProtoParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(OurProtoParser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(OurProtoParser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(OurProtoParser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(OurProtoParser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(OurProtoParser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(OurProtoParser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(OurProtoParser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(OurProtoParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(OurProtoParser.STRING, 0); }
		public TerminalNode BYTE() { return getToken(OurProtoParser.BYTE, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOUBLE) | (1L << FLOAT) | (1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING) | (1L << BYTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EnumDefinitionContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(OurProtoParser.ENUM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public EnumDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterEnumDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitEnumDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitEnumDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumDefinitionContext enumDefinition() throws RecognitionException {
		EnumDefinitionContext _localctx = new EnumDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_enumDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(ENUM);
			setState(216);
			identifier();
			setState(217);
			enumBody();
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

	public static class EnumBodyContext extends ParserRuleContext {
		public TerminalNode RCBRA() { return getToken(OurProtoParser.RCBRA, 0); }
		public List<EnumFieldContext> enumField() {
			return getRuleContexts(EnumFieldContext.class);
		}
		public EnumFieldContext enumField(int i) {
			return getRuleContext(EnumFieldContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitEnumBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitEnumBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_enumBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			match(RCBRA);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(222);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER:
						{
						setState(220);
						enumField();
						}
						break;
					case SEMICOL:
						{
						setState(221);
						emptyStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
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

	public static class EnumFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(OurProtoParser.NUMBER, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public EnumFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterEnumField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitEnumField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitEnumField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumFieldContext enumField() throws RecognitionException {
		EnumFieldContext _localctx = new EnumFieldContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_enumField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			identifier();
			setState(228);
			match(EQUAL);
			setState(229);
			match(NUMBER);
			setState(230);
			match(SEMICOL);
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

	public static class OneofDefContext extends ParserRuleContext {
		public TerminalNode ONEOF() { return getToken(OurProtoParser.ONEOF, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RCBRA() { return getToken(OurProtoParser.RCBRA, 0); }
		public List<OneOfFieldContext> oneOfField() {
			return getRuleContexts(OneOfFieldContext.class);
		}
		public OneOfFieldContext oneOfField(int i) {
			return getRuleContext(OneOfFieldContext.class,i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public OneofDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneofDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterOneofDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitOneofDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitOneofDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneofDefContext oneofDef() throws RecognitionException {
		OneofDefContext _localctx = new OneofDefContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oneofDef);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(ONEOF);
			setState(233);
			identifier();
			setState(234);
			match(RCBRA);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(237);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LETTER:
						{
						setState(235);
						oneOfField();
						}
						break;
					case SEMICOL:
						{
						setState(236);
						emptyStatement();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
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

	public static class OneOfFieldContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(OurProtoParser.NUMBER, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public OneOfFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneOfField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterOneOfField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitOneOfField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitOneOfField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneOfFieldContext oneOfField() throws RecognitionException {
		OneOfFieldContext _localctx = new OneOfFieldContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_oneOfField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			identifier();
			setState(243);
			match(EQUAL);
			setState(244);
			match(NUMBER);
			setState(245);
			match(SEMICOL);
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

	public static class MapFieldContext extends ParserRuleContext {
		public TerminalNode MAP() { return getToken(OurProtoParser.MAP, 0); }
		public TerminalNode LT() { return getToken(OurProtoParser.LT, 0); }
		public KeyTypeContext keyType() {
			return getRuleContext(KeyTypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(OurProtoParser.COMMA, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode GT() { return getToken(OurProtoParser.GT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(OurProtoParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(OurProtoParser.NUMBER, 0); }
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public MapFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterMapField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitMapField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitMapField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapFieldContext mapField() throws RecognitionException {
		MapFieldContext _localctx = new MapFieldContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mapField);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(MAP);
			setState(248);
			match(LT);
			setState(249);
			keyType();
			setState(250);
			match(COMMA);
			setState(251);
			type();
			setState(252);
			match(GT);
			setState(253);
			identifier();
			setState(254);
			match(EQUAL);
			setState(255);
			match(NUMBER);
			setState(256);
			match(SEMICOL);
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

	public static class KeyTypeContext extends ParserRuleContext {
		public TerminalNode INT32() { return getToken(OurProtoParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(OurProtoParser.INT64, 0); }
		public TerminalNode UINT32() { return getToken(OurProtoParser.UINT32, 0); }
		public TerminalNode UINT64() { return getToken(OurProtoParser.UINT64, 0); }
		public TerminalNode SINT32() { return getToken(OurProtoParser.SINT32, 0); }
		public TerminalNode SINT64() { return getToken(OurProtoParser.SINT64, 0); }
		public TerminalNode FIXED32() { return getToken(OurProtoParser.FIXED32, 0); }
		public TerminalNode FIXED64() { return getToken(OurProtoParser.FIXED64, 0); }
		public TerminalNode SFIXED32() { return getToken(OurProtoParser.SFIXED32, 0); }
		public TerminalNode SFIXED64() { return getToken(OurProtoParser.SFIXED64, 0); }
		public TerminalNode BOOL() { return getToken(OurProtoParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(OurProtoParser.STRING, 0); }
		public KeyTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterKeyType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitKeyType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitKeyType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyTypeContext keyType() throws RecognitionException {
		KeyTypeContext _localctx = new KeyTypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT32) | (1L << INT64) | (1L << UINT32) | (1L << UINT64) | (1L << SINT32) | (1L << SINT64) | (1L << FIXED32) | (1L << FIXED64) | (1L << SFIXED32) | (1L << SFIXED64) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMICOL() { return getToken(OurProtoParser.SEMICOL, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OurProtoListener) ((OurProtoListener)listener).exitEmptyStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OurProtoVisitor) return ((OurProtoVisitor<? extends T>)visitor).visitEmptyStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SEMICOL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u0109\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\7\2@\n\2"+
		"\f\2\16\2C\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\7\5S\n\5\f\5\16\5V\13\5\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bj\n\b\3\b\3\b\7\bn\n\b\f\b\16\bq\13"+
		"\b\3\t\3\t\5\tu\n\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\t\5\t~\n\t\5\t\u0080\n"+
		"\t\3\n\6\n\u0083\n\n\r\n\16\n\u0084\3\13\6\13\u0088\n\13\r\13\16\13\u0089"+
		"\3\13\3\13\6\13\u008e\n\13\r\13\16\13\u008f\3\f\3\f\6\f\u0094\n\f\r\f"+
		"\16\f\u0095\3\f\3\f\3\r\3\r\3\16\3\16\3\16\6\16\u009f\n\16\r\16\16\16"+
		"\u00a0\3\17\3\17\3\17\3\17\7\17\u00a7\n\17\f\17\16\17\u00aa\13\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c4\n\22\f\22\16"+
		"\22\u00c7\13\22\3\22\3\22\3\23\5\23\u00cc\n\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\5\24\u00d6\n\24\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\7\27\u00e1\n\27\f\27\16\27\u00e4\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u00f0\n\31\f\31\16\31\u00f3\13\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\35\3\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\b\3\2\3\4\3\2./\3\2\'(\3\2,-\3\2\16\34"+
		"\3\2\20\33\2\u010e\2:\3\2\2\2\4F\3\2\2\2\6K\3\2\2\2\bO\3\2\2\2\nW\3\2"+
		"\2\2\f^\3\2\2\2\16i\3\2\2\2\20\177\3\2\2\2\22\u0082\3\2\2\2\24\u0087\3"+
		"\2\2\2\26\u0091\3\2\2\2\30\u0099\3\2\2\2\32\u009e\3\2\2\2\34\u00a2\3\2"+
		"\2\2\36\u00ad\3\2\2\2 \u00b8\3\2\2\2\"\u00bc\3\2\2\2$\u00cb\3\2\2\2&\u00d5"+
		"\3\2\2\2(\u00d7\3\2\2\2*\u00d9\3\2\2\2,\u00dd\3\2\2\2.\u00e5\3\2\2\2\60"+
		"\u00ea\3\2\2\2\62\u00f4\3\2\2\2\64\u00f9\3\2\2\2\66\u0104\3\2\2\28\u0106"+
		"\3\2\2\2:A\5\4\3\2;@\5\6\4\2<@\5\f\7\2=@\5\32\16\2>@\58\35\2?;\3\2\2\2"+
		"?<\3\2\2\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BD\3\2\2\2"+
		"CA\3\2\2\2DE\7\2\2\3E\3\3\2\2\2FG\7\6\2\2GH\7$\2\2HI\t\2\2\2IJ\7%\2\2"+
		"J\5\3\2\2\2KL\7\7\2\2LM\5\b\5\2MN\7%\2\2N\7\3\2\2\2OT\5\n\6\2PQ\7\5\2"+
		"\2QS\5\n\6\2RP\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\t\3\2\2\2VT\3\2"+
		"\2\2W[\7.\2\2XZ\t\3\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\13"+
		"\3\2\2\2][\3\2\2\2^_\7\b\2\2_`\5\16\b\2`a\7$\2\2ab\5\20\t\2bc\7%\2\2c"+
		"\r\3\2\2\2dj\5\n\6\2ef\7 \2\2fg\5\b\5\2gh\7!\2\2hj\3\2\2\2id\3\2\2\2i"+
		"e\3\2\2\2jo\3\2\2\2kl\7\5\2\2ln\5\n\6\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\17\3\2\2\2qo\3\2\2\2r\u0080\5\b\5\2su\t\4\2\2ts\3\2\2\2tu"+
		"\3\2\2\2uv\3\2\2\2v\u0080\5\22\n\2wy\t\4\2\2xw\3\2\2\2xy\3\2\2\2yz\3\2"+
		"\2\2z\u0080\5\24\13\2{~\5\26\f\2|~\5\30\r\2}{\3\2\2\2}|\3\2\2\2~\u0080"+
		"\3\2\2\2\177r\3\2\2\2\177t\3\2\2\2\177x\3\2\2\2\177}\3\2\2\2\u0080\21"+
		"\3\2\2\2\u0081\u0083\7/\2\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\23\3\2\2\2\u0086\u0088\7/\2\2"+
		"\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a"+
		"\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\7\5\2\2\u008c\u008e\7/\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\25\3\2\2\2\u0091\u0093\7&\2\2\u0092\u0094\7.\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0097\u0098\7&\2\2\u0098\27\3\2\2\2\u0099\u009a\t\5\2\2"+
		"\u009a\31\3\2\2\2\u009b\u009f\5\34\17\2\u009c\u009f\5 \21\2\u009d\u009f"+
		"\5*\26\2\u009e\u009b\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\33\3\2\2"+
		"\2\u00a2\u00a3\7\t\2\2\u00a3\u00a4\5\n\6\2\u00a4\u00a8\7\"\2\2\u00a5\u00a7"+
		"\5\36\20\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2"+
		"\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ac"+
		"\7#\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\5\n\6\2\u00af"+
		"\u00b0\7 \2\2\u00b0\u00b1\5\b\5\2\u00b1\u00b2\7!\2\2\u00b2\u00b3\7\r\2"+
		"\2\u00b3\u00b4\7 \2\2\u00b4\u00b5\5\b\5\2\u00b5\u00b6\7!\2\2\u00b6\u00b7"+
		"\7%\2\2\u00b7\37\3\2\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5\n\6\2\u00ba"+
		"\u00bb\5\"\22\2\u00bb!\3\2\2\2\u00bc\u00c5\7\"\2\2\u00bd\u00c4\5$\23\2"+
		"\u00be\u00c4\5*\26\2\u00bf\u00c4\5 \21\2\u00c0\u00c4\5\60\31\2\u00c1\u00c4"+
		"\5\64\33\2\u00c2\u00c4\58\35\2\u00c3\u00bd\3\2\2\2\u00c3\u00be\3\2\2\2"+
		"\u00c3\u00bf\3\2\2\2\u00c3\u00c0\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9#\3\2\2\2\u00ca"+
		"\u00cc\7\f\2\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7$\2\2\u00d0"+
		"\u00d1\7/\2\2\u00d1\u00d2\7%\2\2\u00d2%\3\2\2\2\u00d3\u00d6\5(\25\2\u00d4"+
		"\u00d6\5\b\5\2\u00d5\u00d3\3\2\2\2\u00d5\u00d4\3\2\2\2\u00d6\'\3\2\2\2"+
		"\u00d7\u00d8\t\6\2\2\u00d8)\3\2\2\2\u00d9\u00da\7\35\2\2\u00da\u00db\5"+
		"\n\6\2\u00db\u00dc\5,\27\2\u00dc+\3\2\2\2\u00dd\u00e2\7#\2\2\u00de\u00e1"+
		"\5.\30\2\u00df\u00e1\58\35\2\u00e0\u00de\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3-\3\2\2\2"+
		"\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\7$\2\2\u00e7\u00e8"+
		"\7/\2\2\u00e8\u00e9\7%\2\2\u00e9/\3\2\2\2\u00ea\u00eb\7\36\2\2\u00eb\u00ec"+
		"\5\n\6\2\u00ec\u00f1\7#\2\2\u00ed\u00f0\5\62\32\2\u00ee\u00f0\58\35\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\61\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4"+
		"\u00f5\5\n\6\2\u00f5\u00f6\7$\2\2\u00f6\u00f7\7/\2\2\u00f7\u00f8\7%\2"+
		"\2\u00f8\63\3\2\2\2\u00f9\u00fa\7\37\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc"+
		"\5\66\34\2\u00fc\u00fd\7+\2\2\u00fd\u00fe\5(\25\2\u00fe\u00ff\7*\2\2\u00ff"+
		"\u0100\5\n\6\2\u0100\u0101\7$\2\2\u0101\u0102\7/\2\2\u0102\u0103\7%\2"+
		"\2\u0103\65\3\2\2\2\u0104\u0105\t\7\2\2\u0105\67\3\2\2\2\u0106\u0107\7"+
		"%\2\2\u01079\3\2\2\2\33?AT[iotx}\177\u0084\u0089\u008f\u0095\u009e\u00a0"+
		"\u00a8\u00c3\u00c5\u00cb\u00d5\u00e0\u00e2\u00ef\u00f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
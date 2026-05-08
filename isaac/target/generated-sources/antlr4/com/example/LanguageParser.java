// Generated from com\example\Language.g4 by ANTLR 4.9.2
package com.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T_ID=1, SACRIFICE=2, PAYBACK=3, PAYSAC=4, CONTINUUM=5, IMP_TOKEN=6, BATTERY=7, 
		OP_RESTA=8, DIPLOPIA=9, DIVORCEPAPERS=10, EQUALITY=11, DEMONDEAL=12, ANGELDEAL=13, 
		OP_ASIG=14, TRAPDOOR=15, MAYOR_QUE=16, MENOR_QUE=17, NOT=18, PAREN_ABRE=19, 
		PAREN_CIERRA=20, LLAVE_ABRE=21, LLAVE_CIERRA=22, CARDS=23, RUNES=24, WHITECARD=25, 
		WS=26;
	public static final int
		RULE_programa = 0, RULE_instruccion = 1, RULE_ifStmt = 2, RULE_forStmt = 3, 
		RULE_bloque = 4, RULE_condicional = 5, RULE_asignacion = 6, RULE_imprimir = 7, 
		RULE_expresion = 8, RULE_termino = 9, RULE_factor = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instruccion", "ifStmt", "forStmt", "bloque", "condicional", 
			"asignacion", "imprimir", "expresion", "termino", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'SACRIFICE'", "'PAYBACK'", "'PAYSAC'", "'CONTINUUM'", null, 
			"'BATTERY'", "'-'", "'DIPLOPIA'", "'DIVORCEPAPERS'", "'EQUALITY'", "'DEMONDEAL'", 
			"'ANGELDEAL'", "'='", "'TRAPDOOR'", "'>'", "'<'", "'!'", "'('", "')'", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "T_ID", "SACRIFICE", "PAYBACK", "PAYSAC", "CONTINUUM", "IMP_TOKEN", 
			"BATTERY", "OP_RESTA", "DIPLOPIA", "DIVORCEPAPERS", "EQUALITY", "DEMONDEAL", 
			"ANGELDEAL", "OP_ASIG", "TRAPDOOR", "MAYOR_QUE", "MENOR_QUE", "NOT", 
			"PAREN_ABRE", "PAREN_CIERRA", "LLAVE_ABRE", "LLAVE_CIERRA", "CARDS", 
			"RUNES", "WHITECARD", "WS"
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				instruccion();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ID) | (1L << SACRIFICE) | (1L << CONTINUUM) | (1L << IMP_TOKEN) | (1L << NOT) | (1L << PAREN_ABRE) | (1L << CARDS) | (1L << WHITECARD))) != 0) );
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

	public static class InstruccionContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public TerminalNode TRAPDOOR() { return getToken(LanguageParser.TRAPDOOR, 0); }
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				asignacion();
				setState(28);
				match(TRAPDOOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				imprimir();
				setState(31);
				match(TRAPDOOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				expresion();
				setState(34);
				match(TRAPDOOR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				condicional(0);
				setState(37);
				match(TRAPDOOR);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				ifStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(40);
				forStmt();
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

	public static class IfStmtContext extends ParserRuleContext {
		public TerminalNode SACRIFICE() { return getToken(LanguageParser.SACRIFICE, 0); }
		public List<TerminalNode> PAREN_ABRE() { return getTokens(LanguageParser.PAREN_ABRE); }
		public TerminalNode PAREN_ABRE(int i) {
			return getToken(LanguageParser.PAREN_ABRE, i);
		}
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<TerminalNode> PAREN_CIERRA() { return getTokens(LanguageParser.PAREN_CIERRA); }
		public TerminalNode PAREN_CIERRA(int i) {
			return getToken(LanguageParser.PAREN_CIERRA, i);
		}
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<TerminalNode> PAYSAC() { return getTokens(LanguageParser.PAYSAC); }
		public TerminalNode PAYSAC(int i) {
			return getToken(LanguageParser.PAYSAC, i);
		}
		public TerminalNode PAYBACK() { return getToken(LanguageParser.PAYBACK, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(SACRIFICE);
			setState(44);
			match(PAREN_ABRE);
			setState(45);
			condicional(0);
			setState(46);
			match(PAREN_CIERRA);
			setState(47);
			bloque();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PAYSAC) {
				{
				{
				setState(48);
				match(PAYSAC);
				setState(49);
				match(PAREN_ABRE);
				setState(50);
				condicional(0);
				setState(51);
				match(PAREN_CIERRA);
				setState(52);
				bloque();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PAYBACK) {
				{
				setState(59);
				match(PAYBACK);
				setState(60);
				bloque();
				}
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

	public static class ForStmtContext extends ParserRuleContext {
		public TerminalNode CONTINUUM() { return getToken(LanguageParser.CONTINUUM, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(LanguageParser.PAREN_ABRE, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> TRAPDOOR() { return getTokens(LanguageParser.TRAPDOOR); }
		public TerminalNode TRAPDOOR(int i) {
			return getToken(LanguageParser.TRAPDOOR, i);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(LanguageParser.PAREN_CIERRA, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(CONTINUUM);
			setState(64);
			match(PAREN_ABRE);
			setState(65);
			asignacion();
			setState(66);
			match(TRAPDOOR);
			setState(67);
			condicional(0);
			setState(68);
			match(TRAPDOOR);
			setState(69);
			asignacion();
			setState(70);
			match(PAREN_CIERRA);
			setState(71);
			bloque();
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LLAVE_ABRE);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T_ID) | (1L << SACRIFICE) | (1L << CONTINUUM) | (1L << IMP_TOKEN) | (1L << NOT) | (1L << PAREN_ABRE) | (1L << CARDS) | (1L << WHITECARD))) != 0)) {
				{
				{
				setState(74);
				instruccion();
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
			match(LLAVE_CIERRA);
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

	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LanguageParser.NOT, 0); }
		public List<CondicionalContext> condicional() {
			return getRuleContexts(CondicionalContext.class);
		}
		public CondicionalContext condicional(int i) {
			return getRuleContext(CondicionalContext.class,i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYOR_QUE() { return getToken(LanguageParser.MAYOR_QUE, 0); }
		public TerminalNode MENOR_QUE() { return getToken(LanguageParser.MENOR_QUE, 0); }
		public TerminalNode EQUALITY() { return getToken(LanguageParser.EQUALITY, 0); }
		public TerminalNode DEMONDEAL() { return getToken(LanguageParser.DEMONDEAL, 0); }
		public TerminalNode ANGELDEAL() { return getToken(LanguageParser.ANGELDEAL, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitCondicional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitCondicional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		return condicional(0);
	}

	private CondicionalContext condicional(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionalContext _localctx = new CondicionalContext(_ctx, _parentState);
		CondicionalContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_condicional, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(83);
				match(NOT);
				setState(84);
				condicional(2);
				}
				break;
			case PAREN_ABRE:
			case CARDS:
			case WHITECARD:
				{
				setState(85);
				expresion();
				setState(86);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALITY) | (1L << MAYOR_QUE) | (1L << MENOR_QUE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(87);
				expresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new CondicionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicional);
						setState(91);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(92);
						match(DEMONDEAL);
						setState(93);
						condicional(5);
						}
						break;
					case 2:
						{
						_localctx = new CondicionalContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condicional);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						match(ANGELDEAL);
						setState(96);
						condicional(4);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode T_ID() { return getToken(LanguageParser.T_ID, 0); }
		public TerminalNode WHITECARD() { return getToken(LanguageParser.WHITECARD, 0); }
		public TerminalNode OP_ASIG() { return getToken(LanguageParser.OP_ASIG, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T_ID);
			setState(103);
			match(WHITECARD);
			setState(104);
			match(OP_ASIG);
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(105);
				expresion();
				}
				break;
			case 2:
				{
				setState(106);
				condicional(0);
				}
				break;
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

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode IMP_TOKEN() { return getToken(LanguageParser.IMP_TOKEN, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(LanguageParser.PAREN_ABRE, 0); }
		public TerminalNode PAREN_CIERRA() { return getToken(LanguageParser.PAREN_CIERRA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public TerminalNode RUNES() { return getToken(LanguageParser.RUNES, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_imprimir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(IMP_TOKEN);
			setState(110);
			match(PAREN_ABRE);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111);
				expresion();
				}
				break;
			case 2:
				{
				setState(112);
				condicional(0);
				}
				break;
			case 3:
				{
				setState(113);
				match(RUNES);
				}
				break;
			}
			setState(116);
			match(PAREN_CIERRA);
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

	public static class ExpresionContext extends ParserRuleContext {
		public List<TerminoContext> termino() {
			return getRuleContexts(TerminoContext.class);
		}
		public TerminoContext termino(int i) {
			return getRuleContext(TerminoContext.class,i);
		}
		public List<TerminalNode> BATTERY() { return getTokens(LanguageParser.BATTERY); }
		public TerminalNode BATTERY(int i) {
			return getToken(LanguageParser.BATTERY, i);
		}
		public List<TerminalNode> OP_RESTA() { return getTokens(LanguageParser.OP_RESTA); }
		public TerminalNode OP_RESTA(int i) {
			return getToken(LanguageParser.OP_RESTA, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expresion);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			termino();
			setState(123);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					_la = _input.LA(1);
					if ( !(_la==BATTERY || _la==OP_RESTA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(120);
					termino();
					}
					} 
				}
				setState(125);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TerminoContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> DIPLOPIA() { return getTokens(LanguageParser.DIPLOPIA); }
		public TerminalNode DIPLOPIA(int i) {
			return getToken(LanguageParser.DIPLOPIA, i);
		}
		public List<TerminalNode> DIVORCEPAPERS() { return getTokens(LanguageParser.DIVORCEPAPERS); }
		public TerminalNode DIVORCEPAPERS(int i) {
			return getToken(LanguageParser.DIVORCEPAPERS, i);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_termino);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			factor();
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					_la = _input.LA(1);
					if ( !(_la==DIPLOPIA || _la==DIVORCEPAPERS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(128);
					factor();
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode CARDS() { return getToken(LanguageParser.CARDS, 0); }
		public TerminalNode WHITECARD() { return getToken(LanguageParser.WHITECARD, 0); }
		public TerminalNode PAREN_ABRE() { return getToken(LanguageParser.PAREN_ABRE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAREN_CIERRA() { return getToken(LanguageParser.PAREN_CIERRA, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LanguageListener ) ((LanguageListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LanguageVisitor ) return ((LanguageVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CARDS:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(CARDS);
				}
				break;
			case WHITECARD:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				match(WHITECARD);
				}
				break;
			case PAREN_ABRE:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				match(PAREN_ABRE);
				setState(137);
				expresion();
				setState(138);
				match(PAREN_CIERRA);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return condicional_sempred((CondicionalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicional_sempred(CondicionalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\34\u0091\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3,\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\49\n\4\f\4\16\4<\13\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7d\n\7\f\7\16"+
		"\7g\13\7\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\t\3\t\5\tu\n\t\3\t"+
		"\3\t\3\n\3\n\3\n\7\n|\n\n\f\n\16\n\177\13\n\3\13\3\13\3\13\7\13\u0084"+
		"\n\13\f\13\16\13\u0087\13\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3\f"+
		"\2\3\f\r\2\4\6\b\n\f\16\20\22\24\26\2\5\4\2\r\r\22\23\3\2\t\n\3\2\13\f"+
		"\2\u0098\2\31\3\2\2\2\4+\3\2\2\2\6-\3\2\2\2\bA\3\2\2\2\nK\3\2\2\2\f[\3"+
		"\2\2\2\16h\3\2\2\2\20o\3\2\2\2\22x\3\2\2\2\24\u0080\3\2\2\2\26\u008e\3"+
		"\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\3\3\2\2\2\35\36\5\16\b\2\36\37\7\21\2\2\37,\3\2\2\2 !\5\20\t"+
		"\2!\"\7\21\2\2\",\3\2\2\2#$\5\22\n\2$%\7\21\2\2%,\3\2\2\2&\'\5\f\7\2\'"+
		"(\7\21\2\2(,\3\2\2\2),\5\6\4\2*,\5\b\5\2+\35\3\2\2\2+ \3\2\2\2+#\3\2\2"+
		"\2+&\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\5\3\2\2\2-.\7\4\2\2./\7\25\2\2/\60\5"+
		"\f\7\2\60\61\7\26\2\2\61:\5\n\6\2\62\63\7\6\2\2\63\64\7\25\2\2\64\65\5"+
		"\f\7\2\65\66\7\26\2\2\66\67\5\n\6\2\679\3\2\2\28\62\3\2\2\29<\3\2\2\2"+
		":8\3\2\2\2:;\3\2\2\2;?\3\2\2\2<:\3\2\2\2=>\7\5\2\2>@\5\n\6\2?=\3\2\2\2"+
		"?@\3\2\2\2@\7\3\2\2\2AB\7\7\2\2BC\7\25\2\2CD\5\16\b\2DE\7\21\2\2EF\5\f"+
		"\7\2FG\7\21\2\2GH\5\16\b\2HI\7\26\2\2IJ\5\n\6\2J\t\3\2\2\2KO\7\27\2\2"+
		"LN\5\4\3\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2"+
		"RS\7\30\2\2S\13\3\2\2\2TU\b\7\1\2UV\7\24\2\2V\\\5\f\7\4WX\5\22\n\2XY\t"+
		"\2\2\2YZ\5\22\n\2Z\\\3\2\2\2[T\3\2\2\2[W\3\2\2\2\\e\3\2\2\2]^\f\6\2\2"+
		"^_\7\16\2\2_d\5\f\7\7`a\f\5\2\2ab\7\17\2\2bd\5\f\7\6c]\3\2\2\2c`\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\r\3\2\2\2ge\3\2\2\2hi\7\3\2\2ij\7\33"+
		"\2\2jm\7\20\2\2kn\5\22\n\2ln\5\f\7\2mk\3\2\2\2ml\3\2\2\2n\17\3\2\2\2o"+
		"p\7\b\2\2pt\7\25\2\2qu\5\22\n\2ru\5\f\7\2su\7\32\2\2tq\3\2\2\2tr\3\2\2"+
		"\2ts\3\2\2\2uv\3\2\2\2vw\7\26\2\2w\21\3\2\2\2x}\5\24\13\2yz\t\3\2\2z|"+
		"\5\24\13\2{y\3\2\2\2|\177\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\23\3\2\2\2\177"+
		"}\3\2\2\2\u0080\u0085\5\26\f\2\u0081\u0082\t\4\2\2\u0082\u0084\5\26\f"+
		"\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\25\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008f\7\31\2\2\u0089"+
		"\u008f\7\33\2\2\u008a\u008b\7\25\2\2\u008b\u008c\5\22\n\2\u008c\u008d"+
		"\7\26\2\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008e\u0089\3\2\2\2"+
		"\u008e\u008a\3\2\2\2\u008f\27\3\2\2\2\17\33+:?O[cemt}\u0085\u008e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
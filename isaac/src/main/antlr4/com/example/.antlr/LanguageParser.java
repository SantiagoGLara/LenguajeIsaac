// Generated from c:/Users/reliv/Downloads/LenguajeIsaac/isaac/src/main/antlr4/com/example/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 42729574L) != 0) );
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 42729574L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 198656L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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
		"\u0004\u0001\u001a\u008f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000"+
		"\u0018\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001*\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u00027\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002>\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0005\u0004L\b\u0004\n\u0004\f\u0004O\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005Z\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005b\b\u0005\n\u0005\f\u0005e\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007s\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\bz\b\b\n\b\f\b}\t\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0082\b\t\n\t\f\t\u0085\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008d\b\n\u0001\n\u0000\u0001"+
		"\n\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003"+
		"\u0002\u0000\u000b\u000b\u0010\u0011\u0001\u0000\u0007\b\u0001\u0000\t"+
		"\n\u0096\u0000\u0017\u0001\u0000\u0000\u0000\u0002)\u0001\u0000\u0000"+
		"\u0000\u0004+\u0001\u0000\u0000\u0000\u0006?\u0001\u0000\u0000\u0000\b"+
		"I\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000"+
		"\u0000\u000em\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000\u0012"+
		"~\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000\u0016\u0018"+
		"\u0003\u0002\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u0001\u0001\u0000\u0000\u0000\u001b\u001c"+
		"\u0003\f\u0006\u0000\u001c\u001d\u0005\u000f\u0000\u0000\u001d*\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u000e\u0007\u0000\u001f \u0005\u000f"+
		"\u0000\u0000 *\u0001\u0000\u0000\u0000!\"\u0003\u0010\b\u0000\"#\u0005"+
		"\u000f\u0000\u0000#*\u0001\u0000\u0000\u0000$%\u0003\n\u0005\u0000%&\u0005"+
		"\u000f\u0000\u0000&*\u0001\u0000\u0000\u0000\'*\u0003\u0004\u0002\u0000"+
		"(*\u0003\u0006\u0003\u0000)\u001b\u0001\u0000\u0000\u0000)\u001e\u0001"+
		"\u0000\u0000\u0000)!\u0001\u0000\u0000\u0000)$\u0001\u0000\u0000\u0000"+
		")\'\u0001\u0000\u0000\u0000)(\u0001\u0000\u0000\u0000*\u0003\u0001\u0000"+
		"\u0000\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u0013\u0000\u0000-.\u0003"+
		"\n\u0005\u0000./\u0005\u0014\u0000\u0000/8\u0003\b\u0004\u000001\u0005"+
		"\u0004\u0000\u000012\u0005\u0013\u0000\u000023\u0003\n\u0005\u000034\u0005"+
		"\u0014\u0000\u000045\u0003\b\u0004\u000057\u0001\u0000\u0000\u000060\u0001"+
		"\u0000\u0000\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u00009=\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000"+
		"\u0000;<\u0005\u0003\u0000\u0000<>\u0003\b\u0004\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>\u0005\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0005\u0000\u0000@A\u0005\u0013\u0000\u0000AB\u0003\f\u0006\u0000BC\u0005"+
		"\u000f\u0000\u0000CD\u0003\n\u0005\u0000DE\u0005\u000f\u0000\u0000EF\u0003"+
		"\f\u0006\u0000FG\u0005\u0014\u0000\u0000GH\u0003\b\u0004\u0000H\u0007"+
		"\u0001\u0000\u0000\u0000IM\u0005\u0015\u0000\u0000JL\u0003\u0002\u0001"+
		"\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000PQ\u0005\u0016\u0000\u0000Q\t\u0001\u0000\u0000\u0000"+
		"RS\u0006\u0005\uffff\uffff\u0000ST\u0005\u0012\u0000\u0000TZ\u0003\n\u0005"+
		"\u0002UV\u0003\u0010\b\u0000VW\u0007\u0000\u0000\u0000WX\u0003\u0010\b"+
		"\u0000XZ\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000Zc\u0001\u0000\u0000\u0000[\\\n\u0004\u0000\u0000\\]\u0005"+
		"\f\u0000\u0000]b\u0003\n\u0005\u0005^_\n\u0003\u0000\u0000_`\u0005\r\u0000"+
		"\u0000`b\u0003\n\u0005\u0004a[\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000"+
		"\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000"+
		"\u0000\u0000d\u000b\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0001\u0000\u0000gh\u0005\u0019\u0000\u0000hk\u0005\u000e\u0000"+
		"\u0000il\u0003\u0010\b\u0000jl\u0003\n\u0005\u0000ki\u0001\u0000\u0000"+
		"\u0000kj\u0001\u0000\u0000\u0000l\r\u0001\u0000\u0000\u0000mn\u0005\u0006"+
		"\u0000\u0000nr\u0005\u0013\u0000\u0000os\u0003\u0010\b\u0000ps\u0003\n"+
		"\u0005\u0000qs\u0005\u0018\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001"+
		"\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0014\u0000\u0000u\u000f\u0001\u0000\u0000\u0000v{\u0003\u0012"+
		"\t\u0000wx\u0007\u0001\u0000\u0000xz\u0003\u0012\t\u0000yw\u0001\u0000"+
		"\u0000\u0000z}\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0011\u0001\u0000\u0000\u0000}{\u0001\u0000\u0000"+
		"\u0000~\u0083\u0003\u0014\n\u0000\u007f\u0080\u0007\u0002\u0000\u0000"+
		"\u0080\u0082\u0003\u0014\n\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082"+
		"\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0086\u008d\u0005\u0017\u0000\u0000\u0087"+
		"\u008d\u0005\u0019\u0000\u0000\u0088\u0089\u0005\u0013\u0000\u0000\u0089"+
		"\u008a\u0003\u0010\b\u0000\u008a\u008b\u0005\u0014\u0000\u0000\u008b\u008d"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0087"+
		"\u0001\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d\u0015"+
		"\u0001\u0000\u0000\u0000\r\u0019)8=MYackr{\u0083\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
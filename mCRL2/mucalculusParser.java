// Generated from info/remenska/PASS/monitor/mCRL2/mucalculus.g4 by ANTLR 4.1
package info.remenska.PASS.monitor.mCRL2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class mucalculusParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__66=1, T__65=2, T__64=3, T__63=4, T__62=5, T__61=6, T__60=7, T__59=8, 
		T__58=9, T__57=10, T__56=11, T__55=12, T__54=13, T__53=14, T__52=15, T__51=16, 
		T__50=17, T__49=18, T__48=19, T__47=20, T__46=21, T__45=22, T__44=23, 
		T__43=24, T__42=25, T__41=26, T__40=27, T__39=28, T__38=29, T__37=30, 
		T__36=31, T__35=32, T__34=33, T__33=34, T__32=35, T__31=36, T__30=37, 
		T__29=38, T__28=39, T__27=40, T__26=41, T__25=42, T__24=43, T__23=44, 
		T__22=45, T__21=46, T__20=47, T__19=48, T__18=49, T__17=50, T__16=51, 
		T__15=52, T__14=53, T__13=54, T__12=55, T__11=56, T__10=57, T__9=58, T__8=59, 
		T__7=60, T__6=61, T__5=62, T__4=63, T__3=64, T__2=65, T__1=66, T__0=67, 
		ID=68, INT=69, WS=70, LINE_COMMENT=71;
	public static final String[] tokenNames = {
		"<INVALID>", "'eqn'", "'*'", "'['", "'<'", "'List'", "'false'", "'!='", 
		"'<='", "'Bool'", "'nil'", "'cons'", "'}'", "'->'", "')'", "'Nat'", "'whr'", 
		"'Bag'", "'@'", "'Pos'", "'map'", "'='", "'div'", "'FSet'", "'Int'", "'yaled'", 
		"'val'", "'mod'", "'|'", "'!'", "']'", "'lambda'", "'in'", "','", "'-'", 
		"'('", "':'", "'var'", "'?'", "'{'", "'sort'", "'|>'", "'true'", "'++'", 
		"'struct'", "'<|'", "'Set'", "'tau'", "'.'", "'=>'", "'+'", "'glob'", 
		"'forall'", "';'", "'&&'", "'delay'", "'nu'", "'||'", "'exists'", "'>'", 
		"'Real'", "'FBag'", "'=='", "'/'", "'>='", "'#'", "'end'", "'mu'", "ID", 
		"INT", "WS", "LINE_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_fixedPointOperator = 1, RULE_besVar = 2, RULE_dataValExpr = 3, 
		RULE_actFrm = 4, RULE_regFrm = 5, RULE_stateFrm = 6, RULE_stateVarDecl = 7, 
		RULE_stateVarAssignment = 8, RULE_stateVarAssignmentList = 9, RULE_varsDeclList = 10, 
		RULE_dataExprList = 11, RULE_dataExpr = 12, RULE_multAct = 13, RULE_varsDecl = 14, 
		RULE_bagEnumEltList = 15, RULE_bagEnumElt = 16, RULE_assignmentList = 17, 
		RULE_varDecl = 18, RULE_idList = 19, RULE_actionList = 20, RULE_sortExpr = 21, 
		RULE_assignment = 22, RULE_action = 23, RULE_simpleSortExpr = 24, RULE_hashArgs = 25, 
		RULE_constrDeclList = 26, RULE_constrDecl = 27, RULE_projDecl = 28, RULE_projDeclList = 29, 
		RULE_dataSpec = 30, RULE_globVarSpec = 31, RULE_varSpec = 32, RULE_eqnSpec = 33, 
		RULE_eqnDecl = 34, RULE_sortSpec = 35, RULE_consSpec = 36, RULE_mapSpec = 37, 
		RULE_sortDecl = 38, RULE_idsDecl = 39;
	public static final String[] ruleNames = {
		"start", "fixedPointOperator", "besVar", "dataValExpr", "actFrm", "regFrm", 
		"stateFrm", "stateVarDecl", "stateVarAssignment", "stateVarAssignmentList", 
		"varsDeclList", "dataExprList", "dataExpr", "multAct", "varsDecl", "bagEnumEltList", 
		"bagEnumElt", "assignmentList", "varDecl", "idList", "actionList", "sortExpr", 
		"assignment", "action", "simpleSortExpr", "hashArgs", "constrDeclList", 
		"constrDecl", "projDecl", "projDeclList", "dataSpec", "globVarSpec", "varSpec", 
		"eqnSpec", "eqnDecl", "sortSpec", "consSpec", "mapSpec", "sortDecl", "idsDecl"
	};

	@Override
	public String getGrammarFileName() { return "mucalculus.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public mucalculusParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); stateFrm(0);
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

	public static class FixedPointOperatorContext extends ParserRuleContext {
		public FixedPointOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixedPointOperator; }
	 
		public FixedPointOperatorContext() { }
		public void copyFrom(FixedPointOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MuOperatorContext extends FixedPointOperatorContext {
		public MuOperatorContext(FixedPointOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMuOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMuOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMuOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NuOperatorContext extends FixedPointOperatorContext {
		public NuOperatorContext(FixedPointOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNuOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNuOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNuOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixedPointOperatorContext fixedPointOperator() throws RecognitionException {
		FixedPointOperatorContext _localctx = new FixedPointOperatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fixedPointOperator);
		try {
			setState(84);
			switch (_input.LA(1)) {
			case 67:
				_localctx = new MuOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(82); match(67);
				}
				break;
			case 56:
				_localctx = new NuOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(56);
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

	public static class BesVarContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public BesVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_besVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBesVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBesVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBesVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BesVarContext besVar() throws RecognitionException {
		BesVarContext _localctx = new BesVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_besVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(ID);
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

	public static class DataValExprContext extends ParserRuleContext {
		public DataExprContext myDataExpr;
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public DataValExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataValExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDataValExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDataValExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDataValExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataValExprContext dataValExpr() throws RecognitionException {
		DataValExprContext _localctx = new DataValExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_dataValExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(26);
			setState(89); match(35);
			setState(90); ((DataValExprContext)_localctx).myDataExpr = dataExpr(0);
			setState(91); match(14);
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

	public static class ActFrmContext extends ParserRuleContext {
		public int _p;
		public ActFrmContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ActFrmContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_actFrm; }
	 
		public ActFrmContext() { }
		public void copyFrom(ActFrmContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class AtOperatorActionFrmContext extends ActFrmContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public AtOperatorActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAtOperatorActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAtOperatorActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAtOperatorActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicationContext extends ActFrmContext {
		public ActFrmContext actFrm(int i) {
			return getRuleContext(ActFrmContext.class,i);
		}
		public List<ActFrmContext> actFrm() {
			return getRuleContexts(ActFrmContext.class);
		}
		public ImplicationContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterImplication(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitImplication(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitImplication(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistentialQuantifierActionFrmContext extends ActFrmContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public ExistentialQuantifierActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterExistentialQuantifierActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitExistentialQuantifierActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitExistentialQuantifierActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseActionFrmContext extends ActFrmContext {
		public FalseActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFalseActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFalseActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFalseActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionOfActionsContext extends ActFrmContext {
		public ActFrmContext actFrm(int i) {
			return getRuleContext(ActFrmContext.class,i);
		}
		public List<ActFrmContext> actFrm() {
			return getRuleContexts(ActFrmContext.class);
		}
		public UnionOfActionsContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterUnionOfActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitUnionOfActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitUnionOfActions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataValueExpressionActionFrmContext extends ActFrmContext {
		public DataValExprContext dataValExpr() {
			return getRuleContext(DataValExprContext.class,0);
		}
		public DataValueExpressionActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDataValueExpressionActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDataValueExpressionActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDataValueExpressionActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntersectionOfActionsContext extends ActFrmContext {
		public ActFrmContext actFrm(int i) {
			return getRuleContext(ActFrmContext.class,i);
		}
		public List<ActFrmContext> actFrm() {
			return getRuleContexts(ActFrmContext.class);
		}
		public IntersectionOfActionsContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIntersectionOfActions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIntersectionOfActions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIntersectionOfActions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsActionFrmContext extends ActFrmContext {
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public BracketsActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBracketsActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBracketsActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBracketsActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiActionContext extends ActFrmContext {
		public MultActContext multAct() {
			return getRuleContext(MultActContext.class,0);
		}
		public MultiActionContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMultiAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMultiAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMultiAction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniversalQuantifierActionFrmContext extends ActFrmContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public UniversalQuantifierActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterUniversalQuantifierActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitUniversalQuantifierActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitUniversalQuantifierActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueActionFrmContext extends ActFrmContext {
		public TrueActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterTrueActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitTrueActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitTrueActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationActionFrmContext extends ActFrmContext {
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public NegationActionFrmContext(ActFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNegationActionFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNegationActionFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNegationActionFrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActFrmContext actFrm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ActFrmContext _localctx = new ActFrmContext(_ctx, _parentState, _p);
		ActFrmContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_actFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			switch (_input.LA(1)) {
			case 29:
				{
				_localctx = new NegationActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(94); match(29);
				setState(95); actFrm(7);
				}
				break;
			case 52:
				{
				_localctx = new UniversalQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96); match(52);
				setState(97); varsDeclList();
				setState(98); match(48);
				setState(99); actFrm(6);
				}
				break;
			case 58:
				{
				_localctx = new ExistentialQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(58);
				setState(102); varsDeclList();
				setState(103); match(48);
				setState(104); actFrm(5);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(106); dataValExpr();
				}
				break;
			case 35:
				{
				_localctx = new BracketsActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(107); match(35);
				setState(108); actFrm(0);
				setState(109); match(14);
				}
				break;
			case 47:
			case ID:
				{
				_localctx = new MultiActionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(111); multAct();
				}
				break;
			case 42:
				{
				_localctx = new TrueActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(112); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(113); match(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(128);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(116);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(117); match(54);
						setState(118); actFrm(4);
						}
						break;

					case 2:
						{
						_localctx = new UnionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(119);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(120); match(57);
						setState(121); actFrm(3);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(122);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(123); match(49);
						setState(124); actFrm(2);
						}
						break;

					case 4:
						{
						_localctx = new AtOperatorActionFrmContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(125);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(126); match(18);
						setState(127); dataExpr(0);
						}
						break;
					}
					} 
				}
				setState(132);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RegFrmContext extends ParserRuleContext {
		public int _p;
		public RegFrmContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RegFrmContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_regFrm; }
	 
		public RegFrmContext() { }
		public void copyFrom(RegFrmContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class IterationRegFormContext extends RegFrmContext {
		public RegFrmContext regFrm() {
			return getRuleContext(RegFrmContext.class,0);
		}
		public IterationRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIterationRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIterationRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIterationRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NilRegFormContext extends RegFrmContext {
		public NilRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNilRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNilRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNilRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NonEmptyIterationRegFormContext extends RegFrmContext {
		public RegFrmContext regFrm() {
			return getRuleContext(RegFrmContext.class,0);
		}
		public NonEmptyIterationRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNonEmptyIterationRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNonEmptyIterationRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNonEmptyIterationRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlternativeCompositionRegFormContext extends RegFrmContext {
		public List<RegFrmContext> regFrm() {
			return getRuleContexts(RegFrmContext.class);
		}
		public RegFrmContext regFrm(int i) {
			return getRuleContext(RegFrmContext.class,i);
		}
		public AlternativeCompositionRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAlternativeCompositionRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAlternativeCompositionRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAlternativeCompositionRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ActionFormulaRegFormContext extends RegFrmContext {
		public ActFrmContext actFrm() {
			return getRuleContext(ActFrmContext.class,0);
		}
		public ActionFormulaRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterActionFormulaRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitActionFormulaRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitActionFormulaRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SequentialCompositionRegFormContext extends RegFrmContext {
		public Token mySeqSign;
		public List<RegFrmContext> regFrm() {
			return getRuleContexts(RegFrmContext.class);
		}
		public RegFrmContext regFrm(int i) {
			return getRuleContext(RegFrmContext.class,i);
		}
		public SequentialCompositionRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSequentialCompositionRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSequentialCompositionRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSequentialCompositionRegForm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsRegFormContext extends RegFrmContext {
		public RegFrmContext regFrm() {
			return getRuleContext(RegFrmContext.class,0);
		}
		public BracketsRegFormContext(RegFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBracketsRegForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBracketsRegForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBracketsRegForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegFrmContext regFrm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RegFrmContext _localctx = new RegFrmContext(_ctx, _parentState, _p);
		RegFrmContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, RULE_regFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(134); match(35);
				setState(135); regFrm(0);
				setState(136); match(14);
				}
				break;

			case 2:
				{
				_localctx = new ActionFormulaRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); actFrm(0);
				}
				break;

			case 3:
				{
				_localctx = new NilRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139); match(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new SequentialCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(142);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(143); ((SequentialCompositionRegFormContext)_localctx).mySeqSign = match(48);
						setState(144); regFrm(3);
						}
						break;

					case 2:
						{
						_localctx = new AlternativeCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(145);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(146); match(50);
						setState(147); regFrm(2);
						}
						break;

					case 3:
						{
						_localctx = new IterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(148);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(149); match(2);
						}
						break;

					case 4:
						{
						_localctx = new NonEmptyIterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(150);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(151); match(50);
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class StateFrmContext extends ParserRuleContext {
		public int _p;
		public StateFrmContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StateFrmContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_stateFrm; }
	 
		public StateFrmContext() { }
		public void copyFrom(StateFrmContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ImplicationStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm(int i) {
			return getRuleContext(StateFrmContext.class,i);
		}
		public List<StateFrmContext> stateFrm() {
			return getRuleContexts(StateFrmContext.class);
		}
		public ImplicationStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterImplicationStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitImplicationStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitImplicationStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public BracketsStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBracketsStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBracketsStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBracketsStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PBESVariableStateFrmContext extends StateFrmContext {
		public DataExprListContext dataExprList() {
			return getRuleContext(DataExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public PBESVariableStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterPBESVariableStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitPBESVariableStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitPBESVariableStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistentialQuantifierStateFrmContext extends StateFrmContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public ExistentialQuantifierStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterExistentialQuantifierStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitExistentialQuantifierStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitExistentialQuantifierStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DataValueExpressionStateFrmContext extends StateFrmContext {
		public DataValExprContext dataValExpr() {
			return getRuleContext(DataValExprContext.class,0);
		}
		public DataValueExpressionStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDataValueExpressionStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDataValueExpressionStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDataValueExpressionStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjunctionStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm(int i) {
			return getRuleContext(StateFrmContext.class,i);
		}
		public List<StateFrmContext> stateFrm() {
			return getRuleContexts(StateFrmContext.class);
		}
		public ConjunctionStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterConjunctionStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitConjunctionStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitConjunctionStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YaledOpStateFrmContext extends StateFrmContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public YaledOpStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterYaledOpStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitYaledOpStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitYaledOpStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueStateFrmContext extends StateFrmContext {
		public TrueStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterTrueStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitTrueStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitTrueStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DiamondModalityStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public RegFrmContext regFrm() {
			return getRuleContext(RegFrmContext.class,0);
		}
		public DiamondModalityStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDiamondModalityStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDiamondModalityStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDiamondModalityStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoxModalityStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public RegFrmContext regFrm() {
			return getRuleContext(RegFrmContext.class,0);
		}
		public BoxModalityStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBoxModalityStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBoxModalityStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBoxModalityStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseStateFrmContext extends StateFrmContext {
		public FalseStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFalseStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFalseStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFalseStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DelayOpStateFrmContext extends StateFrmContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public DelayOpStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDelayOpStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDelayOpStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDelayOpStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DisjunctionStateFmrContext extends StateFrmContext {
		public StateFrmContext stateFrm(int i) {
			return getRuleContext(StateFrmContext.class,i);
		}
		public List<StateFrmContext> stateFrm() {
			return getRuleContexts(StateFrmContext.class);
		}
		public DisjunctionStateFmrContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDisjunctionStateFmr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDisjunctionStateFmr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDisjunctionStateFmr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NuStateFrmContext extends StateFrmContext {
		public StateVarDeclContext stateVarDecl() {
			return getRuleContext(StateVarDeclContext.class,0);
		}
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public NuStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNuStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNuStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNuStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UniversalQuantifierStateFrmContext extends StateFrmContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public UniversalQuantifierStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterUniversalQuantifierStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitUniversalQuantifierStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitUniversalQuantifierStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationStateFrmContext extends StateFrmContext {
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public NegationStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNegationStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNegationStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNegationStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MuStateFrmContext extends StateFrmContext {
		public StateVarDeclContext stateVarDecl() {
			return getRuleContext(StateVarDeclContext.class,0);
		}
		public StateFrmContext stateFrm() {
			return getRuleContext(StateFrmContext.class,0);
		}
		public MuStateFrmContext(StateFrmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMuStateFrm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMuStateFrm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMuStateFrm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateFrmContext stateFrm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StateFrmContext _localctx = new StateFrmContext(_ctx, _parentState, _p);
		StateFrmContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_stateFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			switch (_input.LA(1)) {
			case 52:
				{
				_localctx = new UniversalQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(158); match(52);
				setState(159); varsDeclList();
				setState(160); match(48);
				setState(161); stateFrm(13);
				}
				break;
			case 58:
				{
				_localctx = new ExistentialQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(58);
				setState(164); varsDeclList();
				setState(165); match(48);
				setState(166); stateFrm(12);
				}
				break;
			case 29:
				{
				_localctx = new NegationStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(168); match(29);
				setState(169); stateFrm(11);
				}
				break;
			case 67:
				{
				_localctx = new MuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(67);
				setState(171); stateVarDecl();
				setState(172); match(48);
				setState(173); stateFrm(10);
				}
				break;
			case 56:
				{
				_localctx = new NuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(56);
				setState(176); stateVarDecl();
				setState(177); match(48);
				setState(178); stateFrm(9);
				}
				break;
			case 3:
				{
				_localctx = new BoxModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); match(3);
				setState(181); regFrm(0);
				setState(182); match(30);
				setState(183); stateFrm(5);
				}
				break;
			case 4:
				{
				_localctx = new DiamondModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185); match(4);
				setState(186); regFrm(0);
				setState(187); match(59);
				setState(188); stateFrm(4);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190); dataValExpr();
				}
				break;
			case 35:
				{
				_localctx = new BracketsStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191); match(35);
				setState(192); stateFrm(0);
				setState(193); match(14);
				}
				break;
			case 42:
				{
				_localctx = new TrueStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196); match(6);
				}
				break;
			case ID:
				{
				_localctx = new PBESVariableStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(ID);
				setState(202);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(198); match(35);
					setState(199); dataExprList();
					setState(200); match(14);
					}
					break;
				}
				}
				break;
			case 55:
				{
				_localctx = new DelayOpStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204); match(55);
				setState(207);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(205); match(18);
					setState(206); dataExpr(0);
					}
					break;
				}
				}
				break;
			case 25:
				{
				_localctx = new YaledOpStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(209); match(25);
				setState(212);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(210); match(18);
					setState(211); dataExpr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(225);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(216);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(217); match(54);
						setState(218); stateFrm(9);
						}
						break;

					case 2:
						{
						_localctx = new DisjunctionStateFmrContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(219);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(220); match(57);
						setState(221); stateFrm(8);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(222);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(223); match(49);
						setState(224); stateFrm(7);
						}
						break;
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class StateVarDeclContext extends ParserRuleContext {
		public StateVarAssignmentListContext stateVarAssignmentList() {
			return getRuleContext(StateVarAssignmentListContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public StateVarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterStateVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitStateVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitStateVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarDeclContext stateVarDecl() throws RecognitionException {
		StateVarDeclContext _localctx = new StateVarDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stateVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(ID);
			setState(235);
			_la = _input.LA(1);
			if (_la==35) {
				{
				setState(231); match(35);
				setState(232); stateVarAssignmentList();
				setState(233); match(14);
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

	public static class StateVarAssignmentContext extends ParserRuleContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public StateVarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterStateVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitStateVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitStateVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarAssignmentContext stateVarAssignment() throws RecognitionException {
		StateVarAssignmentContext _localctx = new StateVarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_stateVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); match(ID);
			setState(238); match(36);
			setState(239); sortExpr();
			setState(240); match(21);
			setState(241); dataExpr(0);
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

	public static class StateVarAssignmentListContext extends ParserRuleContext {
		public List<StateVarAssignmentContext> stateVarAssignment() {
			return getRuleContexts(StateVarAssignmentContext.class);
		}
		public StateVarAssignmentContext stateVarAssignment(int i) {
			return getRuleContext(StateVarAssignmentContext.class,i);
		}
		public StateVarAssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stateVarAssignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterStateVarAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitStateVarAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitStateVarAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateVarAssignmentListContext stateVarAssignmentList() throws RecognitionException {
		StateVarAssignmentListContext _localctx = new StateVarAssignmentListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_stateVarAssignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); stateVarAssignment();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(244); match(33);
				setState(245); stateVarAssignment();
				}
				}
				setState(250);
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

	public static class VarsDeclListContext extends ParserRuleContext {
		public List<VarsDeclContext> varsDecl() {
			return getRuleContexts(VarsDeclContext.class);
		}
		public VarsDeclContext varsDecl(int i) {
			return getRuleContext(VarsDeclContext.class,i);
		}
		public VarsDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterVarsDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitVarsDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitVarsDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsDeclListContext varsDeclList() throws RecognitionException {
		VarsDeclListContext _localctx = new VarsDeclListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varsDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); varsDecl();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(252); match(33);
				setState(253); varsDecl();
				}
				}
				setState(258);
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

	public static class DataExprListContext extends ParserRuleContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public DataExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataExprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDataExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDataExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDataExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataExprListContext dataExprList() throws RecognitionException {
		DataExprListContext _localctx = new DataExprListContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dataExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); dataExpr(0);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(260); match(33);
				setState(261); dataExpr(0);
				}
				}
				setState(266);
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

	public static class DataExprContext extends ParserRuleContext {
		public int _p;
		public DataExprContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DataExprContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_dataExpr; }
	 
		public DataExprContext() { }
		public void copyFrom(DataExprContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class UniversalQuantifierDataExprContext extends DataExprContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public UniversalQuantifierDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterUniversalQuantifierDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitUniversalQuantifierDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitUniversalQuantifierDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetBagComprehensionDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public SetBagComprehensionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSetBagComprehensionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSetBagComprehensionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSetBagComprehensionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AdditionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public AdditionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAdditionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAdditionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAdditionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaDataExprContext extends DataExprContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public LambdaDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterLambdaDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitLambdaDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitLambdaDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListSnocDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ListSnocDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListSnocDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListSnocDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListSnocDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionUpdateDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public FunctionUpdateDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFunctionUpdateDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFunctionUpdateDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFunctionUpdateDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetEnumerationDataExprContext extends DataExprContext {
		public DataExprListContext dataExprList() {
			return getRuleContext(DataExprListContext.class,0);
		}
		public SetEnumerationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSetEnumerationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSetEnumerationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSetEnumerationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListEnumerationDataExprContext extends DataExprContext {
		public DataExprListContext dataExprList() {
			return getRuleContext(DataExprListContext.class,0);
		}
		public ListEnumerationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListEnumerationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListEnumerationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListEnumerationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplicationDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public MultiplicationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMultiplicationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMultiplicationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMultiplicationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListConcatenationDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ListConcatenationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListConcatenationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListConcatenationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListConcatenationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InequalityDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public InequalityDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterInequalityDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitInequalityDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitInequalityDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BagEnumerationDataExprContext extends DataExprContext {
		public BagEnumEltListContext bagEnumEltList() {
			return getRuleContext(BagEnumEltListContext.class,0);
		}
		public BagEnumerationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBagEnumerationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBagEnumerationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBagEnumerationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyBagDataExprContext extends DataExprContext {
		public EmptyBagDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEmptyBagDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEmptyBagDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEmptyBagDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public BracketsDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBracketsDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBracketsDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBracketsDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListConsDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ListConsDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListConsDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListConsDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListConsDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerDivDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public IntegerDivDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIntegerDivDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIntegerDivDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIntegerDivDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public SmallerDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSmallerDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSmallerDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSmallerDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LargerDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public LargerDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterLargerDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitLargerDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitLargerDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public UnaryMinusDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterUnaryMinusDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitUnaryMinusDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitUnaryMinusDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhereClauseDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public WhereClauseDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterWhereClauseDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitWhereClauseDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitWhereClauseDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LargerEqualDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public LargerEqualDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterLargerEqualDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitLargerEqualDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitLargerEqualDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerModDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public IntegerModDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIntegerModDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIntegerModDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIntegerModDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListSizeDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public ListSizeDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListSizeDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListSizeDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListSizeDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptySetDataExprContext extends DataExprContext {
		public EmptySetDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEmptySetDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEmptySetDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEmptySetDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubtractionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public SubtractionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSubtractionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSubtractionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSubtractionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueDataExprContext extends DataExprContext {
		public TrueDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterTrueDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitTrueDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitTrueDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public EqualityDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEqualityDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEqualityDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEqualityDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ImplicationDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ImplicationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterImplicationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitImplicationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitImplicationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberDataExprContext extends DataExprContext {
		public TerminalNode INT() { return getToken(mucalculusParser.INT, 0); }
		public NumberDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNumberDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNumberDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNumberDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyListDataExprContext extends DataExprContext {
		public EmptyListDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEmptyListDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEmptyListDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEmptyListDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifierDataExprContext extends DataExprContext {
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public IdentifierDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIdentifierDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIdentifierDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIdentifierDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseDataExprContext extends DataExprContext {
		public FalseDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFalseDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFalseDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFalseDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MemberShipSetBagDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public MemberShipSetBagDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMemberShipSetBagDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMemberShipSetBagDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMemberShipSetBagDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConjunctionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ConjunctionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterConjunctionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitConjunctionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitConjunctionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DisjunctionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public DisjunctionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDisjunctionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDisjunctionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDisjunctionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistentialQuantifierDataExprContext extends DataExprContext {
		public VarsDeclListContext varsDeclList() {
			return getRuleContext(VarsDeclListContext.class,0);
		}
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public ExistentialQuantifierDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterExistentialQuantifierDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitExistentialQuantifierDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitExistentialQuantifierDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public DivisionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDivisionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDivisionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDivisionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallerEqualDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public SmallerEqualDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSmallerEqualDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSmallerEqualDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSmallerEqualDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListElemPositionDataExprContext extends DataExprContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public ListElemPositionDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListElemPositionDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListElemPositionDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListElemPositionDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationSetComplementDataExprContext extends DataExprContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public NegationSetComplementDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNegationSetComplementDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNegationSetComplementDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNegationSetComplementDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionApplicationDataExprContext extends DataExprContext {
		public DataExprListContext dataExprList() {
			return getRuleContext(DataExprListContext.class,0);
		}
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public FunctionApplicationDataExprContext(DataExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFunctionApplicationDataExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFunctionApplicationDataExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFunctionApplicationDataExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataExprContext dataExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DataExprContext _localctx = new DataExprContext(_ctx, _parentState, _p);
		DataExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_dataExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegationSetComplementDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(268); match(29);
				setState(269); dataExpr(27);
				}
				break;

			case 2:
				{
				_localctx = new UnaryMinusDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(270); match(34);
				setState(271); dataExpr(26);
				}
				break;

			case 3:
				{
				_localctx = new ListSizeDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272); match(65);
				setState(273); dataExpr(25);
				}
				break;

			case 4:
				{
				_localctx = new UniversalQuantifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274); match(52);
				setState(275); varsDeclList();
				setState(276); match(48);
				setState(277); dataExpr(24);
				}
				break;

			case 5:
				{
				_localctx = new ExistentialQuantifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); match(58);
				setState(280); varsDeclList();
				setState(281); match(48);
				setState(282); dataExpr(23);
				}
				break;

			case 6:
				{
				_localctx = new LambdaDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284); match(31);
				setState(285); varsDeclList();
				setState(286); match(48);
				setState(287); dataExpr(22);
				}
				break;

			case 7:
				{
				_localctx = new IdentifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289); match(ID);
				}
				break;

			case 8:
				{
				_localctx = new NumberDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290); match(INT);
				}
				break;

			case 9:
				{
				_localctx = new TrueDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291); match(42);
				}
				break;

			case 10:
				{
				_localctx = new FalseDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292); match(6);
				}
				break;

			case 11:
				{
				_localctx = new EmptyListDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293); match(3);
				setState(294); match(30);
				}
				break;

			case 12:
				{
				_localctx = new EmptySetDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295); match(39);
				setState(296); match(12);
				}
				break;

			case 13:
				{
				_localctx = new EmptyBagDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297); match(39);
				setState(298); match(36);
				setState(299); match(12);
				}
				break;

			case 14:
				{
				_localctx = new ListEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300); match(3);
				setState(301); dataExprList();
				setState(302); match(30);
				}
				break;

			case 15:
				{
				_localctx = new BagEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304); match(39);
				setState(305); bagEnumEltList();
				setState(306); match(12);
				}
				break;

			case 16:
				{
				_localctx = new SetBagComprehensionDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308); match(39);
				setState(309); varDecl();
				setState(310); match(28);
				setState(311); dataExpr(0);
				setState(312); match(12);
				}
				break;

			case 17:
				{
				_localctx = new SetEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(314); match(39);
				setState(315); dataExprList();
				setState(316); match(12);
				}
				break;

			case 18:
				{
				_localctx = new BracketsDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318); match(35);
				setState(319); dataExpr(0);
				setState(320); match(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(403);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(401);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ListElemPositionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(324);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(325); match(48);
						setState(326); dataExpr(22);
						}
						break;

					case 2:
						{
						_localctx = new MultiplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(327);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(328); match(2);
						setState(329); dataExpr(21);
						}
						break;

					case 3:
						{
						_localctx = new IntegerModDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(330);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(331); match(27);
						setState(332); dataExpr(20);
						}
						break;

					case 4:
						{
						_localctx = new IntegerDivDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(333);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(334); match(22);
						setState(335); dataExpr(19);
						}
						break;

					case 5:
						{
						_localctx = new DivisionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(336);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(337); match(63);
						setState(338); dataExpr(18);
						}
						break;

					case 6:
						{
						_localctx = new SubtractionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(339);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(340); match(34);
						setState(341); dataExpr(17);
						}
						break;

					case 7:
						{
						_localctx = new AdditionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(342);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(343); match(50);
						setState(344); dataExpr(16);
						}
						break;

					case 8:
						{
						_localctx = new ListConcatenationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(345);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(346); match(43);
						setState(347); dataExpr(15);
						}
						break;

					case 9:
						{
						_localctx = new ListSnocDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(348);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(349); match(45);
						setState(350); dataExpr(14);
						}
						break;

					case 10:
						{
						_localctx = new ListConsDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(351);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(352); match(41);
						setState(353); dataExpr(13);
						}
						break;

					case 11:
						{
						_localctx = new MemberShipSetBagDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(354);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(355); match(32);
						setState(356); dataExpr(12);
						}
						break;

					case 12:
						{
						_localctx = new LargerDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(357);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(358); match(59);
						setState(359); dataExpr(11);
						}
						break;

					case 13:
						{
						_localctx = new LargerEqualDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(360);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(361); match(64);
						setState(362); dataExpr(10);
						}
						break;

					case 14:
						{
						_localctx = new SmallerEqualDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(363);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(364); match(8);
						setState(365); dataExpr(9);
						}
						break;

					case 15:
						{
						_localctx = new SmallerDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(366);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(367); match(4);
						setState(368); dataExpr(8);
						}
						break;

					case 16:
						{
						_localctx = new InequalityDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(369);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(370); match(7);
						setState(371); dataExpr(7);
						}
						break;

					case 17:
						{
						_localctx = new EqualityDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(372);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(373); match(62);
						setState(374); dataExpr(6);
						}
						break;

					case 18:
						{
						_localctx = new DisjunctionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(375);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(376); match(54);
						setState(377); dataExpr(5);
						}
						break;

					case 19:
						{
						_localctx = new ConjunctionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(378);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(379); match(57);
						setState(380); dataExpr(4);
						}
						break;

					case 20:
						{
						_localctx = new ImplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(381);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(382); match(49);
						setState(383); dataExpr(3);
						}
						break;

					case 21:
						{
						_localctx = new FunctionUpdateDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(384);
						if (!(29 >= _localctx._p)) throw new FailedPredicateException(this, "29 >= $_p");
						setState(385); match(3);
						setState(386); dataExpr(0);
						setState(387); match(13);
						setState(388); dataExpr(0);
						setState(389); match(30);
						}
						break;

					case 22:
						{
						_localctx = new FunctionApplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(391);
						if (!(28 >= _localctx._p)) throw new FailedPredicateException(this, "28 >= $_p");
						setState(392); match(35);
						setState(393); dataExprList();
						setState(394); match(14);
						}
						break;

					case 23:
						{
						_localctx = new WhereClauseDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(396);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(397); match(16);
						setState(398); assignmentList();
						setState(399); match(66);
						}
						break;
					}
					} 
				}
				setState(405);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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

	public static class MultActContext extends ParserRuleContext {
		public ActionListContext actionList() {
			return getRuleContext(ActionListContext.class,0);
		}
		public MultActContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multAct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMultAct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMultAct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMultAct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultActContext multAct() throws RecognitionException {
		MultActContext _localctx = new MultActContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_multAct);
		try {
			setState(408);
			switch (_input.LA(1)) {
			case 47:
				enterOuterAlt(_localctx, 1);
				{
				setState(406); match(47);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); actionList();
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

	public static class VarsDeclContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public VarsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterVarsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitVarsDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitVarsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsDeclContext varsDecl() throws RecognitionException {
		VarsDeclContext _localctx = new VarsDeclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); idList();
			setState(411); match(36);
			setState(412); sortExpr();
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

	public static class BagEnumEltListContext extends ParserRuleContext {
		public List<BagEnumEltContext> bagEnumElt() {
			return getRuleContexts(BagEnumEltContext.class);
		}
		public BagEnumEltContext bagEnumElt(int i) {
			return getRuleContext(BagEnumEltContext.class,i);
		}
		public BagEnumEltListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagEnumEltList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBagEnumEltList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBagEnumEltList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBagEnumEltList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagEnumEltListContext bagEnumEltList() throws RecognitionException {
		BagEnumEltListContext _localctx = new BagEnumEltListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bagEnumEltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414); bagEnumElt();
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(415); match(33);
				setState(416); bagEnumElt();
				}
				}
				setState(421);
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

	public static class BagEnumEltContext extends ParserRuleContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public BagEnumEltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bagEnumElt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBagEnumElt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBagEnumElt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBagEnumElt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BagEnumEltContext bagEnumElt() throws RecognitionException {
		BagEnumEltContext _localctx = new BagEnumEltContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bagEnumElt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); dataExpr(0);
			setState(423); match(36);
			setState(424); dataExpr(0);
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

	public static class AssignmentListContext extends ParserRuleContext {
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426); assignment();
			setState(431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(427); match(33);
				setState(428); assignment();
				}
				}
				setState(433);
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

	public static class VarDeclContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(ID);
			setState(435); match(36);
			setState(436); sortExpr();
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

	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(mucalculusParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(mucalculusParser.ID, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438); match(ID);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(439); match(33);
				setState(440); match(ID);
				}
				}
				setState(445);
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

	public static class ActionListContext extends ParserRuleContext {
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public ActionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterActionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitActionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitActionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionListContext actionList() throws RecognitionException {
		ActionListContext _localctx = new ActionListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_actionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446); action();
			setState(451);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(447); match(28);
					setState(448); action();
					}
					} 
				}
				setState(453);
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

	public static class SortExprContext extends ParserRuleContext {
		public SimpleSortExprContext simpleSortExpr() {
			return getRuleContext(SimpleSortExprContext.class,0);
		}
		public HashArgsContext hashArgs() {
			return getRuleContext(HashArgsContext.class,0);
		}
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public SortExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSortExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSortExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSortExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortExprContext sortExpr() throws RecognitionException {
		SortExprContext _localctx = new SortExprContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sortExpr);
		try {
			setState(459);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(454); simpleSortExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(455); hashArgs();
				setState(456); match(13);
				setState(457); sortExpr();
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

	public static class AssignmentContext extends ParserRuleContext {
		public DataExprContext dataExpr() {
			return getRuleContext(DataExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(ID);
			setState(462); match(21);
			setState(463); dataExpr(0);
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

	public static class ActionContext extends ParserRuleContext {
		public DataExprListContext dataExprList() {
			return getRuleContext(DataExprListContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465); match(ID);
			setState(470);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(466); match(35);
				setState(467); dataExprList();
				setState(468); match(14);
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

	public static class SimpleSortExprContext extends ParserRuleContext {
		public SimpleSortExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSortExpr; }
	 
		public SimpleSortExprContext() { }
		public void copyFrom(SimpleSortExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public SetSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSetSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSetSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSetSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BagSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public BagSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBagSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBagSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBagSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositiveNumSortContext extends SimpleSortExprContext {
		public PositiveNumSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterPositiveNumSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitPositiveNumSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitPositiveNumSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanSortContext extends SimpleSortExprContext {
		public BooleanSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterBooleanSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitBooleanSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitBooleanSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public ListSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterListSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitListSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitListSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FiniteSetSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public FiniteSetSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFiniteSetSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFiniteSetSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFiniteSetSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerSortContext extends SimpleSortExprContext {
		public IntegerSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIntegerSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIntegerSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIntegerSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesisSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public ParenthesisSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterParenthesisSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitParenthesisSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitParenthesisSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SortReferenceContext extends SimpleSortExprContext {
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public SortReferenceContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSortReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSortReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSortReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FiniteBagSortContext extends SimpleSortExprContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public FiniteBagSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterFiniteBagSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitFiniteBagSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitFiniteBagSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StructuredSortContext extends SimpleSortExprContext {
		public ConstrDeclListContext constrDeclList() {
			return getRuleContext(ConstrDeclListContext.class,0);
		}
		public StructuredSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterStructuredSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitStructuredSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitStructuredSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NaturalNumSortContext extends SimpleSortExprContext {
		public NaturalNumSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterNaturalNumSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitNaturalNumSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitNaturalNumSort(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealSortContext extends SimpleSortExprContext {
		public RealSortContext(SimpleSortExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterRealSort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitRealSort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitRealSort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSortExprContext simpleSortExpr() throws RecognitionException {
		SimpleSortExprContext _localctx = new SimpleSortExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_simpleSortExpr);
		try {
			setState(509);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new BooleanSortContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(472); match(9);
				}
				break;
			case 19:
				_localctx = new PositiveNumSortContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(473); match(19);
				}
				break;
			case 15:
				_localctx = new NaturalNumSortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(474); match(15);
				}
				break;
			case 24:
				_localctx = new IntegerSortContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(475); match(24);
				}
				break;
			case 60:
				_localctx = new RealSortContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(476); match(60);
				}
				break;
			case 5:
				_localctx = new ListSortContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(477); match(5);
				setState(478); match(35);
				setState(479); sortExpr();
				setState(480); match(14);
				}
				break;
			case 46:
				_localctx = new SetSortContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(482); match(46);
				setState(483); match(35);
				setState(484); sortExpr();
				setState(485); match(14);
				}
				break;
			case 17:
				_localctx = new BagSortContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(487); match(17);
				setState(488); match(35);
				setState(489); sortExpr();
				setState(490); match(14);
				}
				break;
			case 23:
				_localctx = new FiniteSetSortContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(492); match(23);
				setState(493); match(35);
				setState(494); sortExpr();
				setState(495); match(14);
				}
				break;
			case 61:
				_localctx = new FiniteBagSortContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(497); match(61);
				setState(498); match(35);
				setState(499); sortExpr();
				setState(500); match(14);
				}
				break;
			case ID:
				_localctx = new SortReferenceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(502); match(ID);
				}
				break;
			case 35:
				_localctx = new ParenthesisSortContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(503); match(35);
				setState(504); sortExpr();
				setState(505); match(14);
				}
				break;
			case 44:
				_localctx = new StructuredSortContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(507); match(44);
				setState(508); constrDeclList();
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

	public static class HashArgsContext extends ParserRuleContext {
		public List<SimpleSortExprContext> simpleSortExpr() {
			return getRuleContexts(SimpleSortExprContext.class);
		}
		public SimpleSortExprContext simpleSortExpr(int i) {
			return getRuleContext(SimpleSortExprContext.class,i);
		}
		public HashArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hashArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterHashArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitHashArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitHashArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HashArgsContext hashArgs() throws RecognitionException {
		HashArgsContext _localctx = new HashArgsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_hashArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(511); simpleSortExpr();
			setState(516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==65) {
				{
				{
				setState(512); match(65);
				setState(513); simpleSortExpr();
				}
				}
				setState(518);
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

	public static class ConstrDeclListContext extends ParserRuleContext {
		public ConstrDeclContext constrDecl(int i) {
			return getRuleContext(ConstrDeclContext.class,i);
		}
		public List<ConstrDeclContext> constrDecl() {
			return getRuleContexts(ConstrDeclContext.class);
		}
		public ConstrDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterConstrDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitConstrDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitConstrDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrDeclListContext constrDeclList() throws RecognitionException {
		ConstrDeclListContext _localctx = new ConstrDeclListContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_constrDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519); constrDecl();
			setState(524);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(520); match(28);
					setState(521); constrDecl();
					}
					} 
				}
				setState(526);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class ConstrDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(mucalculusParser.ID); }
		public ProjDeclListContext projDeclList() {
			return getRuleContext(ProjDeclListContext.class,0);
		}
		public TerminalNode ID(int i) {
			return getToken(mucalculusParser.ID, i);
		}
		public ConstrDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterConstrDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitConstrDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitConstrDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrDeclContext constrDecl() throws RecognitionException {
		ConstrDeclContext _localctx = new ConstrDeclContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_constrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527); match(ID);
			setState(532);
			_la = _input.LA(1);
			if (_la==35) {
				{
				setState(528); match(35);
				setState(529); projDeclList();
				setState(530); match(14);
				}
			}

			setState(536);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(534); match(38);
				setState(535); match(ID);
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

	public static class ProjDeclContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public ProjDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterProjDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitProjDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitProjDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjDeclContext projDecl() throws RecognitionException {
		ProjDeclContext _localctx = new ProjDeclContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_projDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(538); match(ID);
				setState(539); match(36);
				}
				break;
			}
			setState(542); sortExpr();
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

	public static class ProjDeclListContext extends ParserRuleContext {
		public ProjDeclContext projDecl(int i) {
			return getRuleContext(ProjDeclContext.class,i);
		}
		public List<ProjDeclContext> projDecl() {
			return getRuleContexts(ProjDeclContext.class);
		}
		public ProjDeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_projDeclList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterProjDeclList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitProjDeclList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitProjDeclList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProjDeclListContext projDeclList() throws RecognitionException {
		ProjDeclListContext _localctx = new ProjDeclListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_projDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(544); projDecl();
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(545); match(33);
				setState(546); projDecl();
				}
				}
				setState(551);
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

	public static class DataSpecContext extends ParserRuleContext {
		public MapSpecContext mapSpec(int i) {
			return getRuleContext(MapSpecContext.class,i);
		}
		public ConsSpecContext consSpec(int i) {
			return getRuleContext(ConsSpecContext.class,i);
		}
		public List<ConsSpecContext> consSpec() {
			return getRuleContexts(ConsSpecContext.class);
		}
		public SortSpecContext sortSpec(int i) {
			return getRuleContext(SortSpecContext.class,i);
		}
		public List<EqnSpecContext> eqnSpec() {
			return getRuleContexts(EqnSpecContext.class);
		}
		public EqnSpecContext eqnSpec(int i) {
			return getRuleContext(EqnSpecContext.class,i);
		}
		public List<SortSpecContext> sortSpec() {
			return getRuleContexts(SortSpecContext.class);
		}
		public List<MapSpecContext> mapSpec() {
			return getRuleContexts(MapSpecContext.class);
		}
		public DataSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterDataSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitDataSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitDataSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataSpecContext dataSpec() throws RecognitionException {
		DataSpecContext _localctx = new DataSpecContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dataSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(556);
				switch (_input.LA(1)) {
				case 40:
					{
					setState(552); sortSpec();
					}
					break;
				case 11:
					{
					setState(553); consSpec();
					}
					break;
				case 20:
					{
					setState(554); mapSpec();
					}
					break;
				case 1:
				case 37:
					{
					setState(555); eqnSpec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(558); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 11) | (1L << 20) | (1L << 37) | (1L << 40))) != 0) );
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

	public static class GlobVarSpecContext extends ParserRuleContext {
		public List<VarsDeclListContext> varsDeclList() {
			return getRuleContexts(VarsDeclListContext.class);
		}
		public VarsDeclListContext varsDeclList(int i) {
			return getRuleContext(VarsDeclListContext.class,i);
		}
		public GlobVarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globVarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterGlobVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitGlobVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitGlobVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobVarSpecContext globVarSpec() throws RecognitionException {
		GlobVarSpecContext _localctx = new GlobVarSpecContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_globVarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560); match(51);
			setState(564); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(561); varsDeclList();
				setState(562); match(53);
				}
				}
				setState(566); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class VarSpecContext extends ParserRuleContext {
		public List<VarsDeclListContext> varsDeclList() {
			return getRuleContexts(VarsDeclListContext.class);
		}
		public VarsDeclListContext varsDeclList(int i) {
			return getRuleContext(VarsDeclListContext.class,i);
		}
		public VarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSpecContext varSpec() throws RecognitionException {
		VarSpecContext _localctx = new VarSpecContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568); match(37);
			setState(572); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(569); varsDeclList();
				setState(570); match(53);
				}
				}
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class EqnSpecContext extends ParserRuleContext {
		public VarSpecContext varSpec() {
			return getRuleContext(VarSpecContext.class,0);
		}
		public EqnDeclContext eqnDecl(int i) {
			return getRuleContext(EqnDeclContext.class,i);
		}
		public List<EqnDeclContext> eqnDecl() {
			return getRuleContexts(EqnDeclContext.class);
		}
		public EqnSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEqnSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEqnSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEqnSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqnSpecContext eqnSpec() throws RecognitionException {
		EqnSpecContext _localctx = new EqnSpecContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_eqnSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			_la = _input.LA(1);
			if (_la==37) {
				{
				setState(576); varSpec();
				}
			}

			setState(579); match(1);
			setState(581); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(580); eqnDecl();
				}
				}
				setState(583); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 29) | (1L << 31) | (1L << 34) | (1L << 35) | (1L << 39) | (1L << 42) | (1L << 52) | (1L << 58))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (ID - 65)) | (1L << (INT - 65)))) != 0) );
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

	public static class EqnDeclContext extends ParserRuleContext {
		public List<DataExprContext> dataExpr() {
			return getRuleContexts(DataExprContext.class);
		}
		public DataExprContext dataExpr(int i) {
			return getRuleContext(DataExprContext.class,i);
		}
		public EqnDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eqnDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterEqnDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitEqnDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitEqnDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqnDeclContext eqnDecl() throws RecognitionException {
		EqnDeclContext _localctx = new EqnDeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_eqnDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(585); dataExpr(0);
				setState(586); match(13);
				}
				break;
			}
			setState(590); dataExpr(0);
			setState(591); match(21);
			setState(592); dataExpr(0);
			setState(593); match(53);
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

	public static class SortSpecContext extends ParserRuleContext {
		public List<SortDeclContext> sortDecl() {
			return getRuleContexts(SortDeclContext.class);
		}
		public SortDeclContext sortDecl(int i) {
			return getRuleContext(SortDeclContext.class,i);
		}
		public SortSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSortSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSortSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSortSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortSpecContext sortSpec() throws RecognitionException {
		SortSpecContext _localctx = new SortSpecContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_sortSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595); match(40);
			setState(597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(596); sortDecl();
				}
				}
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class ConsSpecContext extends ParserRuleContext {
		public IdsDeclContext idsDecl(int i) {
			return getRuleContext(IdsDeclContext.class,i);
		}
		public List<IdsDeclContext> idsDecl() {
			return getRuleContexts(IdsDeclContext.class);
		}
		public ConsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterConsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitConsSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitConsSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsSpecContext consSpec() throws RecognitionException {
		ConsSpecContext _localctx = new ConsSpecContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_consSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601); match(11);
			setState(605); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(602); idsDecl();
				setState(603); match(53);
				}
				}
				setState(607); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class MapSpecContext extends ParserRuleContext {
		public IdsDeclContext idsDecl(int i) {
			return getRuleContext(IdsDeclContext.class,i);
		}
		public List<IdsDeclContext> idsDecl() {
			return getRuleContexts(IdsDeclContext.class);
		}
		public MapSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterMapSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitMapSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitMapSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapSpecContext mapSpec() throws RecognitionException {
		MapSpecContext _localctx = new MapSpecContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_mapSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609); match(20);
			setState(613); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(610); idsDecl();
				setState(611); match(53);
				}
				}
				setState(615); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class SortDeclContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(mucalculusParser.ID, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public SortDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterSortDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitSortDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitSortDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortDeclContext sortDecl() throws RecognitionException {
		SortDeclContext _localctx = new SortDeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_sortDecl);
		try {
			setState(625);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617); idList();
				setState(618); match(53);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(620); match(ID);
				setState(621); match(21);
				setState(622); sortExpr();
				setState(623); match(53);
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

	public static class IdsDeclContext extends ParserRuleContext {
		public SortExprContext sortExpr() {
			return getRuleContext(SortExprContext.class,0);
		}
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public IdsDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idsDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).enterIdsDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof mucalculusListener ) ((mucalculusListener)listener).exitIdsDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof mucalculusVisitor ) return ((mucalculusVisitor<? extends T>)visitor).visitIdsDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdsDeclContext idsDecl() throws RecognitionException {
		IdsDeclContext _localctx = new IdsDeclContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_idsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627); idList();
			setState(628); match(36);
			setState(629); sortExpr();
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
		case 4: return actFrm_sempred((ActFrmContext)_localctx, predIndex);

		case 5: return regFrm_sempred((RegFrmContext)_localctx, predIndex);

		case 6: return stateFrm_sempred((StateFrmContext)_localctx, predIndex);

		case 12: return dataExpr_sempred((DataExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean actFrm_sempred(ActFrmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 3 >= _localctx._p;

		case 1: return 2 >= _localctx._p;

		case 2: return 1 >= _localctx._p;

		case 3: return 4 >= _localctx._p;
		}
		return true;
	}
	private boolean regFrm_sempred(RegFrmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;

		case 6: return 4 >= _localctx._p;

		case 7: return 3 >= _localctx._p;
		}
		return true;
	}
	private boolean dataExpr_sempred(DataExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 32: return 28 >= _localctx._p;

		case 33: return 1 >= _localctx._p;

		case 11: return 21 >= _localctx._p;

		case 12: return 20 >= _localctx._p;

		case 13: return 19 >= _localctx._p;

		case 14: return 18 >= _localctx._p;

		case 15: return 17 >= _localctx._p;

		case 17: return 15 >= _localctx._p;

		case 16: return 16 >= _localctx._p;

		case 19: return 13 >= _localctx._p;

		case 18: return 14 >= _localctx._p;

		case 21: return 11 >= _localctx._p;

		case 20: return 12 >= _localctx._p;

		case 23: return 9 >= _localctx._p;

		case 22: return 10 >= _localctx._p;

		case 25: return 7 >= _localctx._p;

		case 24: return 8 >= _localctx._p;

		case 27: return 5 >= _localctx._p;

		case 26: return 6 >= _localctx._p;

		case 29: return 3 >= _localctx._p;

		case 28: return 4 >= _localctx._p;

		case 31: return 29 >= _localctx._p;

		case 30: return 2 >= _localctx._p;
		}
		return true;
	}
	private boolean stateFrm_sempred(StateFrmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return 8 >= _localctx._p;

		case 9: return 7 >= _localctx._p;

		case 10: return 6 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3I\u027a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\5\3W\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6u\n\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6\16\6\u0086"+
		"\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16\7\u009e\13\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u00cd\n\b\3\b\3\b\3\b\5\b\u00d2\n\b\3\b\3\b"+
		"\3\b\5\b\u00d7\n\b\5\b\u00d9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7"+
		"\b\u00e4\n\b\f\b\16\b\u00e7\13\b\3\t\3\t\3\t\3\t\3\t\5\t\u00ee\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13"+
		"\13\3\f\3\f\3\f\7\f\u0101\n\f\f\f\16\f\u0104\13\f\3\r\3\r\3\r\7\r\u0109"+
		"\n\r\f\r\16\r\u010c\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0145\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0194\n\16\f\16\16\16\u0197\13\16\3\17\3\17\5\17\u019b\n\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u01a4\n\21\f\21\16\21\u01a7\13\21"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u01b0\n\23\f\23\16\23\u01b3\13"+
		"\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\7\25\u01bc\n\25\f\25\16\25\u01bf"+
		"\13\25\3\26\3\26\3\26\7\26\u01c4\n\26\f\26\16\26\u01c7\13\26\3\27\3\27"+
		"\3\27\3\27\3\27\5\27\u01ce\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u01d9\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0200\n\32\3\33\3\33\3\33\7\33\u0205\n\33\f\33\16\33\u0208\13\33\3\34"+
		"\3\34\3\34\7\34\u020d\n\34\f\34\16\34\u0210\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0217\n\35\3\35\3\35\5\35\u021b\n\35\3\36\3\36\5\36\u021f\n"+
		"\36\3\36\3\36\3\37\3\37\3\37\7\37\u0226\n\37\f\37\16\37\u0229\13\37\3"+
		" \3 \3 \3 \6 \u022f\n \r \16 \u0230\3!\3!\3!\3!\6!\u0237\n!\r!\16!\u0238"+
		"\3\"\3\"\3\"\3\"\6\"\u023f\n\"\r\"\16\"\u0240\3#\5#\u0244\n#\3#\3#\6#"+
		"\u0248\n#\r#\16#\u0249\3$\3$\3$\5$\u024f\n$\3$\3$\3$\3$\3$\3%\3%\6%\u0258"+
		"\n%\r%\16%\u0259\3&\3&\3&\3&\6&\u0260\n&\r&\16&\u0261\3\'\3\'\3\'\3\'"+
		"\6\'\u0268\n\'\r\'\16\'\u0269\3(\3(\3(\3(\3(\3(\3(\3(\5(\u0274\n(\3)\3"+
		")\3)\3)\3)\2*\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNP\2\2\u02c8\2R\3\2\2\2\4V\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2"+
		"\nt\3\2\2\2\f\u008e\3\2\2\2\16\u00d8\3\2\2\2\20\u00e8\3\2\2\2\22\u00ef"+
		"\3\2\2\2\24\u00f5\3\2\2\2\26\u00fd\3\2\2\2\30\u0105\3\2\2\2\32\u0144\3"+
		"\2\2\2\34\u019a\3\2\2\2\36\u019c\3\2\2\2 \u01a0\3\2\2\2\"\u01a8\3\2\2"+
		"\2$\u01ac\3\2\2\2&\u01b4\3\2\2\2(\u01b8\3\2\2\2*\u01c0\3\2\2\2,\u01cd"+
		"\3\2\2\2.\u01cf\3\2\2\2\60\u01d3\3\2\2\2\62\u01ff\3\2\2\2\64\u0201\3\2"+
		"\2\2\66\u0209\3\2\2\28\u0211\3\2\2\2:\u021e\3\2\2\2<\u0222\3\2\2\2>\u022e"+
		"\3\2\2\2@\u0232\3\2\2\2B\u023a\3\2\2\2D\u0243\3\2\2\2F\u024e\3\2\2\2H"+
		"\u0255\3\2\2\2J\u025b\3\2\2\2L\u0263\3\2\2\2N\u0273\3\2\2\2P\u0275\3\2"+
		"\2\2RS\5\16\b\2S\3\3\2\2\2TW\7E\2\2UW\7:\2\2VT\3\2\2\2VU\3\2\2\2W\5\3"+
		"\2\2\2XY\7F\2\2Y\7\3\2\2\2Z[\7\34\2\2[\\\7%\2\2\\]\5\32\16\2]^\7\20\2"+
		"\2^\t\3\2\2\2_`\b\6\1\2`a\7\37\2\2au\5\n\6\2bc\7\66\2\2cd\5\26\f\2de\7"+
		"\62\2\2ef\5\n\6\2fu\3\2\2\2gh\7<\2\2hi\5\26\f\2ij\7\62\2\2jk\5\n\6\2k"+
		"u\3\2\2\2lu\5\b\5\2mn\7%\2\2no\5\n\6\2op\7\20\2\2pu\3\2\2\2qu\5\34\17"+
		"\2ru\7,\2\2su\7\b\2\2t_\3\2\2\2tb\3\2\2\2tg\3\2\2\2tl\3\2\2\2tm\3\2\2"+
		"\2tq\3\2\2\2tr\3\2\2\2ts\3\2\2\2u\u0084\3\2\2\2vw\6\6\2\3wx\78\2\2x\u0083"+
		"\5\n\6\2yz\6\6\3\3z{\7;\2\2{\u0083\5\n\6\2|}\6\6\4\3}~\7\63\2\2~\u0083"+
		"\5\n\6\2\177\u0080\6\6\5\3\u0080\u0081\7\24\2\2\u0081\u0083\5\32\16\2"+
		"\u0082v\3\2\2\2\u0082y\3\2\2\2\u0082|\3\2\2\2\u0082\177\3\2\2\2\u0083"+
		"\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\13\3\2\2"+
		"\2\u0086\u0084\3\2\2\2\u0087\u0088\b\7\1\2\u0088\u0089\7%\2\2\u0089\u008a"+
		"\5\f\7\2\u008a\u008b\7\20\2\2\u008b\u008f\3\2\2\2\u008c\u008f\5\n\6\2"+
		"\u008d\u008f\7\f\2\2\u008e\u0087\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008d"+
		"\3\2\2\2\u008f\u009c\3\2\2\2\u0090\u0091\6\7\6\3\u0091\u0092\7\62\2\2"+
		"\u0092\u009b\5\f\7\2\u0093\u0094\6\7\7\3\u0094\u0095\7\64\2\2\u0095\u009b"+
		"\5\f\7\2\u0096\u0097\6\7\b\3\u0097\u009b\7\4\2\2\u0098\u0099\6\7\t\3\u0099"+
		"\u009b\7\64\2\2\u009a\u0090\3\2\2\2\u009a\u0093\3\2\2\2\u009a\u0096\3"+
		"\2\2\2\u009a\u0098\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\b\b\1\2"+
		"\u00a0\u00a1\7\66\2\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\7\62\2\2\u00a3"+
		"\u00a4\5\16\b\2\u00a4\u00d9\3\2\2\2\u00a5\u00a6\7<\2\2\u00a6\u00a7\5\26"+
		"\f\2\u00a7\u00a8\7\62\2\2\u00a8\u00a9\5\16\b\2\u00a9\u00d9\3\2\2\2\u00aa"+
		"\u00ab\7\37\2\2\u00ab\u00d9\5\16\b\2\u00ac\u00ad\7E\2\2\u00ad\u00ae\5"+
		"\20\t\2\u00ae\u00af\7\62\2\2\u00af\u00b0\5\16\b\2\u00b0\u00d9\3\2\2\2"+
		"\u00b1\u00b2\7:\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7\62\2\2\u00b4\u00b5"+
		"\5\16\b\2\u00b5\u00d9\3\2\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\5\f\7\2"+
		"\u00b8\u00b9\7 \2\2\u00b9\u00ba\5\16\b\2\u00ba\u00d9\3\2\2\2\u00bb\u00bc"+
		"\7\6\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7=\2\2\u00be\u00bf\5\16\b\2\u00bf"+
		"\u00d9\3\2\2\2\u00c0\u00d9\5\b\5\2\u00c1\u00c2\7%\2\2\u00c2\u00c3\5\16"+
		"\b\2\u00c3\u00c4\7\20\2\2\u00c4\u00d9\3\2\2\2\u00c5\u00d9\7,\2\2\u00c6"+
		"\u00d9\7\b\2\2\u00c7\u00cc\7F\2\2\u00c8\u00c9\7%\2\2\u00c9\u00ca\5\30"+
		"\r\2\u00ca\u00cb\7\20\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d9\3\2\2\2\u00ce\u00d1\79\2\2\u00cf\u00d0\7\24"+
		"\2\2\u00d0\u00d2\5\32\16\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d9\3\2\2\2\u00d3\u00d6\7\33\2\2\u00d4\u00d5\7\24\2\2\u00d5\u00d7\5"+
		"\32\16\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d9\3\2\2\2\u00d8"+
		"\u009f\3\2\2\2\u00d8\u00a5\3\2\2\2\u00d8\u00aa\3\2\2\2\u00d8\u00ac\3\2"+
		"\2\2\u00d8\u00b1\3\2\2\2\u00d8\u00b6\3\2\2\2\u00d8\u00bb\3\2\2\2\u00d8"+
		"\u00c0\3\2\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c5\3\2\2\2\u00d8\u00c6\3\2"+
		"\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9"+
		"\u00e5\3\2\2\2\u00da\u00db\6\b\n\3\u00db\u00dc\78\2\2\u00dc\u00e4\5\16"+
		"\b\2\u00dd\u00de\6\b\13\3\u00de\u00df\7;\2\2\u00df\u00e4\5\16\b\2\u00e0"+
		"\u00e1\6\b\f\3\u00e1\u00e2\7\63\2\2\u00e2\u00e4\5\16\b\2\u00e3\u00da\3"+
		"\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\17\3\2\2\2\u00e7\u00e5\3\2\2"+
		"\2\u00e8\u00ed\7F\2\2\u00e9\u00ea\7%\2\2\u00ea\u00eb\5\24\13\2\u00eb\u00ec"+
		"\7\20\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ed\u00ee\3\2\2\2"+
		"\u00ee\21\3\2\2\2\u00ef\u00f0\7F\2\2\u00f0\u00f1\7&\2\2\u00f1\u00f2\5"+
		",\27\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\5\32\16\2\u00f4\23\3\2\2\2\u00f5"+
		"\u00fa\5\22\n\2\u00f6\u00f7\7#\2\2\u00f7\u00f9\5\22\n\2\u00f8\u00f6\3"+
		"\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\25\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0102\5\36\20\2\u00fe\u00ff\7#\2"+
		"\2\u00ff\u0101\5\36\20\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\27\3\2\2\2\u0104\u0102\3\2\2"+
		"\2\u0105\u010a\5\32\16\2\u0106\u0107\7#\2\2\u0107\u0109\5\32\16\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\31\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\b\16\1\2\u010e\u010f"+
		"\7\37\2\2\u010f\u0145\5\32\16\2\u0110\u0111\7$\2\2\u0111\u0145\5\32\16"+
		"\2\u0112\u0113\7C\2\2\u0113\u0145\5\32\16\2\u0114\u0115\7\66\2\2\u0115"+
		"\u0116\5\26\f\2\u0116\u0117\7\62\2\2\u0117\u0118\5\32\16\2\u0118\u0145"+
		"\3\2\2\2\u0119\u011a\7<\2\2\u011a\u011b\5\26\f\2\u011b\u011c\7\62\2\2"+
		"\u011c\u011d\5\32\16\2\u011d\u0145\3\2\2\2\u011e\u011f\7!\2\2\u011f\u0120"+
		"\5\26\f\2\u0120\u0121\7\62\2\2\u0121\u0122\5\32\16\2\u0122\u0145\3\2\2"+
		"\2\u0123\u0145\7F\2\2\u0124\u0145\7G\2\2\u0125\u0145\7,\2\2\u0126\u0145"+
		"\7\b\2\2\u0127\u0128\7\5\2\2\u0128\u0145\7 \2\2\u0129\u012a\7)\2\2\u012a"+
		"\u0145\7\16\2\2\u012b\u012c\7)\2\2\u012c\u012d\7&\2\2\u012d\u0145\7\16"+
		"\2\2\u012e\u012f\7\5\2\2\u012f\u0130\5\30\r\2\u0130\u0131\7 \2\2\u0131"+
		"\u0145\3\2\2\2\u0132\u0133\7)\2\2\u0133\u0134\5 \21\2\u0134\u0135\7\16"+
		"\2\2\u0135\u0145\3\2\2\2\u0136\u0137\7)\2\2\u0137\u0138\5&\24\2\u0138"+
		"\u0139\7\36\2\2\u0139\u013a\5\32\16\2\u013a\u013b\7\16\2\2\u013b\u0145"+
		"\3\2\2\2\u013c\u013d\7)\2\2\u013d\u013e\5\30\r\2\u013e\u013f\7\16\2\2"+
		"\u013f\u0145\3\2\2\2\u0140\u0141\7%\2\2\u0141\u0142\5\32\16\2\u0142\u0143"+
		"\7\20\2\2\u0143\u0145\3\2\2\2\u0144\u010d\3\2\2\2\u0144\u0110\3\2\2\2"+
		"\u0144\u0112\3\2\2\2\u0144\u0114\3\2\2\2\u0144\u0119\3\2\2\2\u0144\u011e"+
		"\3\2\2\2\u0144\u0123\3\2\2\2\u0144\u0124\3\2\2\2\u0144\u0125\3\2\2\2\u0144"+
		"\u0126\3\2\2\2\u0144\u0127\3\2\2\2\u0144\u0129\3\2\2\2\u0144\u012b\3\2"+
		"\2\2\u0144\u012e\3\2\2\2\u0144\u0132\3\2\2\2\u0144\u0136\3\2\2\2\u0144"+
		"\u013c\3\2\2\2\u0144\u0140\3\2\2\2\u0145\u0195\3\2\2\2\u0146\u0147\6\16"+
		"\r\3\u0147\u0148\7\62\2\2\u0148\u0194\5\32\16\2\u0149\u014a\6\16\16\3"+
		"\u014a\u014b\7\4\2\2\u014b\u0194\5\32\16\2\u014c\u014d\6\16\17\3\u014d"+
		"\u014e\7\35\2\2\u014e\u0194\5\32\16\2\u014f\u0150\6\16\20\3\u0150\u0151"+
		"\7\30\2\2\u0151\u0194\5\32\16\2\u0152\u0153\6\16\21\3\u0153\u0154\7A\2"+
		"\2\u0154\u0194\5\32\16\2\u0155\u0156\6\16\22\3\u0156\u0157\7$\2\2\u0157"+
		"\u0194\5\32\16\2\u0158\u0159\6\16\23\3\u0159\u015a\7\64\2\2\u015a\u0194"+
		"\5\32\16\2\u015b\u015c\6\16\24\3\u015c\u015d\7-\2\2\u015d\u0194\5\32\16"+
		"\2\u015e\u015f\6\16\25\3\u015f\u0160\7/\2\2\u0160\u0194\5\32\16\2\u0161"+
		"\u0162\6\16\26\3\u0162\u0163\7+\2\2\u0163\u0194\5\32\16\2\u0164\u0165"+
		"\6\16\27\3\u0165\u0166\7\"\2\2\u0166\u0194\5\32\16\2\u0167\u0168\6\16"+
		"\30\3\u0168\u0169\7=\2\2\u0169\u0194\5\32\16\2\u016a\u016b\6\16\31\3\u016b"+
		"\u016c\7B\2\2\u016c\u0194\5\32\16\2\u016d\u016e\6\16\32\3\u016e\u016f"+
		"\7\n\2\2\u016f\u0194\5\32\16\2\u0170\u0171\6\16\33\3\u0171\u0172\7\6\2"+
		"\2\u0172\u0194\5\32\16\2\u0173\u0174\6\16\34\3\u0174\u0175\7\t\2\2\u0175"+
		"\u0194\5\32\16\2\u0176\u0177\6\16\35\3\u0177\u0178\7@\2\2\u0178\u0194"+
		"\5\32\16\2\u0179\u017a\6\16\36\3\u017a\u017b\78\2\2\u017b\u0194\5\32\16"+
		"\2\u017c\u017d\6\16\37\3\u017d\u017e\7;\2\2\u017e\u0194\5\32\16\2\u017f"+
		"\u0180\6\16 \3\u0180\u0181\7\63\2\2\u0181\u0194\5\32\16\2\u0182\u0183"+
		"\6\16!\3\u0183\u0184\7\5\2\2\u0184\u0185\5\32\16\2\u0185\u0186\7\17\2"+
		"\2\u0186\u0187\5\32\16\2\u0187\u0188\7 \2\2\u0188\u0194\3\2\2\2\u0189"+
		"\u018a\6\16\"\3\u018a\u018b\7%\2\2\u018b\u018c\5\30\r\2\u018c\u018d\7"+
		"\20\2\2\u018d\u0194\3\2\2\2\u018e\u018f\6\16#\3\u018f\u0190\7\22\2\2\u0190"+
		"\u0191\5$\23\2\u0191\u0192\7D\2\2\u0192\u0194\3\2\2\2\u0193\u0146\3\2"+
		"\2\2\u0193\u0149\3\2\2\2\u0193\u014c\3\2\2\2\u0193\u014f\3\2\2\2\u0193"+
		"\u0152\3\2\2\2\u0193\u0155\3\2\2\2\u0193\u0158\3\2\2\2\u0193\u015b\3\2"+
		"\2\2\u0193\u015e\3\2\2\2\u0193\u0161\3\2\2\2\u0193\u0164\3\2\2\2\u0193"+
		"\u0167\3\2\2\2\u0193\u016a\3\2\2\2\u0193\u016d\3\2\2\2\u0193\u0170\3\2"+
		"\2\2\u0193\u0173\3\2\2\2\u0193\u0176\3\2\2\2\u0193\u0179\3\2\2\2\u0193"+
		"\u017c\3\2\2\2\u0193\u017f\3\2\2\2\u0193\u0182\3\2\2\2\u0193\u0189\3\2"+
		"\2\2\u0193\u018e\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195"+
		"\u0196\3\2\2\2\u0196\33\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019b\7\61\2"+
		"\2\u0199\u019b\5*\26\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\35"+
		"\3\2\2\2\u019c\u019d\5(\25\2\u019d\u019e\7&\2\2\u019e\u019f\5,\27\2\u019f"+
		"\37\3\2\2\2\u01a0\u01a5\5\"\22\2\u01a1\u01a2\7#\2\2\u01a2\u01a4\5\"\22"+
		"\2\u01a3\u01a1\3\2\2\2\u01a4\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6"+
		"\3\2\2\2\u01a6!\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\5\32\16\2\u01a9"+
		"\u01aa\7&\2\2\u01aa\u01ab\5\32\16\2\u01ab#\3\2\2\2\u01ac\u01b1\5.\30\2"+
		"\u01ad\u01ae\7#\2\2\u01ae\u01b0\5.\30\2\u01af\u01ad\3\2\2\2\u01b0\u01b3"+
		"\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2%\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b4\u01b5\7F\2\2\u01b5\u01b6\7&\2\2\u01b6\u01b7\5,\27"+
		"\2\u01b7\'\3\2\2\2\u01b8\u01bd\7F\2\2\u01b9\u01ba\7#\2\2\u01ba\u01bc\7"+
		"F\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be)\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c5\5\60\31"+
		"\2\u01c1\u01c2\7\36\2\2\u01c2\u01c4\5\60\31\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6+\3\2\2\2"+
		"\u01c7\u01c5\3\2\2\2\u01c8\u01ce\5\62\32\2\u01c9\u01ca\5\64\33\2\u01ca"+
		"\u01cb\7\17\2\2\u01cb\u01cc\5,\27\2\u01cc\u01ce\3\2\2\2\u01cd\u01c8\3"+
		"\2\2\2\u01cd\u01c9\3\2\2\2\u01ce-\3\2\2\2\u01cf\u01d0\7F\2\2\u01d0\u01d1"+
		"\7\27\2\2\u01d1\u01d2\5\32\16\2\u01d2/\3\2\2\2\u01d3\u01d8\7F\2\2\u01d4"+
		"\u01d5\7%\2\2\u01d5\u01d6\5\30\r\2\u01d6\u01d7\7\20\2\2\u01d7\u01d9\3"+
		"\2\2\2\u01d8\u01d4\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9\61\3\2\2\2\u01da"+
		"\u0200\7\13\2\2\u01db\u0200\7\25\2\2\u01dc\u0200\7\21\2\2\u01dd\u0200"+
		"\7\32\2\2\u01de\u0200\7>\2\2\u01df\u01e0\7\7\2\2\u01e0\u01e1\7%\2\2\u01e1"+
		"\u01e2\5,\27\2\u01e2\u01e3\7\20\2\2\u01e3\u0200\3\2\2\2\u01e4\u01e5\7"+
		"\60\2\2\u01e5\u01e6\7%\2\2\u01e6\u01e7\5,\27\2\u01e7\u01e8\7\20\2\2\u01e8"+
		"\u0200\3\2\2\2\u01e9\u01ea\7\23\2\2\u01ea\u01eb\7%\2\2\u01eb\u01ec\5,"+
		"\27\2\u01ec\u01ed\7\20\2\2\u01ed\u0200\3\2\2\2\u01ee\u01ef\7\31\2\2\u01ef"+
		"\u01f0\7%\2\2\u01f0\u01f1\5,\27\2\u01f1\u01f2\7\20\2\2\u01f2\u0200\3\2"+
		"\2\2\u01f3\u01f4\7?\2\2\u01f4\u01f5\7%\2\2\u01f5\u01f6\5,\27\2\u01f6\u01f7"+
		"\7\20\2\2\u01f7\u0200\3\2\2\2\u01f8\u0200\7F\2\2\u01f9\u01fa\7%\2\2\u01fa"+
		"\u01fb\5,\27\2\u01fb\u01fc\7\20\2\2\u01fc\u0200\3\2\2\2\u01fd\u01fe\7"+
		".\2\2\u01fe\u0200\5\66\34\2\u01ff\u01da\3\2\2\2\u01ff\u01db\3\2\2\2\u01ff"+
		"\u01dc\3\2\2\2\u01ff\u01dd\3\2\2\2\u01ff\u01de\3\2\2\2\u01ff\u01df\3\2"+
		"\2\2\u01ff\u01e4\3\2\2\2\u01ff\u01e9\3\2\2\2\u01ff\u01ee\3\2\2\2\u01ff"+
		"\u01f3\3\2\2\2\u01ff\u01f8\3\2\2\2\u01ff\u01f9\3\2\2\2\u01ff\u01fd\3\2"+
		"\2\2\u0200\63\3\2\2\2\u0201\u0206\5\62\32\2\u0202\u0203\7C\2\2\u0203\u0205"+
		"\5\62\32\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2"+
		"\u0206\u0207\3\2\2\2\u0207\65\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020e"+
		"\58\35\2\u020a\u020b\7\36\2\2\u020b\u020d\58\35\2\u020c\u020a\3\2\2\2"+
		"\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\67"+
		"\3\2\2\2\u0210\u020e\3\2\2\2\u0211\u0216\7F\2\2\u0212\u0213\7%\2\2\u0213"+
		"\u0214\5<\37\2\u0214\u0215\7\20\2\2\u0215\u0217\3\2\2\2\u0216\u0212\3"+
		"\2\2\2\u0216\u0217\3\2\2\2\u0217\u021a\3\2\2\2\u0218\u0219\7(\2\2\u0219"+
		"\u021b\7F\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b9\3\2\2\2\u021c"+
		"\u021d\7F\2\2\u021d\u021f\7&\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2"+
		"\2\u021f\u0220\3\2\2\2\u0220\u0221\5,\27\2\u0221;\3\2\2\2\u0222\u0227"+
		"\5:\36\2\u0223\u0224\7#\2\2\u0224\u0226\5:\36\2\u0225\u0223\3\2\2\2\u0226"+
		"\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228=\3\2\2\2"+
		"\u0229\u0227\3\2\2\2\u022a\u022f\5H%\2\u022b\u022f\5J&\2\u022c\u022f\5"+
		"L\'\2\u022d\u022f\5D#\2\u022e\u022a\3\2\2\2\u022e\u022b\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0230\u0231\3\2\2\2\u0231?\3\2\2\2\u0232\u0236\7\65\2\2\u0233\u0234"+
		"\5\26\f\2\u0234\u0235\7\67\2\2\u0235\u0237\3\2\2\2\u0236\u0233\3\2\2\2"+
		"\u0237\u0238\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239\3\2\2\2\u0239A\3"+
		"\2\2\2\u023a\u023e\7\'\2\2\u023b\u023c\5\26\f\2\u023c\u023d\7\67\2\2\u023d"+
		"\u023f\3\2\2\2\u023e\u023b\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241C\3\2\2\2\u0242\u0244\5B\"\2\u0243\u0242"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\7\3\2\2\u0246"+
		"\u0248\5F$\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2"+
		"\2\u0249\u024a\3\2\2\2\u024aE\3\2\2\2\u024b\u024c\5\32\16\2\u024c\u024d"+
		"\7\17\2\2\u024d\u024f\3\2\2\2\u024e\u024b\3\2\2\2\u024e\u024f\3\2\2\2"+
		"\u024f\u0250\3\2\2\2\u0250\u0251\5\32\16\2\u0251\u0252\7\27\2\2\u0252"+
		"\u0253\5\32\16\2\u0253\u0254\7\67\2\2\u0254G\3\2\2\2\u0255\u0257\7*\2"+
		"\2\u0256\u0258\5N(\2\u0257\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u0257"+
		"\3\2\2\2\u0259\u025a\3\2\2\2\u025aI\3\2\2\2\u025b\u025f\7\r\2\2\u025c"+
		"\u025d\5P)\2\u025d\u025e\7\67\2\2\u025e\u0260\3\2\2\2\u025f\u025c\3\2"+
		"\2\2\u0260\u0261\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262"+
		"K\3\2\2\2\u0263\u0267\7\26\2\2\u0264\u0265\5P)\2\u0265\u0266\7\67\2\2"+
		"\u0266\u0268\3\2\2\2\u0267\u0264\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0267"+
		"\3\2\2\2\u0269\u026a\3\2\2\2\u026aM\3\2\2\2\u026b\u026c\5(\25\2\u026c"+
		"\u026d\7\67\2\2\u026d\u0274\3\2\2\2\u026e\u026f\7F\2\2\u026f\u0270\7\27"+
		"\2\2\u0270\u0271\5,\27\2\u0271\u0272\7\67\2\2\u0272\u0274\3\2\2\2\u0273"+
		"\u026b\3\2\2\2\u0273\u026e\3\2\2\2\u0274O\3\2\2\2\u0275\u0276\5(\25\2"+
		"\u0276\u0277\7&\2\2\u0277\u0278\5,\27\2\u0278Q\3\2\2\2/Vt\u0082\u0084"+
		"\u008e\u009a\u009c\u00cc\u00d1\u00d6\u00d8\u00e3\u00e5\u00ed\u00fa\u0102"+
		"\u010a\u0144\u0193\u0195\u019a\u01a5\u01b1\u01bd\u01c5\u01cd\u01d8\u01ff"+
		"\u0206\u020e\u0216\u021a\u021e\u0227\u022e\u0230\u0238\u0240\u0243\u0249"+
		"\u024e\u0259\u0261\u0269\u0273";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
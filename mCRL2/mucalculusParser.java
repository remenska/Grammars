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
		"'<='", "'nil'", "'Bool'", "'cons'", "'}'", "'->'", "')'", "'Nat'", "'whr'", 
		"'Bag'", "'@'", "'Pos'", "'map'", "'='", "'div'", "'FSet'", "'Int'", "'yaled'", 
		"'val'", "'mod'", "'|'", "'!'", "']'", "'lambda'", "'in'", "','", "'-'", 
		"':'", "'('", "'var'", "'?'", "'{'", "'sort'", "'|>'", "'true'", "'++'", 
		"'struct'", "'<|'", "'Set'", "'tau'", "'.'", "'=>'", "'+'", "'glob'", 
		"'forall'", "';'", "'&&'", "'delay'", "'nu'", "'||'", "'exists'", "'>'", 
		"'Real'", "'FBag'", "'=='", "'/'", "'>='", "'#'", "'end'", "'mu'", "ID", 
		"INT", "WS", "LINE_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_dataValExpr = 1, RULE_actFrm = 2, RULE_regFrm = 3, 
		RULE_stateFrm = 4, RULE_stateVarDecl = 5, RULE_stateVarAssignment = 6, 
		RULE_stateVarAssignmentList = 7, RULE_varsDeclList = 8, RULE_dataExprList = 9, 
		RULE_dataExpr = 10, RULE_multAct = 11, RULE_varsDecl = 12, RULE_bagEnumEltList = 13, 
		RULE_bagEnumElt = 14, RULE_assignmentList = 15, RULE_varDecl = 16, RULE_idList = 17, 
		RULE_actionList = 18, RULE_sortExpr = 19, RULE_assignment = 20, RULE_action = 21, 
		RULE_simpleSortExpr = 22, RULE_hashArgs = 23, RULE_constrDeclList = 24, 
		RULE_constrDecl = 25, RULE_projDecl = 26, RULE_projDeclList = 27, RULE_dataSpec = 28, 
		RULE_globVarSpec = 29, RULE_varSpec = 30, RULE_eqnSpec = 31, RULE_eqnDecl = 32, 
		RULE_sortSpec = 33, RULE_consSpec = 34, RULE_mapSpec = 35, RULE_sortDecl = 36, 
		RULE_idsDecl = 37;
	public static final String[] ruleNames = {
		"start", "dataValExpr", "actFrm", "regFrm", "stateFrm", "stateVarDecl", 
		"stateVarAssignment", "stateVarAssignmentList", "varsDeclList", "dataExprList", 
		"dataExpr", "multAct", "varsDecl", "bagEnumEltList", "bagEnumElt", "assignmentList", 
		"varDecl", "idList", "actionList", "sortExpr", "assignment", "action", 
		"simpleSortExpr", "hashArgs", "constrDeclList", "constrDecl", "projDecl", 
		"projDeclList", "dataSpec", "globVarSpec", "varSpec", "eqnSpec", "eqnDecl", 
		"sortSpec", "consSpec", "mapSpec", "sortDecl", "idsDecl"
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
			setState(76); stateFrm(0);
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
		enterRule(_localctx, 2, RULE_dataValExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); match(26);
			setState(79); match(36);
			setState(80); ((DataValExprContext)_localctx).myDataExpr = dataExpr(0);
			setState(81); match(14);
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
		int _startState = 4;
		enterRecursionRule(_localctx, RULE_actFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			switch (_input.LA(1)) {
			case 29:
				{
				_localctx = new NegationActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(84); match(29);
				setState(85); actFrm(7);
				}
				break;
			case 52:
				{
				_localctx = new UniversalQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86); match(52);
				setState(87); varsDeclList();
				setState(88); match(48);
				setState(89); actFrm(6);
				}
				break;
			case 58:
				{
				_localctx = new ExistentialQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91); match(58);
				setState(92); varsDeclList();
				setState(93); match(48);
				setState(94); actFrm(5);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(96); dataValExpr();
				}
				break;
			case 36:
				{
				_localctx = new BracketsActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(97); match(36);
				setState(98); actFrm(0);
				setState(99); match(14);
				}
				break;
			case 47:
			case ID:
				{
				_localctx = new MultiActionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); multAct();
				}
				break;
			case 42:
				{
				_localctx = new TrueActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(103); match(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(118);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(106);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(107); match(54);
						setState(108); actFrm(4);
						}
						break;

					case 2:
						{
						_localctx = new UnionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(109);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(110); match(57);
						setState(111); actFrm(3);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(112);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(113); match(49);
						setState(114); actFrm(2);
						}
						break;

					case 4:
						{
						_localctx = new AtOperatorActionFrmContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(115);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(116); match(18);
						setState(117); dataExpr(0);
						}
						break;
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
		int _startState = 6;
		enterRecursionRule(_localctx, RULE_regFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(124); match(36);
				setState(125); regFrm(0);
				setState(126); match(14);
				}
				break;

			case 2:
				{
				_localctx = new ActionFormulaRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); actFrm(0);
				}
				break;

			case 3:
				{
				_localctx = new NilRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129); match(9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new SequentialCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(132);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(133); ((SequentialCompositionRegFormContext)_localctx).mySeqSign = match(48);
						setState(134); regFrm(3);
						}
						break;

					case 2:
						{
						_localctx = new AlternativeCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(135);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(136); match(50);
						setState(137); regFrm(2);
						}
						break;

					case 3:
						{
						_localctx = new IterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(138);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(139); match(2);
						}
						break;

					case 4:
						{
						_localctx = new NonEmptyIterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(140);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(141); match(50);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
		int _startState = 8;
		enterRecursionRule(_localctx, RULE_stateFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			switch (_input.LA(1)) {
			case 52:
				{
				_localctx = new UniversalQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148); match(52);
				setState(149); varsDeclList();
				setState(150); match(48);
				setState(151); stateFrm(13);
				}
				break;
			case 58:
				{
				_localctx = new ExistentialQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); match(58);
				setState(154); varsDeclList();
				setState(155); match(48);
				setState(156); stateFrm(12);
				}
				break;
			case 29:
				{
				_localctx = new NegationStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); match(29);
				setState(159); stateFrm(11);
				}
				break;
			case 67:
				{
				_localctx = new MuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); match(67);
				setState(161); stateVarDecl();
				setState(162); match(48);
				setState(163); stateFrm(10);
				}
				break;
			case 56:
				{
				_localctx = new NuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); match(56);
				setState(166); stateVarDecl();
				setState(167); match(48);
				setState(168); stateFrm(9);
				}
				break;
			case 3:
				{
				_localctx = new BoxModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170); match(3);
				setState(171); regFrm(0);
				setState(172); match(30);
				setState(173); stateFrm(5);
				}
				break;
			case 4:
				{
				_localctx = new DiamondModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175); match(4);
				setState(176); regFrm(0);
				setState(177); match(59);
				setState(178); stateFrm(4);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(180); dataValExpr();
				}
				break;
			case 36:
				{
				_localctx = new BracketsStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181); match(36);
				setState(182); stateFrm(0);
				setState(183); match(14);
				}
				break;
			case 42:
				{
				_localctx = new TrueStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); match(6);
				}
				break;
			case ID:
				{
				_localctx = new PBESVariableStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187); match(ID);
				setState(192);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(188); match(36);
					setState(189); dataExprList();
					setState(190); match(14);
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
				setState(194); match(55);
				setState(197);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(195); match(18);
					setState(196); dataExpr(0);
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
				setState(199); match(25);
				setState(202);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(200); match(18);
					setState(201); dataExpr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(215);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(206);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(207); match(54);
						setState(208); stateFrm(9);
						}
						break;

					case 2:
						{
						_localctx = new DisjunctionStateFmrContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(209);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(210); match(57);
						setState(211); stateFrm(8);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(212);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(213); match(49);
						setState(214); stateFrm(7);
						}
						break;
					}
					} 
				}
				setState(219);
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
		enterRule(_localctx, 10, RULE_stateVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); match(ID);
			setState(225);
			_la = _input.LA(1);
			if (_la==36) {
				{
				setState(221); match(36);
				setState(222); stateVarAssignmentList();
				setState(223); match(14);
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
		enterRule(_localctx, 12, RULE_stateVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(ID);
			setState(228); match(35);
			setState(229); sortExpr();
			setState(230); match(21);
			setState(231); dataExpr(0);
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
		enterRule(_localctx, 14, RULE_stateVarAssignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); stateVarAssignment();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(234); match(33);
				setState(235); stateVarAssignment();
				}
				}
				setState(240);
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
		enterRule(_localctx, 16, RULE_varsDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); varsDecl();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(242); match(33);
				setState(243); varsDecl();
				}
				}
				setState(248);
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
		enterRule(_localctx, 18, RULE_dataExprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); dataExpr(0);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(250); match(33);
				setState(251); dataExpr(0);
				}
				}
				setState(256);
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
		int _startState = 20;
		enterRecursionRule(_localctx, RULE_dataExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				_localctx = new NegationSetComplementDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(258); match(29);
				setState(259); dataExpr(27);
				}
				break;

			case 2:
				{
				_localctx = new UnaryMinusDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(260); match(34);
				setState(261); dataExpr(26);
				}
				break;

			case 3:
				{
				_localctx = new ListSizeDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(262); match(65);
				setState(263); dataExpr(25);
				}
				break;

			case 4:
				{
				_localctx = new UniversalQuantifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(264); match(52);
				setState(265); varsDeclList();
				setState(266); match(48);
				setState(267); dataExpr(24);
				}
				break;

			case 5:
				{
				_localctx = new ExistentialQuantifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(269); match(58);
				setState(270); varsDeclList();
				setState(271); match(48);
				setState(272); dataExpr(23);
				}
				break;

			case 6:
				{
				_localctx = new LambdaDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274); match(31);
				setState(275); varsDeclList();
				setState(276); match(48);
				setState(277); dataExpr(22);
				}
				break;

			case 7:
				{
				_localctx = new IdentifierDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279); match(ID);
				}
				break;

			case 8:
				{
				_localctx = new NumberDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280); match(INT);
				}
				break;

			case 9:
				{
				_localctx = new TrueDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281); match(42);
				}
				break;

			case 10:
				{
				_localctx = new FalseDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282); match(6);
				}
				break;

			case 11:
				{
				_localctx = new EmptyListDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283); match(3);
				setState(284); match(30);
				}
				break;

			case 12:
				{
				_localctx = new EmptySetDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(285); match(39);
				setState(286); match(12);
				}
				break;

			case 13:
				{
				_localctx = new EmptyBagDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(287); match(39);
				setState(288); match(35);
				setState(289); match(12);
				}
				break;

			case 14:
				{
				_localctx = new ListEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290); match(3);
				setState(291); dataExprList();
				setState(292); match(30);
				}
				break;

			case 15:
				{
				_localctx = new BagEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294); match(39);
				setState(295); bagEnumEltList();
				setState(296); match(12);
				}
				break;

			case 16:
				{
				_localctx = new SetBagComprehensionDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298); match(39);
				setState(299); varDecl();
				setState(300); match(28);
				setState(301); dataExpr(0);
				setState(302); match(12);
				}
				break;

			case 17:
				{
				_localctx = new SetEnumerationDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304); match(39);
				setState(305); dataExprList();
				setState(306); match(12);
				}
				break;

			case 18:
				{
				_localctx = new BracketsDataExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308); match(36);
				setState(309); dataExpr(0);
				setState(310); match(14);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ListElemPositionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(314);
						if (!(21 >= _localctx._p)) throw new FailedPredicateException(this, "21 >= $_p");
						setState(315); match(48);
						setState(316); dataExpr(22);
						}
						break;

					case 2:
						{
						_localctx = new MultiplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(317);
						if (!(20 >= _localctx._p)) throw new FailedPredicateException(this, "20 >= $_p");
						setState(318); match(2);
						setState(319); dataExpr(21);
						}
						break;

					case 3:
						{
						_localctx = new IntegerModDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(320);
						if (!(19 >= _localctx._p)) throw new FailedPredicateException(this, "19 >= $_p");
						setState(321); match(27);
						setState(322); dataExpr(20);
						}
						break;

					case 4:
						{
						_localctx = new IntegerDivDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(323);
						if (!(18 >= _localctx._p)) throw new FailedPredicateException(this, "18 >= $_p");
						setState(324); match(22);
						setState(325); dataExpr(19);
						}
						break;

					case 5:
						{
						_localctx = new DivisionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(326);
						if (!(17 >= _localctx._p)) throw new FailedPredicateException(this, "17 >= $_p");
						setState(327); match(63);
						setState(328); dataExpr(18);
						}
						break;

					case 6:
						{
						_localctx = new SubtractionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(329);
						if (!(16 >= _localctx._p)) throw new FailedPredicateException(this, "16 >= $_p");
						setState(330); match(34);
						setState(331); dataExpr(17);
						}
						break;

					case 7:
						{
						_localctx = new AdditionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(332);
						if (!(15 >= _localctx._p)) throw new FailedPredicateException(this, "15 >= $_p");
						setState(333); match(50);
						setState(334); dataExpr(16);
						}
						break;

					case 8:
						{
						_localctx = new ListConcatenationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(335);
						if (!(14 >= _localctx._p)) throw new FailedPredicateException(this, "14 >= $_p");
						setState(336); match(43);
						setState(337); dataExpr(15);
						}
						break;

					case 9:
						{
						_localctx = new ListSnocDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(338);
						if (!(13 >= _localctx._p)) throw new FailedPredicateException(this, "13 >= $_p");
						setState(339); match(45);
						setState(340); dataExpr(14);
						}
						break;

					case 10:
						{
						_localctx = new ListConsDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(341);
						if (!(12 >= _localctx._p)) throw new FailedPredicateException(this, "12 >= $_p");
						setState(342); match(41);
						setState(343); dataExpr(13);
						}
						break;

					case 11:
						{
						_localctx = new MemberShipSetBagDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(344);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(345); match(32);
						setState(346); dataExpr(12);
						}
						break;

					case 12:
						{
						_localctx = new LargerDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(347);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(348); match(59);
						setState(349); dataExpr(11);
						}
						break;

					case 13:
						{
						_localctx = new LargerEqualDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(350);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(351); match(64);
						setState(352); dataExpr(10);
						}
						break;

					case 14:
						{
						_localctx = new SmallerEqualDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(353);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(354); match(8);
						setState(355); dataExpr(9);
						}
						break;

					case 15:
						{
						_localctx = new SmallerDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(356);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(357); match(4);
						setState(358); dataExpr(8);
						}
						break;

					case 16:
						{
						_localctx = new InequalityDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(359);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(360); match(7);
						setState(361); dataExpr(7);
						}
						break;

					case 17:
						{
						_localctx = new EqualityDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(362);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(363); match(62);
						setState(364); dataExpr(6);
						}
						break;

					case 18:
						{
						_localctx = new DisjunctionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(365);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(366); match(54);
						setState(367); dataExpr(5);
						}
						break;

					case 19:
						{
						_localctx = new ConjunctionDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(368);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(369); match(57);
						setState(370); dataExpr(4);
						}
						break;

					case 20:
						{
						_localctx = new ImplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(371);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(372); match(49);
						setState(373); dataExpr(3);
						}
						break;

					case 21:
						{
						_localctx = new FunctionUpdateDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(374);
						if (!(29 >= _localctx._p)) throw new FailedPredicateException(this, "29 >= $_p");
						setState(375); match(3);
						setState(376); dataExpr(0);
						setState(377); match(13);
						setState(378); dataExpr(0);
						setState(379); match(30);
						}
						break;

					case 22:
						{
						_localctx = new FunctionApplicationDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(381);
						if (!(28 >= _localctx._p)) throw new FailedPredicateException(this, "28 >= $_p");
						setState(382); match(36);
						setState(383); dataExprList();
						setState(384); match(14);
						}
						break;

					case 23:
						{
						_localctx = new WhereClauseDataExprContext(new DataExprContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_dataExpr);
						setState(386);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(387); match(16);
						setState(388); assignmentList();
						setState(389); match(66);
						}
						break;
					}
					} 
				}
				setState(395);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 22, RULE_multAct);
		try {
			setState(398);
			switch (_input.LA(1)) {
			case 47:
				enterOuterAlt(_localctx, 1);
				{
				setState(396); match(47);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(397); actionList();
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
		enterRule(_localctx, 24, RULE_varsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400); idList();
			setState(401); match(35);
			setState(402); sortExpr();
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
		enterRule(_localctx, 26, RULE_bagEnumEltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404); bagEnumElt();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(405); match(33);
				setState(406); bagEnumElt();
				}
				}
				setState(411);
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
		enterRule(_localctx, 28, RULE_bagEnumElt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412); dataExpr(0);
			setState(413); match(35);
			setState(414); dataExpr(0);
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
		enterRule(_localctx, 30, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416); assignment();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(417); match(33);
				setState(418); assignment();
				}
				}
				setState(423);
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
		enterRule(_localctx, 32, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424); match(ID);
			setState(425); match(35);
			setState(426); sortExpr();
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
		enterRule(_localctx, 34, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428); match(ID);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(429); match(33);
				setState(430); match(ID);
				}
				}
				setState(435);
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
		enterRule(_localctx, 36, RULE_actionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(436); action();
			setState(441);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(437); match(28);
					setState(438); action();
					}
					} 
				}
				setState(443);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 38, RULE_sortExpr);
		try {
			setState(449);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(444); simpleSortExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(445); hashArgs();
				setState(446); match(13);
				setState(447); sortExpr();
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
		enterRule(_localctx, 40, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451); match(ID);
			setState(452); match(21);
			setState(453); dataExpr(0);
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
		enterRule(_localctx, 42, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(455); match(ID);
			setState(460);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(456); match(36);
				setState(457); dataExprList();
				setState(458); match(14);
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
		enterRule(_localctx, 44, RULE_simpleSortExpr);
		try {
			setState(499);
			switch (_input.LA(1)) {
			case 10:
				_localctx = new BooleanSortContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(462); match(10);
				}
				break;
			case 19:
				_localctx = new PositiveNumSortContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463); match(19);
				}
				break;
			case 15:
				_localctx = new NaturalNumSortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(464); match(15);
				}
				break;
			case 24:
				_localctx = new IntegerSortContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(465); match(24);
				}
				break;
			case 60:
				_localctx = new RealSortContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(466); match(60);
				}
				break;
			case 5:
				_localctx = new ListSortContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(467); match(5);
				setState(468); match(36);
				setState(469); sortExpr();
				setState(470); match(14);
				}
				break;
			case 46:
				_localctx = new SetSortContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(472); match(46);
				setState(473); match(36);
				setState(474); sortExpr();
				setState(475); match(14);
				}
				break;
			case 17:
				_localctx = new BagSortContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(477); match(17);
				setState(478); match(36);
				setState(479); sortExpr();
				setState(480); match(14);
				}
				break;
			case 23:
				_localctx = new FiniteSetSortContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(482); match(23);
				setState(483); match(36);
				setState(484); sortExpr();
				setState(485); match(14);
				}
				break;
			case 61:
				_localctx = new FiniteBagSortContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(487); match(61);
				setState(488); match(36);
				setState(489); sortExpr();
				setState(490); match(14);
				}
				break;
			case ID:
				_localctx = new SortReferenceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(492); match(ID);
				}
				break;
			case 36:
				_localctx = new ParenthesisSortContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(493); match(36);
				setState(494); sortExpr();
				setState(495); match(14);
				}
				break;
			case 44:
				_localctx = new StructuredSortContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(497); match(44);
				setState(498); constrDeclList();
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
		enterRule(_localctx, 46, RULE_hashArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501); simpleSortExpr();
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==65) {
				{
				{
				setState(502); match(65);
				setState(503); simpleSortExpr();
				}
				}
				setState(508);
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
		enterRule(_localctx, 48, RULE_constrDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(509); constrDecl();
			setState(514);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(510); match(28);
					setState(511); constrDecl();
					}
					} 
				}
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 50, RULE_constrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); match(ID);
			setState(522);
			_la = _input.LA(1);
			if (_la==36) {
				{
				setState(518); match(36);
				setState(519); projDeclList();
				setState(520); match(14);
				}
			}

			setState(526);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(524); match(38);
				setState(525); match(ID);
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
		enterRule(_localctx, 52, RULE_projDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(528); match(ID);
				setState(529); match(35);
				}
				break;
			}
			setState(532); sortExpr();
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
		enterRule(_localctx, 54, RULE_projDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534); projDecl();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(535); match(33);
				setState(536); projDecl();
				}
				}
				setState(541);
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
		enterRule(_localctx, 56, RULE_dataSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(546);
				switch (_input.LA(1)) {
				case 40:
					{
					setState(542); sortSpec();
					}
					break;
				case 11:
					{
					setState(543); consSpec();
					}
					break;
				case 20:
					{
					setState(544); mapSpec();
					}
					break;
				case 1:
				case 37:
					{
					setState(545); eqnSpec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(548); 
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
		enterRule(_localctx, 58, RULE_globVarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); match(51);
			setState(554); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(551); varsDeclList();
				setState(552); match(53);
				}
				}
				setState(556); 
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
		enterRule(_localctx, 60, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558); match(37);
			setState(562); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(559); varsDeclList();
				setState(560); match(53);
				}
				}
				setState(564); 
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
		enterRule(_localctx, 62, RULE_eqnSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_la = _input.LA(1);
			if (_la==37) {
				{
				setState(566); varSpec();
				}
			}

			setState(569); match(1);
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570); eqnDecl();
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 29) | (1L << 31) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 42) | (1L << 52) | (1L << 58))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (ID - 65)) | (1L << (INT - 65)))) != 0) );
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
		enterRule(_localctx, 64, RULE_eqnDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(575); dataExpr(0);
				setState(576); match(13);
				}
				break;
			}
			setState(580); dataExpr(0);
			setState(581); match(21);
			setState(582); dataExpr(0);
			setState(583); match(53);
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
		enterRule(_localctx, 66, RULE_sortSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); match(40);
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586); sortDecl();
				}
				}
				setState(589); 
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
		enterRule(_localctx, 68, RULE_consSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); match(11);
			setState(595); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(592); idsDecl();
				setState(593); match(53);
				}
				}
				setState(597); 
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
		enterRule(_localctx, 70, RULE_mapSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599); match(20);
			setState(603); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(600); idsDecl();
				setState(601); match(53);
				}
				}
				setState(605); 
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
		enterRule(_localctx, 72, RULE_sortDecl);
		try {
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607); idList();
				setState(608); match(53);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(610); match(ID);
				setState(611); match(21);
				setState(612); sortExpr();
				setState(613); match(53);
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
		enterRule(_localctx, 74, RULE_idsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617); idList();
			setState(618); match(35);
			setState(619); sortExpr();
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
		case 2: return actFrm_sempred((ActFrmContext)_localctx, predIndex);

		case 3: return regFrm_sempred((RegFrmContext)_localctx, predIndex);

		case 4: return stateFrm_sempred((StateFrmContext)_localctx, predIndex);

		case 10: return dataExpr_sempred((DataExprContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3I\u0270\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4k\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\7\4y\n\4\f\4\16\4|\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0085\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094"+
		"\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00c3\n\6\3\6\3\6\3"+
		"\6\5\6\u00c8\n\6\3\6\3\6\3\6\5\6\u00cd\n\6\5\6\u00cf\n\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00da\n\6\f\6\16\6\u00dd\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00e4\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00ef\n\t"+
		"\f\t\16\t\u00f2\13\t\3\n\3\n\3\n\7\n\u00f7\n\n\f\n\16\n\u00fa\13\n\3\13"+
		"\3\13\3\13\7\13\u00ff\n\13\f\13\16\13\u0102\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u013b"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u018a\n\f\f\f\16\f\u018d\13\f\3\r"+
		"\3\r\5\r\u0191\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\7\17\u019a\n\17"+
		"\f\17\16\17\u019d\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u01a6"+
		"\n\21\f\21\16\21\u01a9\13\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\7\23\u01b2"+
		"\n\23\f\23\16\23\u01b5\13\23\3\24\3\24\3\24\7\24\u01ba\n\24\f\24\16\24"+
		"\u01bd\13\24\3\25\3\25\3\25\3\25\3\25\5\25\u01c4\n\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\5\27\u01cf\n\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u01f6\n\30\3\31\3\31\3\31\7\31\u01fb\n\31\f"+
		"\31\16\31\u01fe\13\31\3\32\3\32\3\32\7\32\u0203\n\32\f\32\16\32\u0206"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\5\33\u020d\n\33\3\33\3\33\5\33\u0211\n"+
		"\33\3\34\3\34\5\34\u0215\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u021c\n\35"+
		"\f\35\16\35\u021f\13\35\3\36\3\36\3\36\3\36\6\36\u0225\n\36\r\36\16\36"+
		"\u0226\3\37\3\37\3\37\3\37\6\37\u022d\n\37\r\37\16\37\u022e\3 \3 \3 \3"+
		" \6 \u0235\n \r \16 \u0236\3!\5!\u023a\n!\3!\3!\6!\u023e\n!\r!\16!\u023f"+
		"\3\"\3\"\3\"\5\"\u0245\n\"\3\"\3\"\3\"\3\"\3\"\3#\3#\6#\u024e\n#\r#\16"+
		"#\u024f\3$\3$\3$\3$\6$\u0256\n$\r$\16$\u0257\3%\3%\3%\3%\6%\u025e\n%\r"+
		"%\16%\u025f\3&\3&\3&\3&\3&\3&\3&\3&\5&\u026a\n&\3\'\3\'\3\'\3\'\3\'\2"+
		"(\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF"+
		"HJL\2\2\u02bf\2N\3\2\2\2\4P\3\2\2\2\6j\3\2\2\2\b\u0084\3\2\2\2\n\u00ce"+
		"\3\2\2\2\f\u00de\3\2\2\2\16\u00e5\3\2\2\2\20\u00eb\3\2\2\2\22\u00f3\3"+
		"\2\2\2\24\u00fb\3\2\2\2\26\u013a\3\2\2\2\30\u0190\3\2\2\2\32\u0192\3\2"+
		"\2\2\34\u0196\3\2\2\2\36\u019e\3\2\2\2 \u01a2\3\2\2\2\"\u01aa\3\2\2\2"+
		"$\u01ae\3\2\2\2&\u01b6\3\2\2\2(\u01c3\3\2\2\2*\u01c5\3\2\2\2,\u01c9\3"+
		"\2\2\2.\u01f5\3\2\2\2\60\u01f7\3\2\2\2\62\u01ff\3\2\2\2\64\u0207\3\2\2"+
		"\2\66\u0214\3\2\2\28\u0218\3\2\2\2:\u0224\3\2\2\2<\u0228\3\2\2\2>\u0230"+
		"\3\2\2\2@\u0239\3\2\2\2B\u0244\3\2\2\2D\u024b\3\2\2\2F\u0251\3\2\2\2H"+
		"\u0259\3\2\2\2J\u0269\3\2\2\2L\u026b\3\2\2\2NO\5\n\6\2O\3\3\2\2\2PQ\7"+
		"\34\2\2QR\7&\2\2RS\5\26\f\2ST\7\20\2\2T\5\3\2\2\2UV\b\4\1\2VW\7\37\2\2"+
		"Wk\5\6\4\2XY\7\66\2\2YZ\5\22\n\2Z[\7\62\2\2[\\\5\6\4\2\\k\3\2\2\2]^\7"+
		"<\2\2^_\5\22\n\2_`\7\62\2\2`a\5\6\4\2ak\3\2\2\2bk\5\4\3\2cd\7&\2\2de\5"+
		"\6\4\2ef\7\20\2\2fk\3\2\2\2gk\5\30\r\2hk\7,\2\2ik\7\b\2\2jU\3\2\2\2jX"+
		"\3\2\2\2j]\3\2\2\2jb\3\2\2\2jc\3\2\2\2jg\3\2\2\2jh\3\2\2\2ji\3\2\2\2k"+
		"z\3\2\2\2lm\6\4\2\3mn\78\2\2ny\5\6\4\2op\6\4\3\3pq\7;\2\2qy\5\6\4\2rs"+
		"\6\4\4\3st\7\63\2\2ty\5\6\4\2uv\6\4\5\3vw\7\24\2\2wy\5\26\f\2xl\3\2\2"+
		"\2xo\3\2\2\2xr\3\2\2\2xu\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\7\3\2"+
		"\2\2|z\3\2\2\2}~\b\5\1\2~\177\7&\2\2\177\u0080\5\b\5\2\u0080\u0081\7\20"+
		"\2\2\u0081\u0085\3\2\2\2\u0082\u0085\5\6\4\2\u0083\u0085\7\13\2\2\u0084"+
		"}\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0092\3\2\2\2"+
		"\u0086\u0087\6\5\6\3\u0087\u0088\7\62\2\2\u0088\u0091\5\b\5\2\u0089\u008a"+
		"\6\5\7\3\u008a\u008b\7\64\2\2\u008b\u0091\5\b\5\2\u008c\u008d\6\5\b\3"+
		"\u008d\u0091\7\4\2\2\u008e\u008f\6\5\t\3\u008f\u0091\7\64\2\2\u0090\u0086"+
		"\3\2\2\2\u0090\u0089\3\2\2\2\u0090\u008c\3\2\2\2\u0090\u008e\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\t\3\2\2\2"+
		"\u0094\u0092\3\2\2\2\u0095\u0096\b\6\1\2\u0096\u0097\7\66\2\2\u0097\u0098"+
		"\5\22\n\2\u0098\u0099\7\62\2\2\u0099\u009a\5\n\6\2\u009a\u00cf\3\2\2\2"+
		"\u009b\u009c\7<\2\2\u009c\u009d\5\22\n\2\u009d\u009e\7\62\2\2\u009e\u009f"+
		"\5\n\6\2\u009f\u00cf\3\2\2\2\u00a0\u00a1\7\37\2\2\u00a1\u00cf\5\n\6\2"+
		"\u00a2\u00a3\7E\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\62\2\2\u00a5\u00a6"+
		"\5\n\6\2\u00a6\u00cf\3\2\2\2\u00a7\u00a8\7:\2\2\u00a8\u00a9\5\f\7\2\u00a9"+
		"\u00aa\7\62\2\2\u00aa\u00ab\5\n\6\2\u00ab\u00cf\3\2\2\2\u00ac\u00ad\7"+
		"\5\2\2\u00ad\u00ae\5\b\5\2\u00ae\u00af\7 \2\2\u00af\u00b0\5\n\6\2\u00b0"+
		"\u00cf\3\2\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b3\5\b\5\2\u00b3\u00b4\7="+
		"\2\2\u00b4\u00b5\5\n\6\2\u00b5\u00cf\3\2\2\2\u00b6\u00cf\5\4\3\2\u00b7"+
		"\u00b8\7&\2\2\u00b8\u00b9\5\n\6\2\u00b9\u00ba\7\20\2\2\u00ba\u00cf\3\2"+
		"\2\2\u00bb\u00cf\7,\2\2\u00bc\u00cf\7\b\2\2\u00bd\u00c2\7F\2\2\u00be\u00bf"+
		"\7&\2\2\u00bf\u00c0\5\24\13\2\u00c0\u00c1\7\20\2\2\u00c1\u00c3\3\2\2\2"+
		"\u00c2\u00be\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00cf\3\2\2\2\u00c4\u00c7"+
		"\79\2\2\u00c5\u00c6\7\24\2\2\u00c6\u00c8\5\26\f\2\u00c7\u00c5\3\2\2\2"+
		"\u00c7\u00c8\3\2\2\2\u00c8\u00cf\3\2\2\2\u00c9\u00cc\7\33\2\2\u00ca\u00cb"+
		"\7\24\2\2\u00cb\u00cd\5\26\f\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cf\3\2\2\2\u00ce\u0095\3\2\2\2\u00ce\u009b\3\2\2\2\u00ce\u00a0"+
		"\3\2\2\2\u00ce\u00a2\3\2\2\2\u00ce\u00a7\3\2\2\2\u00ce\u00ac\3\2\2\2\u00ce"+
		"\u00b1\3\2\2\2\u00ce\u00b6\3\2\2\2\u00ce\u00b7\3\2\2\2\u00ce\u00bb\3\2"+
		"\2\2\u00ce\u00bc\3\2\2\2\u00ce\u00bd\3\2\2\2\u00ce\u00c4\3\2\2\2\u00ce"+
		"\u00c9\3\2\2\2\u00cf\u00db\3\2\2\2\u00d0\u00d1\6\6\n\3\u00d1\u00d2\78"+
		"\2\2\u00d2\u00da\5\n\6\2\u00d3\u00d4\6\6\13\3\u00d4\u00d5\7;\2\2\u00d5"+
		"\u00da\5\n\6\2\u00d6\u00d7\6\6\f\3\u00d7\u00d8\7\63\2\2\u00d8\u00da\5"+
		"\n\6\2\u00d9\u00d0\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da"+
		"\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\13\3\2\2"+
		"\2\u00dd\u00db\3\2\2\2\u00de\u00e3\7F\2\2\u00df\u00e0\7&\2\2\u00e0\u00e1"+
		"\5\20\t\2\u00e1\u00e2\7\20\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\r\3\2\2\2\u00e5\u00e6\7F\2\2\u00e6\u00e7\7"+
		"%\2\2\u00e7\u00e8\5(\25\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\5\26\f\2\u00ea"+
		"\17\3\2\2\2\u00eb\u00f0\5\16\b\2\u00ec\u00ed\7#\2\2\u00ed\u00ef\5\16\b"+
		"\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1"+
		"\3\2\2\2\u00f1\21\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u00f8\5\32\16\2\u00f4"+
		"\u00f5\7#\2\2\u00f5\u00f7\5\32\16\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3"+
		"\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\23\3\2\2\2\u00fa"+
		"\u00f8\3\2\2\2\u00fb\u0100\5\26\f\2\u00fc\u00fd\7#\2\2\u00fd\u00ff\5\26"+
		"\f\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\25\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\b\f\1"+
		"\2\u0104\u0105\7\37\2\2\u0105\u013b\5\26\f\2\u0106\u0107\7$\2\2\u0107"+
		"\u013b\5\26\f\2\u0108\u0109\7C\2\2\u0109\u013b\5\26\f\2\u010a\u010b\7"+
		"\66\2\2\u010b\u010c\5\22\n\2\u010c\u010d\7\62\2\2\u010d\u010e\5\26\f\2"+
		"\u010e\u013b\3\2\2\2\u010f\u0110\7<\2\2\u0110\u0111\5\22\n\2\u0111\u0112"+
		"\7\62\2\2\u0112\u0113\5\26\f\2\u0113\u013b\3\2\2\2\u0114\u0115\7!\2\2"+
		"\u0115\u0116\5\22\n\2\u0116\u0117\7\62\2\2\u0117\u0118\5\26\f\2\u0118"+
		"\u013b\3\2\2\2\u0119\u013b\7F\2\2\u011a\u013b\7G\2\2\u011b\u013b\7,\2"+
		"\2\u011c\u013b\7\b\2\2\u011d\u011e\7\5\2\2\u011e\u013b\7 \2\2\u011f\u0120"+
		"\7)\2\2\u0120\u013b\7\16\2\2\u0121\u0122\7)\2\2\u0122\u0123\7%\2\2\u0123"+
		"\u013b\7\16\2\2\u0124\u0125\7\5\2\2\u0125\u0126\5\24\13\2\u0126\u0127"+
		"\7 \2\2\u0127\u013b\3\2\2\2\u0128\u0129\7)\2\2\u0129\u012a\5\34\17\2\u012a"+
		"\u012b\7\16\2\2\u012b\u013b\3\2\2\2\u012c\u012d\7)\2\2\u012d\u012e\5\""+
		"\22\2\u012e\u012f\7\36\2\2\u012f\u0130\5\26\f\2\u0130\u0131\7\16\2\2\u0131"+
		"\u013b\3\2\2\2\u0132\u0133\7)\2\2\u0133\u0134\5\24\13\2\u0134\u0135\7"+
		"\16\2\2\u0135\u013b\3\2\2\2\u0136\u0137\7&\2\2\u0137\u0138\5\26\f\2\u0138"+
		"\u0139\7\20\2\2\u0139\u013b\3\2\2\2\u013a\u0103\3\2\2\2\u013a\u0106\3"+
		"\2\2\2\u013a\u0108\3\2\2\2\u013a\u010a\3\2\2\2\u013a\u010f\3\2\2\2\u013a"+
		"\u0114\3\2\2\2\u013a\u0119\3\2\2\2\u013a\u011a\3\2\2\2\u013a\u011b\3\2"+
		"\2\2\u013a\u011c\3\2\2\2\u013a\u011d\3\2\2\2\u013a\u011f\3\2\2\2\u013a"+
		"\u0121\3\2\2\2\u013a\u0124\3\2\2\2\u013a\u0128\3\2\2\2\u013a\u012c\3\2"+
		"\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2\2\u013b\u018b\3\2\2\2\u013c"+
		"\u013d\6\f\r\3\u013d\u013e\7\62\2\2\u013e\u018a\5\26\f\2\u013f\u0140\6"+
		"\f\16\3\u0140\u0141\7\4\2\2\u0141\u018a\5\26\f\2\u0142\u0143\6\f\17\3"+
		"\u0143\u0144\7\35\2\2\u0144\u018a\5\26\f\2\u0145\u0146\6\f\20\3\u0146"+
		"\u0147\7\30\2\2\u0147\u018a\5\26\f\2\u0148\u0149\6\f\21\3\u0149\u014a"+
		"\7A\2\2\u014a\u018a\5\26\f\2\u014b\u014c\6\f\22\3\u014c\u014d\7$\2\2\u014d"+
		"\u018a\5\26\f\2\u014e\u014f\6\f\23\3\u014f\u0150\7\64\2\2\u0150\u018a"+
		"\5\26\f\2\u0151\u0152\6\f\24\3\u0152\u0153\7-\2\2\u0153\u018a\5\26\f\2"+
		"\u0154\u0155\6\f\25\3\u0155\u0156\7/\2\2\u0156\u018a\5\26\f\2\u0157\u0158"+
		"\6\f\26\3\u0158\u0159\7+\2\2\u0159\u018a\5\26\f\2\u015a\u015b\6\f\27\3"+
		"\u015b\u015c\7\"\2\2\u015c\u018a\5\26\f\2\u015d\u015e\6\f\30\3\u015e\u015f"+
		"\7=\2\2\u015f\u018a\5\26\f\2\u0160\u0161\6\f\31\3\u0161\u0162\7B\2\2\u0162"+
		"\u018a\5\26\f\2\u0163\u0164\6\f\32\3\u0164\u0165\7\n\2\2\u0165\u018a\5"+
		"\26\f\2\u0166\u0167\6\f\33\3\u0167\u0168\7\6\2\2\u0168\u018a\5\26\f\2"+
		"\u0169\u016a\6\f\34\3\u016a\u016b\7\t\2\2\u016b\u018a\5\26\f\2\u016c\u016d"+
		"\6\f\35\3\u016d\u016e\7@\2\2\u016e\u018a\5\26\f\2\u016f\u0170\6\f\36\3"+
		"\u0170\u0171\78\2\2\u0171\u018a\5\26\f\2\u0172\u0173\6\f\37\3\u0173\u0174"+
		"\7;\2\2\u0174\u018a\5\26\f\2\u0175\u0176\6\f \3\u0176\u0177\7\63\2\2\u0177"+
		"\u018a\5\26\f\2\u0178\u0179\6\f!\3\u0179\u017a\7\5\2\2\u017a\u017b\5\26"+
		"\f\2\u017b\u017c\7\17\2\2\u017c\u017d\5\26\f\2\u017d\u017e\7 \2\2\u017e"+
		"\u018a\3\2\2\2\u017f\u0180\6\f\"\3\u0180\u0181\7&\2\2\u0181\u0182\5\24"+
		"\13\2\u0182\u0183\7\20\2\2\u0183\u018a\3\2\2\2\u0184\u0185\6\f#\3\u0185"+
		"\u0186\7\22\2\2\u0186\u0187\5 \21\2\u0187\u0188\7D\2\2\u0188\u018a\3\2"+
		"\2\2\u0189\u013c\3\2\2\2\u0189\u013f\3\2\2\2\u0189\u0142\3\2\2\2\u0189"+
		"\u0145\3\2\2\2\u0189\u0148\3\2\2\2\u0189\u014b\3\2\2\2\u0189\u014e\3\2"+
		"\2\2\u0189\u0151\3\2\2\2\u0189\u0154\3\2\2\2\u0189\u0157\3\2\2\2\u0189"+
		"\u015a\3\2\2\2\u0189\u015d\3\2\2\2\u0189\u0160\3\2\2\2\u0189\u0163\3\2"+
		"\2\2\u0189\u0166\3\2\2\2\u0189\u0169\3\2\2\2\u0189\u016c\3\2\2\2\u0189"+
		"\u016f\3\2\2\2\u0189\u0172\3\2\2\2\u0189\u0175\3\2\2\2\u0189\u0178\3\2"+
		"\2\2\u0189\u017f\3\2\2\2\u0189\u0184\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\27\3\2\2\2\u018d\u018b\3\2\2"+
		"\2\u018e\u0191\7\61\2\2\u018f\u0191\5&\24\2\u0190\u018e\3\2\2\2\u0190"+
		"\u018f\3\2\2\2\u0191\31\3\2\2\2\u0192\u0193\5$\23\2\u0193\u0194\7%\2\2"+
		"\u0194\u0195\5(\25\2\u0195\33\3\2\2\2\u0196\u019b\5\36\20\2\u0197\u0198"+
		"\7#\2\2\u0198\u019a\5\36\20\2\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\35\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019e\u019f\5\26\f\2\u019f\u01a0\7%\2\2\u01a0\u01a1\5\26\f\2"+
		"\u01a1\37\3\2\2\2\u01a2\u01a7\5*\26\2\u01a3\u01a4\7#\2\2\u01a4\u01a6\5"+
		"*\26\2\u01a5\u01a3\3\2\2\2\u01a6\u01a9\3\2\2\2\u01a7\u01a5\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8!\3\2\2\2\u01a9\u01a7\3\2\2\2\u01aa\u01ab\7F\2\2\u01ab"+
		"\u01ac\7%\2\2\u01ac\u01ad\5(\25\2\u01ad#\3\2\2\2\u01ae\u01b3\7F\2\2\u01af"+
		"\u01b0\7#\2\2\u01b0\u01b2\7F\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b5\3\2\2"+
		"\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4%\3\2\2\2\u01b5\u01b3"+
		"\3\2\2\2\u01b6\u01bb\5,\27\2\u01b7\u01b8\7\36\2\2\u01b8\u01ba\5,\27\2"+
		"\u01b9\u01b7\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc"+
		"\3\2\2\2\u01bc\'\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c4\5.\30\2\u01bf"+
		"\u01c0\5\60\31\2\u01c0\u01c1\7\17\2\2\u01c1\u01c2\5(\25\2\u01c2\u01c4"+
		"\3\2\2\2\u01c3\u01be\3\2\2\2\u01c3\u01bf\3\2\2\2\u01c4)\3\2\2\2\u01c5"+
		"\u01c6\7F\2\2\u01c6\u01c7\7\27\2\2\u01c7\u01c8\5\26\f\2\u01c8+\3\2\2\2"+
		"\u01c9\u01ce\7F\2\2\u01ca\u01cb\7&\2\2\u01cb\u01cc\5\24\13\2\u01cc\u01cd"+
		"\7\20\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01ca\3\2\2\2\u01ce\u01cf\3\2\2\2"+
		"\u01cf-\3\2\2\2\u01d0\u01f6\7\f\2\2\u01d1\u01f6\7\25\2\2\u01d2\u01f6\7"+
		"\21\2\2\u01d3\u01f6\7\32\2\2\u01d4\u01f6\7>\2\2\u01d5\u01d6\7\7\2\2\u01d6"+
		"\u01d7\7&\2\2\u01d7\u01d8\5(\25\2\u01d8\u01d9\7\20\2\2\u01d9\u01f6\3\2"+
		"\2\2\u01da\u01db\7\60\2\2\u01db\u01dc\7&\2\2\u01dc\u01dd\5(\25\2\u01dd"+
		"\u01de\7\20\2\2\u01de\u01f6\3\2\2\2\u01df\u01e0\7\23\2\2\u01e0\u01e1\7"+
		"&\2\2\u01e1\u01e2\5(\25\2\u01e2\u01e3\7\20\2\2\u01e3\u01f6\3\2\2\2\u01e4"+
		"\u01e5\7\31\2\2\u01e5\u01e6\7&\2\2\u01e6\u01e7\5(\25\2\u01e7\u01e8\7\20"+
		"\2\2\u01e8\u01f6\3\2\2\2\u01e9\u01ea\7?\2\2\u01ea\u01eb\7&\2\2\u01eb\u01ec"+
		"\5(\25\2\u01ec\u01ed\7\20\2\2\u01ed\u01f6\3\2\2\2\u01ee\u01f6\7F\2\2\u01ef"+
		"\u01f0\7&\2\2\u01f0\u01f1\5(\25\2\u01f1\u01f2\7\20\2\2\u01f2\u01f6\3\2"+
		"\2\2\u01f3\u01f4\7.\2\2\u01f4\u01f6\5\62\32\2\u01f5\u01d0\3\2\2\2\u01f5"+
		"\u01d1\3\2\2\2\u01f5\u01d2\3\2\2\2\u01f5\u01d3\3\2\2\2\u01f5\u01d4\3\2"+
		"\2\2\u01f5\u01d5\3\2\2\2\u01f5\u01da\3\2\2\2\u01f5\u01df\3\2\2\2\u01f5"+
		"\u01e4\3\2\2\2\u01f5\u01e9\3\2\2\2\u01f5\u01ee\3\2\2\2\u01f5\u01ef\3\2"+
		"\2\2\u01f5\u01f3\3\2\2\2\u01f6/\3\2\2\2\u01f7\u01fc\5.\30\2\u01f8\u01f9"+
		"\7C\2\2\u01f9\u01fb\5.\30\2\u01fa\u01f8\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\61\3\2\2\2\u01fe\u01fc\3\2\2"+
		"\2\u01ff\u0204\5\64\33\2\u0200\u0201\7\36\2\2\u0201\u0203\5\64\33\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\63\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020c\7F\2\2\u0208\u0209"+
		"\7&\2\2\u0209\u020a\58\35\2\u020a\u020b\7\20\2\2\u020b\u020d\3\2\2\2\u020c"+
		"\u0208\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020f\7("+
		"\2\2\u020f\u0211\7F\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\65\3\2\2\2\u0212\u0213\7F\2\2\u0213\u0215\7%\2\2\u0214\u0212\3\2\2\2"+
		"\u0214\u0215\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0217\5(\25\2\u0217\67"+
		"\3\2\2\2\u0218\u021d\5\66\34\2\u0219\u021a\7#\2\2\u021a\u021c\5\66\34"+
		"\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e9\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0225\5D#\2\u0221\u0225"+
		"\5F$\2\u0222\u0225\5H%\2\u0223\u0225\5@!\2\u0224\u0220\3\2\2\2\u0224\u0221"+
		"\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0223\3\2\2\2\u0225\u0226\3\2\2\2\u0226"+
		"\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227;\3\2\2\2\u0228\u022c\7\65\2\2"+
		"\u0229\u022a\5\22\n\2\u022a\u022b\7\67\2\2\u022b\u022d\3\2\2\2\u022c\u0229"+
		"\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"=\3\2\2\2\u0230\u0234\7\'\2\2\u0231\u0232\5\22\n\2\u0232\u0233\7\67\2"+
		"\2\u0233\u0235\3\2\2\2\u0234\u0231\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0234"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237?\3\2\2\2\u0238\u023a\5> \2\u0239\u0238"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\7\3\2\2\u023c"+
		"\u023e\5B\"\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u023d\3\2"+
		"\2\2\u023f\u0240\3\2\2\2\u0240A\3\2\2\2\u0241\u0242\5\26\f\2\u0242\u0243"+
		"\7\17\2\2\u0243\u0245\3\2\2\2\u0244\u0241\3\2\2\2\u0244\u0245\3\2\2\2"+
		"\u0245\u0246\3\2\2\2\u0246\u0247\5\26\f\2\u0247\u0248\7\27\2\2\u0248\u0249"+
		"\5\26\f\2\u0249\u024a\7\67\2\2\u024aC\3\2\2\2\u024b\u024d\7*\2\2\u024c"+
		"\u024e\5J&\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2"+
		"\2\u024f\u0250\3\2\2\2\u0250E\3\2\2\2\u0251\u0255\7\r\2\2\u0252\u0253"+
		"\5L\'\2\u0253\u0254\7\67\2\2\u0254\u0256\3\2\2\2\u0255\u0252\3\2\2\2\u0256"+
		"\u0257\3\2\2\2\u0257\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258G\3\2\2\2"+
		"\u0259\u025d\7\26\2\2\u025a\u025b\5L\'\2\u025b\u025c\7\67\2\2\u025c\u025e"+
		"\3\2\2\2\u025d\u025a\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d\3\2\2\2\u025f"+
		"\u0260\3\2\2\2\u0260I\3\2\2\2\u0261\u0262\5$\23\2\u0262\u0263\7\67\2\2"+
		"\u0263\u026a\3\2\2\2\u0264\u0265\7F\2\2\u0265\u0266\7\27\2\2\u0266\u0267"+
		"\5(\25\2\u0267\u0268\7\67\2\2\u0268\u026a\3\2\2\2\u0269\u0261\3\2\2\2"+
		"\u0269\u0264\3\2\2\2\u026aK\3\2\2\2\u026b\u026c\5$\23\2\u026c\u026d\7"+
		"%\2\2\u026d\u026e\5(\25\2\u026eM\3\2\2\2.jxz\u0084\u0090\u0092\u00c2\u00c7"+
		"\u00cc\u00ce\u00d9\u00db\u00e3\u00f0\u00f8\u0100\u013a\u0189\u018b\u0190"+
		"\u019b\u01a7\u01b3\u01bb\u01c3\u01ce\u01f5\u01fc\u0204\u020c\u0210\u0214"+
		"\u021d\u0224\u0226\u022e\u0236\u0239\u023f\u0244\u024f\u0257\u025f\u0269";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
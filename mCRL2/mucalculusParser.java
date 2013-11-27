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
		"':'", "'('", "'var'", "'?'", "'{'", "'sort'", "'|>'", "'true'", "'++'", 
		"'struct'", "'<|'", "'Set'", "'tau'", "'.'", "'=>'", "'+'", "'glob'", 
		"'forall'", "';'", "'&&'", "'delay'", "'nu'", "'||'", "'>'", "'exists'", 
		"'Real'", "'FBag'", "'=='", "'/'", "'>='", "'#'", "'end'", "'mu'", "ID", 
		"INT", "WS", "LINE_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_fixedPointOperator = 1, RULE_dataValExpr = 2, RULE_regFrm = 3, 
		RULE_varsDeclList = 4, RULE_varsDecl = 5, RULE_stateFrm = 6, RULE_actFrm = 7, 
		RULE_stateVarDecl = 8, RULE_stateVarAssignment = 9, RULE_stateVarAssignmentList = 10, 
		RULE_dataExprList = 11, RULE_dataExpr = 12, RULE_multAct = 13, RULE_bagEnumEltList = 14, 
		RULE_bagEnumElt = 15, RULE_assignmentList = 16, RULE_varDecl = 17, RULE_idList = 18, 
		RULE_actionList = 19, RULE_sortExpr = 20, RULE_assignment = 21, RULE_action = 22, 
		RULE_simpleSortExpr = 23, RULE_hashArgs = 24, RULE_constrDeclList = 25, 
		RULE_constrDecl = 26, RULE_projDecl = 27, RULE_projDeclList = 28, RULE_dataSpec = 29, 
		RULE_globVarSpec = 30, RULE_varSpec = 31, RULE_eqnSpec = 32, RULE_eqnDecl = 33, 
		RULE_sortSpec = 34, RULE_consSpec = 35, RULE_mapSpec = 36, RULE_sortDecl = 37, 
		RULE_idsDecl = 38;
	public static final String[] ruleNames = {
		"start", "fixedPointOperator", "dataValExpr", "regFrm", "varsDeclList", 
		"varsDecl", "stateFrm", "actFrm", "stateVarDecl", "stateVarAssignment", 
		"stateVarAssignmentList", "dataExprList", "dataExpr", "multAct", "bagEnumEltList", 
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
			setState(78); stateFrm(0);
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
			setState(82);
			switch (_input.LA(1)) {
			case 67:
				_localctx = new MuOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80); match(67);
				}
				break;
			case 56:
				_localctx = new NuOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81); match(56);
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
		enterRule(_localctx, 4, RULE_dataValExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84); match(26);
			setState(85); match(36);
			setState(86); ((DataValExprContext)_localctx).myDataExpr = dataExpr(0);
			setState(87); match(14);
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
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new BracketsRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90); match(36);
				setState(91); regFrm(0);
				setState(92); match(14);
				}
				break;

			case 2:
				{
				_localctx = new ActionFormulaRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94); actFrm(0);
				}
				break;

			case 3:
				{
				_localctx = new NilRegFormContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(95); match(10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new SequentialCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(98);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(99); ((SequentialCompositionRegFormContext)_localctx).mySeqSign = match(48);
						setState(100); regFrm(3);
						}
						break;

					case 2:
						{
						_localctx = new AlternativeCompositionRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(101);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(102); match(50);
						setState(103); regFrm(2);
						}
						break;

					case 3:
						{
						_localctx = new IterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(104);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(105); match(2);
						}
						break;

					case 4:
						{
						_localctx = new NonEmptyIterationRegFormContext(new RegFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_regFrm);
						setState(106);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(107); match(50);
						}
						break;
					}
					} 
				}
				setState(112);
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
		enterRule(_localctx, 8, RULE_varsDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); varsDecl();
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(114); match(33);
				setState(115); varsDecl();
				}
				}
				setState(120);
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
		enterRule(_localctx, 10, RULE_varsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); idList();
			setState(122); match(35);
			setState(123); sortExpr();
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
			setState(182);
			switch (_input.LA(1)) {
			case 29:
				{
				_localctx = new NegationStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(126); match(29);
				setState(127); stateFrm(13);
				}
				break;
			case 3:
				{
				_localctx = new BoxModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128); match(3);
				setState(129); regFrm(0);
				setState(130); match(30);
				setState(131); stateFrm(12);
				}
				break;
			case 4:
				{
				_localctx = new DiamondModalityStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133); match(4);
				setState(134); regFrm(0);
				setState(135); match(58);
				setState(136); stateFrm(11);
				}
				break;
			case 59:
				{
				_localctx = new ExistentialQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138); match(59);
				setState(139); varsDeclList();
				setState(140); match(48);
				setState(141); stateFrm(4);
				}
				break;
			case 52:
				{
				_localctx = new UniversalQuantifierStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(143); match(52);
				setState(144); varsDeclList();
				setState(145); match(48);
				setState(146); stateFrm(3);
				}
				break;
			case 67:
				{
				_localctx = new MuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148); match(67);
				setState(149); stateVarDecl();
				setState(150); match(48);
				setState(151); stateFrm(2);
				}
				break;
			case 56:
				{
				_localctx = new NuStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(153); match(56);
				setState(154); stateVarDecl();
				setState(155); match(48);
				setState(156); stateFrm(1);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158); dataValExpr();
				}
				break;
			case 36:
				{
				_localctx = new BracketsStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159); match(36);
				setState(160); stateFrm(0);
				setState(161); match(14);
				}
				break;
			case 42:
				{
				_localctx = new TrueStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164); match(6);
				}
				break;
			case ID:
				{
				_localctx = new PBESVariableStateFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165); match(ID);
				setState(170);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(166); match(36);
					setState(167); dataExprList();
					setState(168); match(14);
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
				setState(172); match(55);
				setState(175);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(173); match(18);
					setState(174); dataExpr(0);
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
				setState(177); match(25);
				setState(180);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(178); match(18);
					setState(179); dataExpr(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ConjunctionStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(184);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(185); match(54);
						setState(186); stateFrm(11);
						}
						break;

					case 2:
						{
						_localctx = new DisjunctionStateFmrContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(187);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(188); match(57);
						setState(189); stateFrm(10);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationStateFrmContext(new StateFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_stateFrm);
						setState(190);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(191); match(49);
						setState(192); stateFrm(9);
						}
						break;
					}
					} 
				}
				setState(197);
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
			unrollRecursionContexts(_parentctx);
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
		int _startState = 14;
		enterRecursionRule(_localctx, RULE_actFrm);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			switch (_input.LA(1)) {
			case 29:
				{
				_localctx = new NegationActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(199); match(29);
				setState(200); actFrm(9);
				}
				break;
			case 52:
				{
				_localctx = new UniversalQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201); match(52);
				setState(202); varsDeclList();
				setState(203); match(48);
				setState(204); actFrm(2);
				}
				break;
			case 59:
				{
				_localctx = new ExistentialQuantifierActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(206); match(59);
				setState(207); varsDeclList();
				setState(208); match(48);
				setState(209); actFrm(1);
				}
				break;
			case 26:
				{
				_localctx = new DataValueExpressionActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(211); dataValExpr();
				}
				break;
			case 36:
				{
				_localctx = new BracketsActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(212); match(36);
				setState(213); actFrm(0);
				setState(214); match(14);
				}
				break;
			case 47:
			case ID:
				{
				_localctx = new MultiActionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216); multAct();
				}
				break;
			case 42:
				{
				_localctx = new TrueActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(217); match(42);
				}
				break;
			case 6:
				{
				_localctx = new FalseActionFrmContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(218); match(6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new IntersectionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(221);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(222); match(54);
						setState(223); actFrm(6);
						}
						break;

					case 2:
						{
						_localctx = new UnionOfActionsContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(224);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(225); match(57);
						setState(226); actFrm(5);
						}
						break;

					case 3:
						{
						_localctx = new ImplicationContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(227);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(228); match(49);
						setState(229); actFrm(4);
						}
						break;

					case 4:
						{
						_localctx = new AtOperatorActionFrmContext(new ActFrmContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_actFrm);
						setState(230);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(231); match(18);
						setState(232); dataExpr(0);
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 16, RULE_stateVarDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); match(ID);
			setState(243);
			_la = _input.LA(1);
			if (_la==36) {
				{
				setState(239); match(36);
				setState(240); stateVarAssignmentList();
				setState(241); match(14);
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
		enterRule(_localctx, 18, RULE_stateVarAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); match(ID);
			setState(246); match(35);
			setState(247); sortExpr();
			setState(248); match(21);
			setState(249); dataExpr(0);
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
		enterRule(_localctx, 20, RULE_stateVarAssignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251); stateVarAssignment();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(252); match(33);
				setState(253); stateVarAssignment();
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
				setState(279); match(59);
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
				setState(298); match(35);
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
				setState(318); match(36);
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
						setState(358); match(58);
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
						setState(392); match(36);
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
		enterRule(_localctx, 28, RULE_bagEnumEltList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); bagEnumElt();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(411); match(33);
				setState(412); bagEnumElt();
				}
				}
				setState(417);
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
		enterRule(_localctx, 30, RULE_bagEnumElt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418); dataExpr(0);
			setState(419); match(35);
			setState(420); dataExpr(0);
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
		enterRule(_localctx, 32, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422); assignment();
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(423); match(33);
				setState(424); assignment();
				}
				}
				setState(429);
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
		enterRule(_localctx, 34, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430); match(ID);
			setState(431); match(35);
			setState(432); sortExpr();
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
		enterRule(_localctx, 36, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434); match(ID);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(435); match(33);
				setState(436); match(ID);
				}
				}
				setState(441);
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
		enterRule(_localctx, 38, RULE_actionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442); action();
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(443); match(28);
					setState(444); action();
					}
					} 
				}
				setState(449);
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
		enterRule(_localctx, 40, RULE_sortExpr);
		try {
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450); simpleSortExpr();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451); hashArgs();
				setState(452); match(13);
				setState(453); sortExpr();
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
		enterRule(_localctx, 42, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457); match(ID);
			setState(458); match(21);
			setState(459); dataExpr(0);
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
		enterRule(_localctx, 44, RULE_action);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461); match(ID);
			setState(466);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(462); match(36);
				setState(463); dataExprList();
				setState(464); match(14);
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
		enterRule(_localctx, 46, RULE_simpleSortExpr);
		try {
			setState(505);
			switch (_input.LA(1)) {
			case 9:
				_localctx = new BooleanSortContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(468); match(9);
				}
				break;
			case 19:
				_localctx = new PositiveNumSortContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(469); match(19);
				}
				break;
			case 15:
				_localctx = new NaturalNumSortContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(470); match(15);
				}
				break;
			case 24:
				_localctx = new IntegerSortContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(471); match(24);
				}
				break;
			case 60:
				_localctx = new RealSortContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(472); match(60);
				}
				break;
			case 5:
				_localctx = new ListSortContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(473); match(5);
				setState(474); match(36);
				setState(475); sortExpr();
				setState(476); match(14);
				}
				break;
			case 46:
				_localctx = new SetSortContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(478); match(46);
				setState(479); match(36);
				setState(480); sortExpr();
				setState(481); match(14);
				}
				break;
			case 17:
				_localctx = new BagSortContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(483); match(17);
				setState(484); match(36);
				setState(485); sortExpr();
				setState(486); match(14);
				}
				break;
			case 23:
				_localctx = new FiniteSetSortContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(488); match(23);
				setState(489); match(36);
				setState(490); sortExpr();
				setState(491); match(14);
				}
				break;
			case 61:
				_localctx = new FiniteBagSortContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(493); match(61);
				setState(494); match(36);
				setState(495); sortExpr();
				setState(496); match(14);
				}
				break;
			case ID:
				_localctx = new SortReferenceContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(498); match(ID);
				}
				break;
			case 36:
				_localctx = new ParenthesisSortContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(499); match(36);
				setState(500); sortExpr();
				setState(501); match(14);
				}
				break;
			case 44:
				_localctx = new StructuredSortContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(503); match(44);
				setState(504); constrDeclList();
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
		enterRule(_localctx, 48, RULE_hashArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507); simpleSortExpr();
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==65) {
				{
				{
				setState(508); match(65);
				setState(509); simpleSortExpr();
				}
				}
				setState(514);
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
		enterRule(_localctx, 50, RULE_constrDeclList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515); constrDecl();
			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(516); match(28);
					setState(517); constrDecl();
					}
					} 
				}
				setState(522);
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
		enterRule(_localctx, 52, RULE_constrDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); match(ID);
			setState(528);
			_la = _input.LA(1);
			if (_la==36) {
				{
				setState(524); match(36);
				setState(525); projDeclList();
				setState(526); match(14);
				}
			}

			setState(532);
			_la = _input.LA(1);
			if (_la==38) {
				{
				setState(530); match(38);
				setState(531); match(ID);
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
		enterRule(_localctx, 54, RULE_projDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(534); match(ID);
				setState(535); match(35);
				}
				break;
			}
			setState(538); sortExpr();
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
		enterRule(_localctx, 56, RULE_projDeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(540); projDecl();
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==33) {
				{
				{
				setState(541); match(33);
				setState(542); projDecl();
				}
				}
				setState(547);
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
		enterRule(_localctx, 58, RULE_dataSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(552);
				switch (_input.LA(1)) {
				case 40:
					{
					setState(548); sortSpec();
					}
					break;
				case 11:
					{
					setState(549); consSpec();
					}
					break;
				case 20:
					{
					setState(550); mapSpec();
					}
					break;
				case 1:
				case 37:
					{
					setState(551); eqnSpec();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(554); 
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
		enterRule(_localctx, 60, RULE_globVarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556); match(51);
			setState(560); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(557); varsDeclList();
				setState(558); match(53);
				}
				}
				setState(562); 
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
		enterRule(_localctx, 62, RULE_varSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564); match(37);
			setState(568); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(565); varsDeclList();
				setState(566); match(53);
				}
				}
				setState(570); 
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
		enterRule(_localctx, 64, RULE_eqnSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_la = _input.LA(1);
			if (_la==37) {
				{
				setState(572); varSpec();
				}
			}

			setState(575); match(1);
			setState(577); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(576); eqnDecl();
				}
				}
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 6) | (1L << 29) | (1L << 31) | (1L << 34) | (1L << 36) | (1L << 39) | (1L << 42) | (1L << 52) | (1L << 59))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (65 - 65)) | (1L << (ID - 65)) | (1L << (INT - 65)))) != 0) );
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
		enterRule(_localctx, 66, RULE_eqnDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(581); dataExpr(0);
				setState(582); match(13);
				}
				break;
			}
			setState(586); dataExpr(0);
			setState(587); match(21);
			setState(588); dataExpr(0);
			setState(589); match(53);
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
		enterRule(_localctx, 68, RULE_sortSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591); match(40);
			setState(593); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(592); sortDecl();
				}
				}
				setState(595); 
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
		enterRule(_localctx, 70, RULE_consSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597); match(11);
			setState(601); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(598); idsDecl();
				setState(599); match(53);
				}
				}
				setState(603); 
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
		enterRule(_localctx, 72, RULE_mapSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605); match(20);
			setState(609); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(606); idsDecl();
				setState(607); match(53);
				}
				}
				setState(611); 
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
		enterRule(_localctx, 74, RULE_sortDecl);
		try {
			setState(621);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613); idList();
				setState(614); match(53);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616); match(ID);
				setState(617); match(21);
				setState(618); sortExpr();
				setState(619); match(53);
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
		enterRule(_localctx, 76, RULE_idsDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623); idList();
			setState(624); match(35);
			setState(625); sortExpr();
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
		case 3: return regFrm_sempred((RegFrmContext)_localctx, predIndex);

		case 6: return stateFrm_sempred((StateFrmContext)_localctx, predIndex);

		case 7: return actFrm_sempred((ActFrmContext)_localctx, predIndex);

		case 12: return dataExpr_sempred((DataExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean actFrm_sempred(ActFrmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7: return 5 >= _localctx._p;

		case 8: return 4 >= _localctx._p;

		case 9: return 3 >= _localctx._p;

		case 10: return 6 >= _localctx._p;
		}
		return true;
	}
	private boolean regFrm_sempred(RegFrmContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;

		case 1: return 1 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;
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
		case 4: return 10 >= _localctx._p;

		case 5: return 9 >= _localctx._p;

		case 6: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3I\u0276\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\3\3\3\5\3"+
		"U\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5c\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5o\n\5\f\5\16\5r\13\5\3\6\3\6\3\6\7"+
		"\6w\n\6\f\6\16\6z\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00ad\n\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\b\3\b\3\b\5\b\u00b7"+
		"\n\b\5\b\u00b9\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00c4\n\b\f"+
		"\b\16\b\u00c7\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00de\n\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00ec\n\t\f\t\16\t\u00ef\13\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00f6\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u0101"+
		"\n\f\f\f\16\f\u0104\13\f\3\r\3\r\3\r\7\r\u0109\n\r\f\r\16\r\u010c\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0145\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0194\n\16\f\16\16"+
		"\16\u0197\13\16\3\17\3\17\5\17\u019b\n\17\3\20\3\20\3\20\7\20\u01a0\n"+
		"\20\f\20\16\20\u01a3\13\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\7\22\u01ac"+
		"\n\22\f\22\16\22\u01af\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\7\24\u01b8"+
		"\n\24\f\24\16\24\u01bb\13\24\3\25\3\25\3\25\7\25\u01c0\n\25\f\25\16\25"+
		"\u01c3\13\25\3\26\3\26\3\26\3\26\3\26\5\26\u01ca\n\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\5\30\u01d5\n\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\5\31\u01fc\n\31\3\32\3\32\3\32\7\32\u0201\n\32\f"+
		"\32\16\32\u0204\13\32\3\33\3\33\3\33\7\33\u0209\n\33\f\33\16\33\u020c"+
		"\13\33\3\34\3\34\3\34\3\34\3\34\5\34\u0213\n\34\3\34\3\34\5\34\u0217\n"+
		"\34\3\35\3\35\5\35\u021b\n\35\3\35\3\35\3\36\3\36\3\36\7\36\u0222\n\36"+
		"\f\36\16\36\u0225\13\36\3\37\3\37\3\37\3\37\6\37\u022b\n\37\r\37\16\37"+
		"\u022c\3 \3 \3 \3 \6 \u0233\n \r \16 \u0234\3!\3!\3!\3!\6!\u023b\n!\r"+
		"!\16!\u023c\3\"\5\"\u0240\n\"\3\"\3\"\6\"\u0244\n\"\r\"\16\"\u0245\3#"+
		"\3#\3#\5#\u024b\n#\3#\3#\3#\3#\3#\3$\3$\6$\u0254\n$\r$\16$\u0255\3%\3"+
		"%\3%\3%\6%\u025c\n%\r%\16%\u025d\3&\3&\3&\3&\6&\u0264\n&\r&\16&\u0265"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0270\n\'\3(\3(\3(\3(\3(\2)\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLN\2\2"+
		"\u02c5\2P\3\2\2\2\4T\3\2\2\2\6V\3\2\2\2\bb\3\2\2\2\ns\3\2\2\2\f{\3\2\2"+
		"\2\16\u00b8\3\2\2\2\20\u00dd\3\2\2\2\22\u00f0\3\2\2\2\24\u00f7\3\2\2\2"+
		"\26\u00fd\3\2\2\2\30\u0105\3\2\2\2\32\u0144\3\2\2\2\34\u019a\3\2\2\2\36"+
		"\u019c\3\2\2\2 \u01a4\3\2\2\2\"\u01a8\3\2\2\2$\u01b0\3\2\2\2&\u01b4\3"+
		"\2\2\2(\u01bc\3\2\2\2*\u01c9\3\2\2\2,\u01cb\3\2\2\2.\u01cf\3\2\2\2\60"+
		"\u01fb\3\2\2\2\62\u01fd\3\2\2\2\64\u0205\3\2\2\2\66\u020d\3\2\2\28\u021a"+
		"\3\2\2\2:\u021e\3\2\2\2<\u022a\3\2\2\2>\u022e\3\2\2\2@\u0236\3\2\2\2B"+
		"\u023f\3\2\2\2D\u024a\3\2\2\2F\u0251\3\2\2\2H\u0257\3\2\2\2J\u025f\3\2"+
		"\2\2L\u026f\3\2\2\2N\u0271\3\2\2\2PQ\5\16\b\2Q\3\3\2\2\2RU\7E\2\2SU\7"+
		":\2\2TR\3\2\2\2TS\3\2\2\2U\5\3\2\2\2VW\7\34\2\2WX\7&\2\2XY\5\32\16\2Y"+
		"Z\7\20\2\2Z\7\3\2\2\2[\\\b\5\1\2\\]\7&\2\2]^\5\b\5\2^_\7\20\2\2_c\3\2"+
		"\2\2`c\5\20\t\2ac\7\f\2\2b[\3\2\2\2b`\3\2\2\2ba\3\2\2\2cp\3\2\2\2de\6"+
		"\5\2\3ef\7\62\2\2fo\5\b\5\2gh\6\5\3\3hi\7\64\2\2io\5\b\5\2jk\6\5\4\3k"+
		"o\7\4\2\2lm\6\5\5\3mo\7\64\2\2nd\3\2\2\2ng\3\2\2\2nj\3\2\2\2nl\3\2\2\2"+
		"or\3\2\2\2pn\3\2\2\2pq\3\2\2\2q\t\3\2\2\2rp\3\2\2\2sx\5\f\7\2tu\7#\2\2"+
		"uw\5\f\7\2vt\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\13\3\2\2\2zx\3\2\2"+
		"\2{|\5&\24\2|}\7%\2\2}~\5*\26\2~\r\3\2\2\2\177\u0080\b\b\1\2\u0080\u0081"+
		"\7\37\2\2\u0081\u00b9\5\16\b\2\u0082\u0083\7\5\2\2\u0083\u0084\5\b\5\2"+
		"\u0084\u0085\7 \2\2\u0085\u0086\5\16\b\2\u0086\u00b9\3\2\2\2\u0087\u0088"+
		"\7\6\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7<\2\2\u008a\u008b\5\16\b\2\u008b"+
		"\u00b9\3\2\2\2\u008c\u008d\7=\2\2\u008d\u008e\5\n\6\2\u008e\u008f\7\62"+
		"\2\2\u008f\u0090\5\16\b\2\u0090\u00b9\3\2\2\2\u0091\u0092\7\66\2\2\u0092"+
		"\u0093\5\n\6\2\u0093\u0094\7\62\2\2\u0094\u0095\5\16\b\2\u0095\u00b9\3"+
		"\2\2\2\u0096\u0097\7E\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\62\2\2\u0099"+
		"\u009a\5\16\b\2\u009a\u00b9\3\2\2\2\u009b\u009c\7:\2\2\u009c\u009d\5\22"+
		"\n\2\u009d\u009e\7\62\2\2\u009e\u009f\5\16\b\2\u009f\u00b9\3\2\2\2\u00a0"+
		"\u00b9\5\6\4\2\u00a1\u00a2\7&\2\2\u00a2\u00a3\5\16\b\2\u00a3\u00a4\7\20"+
		"\2\2\u00a4\u00b9\3\2\2\2\u00a5\u00b9\7,\2\2\u00a6\u00b9\7\b\2\2\u00a7"+
		"\u00ac\7F\2\2\u00a8\u00a9\7&\2\2\u00a9\u00aa\5\30\r\2\u00aa\u00ab\7\20"+
		"\2\2\u00ab\u00ad\3\2\2\2\u00ac\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00b9\3\2\2\2\u00ae\u00b1\79\2\2\u00af\u00b0\7\24\2\2\u00b0\u00b2\5\32"+
		"\16\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b9\3\2\2\2\u00b3"+
		"\u00b6\7\33\2\2\u00b4\u00b5\7\24\2\2\u00b5\u00b7\5\32\16\2\u00b6\u00b4"+
		"\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\177\3\2\2\2\u00b8"+
		"\u0082\3\2\2\2\u00b8\u0087\3\2\2\2\u00b8\u008c\3\2\2\2\u00b8\u0091\3\2"+
		"\2\2\u00b8\u0096\3\2\2\2\u00b8\u009b\3\2\2\2\u00b8\u00a0\3\2\2\2\u00b8"+
		"\u00a1\3\2\2\2\u00b8\u00a5\3\2\2\2\u00b8\u00a6\3\2\2\2\u00b8\u00a7\3\2"+
		"\2\2\u00b8\u00ae\3\2\2\2\u00b8\u00b3\3\2\2\2\u00b9\u00c5\3\2\2\2\u00ba"+
		"\u00bb\6\b\6\3\u00bb\u00bc\78\2\2\u00bc\u00c4\5\16\b\2\u00bd\u00be\6\b"+
		"\7\3\u00be\u00bf\7;\2\2\u00bf\u00c4\5\16\b\2\u00c0\u00c1\6\b\b\3\u00c1"+
		"\u00c2\7\63\2\2\u00c2\u00c4\5\16\b\2\u00c3\u00ba\3\2\2\2\u00c3\u00bd\3"+
		"\2\2\2\u00c3\u00c0\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\17\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\b\t\1"+
		"\2\u00c9\u00ca\7\37\2\2\u00ca\u00de\5\20\t\2\u00cb\u00cc\7\66\2\2\u00cc"+
		"\u00cd\5\n\6\2\u00cd\u00ce\7\62\2\2\u00ce\u00cf\5\20\t\2\u00cf\u00de\3"+
		"\2\2\2\u00d0\u00d1\7=\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\7\62\2\2\u00d3"+
		"\u00d4\5\20\t\2\u00d4\u00de\3\2\2\2\u00d5\u00de\5\6\4\2\u00d6\u00d7\7"+
		"&\2\2\u00d7\u00d8\5\20\t\2\u00d8\u00d9\7\20\2\2\u00d9\u00de\3\2\2\2\u00da"+
		"\u00de\5\34\17\2\u00db\u00de\7,\2\2\u00dc\u00de\7\b\2\2\u00dd\u00c8\3"+
		"\2\2\2\u00dd\u00cb\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd"+
		"\u00d6\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2"+
		"\2\2\u00de\u00ed\3\2\2\2\u00df\u00e0\6\t\t\3\u00e0\u00e1\78\2\2\u00e1"+
		"\u00ec\5\20\t\2\u00e2\u00e3\6\t\n\3\u00e3\u00e4\7;\2\2\u00e4\u00ec\5\20"+
		"\t\2\u00e5\u00e6\6\t\13\3\u00e6\u00e7\7\63\2\2\u00e7\u00ec\5\20\t\2\u00e8"+
		"\u00e9\6\t\f\3\u00e9\u00ea\7\24\2\2\u00ea\u00ec\5\32\16\2\u00eb\u00df"+
		"\3\2\2\2\u00eb\u00e2\3\2\2\2\u00eb\u00e5\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\21\3\2\2"+
		"\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\7F\2\2\u00f1\u00f2\7&\2\2\u00f2\u00f3"+
		"\5\26\f\2\u00f3\u00f4\7\20\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f1\3\2\2\2"+
		"\u00f5\u00f6\3\2\2\2\u00f6\23\3\2\2\2\u00f7\u00f8\7F\2\2\u00f8\u00f9\7"+
		"%\2\2\u00f9\u00fa\5*\26\2\u00fa\u00fb\7\27\2\2\u00fb\u00fc\5\32\16\2\u00fc"+
		"\25\3\2\2\2\u00fd\u0102\5\24\13\2\u00fe\u00ff\7#\2\2\u00ff\u0101\5\24"+
		"\13\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\27\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a\5\32\16"+
		"\2\u0106\u0107\7#\2\2\u0107\u0109\5\32\16\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\31\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010d\u010e\b\16\1\2\u010e\u010f\7\37\2\2\u010f"+
		"\u0145\5\32\16\2\u0110\u0111\7$\2\2\u0111\u0145\5\32\16\2\u0112\u0113"+
		"\7C\2\2\u0113\u0145\5\32\16\2\u0114\u0115\7\66\2\2\u0115\u0116\5\n\6\2"+
		"\u0116\u0117\7\62\2\2\u0117\u0118\5\32\16\2\u0118\u0145\3\2\2\2\u0119"+
		"\u011a\7=\2\2\u011a\u011b\5\n\6\2\u011b\u011c\7\62\2\2\u011c\u011d\5\32"+
		"\16\2\u011d\u0145\3\2\2\2\u011e\u011f\7!\2\2\u011f\u0120\5\n\6\2\u0120"+
		"\u0121\7\62\2\2\u0121\u0122\5\32\16\2\u0122\u0145\3\2\2\2\u0123\u0145"+
		"\7F\2\2\u0124\u0145\7G\2\2\u0125\u0145\7,\2\2\u0126\u0145\7\b\2\2\u0127"+
		"\u0128\7\5\2\2\u0128\u0145\7 \2\2\u0129\u012a\7)\2\2\u012a\u0145\7\16"+
		"\2\2\u012b\u012c\7)\2\2\u012c\u012d\7%\2\2\u012d\u0145\7\16\2\2\u012e"+
		"\u012f\7\5\2\2\u012f\u0130\5\30\r\2\u0130\u0131\7 \2\2\u0131\u0145\3\2"+
		"\2\2\u0132\u0133\7)\2\2\u0133\u0134\5\36\20\2\u0134\u0135\7\16\2\2\u0135"+
		"\u0145\3\2\2\2\u0136\u0137\7)\2\2\u0137\u0138\5$\23\2\u0138\u0139\7\36"+
		"\2\2\u0139\u013a\5\32\16\2\u013a\u013b\7\16\2\2\u013b\u0145\3\2\2\2\u013c"+
		"\u013d\7)\2\2\u013d\u013e\5\30\r\2\u013e\u013f\7\16\2\2\u013f\u0145\3"+
		"\2\2\2\u0140\u0141\7&\2\2\u0141\u0142\5\32\16\2\u0142\u0143\7\20\2\2\u0143"+
		"\u0145\3\2\2\2\u0144\u010d\3\2\2\2\u0144\u0110\3\2\2\2\u0144\u0112\3\2"+
		"\2\2\u0144\u0114\3\2\2\2\u0144\u0119\3\2\2\2\u0144\u011e\3\2\2\2\u0144"+
		"\u0123\3\2\2\2\u0144\u0124\3\2\2\2\u0144\u0125\3\2\2\2\u0144\u0126\3\2"+
		"\2\2\u0144\u0127\3\2\2\2\u0144\u0129\3\2\2\2\u0144\u012b\3\2\2\2\u0144"+
		"\u012e\3\2\2\2\u0144\u0132\3\2\2\2\u0144\u0136\3\2\2\2\u0144\u013c\3\2"+
		"\2\2\u0144\u0140\3\2\2\2\u0145\u0195\3\2\2\2\u0146\u0147\6\16\r\3\u0147"+
		"\u0148\7\62\2\2\u0148\u0194\5\32\16\2\u0149\u014a\6\16\16\3\u014a\u014b"+
		"\7\4\2\2\u014b\u0194\5\32\16\2\u014c\u014d\6\16\17\3\u014d\u014e\7\35"+
		"\2\2\u014e\u0194\5\32\16\2\u014f\u0150\6\16\20\3\u0150\u0151\7\30\2\2"+
		"\u0151\u0194\5\32\16\2\u0152\u0153\6\16\21\3\u0153\u0154\7A\2\2\u0154"+
		"\u0194\5\32\16\2\u0155\u0156\6\16\22\3\u0156\u0157\7$\2\2\u0157\u0194"+
		"\5\32\16\2\u0158\u0159\6\16\23\3\u0159\u015a\7\64\2\2\u015a\u0194\5\32"+
		"\16\2\u015b\u015c\6\16\24\3\u015c\u015d\7-\2\2\u015d\u0194\5\32\16\2\u015e"+
		"\u015f\6\16\25\3\u015f\u0160\7/\2\2\u0160\u0194\5\32\16\2\u0161\u0162"+
		"\6\16\26\3\u0162\u0163\7+\2\2\u0163\u0194\5\32\16\2\u0164\u0165\6\16\27"+
		"\3\u0165\u0166\7\"\2\2\u0166\u0194\5\32\16\2\u0167\u0168\6\16\30\3\u0168"+
		"\u0169\7<\2\2\u0169\u0194\5\32\16\2\u016a\u016b\6\16\31\3\u016b\u016c"+
		"\7B\2\2\u016c\u0194\5\32\16\2\u016d\u016e\6\16\32\3\u016e\u016f\7\n\2"+
		"\2\u016f\u0194\5\32\16\2\u0170\u0171\6\16\33\3\u0171\u0172\7\6\2\2\u0172"+
		"\u0194\5\32\16\2\u0173\u0174\6\16\34\3\u0174\u0175\7\t\2\2\u0175\u0194"+
		"\5\32\16\2\u0176\u0177\6\16\35\3\u0177\u0178\7@\2\2\u0178\u0194\5\32\16"+
		"\2\u0179\u017a\6\16\36\3\u017a\u017b\78\2\2\u017b\u0194\5\32\16\2\u017c"+
		"\u017d\6\16\37\3\u017d\u017e\7;\2\2\u017e\u0194\5\32\16\2\u017f\u0180"+
		"\6\16 \3\u0180\u0181\7\63\2\2\u0181\u0194\5\32\16\2\u0182\u0183\6\16!"+
		"\3\u0183\u0184\7\5\2\2\u0184\u0185\5\32\16\2\u0185\u0186\7\17\2\2\u0186"+
		"\u0187\5\32\16\2\u0187\u0188\7 \2\2\u0188\u0194\3\2\2\2\u0189\u018a\6"+
		"\16\"\3\u018a\u018b\7&\2\2\u018b\u018c\5\30\r\2\u018c\u018d\7\20\2\2\u018d"+
		"\u0194\3\2\2\2\u018e\u018f\6\16#\3\u018f\u0190\7\22\2\2\u0190\u0191\5"+
		"\"\22\2\u0191\u0192\7D\2\2\u0192\u0194\3\2\2\2\u0193\u0146\3\2\2\2\u0193"+
		"\u0149\3\2\2\2\u0193\u014c\3\2\2\2\u0193\u014f\3\2\2\2\u0193\u0152\3\2"+
		"\2\2\u0193\u0155\3\2\2\2\u0193\u0158\3\2\2\2\u0193\u015b\3\2\2\2\u0193"+
		"\u015e\3\2\2\2\u0193\u0161\3\2\2\2\u0193\u0164\3\2\2\2\u0193\u0167\3\2"+
		"\2\2\u0193\u016a\3\2\2\2\u0193\u016d\3\2\2\2\u0193\u0170\3\2\2\2\u0193"+
		"\u0173\3\2\2\2\u0193\u0176\3\2\2\2\u0193\u0179\3\2\2\2\u0193\u017c\3\2"+
		"\2\2\u0193\u017f\3\2\2\2\u0193\u0182\3\2\2\2\u0193\u0189\3\2\2\2\u0193"+
		"\u018e\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2"+
		"\2\2\u0196\33\3\2\2\2\u0197\u0195\3\2\2\2\u0198\u019b\7\61\2\2\u0199\u019b"+
		"\5(\25\2\u019a\u0198\3\2\2\2\u019a\u0199\3\2\2\2\u019b\35\3\2\2\2\u019c"+
		"\u01a1\5 \21\2\u019d\u019e\7#\2\2\u019e\u01a0\5 \21\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\37\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5\5\32\16\2\u01a5\u01a6\7%\2"+
		"\2\u01a6\u01a7\5\32\16\2\u01a7!\3\2\2\2\u01a8\u01ad\5,\27\2\u01a9\u01aa"+
		"\7#\2\2\u01aa\u01ac\5,\27\2\u01ab\u01a9\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae#\3\2\2\2\u01af\u01ad\3\2\2\2"+
		"\u01b0\u01b1\7F\2\2\u01b1\u01b2\7%\2\2\u01b2\u01b3\5*\26\2\u01b3%\3\2"+
		"\2\2\u01b4\u01b9\7F\2\2\u01b5\u01b6\7#\2\2\u01b6\u01b8\7F\2\2\u01b7\u01b5"+
		"\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba"+
		"\'\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01c1\5.\30\2\u01bd\u01be\7\36\2"+
		"\2\u01be\u01c0\5.\30\2\u01bf\u01bd\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2)\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4"+
		"\u01ca\5\60\31\2\u01c5\u01c6\5\62\32\2\u01c6\u01c7\7\17\2\2\u01c7\u01c8"+
		"\5*\26\2\u01c8\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01c9\u01c5\3\2\2\2\u01ca"+
		"+\3\2\2\2\u01cb\u01cc\7F\2\2\u01cc\u01cd\7\27\2\2\u01cd\u01ce\5\32\16"+
		"\2\u01ce-\3\2\2\2\u01cf\u01d4\7F\2\2\u01d0\u01d1\7&\2\2\u01d1\u01d2\5"+
		"\30\r\2\u01d2\u01d3\7\20\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d0\3\2\2\2\u01d4"+
		"\u01d5\3\2\2\2\u01d5/\3\2\2\2\u01d6\u01fc\7\13\2\2\u01d7\u01fc\7\25\2"+
		"\2\u01d8\u01fc\7\21\2\2\u01d9\u01fc\7\32\2\2\u01da\u01fc\7>\2\2\u01db"+
		"\u01dc\7\7\2\2\u01dc\u01dd\7&\2\2\u01dd\u01de\5*\26\2\u01de\u01df\7\20"+
		"\2\2\u01df\u01fc\3\2\2\2\u01e0\u01e1\7\60\2\2\u01e1\u01e2\7&\2\2\u01e2"+
		"\u01e3\5*\26\2\u01e3\u01e4\7\20\2\2\u01e4\u01fc\3\2\2\2\u01e5\u01e6\7"+
		"\23\2\2\u01e6\u01e7\7&\2\2\u01e7\u01e8\5*\26\2\u01e8\u01e9\7\20\2\2\u01e9"+
		"\u01fc\3\2\2\2\u01ea\u01eb\7\31\2\2\u01eb\u01ec\7&\2\2\u01ec\u01ed\5*"+
		"\26\2\u01ed\u01ee\7\20\2\2\u01ee\u01fc\3\2\2\2\u01ef\u01f0\7?\2\2\u01f0"+
		"\u01f1\7&\2\2\u01f1\u01f2\5*\26\2\u01f2\u01f3\7\20\2\2\u01f3\u01fc\3\2"+
		"\2\2\u01f4\u01fc\7F\2\2\u01f5\u01f6\7&\2\2\u01f6\u01f7\5*\26\2\u01f7\u01f8"+
		"\7\20\2\2\u01f8\u01fc\3\2\2\2\u01f9\u01fa\7.\2\2\u01fa\u01fc\5\64\33\2"+
		"\u01fb\u01d6\3\2\2\2\u01fb\u01d7\3\2\2\2\u01fb\u01d8\3\2\2\2\u01fb\u01d9"+
		"\3\2\2\2\u01fb\u01da\3\2\2\2\u01fb\u01db\3\2\2\2\u01fb\u01e0\3\2\2\2\u01fb"+
		"\u01e5\3\2\2\2\u01fb\u01ea\3\2\2\2\u01fb\u01ef\3\2\2\2\u01fb\u01f4\3\2"+
		"\2\2\u01fb\u01f5\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc\61\3\2\2\2\u01fd\u0202"+
		"\5\60\31\2\u01fe\u01ff\7C\2\2\u01ff\u0201\5\60\31\2\u0200\u01fe\3\2\2"+
		"\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203\63"+
		"\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u020a\5\66\34\2\u0206\u0207\7\36\2"+
		"\2\u0207\u0209\5\66\34\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\65\3\2\2\2\u020c\u020a\3\2\2"+
		"\2\u020d\u0212\7F\2\2\u020e\u020f\7&\2\2\u020f\u0210\5:\36\2\u0210\u0211"+
		"\7\20\2\2\u0211\u0213\3\2\2\2\u0212\u020e\3\2\2\2\u0212\u0213\3\2\2\2"+
		"\u0213\u0216\3\2\2\2\u0214\u0215\7(\2\2\u0215\u0217\7F\2\2\u0216\u0214"+
		"\3\2\2\2\u0216\u0217\3\2\2\2\u0217\67\3\2\2\2\u0218\u0219\7F\2\2\u0219"+
		"\u021b\7%\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\3\2"+
		"\2\2\u021c\u021d\5*\26\2\u021d9\3\2\2\2\u021e\u0223\58\35\2\u021f\u0220"+
		"\7#\2\2\u0220\u0222\58\35\2\u0221\u021f\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224;\3\2\2\2\u0225\u0223\3\2\2\2"+
		"\u0226\u022b\5F$\2\u0227\u022b\5H%\2\u0228\u022b\5J&\2\u0229\u022b\5B"+
		"\"\2\u022a\u0226\3\2\2\2\u022a\u0227\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2"+
		"\2\2\u022d=\3\2\2\2\u022e\u0232\7\65\2\2\u022f\u0230\5\n\6\2\u0230\u0231"+
		"\7\67\2\2\u0231\u0233\3\2\2\2\u0232\u022f\3\2\2\2\u0233\u0234\3\2\2\2"+
		"\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235?\3\2\2\2\u0236\u023a\7"+
		"\'\2\2\u0237\u0238\5\n\6\2\u0238\u0239\7\67\2\2\u0239\u023b\3\2\2\2\u023a"+
		"\u0237\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023a\3\2\2\2\u023c\u023d\3\2"+
		"\2\2\u023dA\3\2\2\2\u023e\u0240\5@!\2\u023f\u023e\3\2\2\2\u023f\u0240"+
		"\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0243\7\3\2\2\u0242\u0244\5D#\2\u0243"+
		"\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2"+
		"\2\2\u0246C\3\2\2\2\u0247\u0248\5\32\16\2\u0248\u0249\7\17\2\2\u0249\u024b"+
		"\3\2\2\2\u024a\u0247\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c"+
		"\u024d\5\32\16\2\u024d\u024e\7\27\2\2\u024e\u024f\5\32\16\2\u024f\u0250"+
		"\7\67\2\2\u0250E\3\2\2\2\u0251\u0253\7*\2\2\u0252\u0254\5L\'\2\u0253\u0252"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0253\3\2\2\2\u0255\u0256\3\2\2\2\u0256"+
		"G\3\2\2\2\u0257\u025b\7\r\2\2\u0258\u0259\5N(\2\u0259\u025a\7\67\2\2\u025a"+
		"\u025c\3\2\2\2\u025b\u0258\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025b\3\2"+
		"\2\2\u025d\u025e\3\2\2\2\u025eI\3\2\2\2\u025f\u0263\7\26\2\2\u0260\u0261"+
		"\5N(\2\u0261\u0262\7\67\2\2\u0262\u0264\3\2\2\2\u0263\u0260\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266\3\2\2\2\u0266K\3\2\2\2"+
		"\u0267\u0268\5&\24\2\u0268\u0269\7\67\2\2\u0269\u0270\3\2\2\2\u026a\u026b"+
		"\7F\2\2\u026b\u026c\7\27\2\2\u026c\u026d\5*\26\2\u026d\u026e\7\67\2\2"+
		"\u026e\u0270\3\2\2\2\u026f\u0267\3\2\2\2\u026f\u026a\3\2\2\2\u0270M\3"+
		"\2\2\2\u0271\u0272\5&\24\2\u0272\u0273\7%\2\2\u0273\u0274\5*\26\2\u0274"+
		"O\3\2\2\2/Tbnpx\u00ac\u00b1\u00b6\u00b8\u00c3\u00c5\u00dd\u00eb\u00ed"+
		"\u00f5\u0102\u010a\u0144\u0193\u0195\u019a\u01a1\u01ad\u01b9\u01c1\u01c9"+
		"\u01d4\u01fb\u0202\u020a\u0212\u0216\u021a\u0223\u022a\u022c\u0234\u023c"+
		"\u023f\u0245\u024a\u0255\u025d\u0265\u026f";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
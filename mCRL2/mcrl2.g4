// Author(s): Wieger Wesselink
grammar mcrl2;
start : mCRL2Spec ;

//--- mCRL2 specification

mCRL2Spec: mCRL2SpecElt* init mCRL2SpecElt* ;                    // MCRL2 specification

mCRL2SpecElt
  : sortSpec                                                # SortmCRL2SpecElt    // Sort specification
  | consSpec                                                # ConsmCRL2SpecElt     // Constructor specification
  | mapSpec                                                 # MapmCRL2SpecElt     // Map specification
  | eqnSpec                                                 # EqnmCRL2SpecElt     // Equation specification
  | globVarSpec                                             # GlobalVarmCRL2SpecElt     // Global variable specification
  | actSpec                                                 # ActmCRL2SpecElt     // action specification
  | procSpec                                                # ProcmCRL2SpecElt     // Process specification
  ;
  
//--- Sort expressions and sort declarations

simpleSortExpr
  : 'Bool'                                                 # BooleanSort      // Booleans
  | 'Pos'                                                  # PositiveSort      // Positive numbers
  | 'Nat'                                                  # NaturalSort      // Natural numbers
  | 'Int'                                                  # IntegerSort      // Integers
  | 'Real'                                                 # RealSort      // Reals
  | 'List' '(' sortExpr ')'                                # ListSort      // List sort
  | 'Set' '(' sortExpr ')'                                 # SetSort      // Set sort
  | 'Bag' '(' sortExpr ')'                                 # BagSort      // Bag sort
  | 'FSet' '(' sortExpr ')'                                # FSetSort      // Finite set sort
  | 'FBag' '(' sortExpr ')'                                # FBagSort      // Finite bag sort
  | ID                                                     # SortRefSort      // Sort reference
  | '(' sortExpr ')'                                       # sortSimpleExpr      // Sort expression with parentheses
  | 'struct' constrDeclList                                # StructuredSort      // Structured sort
  ;

sortExpr
  : simpleSortExpr # SortExprSimpleSortExpr
  | hashArgs '->' sortExpr # FunctionSort;                                     // Function sort

sortExprList: (sortExpr '#')* sortExpr ;                         // Product sort

hashArgs: simpleSortExpr ('#' simpleSortExpr)* ;                 // Simple product sort

sortSpec: 'sort' sortDecl+ ;                                     // Sort specification

sortDecl
  : idList ';'                                                   // List of sort identifiers
  | ID '=' sortExpr ';'                                          // Sort alias
  ;

constrDecl: ID ( '(' projDeclList ')' )? ( '?' ID )? ;           // Constructor declaration

constrDeclList: constrDecl ( '|' constrDecl )* ;                 // Constructor declaration list

projDecl: ( ID ':' )? sortExpr ;                                 // Domain with optional projection

projDeclList: projDecl ( ',' projDecl )* ;                       // Declaration of projection functions

//--- Constructors and mappings

idsDecl: idList ':' sortExpr ;                                   // Typed parameters

consSpec: 'cons' ( idsDecl ';' )+ ;                              // Declaration of constructors

mapSpec: 'map' ( idsDecl ';' )+ ;                                // Declaration of mappings

//--- Equations

globVarSpec: 'glob' ( varsDeclList ';' )+ ;                      // Declaration of global variables

varSpec: 'var' ( varsDeclList ';' )+ ;                           // Declaration of variables

eqnSpec: varSpec? 'eqn' eqnDecl+ ;                               // Definition of equations

eqnDecl: (dataExpr '->')? dataExpr '=' dataExpr ';' ;            // Conditional equation

//--- Data expressions

varDecl: ID ':' sortExpr ;                                       // Typed variable

varsDecl: idList ':' sortExpr ;                                  // Typed variables

varsDeclList: varsDecl ( ',' varsDecl )* ;                       // Individually typed variables


dataExpr: ID                                          # IdentifierDataExpr                // Identifier
  | INT                                               # NumberDataExpr       // Number
  | 'true'                                            # TrueDataExpr          // True
  | 'false'                                           # FalseDataExpr          // False
  | '[' ']'                                           # EmptyListDataExpr          // Empty list
  | '{' '}'                                           # EmptySetDataExpr          // Empty set
  | '{'':''}'                                         # EmptyBagDataExpr          // Empty bag
  | '[' dataExprList ']'                              # ListEnumerationDataExpr          // List enumeration
  | '{' bagEnumEltList '}'                            # BagEnumerationDataExpr          // Bag enumeration
  | '{' varDecl '|' dataExpr '}'                      # SetBagComprehensionDataExpr         // Set/bag comprehension
  | '{' dataExprList '}'                              # SetEnumerationDataExpr          // Set enumeration
  | '(' dataExpr ')'                                  # BracketsDataExpr          // Brackets
  | dataExpr '[' dataExpr '->' dataExpr ']'   		# FunctionUpdateDataExpr 	// Function update
  | dataExpr '(' dataExprList ')'               	# FunctionApplicationDataExpr		// Function application
  | '!' dataExpr                                	# NegationSetComplementDataExpr	// Negation, set complement
  | '-' dataExpr                               	# UnaryMinusDataExpr	// Unary minus
  | '#' dataExpr                                	# ListSizeDataExpr	 // Size of a list
  | 'forall' varsDeclList '.' dataExpr           	# UniversalQuantifierDataExpr// Universal quantifier
  | 'exists' varsDeclList '.' dataExpr          	# ExistentialQuantifierDataExpr	// Existential quantifier
  | 'lambda' varsDeclList '.' dataExpr         	# LambdaDataExpr	// Lambda abstraction
  | dataExpr '.' dataExpr                   		# ListElemPositionDataExpr	// List element at position
  | dataExpr '*' dataExpr                   		# MultiplicationDataExpr	// Multiplication, set/bag intersection
  | dataExpr 'mod' dataExpr                 		# IntegerModDataExpr	// Integer mod
  | dataExpr 'div' dataExpr                 		# IntegerDivDataExpr	// Integer div
  | dataExpr '/' dataExpr                   		# DivisionDataExpr	// Division
  | dataExpr '-' dataExpr                  		# SubtractionDataExpr	// Subtraction, set/bag difference
  | dataExpr '+' dataExpr                   		# AdditionDataExpr	// Addition, set/bag union
  | dataExpr '++' dataExpr                   		# ListConcatenationDataExpr	// List concatenation
  | dataExpr '<|' dataExpr                   		# ListSnocDataExpr	// List snoc
  | dataExpr '|>' dataExpr                  		# ListConsDataExpr	// List cons
  | dataExpr 'in' dataExpr                   		# MemberShipSetBagDataExpr	// Set, bag, list membership
  | dataExpr '>' dataExpr                    		# LargerDataExpr	// Larger
  | dataExpr '>=' dataExpr                   		# LargerEqualDataExpr	// Larger equal
  | dataExpr '<=' dataExpr                   		# SmallerEqualDataExpr	// Smaller equal
  | dataExpr '<' dataExpr                    		# SmallerDataExpr	// Smaller
  | dataExpr '!=' dataExpr                   		# InequalityDataExpr	// Inequality
  | dataExpr '==' dataExpr                   		# EqualityDataExpr	// Equality
  | dataExpr '&&' dataExpr                  		# DisjunctionDataExpr	// Disjunction
  | dataExpr '||' dataExpr                  		# ConjunctionDataExpr	// Conjunction
  | dataExpr '=>' dataExpr                  		# ImplicationDataExpr	// Implication
  | dataExpr 'whr' assignmentList 'end'           	# WhereClauseDataExpr	// Where clause
  ;
  
  
dataExprUnit
  : ID                                                           // Identifier
  | INT                                                       // Number
  | 'true'                                                       // True
  | 'false'                                                      // False
  | '(' dataExpr ')'                                             // Bracket
  | dataExprUnit '(' dataExprList ')'             // Function application
  | '!' dataExprUnit                              // Negation, set complement
  | '-' dataExprUnit                              // Unary minus
  | '#' dataExprUnit                        	  // Size of a list
  ;


assignmentList: assignment ( ',' assignment )* ;                 // Assignment list

assignment: ID '=' dataExpr ;                                    // Assignment

dataExprList: dataExpr ( ',' dataExpr )* ;                       // Data expression list

bagEnumElt: dataExpr ':' dataExpr ;                              // Bag element with multiplicity

bagEnumEltList: bagEnumElt ( ',' bagEnumElt )* ;                 // Elements in a finite bag

//--- Communication and renaming sets

actIdSet: '{' idList '}' ;                                       // action set

multActId: ID ( '|' ID )* ;                                      // Multi-action label

multActIdList: multActId ( ',' multActId )* ;                    // Multi-action labels 

multActIdSet: '{' multActIdList? '}' ;                           // Multi-action label set

commExpr: ID '|' multActId '->' ID ;                             // action synchronisation

commExprList: commExpr ( ',' commExpr )* ;                       // action synchronisations

commExprSet: '{' commExprList? '}' ;                             // action synchronisation set

renExpr: ID '->' ID ;                                            // action renaming

renExprList: renExpr ( ',' renExpr )* ;                          // action renamings

renExprSet: '{' renExprList? '}' ;                               // action renaming set

//--- Process expressions

procExpr
  : action                                                       // action or process instantiation
  | ID '(' assignmentList? ')'                                   // Process assignment
  | 'delta'                                                      // Delta, deadlock, inaction
  | 'tau'                                                        // Tau, hidden action, empty multi-action
  | 'block' '(' actIdSet ',' procExpr ')'                        // Block or encapsulation operator
  | 'allow' '(' multActIdSet ',' procExpr ')'                    // Allow operator
  | 'hide' '(' actIdSet ',' procExpr ')'                         // Hiding operator
  | 'rename' '(' renExprSet ',' procExpr ')'                     // action renaming operator
  | 'comm' '(' commExprSet ',' procExpr ')'                      // Communication operator
  | '(' procExpr ')'                                             // Brackets
  | procExpr('|') procExpr                   					 // Communication merge
  | procExpr('@') dataExprUnit                // At operator
  | procExpr('.') procExpr                  // Sequential composition operator
  | procExpr('<<') procExpr                  // Until operator
  | (dataExprUnit ifThen) procExpr             // If-then-else operator
  | (dataExprUnit'->') procExpr              // If-then operator
  | procExpr('||_') procExpr                // Leftmerge operator
  | procExpr ('||') procExpr                 // Parallel operator
  | 'sum' varsDeclList '.' procExpr              // Sum operator
  | procExpr ('+') procExpr                    // Choice operator
  ;

procExprNoIf
  : action                                                       // action or process instantiation
  | ID '(' assignmentList? ')'                                   // Process assignment
  | 'delta'                                                      // Delta, deadlock, inaction
  | 'tau'                                                        // Tau, hidden action, empty multi-action
  | 'block' '(' actIdSet ',' procExpr')'                        // Block or encapsulation operator
  | 'allow' '(' multActIdSet ',' procExpr')'                    // Allow operator
  | 'hide' '(' actIdSet ',' procExpr')'                         // Hiding operator
  | 'rename' '(' renExprSet ',' procExpr')'                     // action renaming operator
  | 'comm' '(' commExprSet ',' procExpr')'                      // Communication operator
  | '(' procExpr')'                                             // Brackets
  | procExprNoIf ('|') procExprNoIf            // Communication merge
  | procExprNoIf ('@') dataExprUnit            // At operator
  | procExprNoIf ('.') procExprNoIf           // Sequential composition operator
  | procExprNoIf ('<<') procExprNoIf           // Until operator
  | (dataExprUnit ifThen) procExprNoIf         // If-then-else operator
  | procExprNoIf ('||_') procExprNoIf         // Leftmerge operator
  | procExprNoIf ('||') procExprNoIf          // Parallel operator
  | 'sum' varsDeclList '.' procExprNoIf       // Sum operator
  | procExprNoIf ('+') procExprNoIf            // Choice operator
  ;

ifThen: '->' procExprNoIf '<>';                         // Auxiliary if-then-else

//--- Actions

action: ID ( '(' dataExprList ')' )? ;                           // action, process instantiation

actDecl: idList ( ':' sortExprList )? ';' ;                      // Declarations of actions

actSpec: 'act' actDecl+ ;                                        // action specification

multAct
  : 'tau'                                                        // Tau, hidden action, empty multi-action
  | actionList                                                   // Multi-action
  ;

actionList: action ( '|' action )* ;                             // List of actions

//--- Process and initial state declaration

procDecl: ID ( '(' varsDeclList ')' )? '=' procExpr';' ;        // Process declaration

procSpec: 'proc' procDecl+ ;                                     // Process specification

init: 'init' procExpr';' ;                                      // Initial process

//--- Data specification

dataSpec: ( sortSpec | consSpec | mapSpec | eqnSpec )+ ;         // Data specification



//--- BES

besSpec: besEqnSpec besInit ;                                    // Boolean equation system

besEqnSpec: 'bes' besEqnDecl+ ;                                  // Boolean equation declaration

besEqnDecl: fixedPointOperator besVar '=' besExpr ';' ;          // Boolean fixed poinst equation

besVar: ID ;                                                     // BES variable

besExpr
  : 'true'                                                       // True
  | 'false'                                                      // False
  | '(' besExpr ')'                                              // Brackets
  | besVar                                                       // Boolean variable
  | '!' besExpr                                 // Negation
  | besExpr ('&&') besExpr                    // Conjunction
  | besExpr ('||') besExpr                    // Disjunction
  | besExpr ('=>') besExpr                    // Implication
  ;

besInit: 'init' besVar ';' ;                                     // Initial BES variable

//--- PBES

pbesSpec: dataSpec? globVarSpec? pbesEqnSpec pbesInit ;          // PBES specification

pbesEqnSpec: 'pbes' pbesEqnDecl+ ;                               // Declaratioin of PBES equations

pbesEqnDecl: fixedPointOperator propVarDecl '=' pbesExpr ';' ;   // PBES equation

fixedPointOperator
  : 'mu'                                                         // Minimal fixed point operator
  | 'nu'                                                         // Maximal fixed point operator
  ;

propVarDecl: ID ( '(' varsDeclList ')' )? ;                      // PBES variable declaration

propVarInst: ID ( '(' dataExprList ')' )? ;                      // Instantiated PBES variable

pbesInit: 'init' propVarInst ';' ;                               // Initial PBES variable

dataValExpr: 'val' '(' dataExpr ')';                             // Marked data expression

pbesExpr
  : dataValExpr                                                  // Data expression
  | 'true'                                                       // True
  | 'false'                                                      // False
  | '(' pbesExpr ')'                                             // Brackets
  | propVarInst                                                  // Propositional variable
  | '!' pbesExpr                                // Negation
  | pbesExpr ('&&') pbesExpr                  // Conjunction
  | pbesExpr ('||') pbesExpr                  // Disjunction
  | pbesExpr ('=>') pbesExpr                  // Implication
  | 'exists' varsDeclList '.' pbesExpr           // Existential quantifier
  | 'forall' varsDeclList '.' pbesExpr           // Universal quantifier
  ;

//--- action formulas
 
actFrm: 
   dataValExpr                        	 	   # DataValueExpressionActionFrm    // note: included in restricted grammar
  | '(' actFrm ')'                    		   # BracketsActionFrm                // Brackets // note: included in restricted grammar
  |  multAct                          		   # MultiAction                 // Multi-action
  | '!' actFrm                       		   # NegationActionFrm            // Negation // note: included in restricted grammar
  | 'true'                            		   # TrueActionFrm                        // True // note: included in restricted grammar
  | 'false'                           		   # FalseActionFrm                         // False // note: included in restricted grammar
  | actFrm '@' dataExpr             		   # AtOperatorActionFrm      // At operator
  | actFrm '&&' actFrm               		   # IntersectionOfActions       // Intersection of actions // note: included in restricted grammar
  | actFrm '||' actFrm             		   # UnionOfActions       // Union actions // note: included in restricted grammar
  | actFrm '=>' actFrm            		   # Implication        // Implication
  | 'forall' varsDeclList '.' actFrm  		   # UniversalQuantifierActionFrm             // Universal quantifier  // note: included in restricted grammar
  | 'exists' varsDeclList '.' actFrm 		   # ExistentialQuantifierActionFrm             // Existential quantifier // note: included in restricted grammar
  ;

//--- Regular formulas
// note: all included in the restricted grammar
regFrm:
  '(' regFrm ')'                               # BracketsRegForm           // Brackets
  | actFrm                                     # ActionFormulaRegForm             // Action formula
  | 'nil'           				# NilRegForm 
  | regFrm '*'                                # IterationRegForm       // Iteration
  | regFrm '+'                                # NonEmptyIterationRegForm       // Non-empty iteration  
  | regFrm mySeqSign='.' regFrm              	# SequentialCompositionRegForm 	// Sequential composition // note: here I want to do in-place token replace
  | regFrm '+' regFrm                        	# AlternativeCompositionRegForm 	// Alternative composition
  ;

//--- State formulas

stateFrm: 
  dataValExpr            		  	# DataValueExpressionStateFrm      // Data expression // note: included in restricted grammar
  | '(' stateFrm ')'             		   	# BracketsStateFrm                      // Brackets // note: included in restricted grammar
  | 'true'                                    		# TrueStateFrm                             // True // note: included in restricted grammar
  | 'false'    			    	 		# FalseStateFrm    // False // note: included in restricted grammar
  | '!' stateFrm                   			# NegationStateFrm            // Negation
  | '[' regFrm ']' stateFrm           		 	# BoxModalityStateFrm          // Box modality // note: included in restricted grammar
  | '<' regFrm '>' stateFrm           		 	# DiamondModalityStateFrm          // Diamond modality
  | stateFrm '&&' stateFrm             	 	# ConjunctionStateFrm    // Conjunction // note: included in restricted grammar
  | stateFrm '||' stateFrm            		  	# DisjunctionStateFmr    // Disjunction
  | stateFrm '=>' stateFrm            		 	# ImplicationStateFrm     // Implication   
  | ID ( '(' dataExprList ')' )?      		 	# PBESVariableStateFrm                          // Instantiated PBES variable
  | 'delay' ( '@' dataExpr )?         		 	# DelayOpStateFrm                          // Delay
  | 'yaled' ( '@' dataExpr )?         		 	# YaledOpStateFrm                         // Yaled
  | 'exists' varsDeclList '.' stateFrm  	   	# ExistentialQuantifierStateFrm       // Existential quantification// False
  | 'forall' varsDeclList '.' stateFrm  	  	# UniversalQuantifierStateFrm      // Universal quantification // note: included in restricted grammar
  | 'mu' stateVarDecl '.' stateFrm     	    	# MuStateFrm    // Minimal fixed point
  | 'nu' stateVarDecl '.' stateFrm       	  	# NuStateFrm      // Maximal fixed point
  ;



stateVarDecl: ID ( '(' stateVarAssignmentList ')' )? ;           // PBES variable declaration

stateVarAssignment: ID ':' sortExpr '=' dataExpr ;               // Typed variable with initial value 

stateVarAssignmentList: stateVarAssignment ( ',' stateVarAssignment )* ;  // Typed variable list

//--- action Rename Specifications

actionRenameSpec: (sortSpec | consSpec | mapSpec | eqnSpec | actSpec | actionRenameRuleSpec)+ ; // action rename specification

actionRenameRuleSpec: varSpec? 'rename' actionRenameRule+ ;      // action rename rule section

actionRenameRule: (dataExpr '->')? action '=>' actionRenameRuleRHS ';' ; // Conditional action renaming

actionRenameRuleRHS
  : action                                                       // action
  | 'tau'                                                        // Tau, hidden action, empty multi-action
  | 'delta'                                                      // Delta, deadlock, inaction
  ;

//--- Identifiers

idList: ID ( ',' ID )* ;                                         // List of identifiers

ID  :   LETTER (LETTER | [0-9])* ; 
fragment
LETTER : [a-zA-Z_] ;

INT :   [0-9]+ ;

WS  :  ([ \t\n\r])+ -> skip ;

LINE_COMMENT:   '%' .*? '\r'? '\n' -> skip ;



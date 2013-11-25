//comment
grammar mucalculus;
start : stateFrm;

// besEqnSpec: 'bes' besEqnDecl+ ;                                  // Boolean equation declaration

// besEqnDecl: fixedPointOperator besVar '=' besExpr ';' ;          // Boolean fixed poinst equation

fixedPointOperator
  : 'mu'                       # MuOperator                                  // Minimal fixed point operator
  | 'nu'                       # NuOperator                                  // Maximal fixed point operator
  ;
  
besVar: ID ;                                                     // BES variable



// besExpr: 'true'                                                       // True
//   | 'false'                                                      // False
//   | besExpr '=>' besExpr                    // Implication
//   | besExpr '||' besExpr                    // Disjunction
//   | besExpr '&&' besExpr                    // Conjunction
//   | '!' besExpr                    // Negation
//   | '(' besExpr ')'                                              // Brackets
//   | besVar                                                       // Boolean variable
//   ;


//--- PBES

// pbesSpec: dataSpec? globVarSpec? pbesEqnSpec pbesInit ;          // PBES specification

// pbesEqnSpec: 'pbes' pbesEqnDecl+ ;                               // Declaratioin of PBES equations

// pbesEqnDecl: fixedPointOperator propVarDecl '=' pbesExpr ';' ;   // PBES equation


// propVarDecl: ID ( '(' varsDeclList ')' )? ;                      // PBES variable declaration

// propVarInst: ID ( '(' dataExprList ')' )? ;                      // Instantiated PBES variable

// pbesInit: 'init' propVarInst ';' ;                               // Initial PBES variable

dataValExpr: 'val' '(' dataExpr ')';                             // Marked data expression

// pbesExpr: dataValExpr                                                  // Data expression
//   | 'true'                                                       // True
//   | 'false'                                                      // False
//   | 'forall' varsDeclList '.' pbesExpr            // Universal quantifier
//   | 'exists' varsDeclList '.' pbesExpr            // Existential quantifier
//   | pbesExpr '=>' pbesExpr                  // Implication
//   | pbesExpr '||' pbesExpr                  // Disjunction
//   | pbesExpr '&&' pbesExpr                  // Conjunction
//   | '!' pbesExpr                                  // Negation
//   | '(' pbesExpr ')'                                             // Brackets
//   | propVarInst                                                  // Propositional variable
//   ;

//--- Action formulas
 
actFrm: 
   dataValExpr                        	 	   # DataValueExpressionActionFrm
  | '(' actFrm ')'                    		   # BracketsActionFrm                // Brackets
  |  multAct                          		   # MultiAction                 // Multi-action
  | 'true'                            		   # TrueActionFrm                        // True
  | 'false'                           		   # FalseActionFrm                         // False
  | '!' actFrm                       		   # NegationActionFrm            // Negation
  | 'forall' varsDeclList '.' actFrm  		   # UniversalQuantifierActionFrm             // Universal quantifier
  | 'exists' varsDeclList '.' actFrm 		   # ExistentialQuantifierActionFrm             // Existential quantifier
  | actFrm '@' dataExpr             		   # AtOperatorActionFrm      // At operator
  | actFrm '&&' actFrm               		   # IntersectionOfActions       // Intersection of actions
  | actFrm '||' actFrm             		   # UnionOfActions       // Union actions
  | actFrm '=>' actFrm            		   # Implication        // Implication
  ;

//--- Regular formulas
  
regFrm:
  '(' regFrm ')'                                        // Brackets
  | actFrm                                                // Action formula
  | 'nil'           
  | regFrm '.' regFrm                       // Sequential composition
  | regFrm '+' regFrm                        // Alternative composition
  | regFrm '*'                                      // Iteration
  | regFrm '+'                                      // Non-empty iteration
  ;

//--- State formulas

stateFrm: dataValExpr            		  	# DataValueExpressionStateFrm                              // Data expression
  | '(' stateFrm ')'             		   	# BracketsStateFrm                      // Brackets
  | 'true'                                    		# TrueStateFrm                             // True
  | 'false'    			    	 		# FalseStateFrm
  | 'forall' varsDeclList '.' stateFrm  	  	# UniversalQuantifierStateFrm      // Universal quantification
  | 'exists' varsDeclList '.' stateFrm  	   	# ExistentialQuantifierStateFrm       // Existential quantification// False
  | '!' stateFrm                   			# NegationStateFrm            // Negation
  | 'mu' stateVarDecl '.' stateFrm     	    	# MuStateFrm    // Minimal fixed point
  | 'nu' stateVarDecl '.' stateFrm       	  	# NuStateFrm      // Maximal fixed point
  | stateFrm '&&' stateFrm             	 	# ConjunctionStateFrm    // Conjunction
  | stateFrm '||' stateFrm            		  	# DisjunctionStateFmr    // Disjunction
  | stateFrm '=>' stateFrm            		 	# ImplicationStateFrm     // Implication   
  | '[' regFrm ']' stateFrm           		 	# BoxModalityStateFrm          // Box modality
  | '<' regFrm '>' stateFrm           		 	# DiamondModalityStateFrm          // Diamond modality
  | ID ( '(' dataExprList ')' )?      		 	# PBESVariableStateFrm                          // Instantiated PBES variable
  | 'delay' ( '@' dataExpr )?         		 	# DelayOpStateFrm                          // Delay
  | 'yaled' ( '@' dataExpr )?         		 	# YaledOpStateFrm                         // Yaled
  ;

stateVarDecl: ID ( '(' stateVarAssignmentList ')' )? ;           // PBES variable declaration

stateVarAssignment: ID ':' sortExpr '=' dataExpr ;               // Typed variable with initial value 

stateVarAssignmentList: stateVarAssignment ( ',' stateVarAssignment )* ;  // Typed variable list


varsDeclList: varsDecl ( ',' varsDecl )* ;                       // Individually typed variables

dataExprList: dataExpr ( ',' dataExpr )* ;                       // Data expression list


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
  
 
  
multAct: 'tau'                                                        // Tau, hidden action, empty multi-action
  | actionList                                                   // Multi-action
  ;

varsDecl: idList ':' sortExpr ;                                  // Typed variables

bagEnumEltList: bagEnumElt ( ',' bagEnumElt )* ;                 // Elements in a finite bag

bagEnumElt: dataExpr ':' dataExpr ;                              // Bag element with multiplicity

assignmentList: assignment ( ',' assignment )* ;                 // Assignment list

varDecl: ID ':' sortExpr ;                                       // Typed variable

idList: ID ( ',' ID )* ;                                         // List of identifiers

actionList: action ( '|' action )* ;                             // List of actions

sortExpr: simpleSortExpr
  | hashArgs '->' sortExpr ;   
  
assignment: ID '=' dataExpr ;                                    // Assignment

action: ID ( '(' dataExprList ')' )? ;                           // Action, process instantiation

simpleSortExpr: 'Bool'                                      # BooleanSort                 // Booleans
  | 'Pos'                                                   # PositiveNumSort     // Positive numbers
  | 'Nat'                                                   # NaturalNumSort     // Natural numbers
  | 'Int'                                                   # IntegerSort     // Integers
  | 'Real'                                                  # RealSort     // Reals
  | 'List' '(' sortExpr ')'                                 # ListSort     // List sort
  | 'Set' '(' sortExpr ')'                                  # SetSort     // Set sort
  | 'Bag' '(' sortExpr ')'                                  # BagSort     // Bag sort
  | 'FSet' '(' sortExpr ')'                                 # FiniteSetSort     // Finite set sort
  | 'FBag' '(' sortExpr ')'                                 # FiniteBagSort     // Finite bag sort
  | ID                                                      # SortReference     // Sort reference
  | '(' sortExpr ')'                                        # ParenthesisSort     // Sort expression with parentheses
  | 'struct' constrDeclList                                 # StructuredSort     // Structured sort
  ;

hashArgs: simpleSortExpr ('#' simpleSortExpr)* ;                 // Simple product sort
  
constrDeclList: constrDecl ( '|' constrDecl )* ;                 // Constructor declaration list

constrDecl: ID ( '(' projDeclList ')' )? ( '?' ID )? ;           // Constructor declaration



projDecl: ( ID ':' )? sortExpr ;                                 // Domain with optional projection

projDeclList: projDecl ( ',' projDecl )* ;                       // Declaration of projection functions

dataSpec: ( sortSpec | consSpec | mapSpec | eqnSpec )+ ;         // Data specification



globVarSpec: 'glob' ( varsDeclList ';' )+ ;                      // Declaration of global variables

varSpec: 'var' ( varsDeclList ';' )+ ;                           // Declaration of variables

eqnSpec: varSpec? 'eqn' eqnDecl+ ;                               // Definition of equations

eqnDecl: (dataExpr '->')? dataExpr '=' dataExpr ';' ;            // Conditional equation

sortSpec: 'sort' sortDecl+ ;                                     // Sort specification

consSpec: 'cons' ( idsDecl ';' )+ ;                              // Declaration of constructors

mapSpec: 'map' ( idsDecl ';' )+ ;                                // Declaration of mappings

sortDecl: idList ';'                                                   // List of sort identifiers
  | ID '=' sortExpr ';'                                          // Sort alias
  ;

idsDecl: idList ':' sortExpr ;                                   // Typed parameters

  
//--- Action Rename Specifications

// actionRenameSpec: (SortSpec | ConsSpec | MapSpec | EqnSpec | ActSpec | ActionRenameRuleSpec)+ ; // Action rename specification

// ActionRenameRuleSpec: VarSpec? 'rename' ActionRenameRule+ ;      // Action rename rule section

// ActionRenameRule: (dataExpr '->')? Action '=>' ActionRenameRuleRHS ';' ; // Conditional action renaming

// ActionRenameRuleRHS
//   : Action                                                       // Action
//   | 'tau'                                                        // Tau, hidden action, empty multi-action
//   | 'delta'                                                      // Delta, deadlock, inaction
//   ;
//   

// id :  'aman';
//
ID  :   LETTER (LETTER | [0-9])* ; 
fragment
LETTER : [a-zA-Z_] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;


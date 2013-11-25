//comment
grammar mucalculus;
start : stateFrm;

// besEqnSpec: 'bes' besEqnDecl+ ;                                  // Boolean equation declaration

// besEqnDecl: fixedPointOperator besVar '=' besExpr ';' ;          // Boolean fixed poinst equation

fixedPointOperator
  : 'mu'                                                         // Minimal fixed point operator
  | 'nu'                                                         // Maximal fixed point operator
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
   dataValExpr  
  | '(' actFrm ')'                                       // Brackets
  |  multAct                                              // Multi-action
  | 'true'                                                       // True
  | 'false'                                                      // False
  | '!' actFrm                                      // Negation
  | 'forall' varsDeclList '.' actFrm                // Universal quantifier
  | 'exists' varsDeclList '.' actFrm                // Existential quantifier
  | actFrm '@' dataExpr                      // At operator
  | actFrm '&&' actFrm                      // Intersection of actions
  | actFrm '||' actFrm                      // Union actions
  | actFrm '=>' actFrm                      // Implication
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

stateFrm: dataValExpr                                           // Data expression
  | '(' stateFrm ')'                                      // Brackets
  | 'true'                                                       // True
  | 'false'    
  | 'forall' varsDeclList '.' stateFrm           // Universal quantification
  | 'exists' varsDeclList '.' stateFrm            // Existential quantification// False
  | 'mu' stateVarDecl '.' stateFrm             // Minimal fixed point
  | 'nu' stateVarDecl '.' stateFrm               // Maximal fixed point
  | stateFrm '&&' stateFrm                  // Conjunction
  | stateFrm '||' stateFrm                  // Disjunction
  | stateFrm '=>' stateFrm                  // Implication   | '!' stateFrm                                // Negation
  | '[' regFrm ']' stateFrm                      // Box modality
  | '<' regFrm '>' stateFrm                      // Diamond modality
  | ID ( '(' dataExprList ')' )?                                 // Instantiated PBES variable
  | 'delay' ( '@' dataExpr )?                                    // Delay
  | 'yaled' ( '@' dataExpr )?                                    // Yaled
  ;

stateVarDecl: ID ( '(' stateVarAssignmentList ')' )? ;           // PBES variable declaration

stateVarAssignment: ID ':' sortExpr '=' dataExpr ;               // Typed variable with initial value 

stateVarAssignmentList: stateVarAssignment ( ',' stateVarAssignment )* ;  // Typed variable list


varsDeclList: varsDecl ( ',' varsDecl )* ;                       // Individually typed variables

dataExprList: dataExpr ( ',' dataExpr )* ;                       // Data expression list


dataExpr: ID                                                           // Identifier
  | INT                                                       // Number
  | 'true'                                                       // True
  | 'false'                                                      // False
  | '[' ']'                                                      // Empty list
  | '{' '}'                                                      // Empty set
  | '{'':''}'                                                    // Empty bag
  | '[' dataExprList ']'                                         // List enumeration
  | '{' bagEnumEltList '}'                                       // Bag enumeration
  | '{' varDecl '|' dataExpr '}'                                 // Set/bag comprehension
  | '{' dataExprList '}'                                         // Set enumeration
  | '(' dataExpr ')'                                             // Brackets
  | dataExpr '[' dataExpr '->' dataExpr ']'   // Function update
  | dataExpr '(' dataExprList ')'               // Function application
  | '!' dataExpr                                // Negation, set complement
  | '-' dataExpr                               // Unary minus
  | '#' dataExpr                                // Size of a list
  | 'forall' varsDeclList '.' dataExpr           // Universal quantifier
  | 'exists' varsDeclList '.' dataExpr          // Existential quantifier
  | 'lambda' varsDeclList '.' dataExpr         // Lambda abstraction
  | dataExpr '.' dataExpr                   // List element at position
  | dataExpr '*' dataExpr                   // Multiplication, set/bag intersection
  | dataExpr 'mod' dataExpr                 // Integer mod
  | dataExpr 'div' dataExpr                 // Integer div
  | dataExpr '/' dataExpr                   // Division
  | dataExpr '-' dataExpr                   // Subtraction, set/bag difference
  | dataExpr '+' dataExpr                   // Addition, set/bag union
  | dataExpr '++' dataExpr                   // List concatenation
  | dataExpr '<|' dataExpr                   // List snoc
  | dataExpr '|>' dataExpr                  // List cons
  | dataExpr 'in' dataExpr                   // Set, bag, list membership
  | dataExpr '>' dataExpr                    // Larger
  | dataExpr '>=' dataExpr                   // Larger equal
  | dataExpr '<=' dataExpr                   // Smaller equal
  | dataExpr '<' dataExpr                    // Smaller
  | dataExpr '!=' dataExpr                   // Inequality
  | dataExpr '==' dataExpr                   // Equality
  | dataExpr '&&' dataExpr                  // Disjunction
  | dataExpr '||' dataExpr                  // Conjunction
  | dataExpr '=>' dataExpr                  // Implication
  | dataExpr 'whr' assignmentList 'end'           // Where clause
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

simpleSortExpr: 'Bool'                                                       // Booleans
  | 'Pos'                                                        // Positive numbers
  | 'Nat'                                                        // Natural numbers
  | 'Int'                                                        // Integers
  | 'Real'                                                       // Reals
  | 'List' '(' sortExpr ')'                                      // List sort
  | 'Set' '(' sortExpr ')'                                       // Set sort
  | 'Bag' '(' sortExpr ')'                                       // Bag sort
  | 'FSet' '(' sortExpr ')'                                      // Finite set sort
  | 'FBag' '(' sortExpr ')'                                      // Finite bag sort
  | ID                                                           // Sort reference
  | '(' sortExpr ')'                                             // Sort expression with parentheses
  | 'struct' constrDeclList                                      // Structured sort
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


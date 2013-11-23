//comment
grammar mucalculus;

// TODO: deal with whitespaces and \n newline
besEqnSpec: 'bes' besEqnDecl+ ;                                  // Boolean equation declaration

besEqnDecl: fixedPointOperator besVar '=' besExpr ';' ;          // Boolean fixed poinst equation

fixedPointOperator
  : 'mu'                                                         // Minimal fixed point operator
  | 'nu'                                                         // Maximal fixed point operator
  ;
  
besVar: ID ;                                                     // BES variable



besExpr
  : 'true'                                                       // True
  | 'false'                                                      // False
  | besExpr '=>' besExpr                    // Implication
  | besExpr '||' besExpr                    // Disjunction
  | besExpr '&&' besExpr                    // Conjunction
  | '!' besExpr                    // Negation
  | '(' besExpr ')'                                              // Brackets
  | besVar                                                       // Boolean variable
  ;


  
// id :  'aman';

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;


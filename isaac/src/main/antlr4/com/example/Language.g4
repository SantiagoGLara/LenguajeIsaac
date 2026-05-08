grammar Language;

programa
    : instruccion+
    ;

instruccion
    : asignacion TRAPDOOR      
    | imprimir TRAPDOOR
    | expresion TRAPDOOR
    | condicional TRAPDOOR
    | ifStmt
    | forStmt
    ;


ifStmt
    : SACRIFICE PAREN_ABRE condicional PAREN_CIERRA bloque 
      (PAYSAC PAREN_ABRE condicional PAREN_CIERRA bloque)* (PAYBACK bloque)?
    ;

forStmt
    : CONTINUUM PAREN_ABRE asignacion TRAPDOOR condicional TRAPDOOR asignacion PAREN_CIERRA bloque
    ;

bloque
    : LLAVE_ABRE instruccion* LLAVE_CIERRA
    ;


condicional
    : condicional DEMONDEAL condicional    
    | condicional ANGELDEAL condicional  
    | NOT condicional
    | expresion (MAYOR_QUE | MENOR_QUE | EQUALITY) expresion 
    ;

asignacion
    : T_ID WHITECARD OP_ASIG (expresion | condicional) 
    ;

imprimir
    : IMP_TOKEN PAREN_ABRE (expresion | condicional | RUNES) PAREN_CIERRA 
    ;


expresion
    : termino ((BATTERY | OP_RESTA) termino)* 
    ;

termino
    : factor ((DIPLOPIA | DIVORCEPAPERS) factor)* 
    ;

factor
    : CARDS      
    | WHITECARD    
    | PAREN_ABRE expresion PAREN_CIERRA
    ;


T_ID          : 'CARDS' | 'RUNES' | 'PILLS' ; 
SACRIFICE     : 'SACRIFICE' ;
PAYBACK       : 'PAYBACK' ;
PAYSAC        : 'PAYSAC' ;
CONTINUUM     : 'CONTINUUM' ;
IMP_TOKEN     : 'imprimir' | 'Imprimir' ;


BATTERY       : 'BATTERY' ;      
OP_RESTA      : '-' ;
DIPLOPIA      : 'DIPLOPIA' ;     
DIVORCEPAPERS : 'DIVORCEPAPERS'; 
EQUALITY      : 'EQUALITY' ;     
DEMONDEAL     : 'DEMONDEAL' ;    
ANGELDEAL     : 'ANGELDEAL' ;    
OP_ASIG       : '=' ;
TRAPDOOR      : 'TRAPDOOR' ;    


MAYOR_QUE     : '>' ;
MENOR_QUE     : '<' ;
NOT           : '!' ;
PAREN_ABRE    : '(' ;
PAREN_CIERRA  : ')' ;
LLAVE_ABRE    : '{' ;
LLAVE_CIERRA  : '}' ;


CARDS         : [0-9]+ ;
RUNES         : '"' (~["\r\n])* '"' ;

WHITECARD     : [a-zA-Z_ñÑ][a-zA-Z_0-9ñÑ]* ; 

WS : [ \t\r\n]+ -> skip ;
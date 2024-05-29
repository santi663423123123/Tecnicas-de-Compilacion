grammar TP1;

@header { 
    package compiladores;
}

PuntoComa : ';' ;
ParAbierto  : '(' ;
ParCerrado  : ')' ;
LlaveAbierta : '{' ;
LlaveCerrada : '}' ;
Asignacion : '=' ;
Coma  : ',' ;
Suma  : '+' ;
Resta : '-' ;
Multiplicacion  : '*' ;
Division   : '/' ;
Modulo   : '%' ;
CorcheteIzquierdo : '['  ;
CorcheteDerecho : ']'  ;
Comparacion :  '==' | '>' | '<' | '=>' | '=<' | '||' | '&&' | '!=' ;
Incrementador : '++' ;
Decrementador : '--' ;

TipoDeDatos : 'void' | 'char' | 'short' | 'int' | 'long' | 'float' | 'double' | 'signed' | 'unsigned' | 'string' ;


fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

NUMERO : DIGITO+ ;

Si : 'if' ;
Sino : 'else' ;
Para : 'for' ;
Mientras : 'while' ;

Identificador : (LETRA | '_')(LETRA | DIGITO | '_')* ;

EspacioBlanco : [ \t\n\r] -> skip ;

programa : instrucciones EOF ;

instrucciones : tipoinstruccion instrucciones
              |
              ;


tipoinstruccion : asignar
            | declaracionVariablelarar
            | bloque
            | mientras
            | si
            | ipara
            | llamadaFuncion
            ;

bloque : LlaveAbierta instrucciones LlaveCerrada ;

asignar : Identificador Asignacion expresion PuntoComa ;

para : asignar
      |  incremento
      |  Identificador Comparacion Identificador
      |  exp
      |  term
      |
      ;
declaracionVariablelarar : TipoDeDatos Identificador inicializar listaid PuntoComa ;


inicializar : Asignacion NUMERO
               |
               ;

incremento : Identificador (Incrementador|Decrementador)  ;

listaid : Coma Identificador inicializar listaid
        |
        ;

llamadaFuncion : TipoDeDatos Identificador ParAbierto  (TipoDeDatos parametrosdefuncion)? ParCerrado tipoinstruccion ;

definicionFuncion : Identificador listaid;

parametrosdefuncion: definicionFuncion (Coma definicionFuncion)* ;


declaracionVariable : TipoDeDatos Identificador (Comparacion expresion)? PuntoComa ;

mientras : Mientras ParAbierto comparar ParCerrado tipoinstruccion ;

si : Si ParAbierto comparar ParCerrado tipoinstruccion Sino tipoinstruccion ;

ipara : Para ParAbierto declaracionVariablelarar  comparar PuntoComa para ParCerrado tipoinstruccion ; 

comparar : expresion Comparacion expresion 
            | expresion Asignacion expresion
            |
            ; 

 expresion : termino exp ;

 termino : factor term ;

 term : Multiplicacion factor term
      | Division  factor term
      | Modulo  factor term
      |
      ;
      
 factor : NUMERO
        | Identificador
        | ParAbierto expresion ParCerrado 
        ;

 exp : Suma termino exp
     | Resta termino exp
     |
     ;

/*
a futuro :
-- reconocer # librerías .
-- printf - printc .
-- // comentarios
-- * punteros
-- struct estructuras
 */
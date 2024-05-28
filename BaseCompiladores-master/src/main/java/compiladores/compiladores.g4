grammar compiladores;

@header { 
    package compiladores;
}

fragment Letra : [A-Za-z] ;
fragment Digito : [0-9] ;

PuntoComa : ';' ;
ParAbierto  : '(' ;
ParCerrado  : ')' ;
LlaveAbierta : '{' ;
LlaveCerrada : '}' ;
Asignacion : '=' ;
Coma  : ',' ;
Suma  : '+' ;
Resta : '-' ;
Multiplicacion : '*' ;
Division   : '/' ;
Modulo   : '%' ;
Comparacion : '==' | '>' | '<' | '>=' | '<=' ;

Numero : Digito+ ;

Entero : 'int' ;

Si : 'if';
Sino : 'else';
Para : 'for';
Mientras : 'while';

Identificador : (Letra | '_')(Letra | Digito | '_')* ;

EspacioBlanco : [ \t\n\r] -> skip ;

programa : instrucciones EOF ;

instrucciones : instruccion* ;

instruccion : asignar
            | declarar
            | bloque
            | mientras
            | si
            | para
            | llamadaFuncion
            ;

bloque : LlaveAbierta instrucciones? LlaveCerrada ;

asignar : Identificador Asignacion expresion PuntoComa ;

declarar : Entero Identificador inicializar? listaIds? PuntoComa ;

inicializar : Asignacion expresion ;

listaIds : Coma Identificador inicializar? listaIds? ;

mientras : Mientras ParAbierto comparar ParCerrado bloque ;

si : Si ParAbierto comparar ParCerrado bloque (Sino bloque)?;

para : Para ParAbierto (declarar | asignar |) comparar PuntoComa asignar ParCerrado bloque ;

llamadaFuncion : Identificador ParAbierto parametros? ParCerrado PuntoComa ;

parametros : expresion (Coma expresion)* ;

expresion : termino ((Suma | Resta) termino)* ;

termino : factor ((Multiplicacion | Division | Modulo) factor)* ;

factor : Numero | Identificador | ParAbierto expresion ParCerrado ;

comparar : expresion Comparacion expresion ;

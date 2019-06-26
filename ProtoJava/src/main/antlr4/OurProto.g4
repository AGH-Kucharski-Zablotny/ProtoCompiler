grammar OurProto;

// Lexical part
SYNTAX : 'syntax' ;
PACKAGE : 'package' ;
OPTION : 'option' ;
SERVICE : 'service' ;
RPC : 'rpc' ;
MESSAGE : 'message' ;
REPEATED : 'repeated' ;
RETURNS : 'returns' ;
DOUBLE : 'double' ;
FLOAT : 'float' ;
INT32 : 'int32' ;
INT64 : 'int64' ;
UINT32 : 'uint32' ;
UINT64 : 'uint64' ;
SINT32 : 'sint32' ;
SINT64 : 'sint64' ;
FIXED32 : 'fixed32' ;
FIXED64 : 'fixed64' ;
SFIXED32 : 'sfixed32' ;
SFIXED64 : 'sfixed64' ;
BOOL : 'bool' ;
STRING : 'string' ;
BYTE : 'bytes' ;
ENUM : 'enum' ;
MAP : 'map' ;
LPARA : '(' ;
RPARA : ')' ;
LCBRA : '{' ;
RCBRA : '}' ;
EQUAL : '=' ;
SEMICOL : ';' ;
QUOT : '"' ;
PLUS : '+' ;
MINUS : '-' ;
LT : '<' ;
GT : '>' ;
COMMA : ',' ;
TRUE : 'true';
FALSE : 'false';
LETTER : [A-Za-z_] ;
NUMBER : [0-9] ;



// Grammar part

protoFileDef
    : syntax ( packageDef | option | definition | emptyStatement )* EOF
    ;

syntax 
    : SYNTAX EQUAL ('"proto3"' | '\'proto3\'') SEMICOL 
    ;

packageDef
    : PACKAGE fullIdentifier SEMICOL 
    ;

fullIdentifier
    : identifier ('.' identifier)*
    ;

identifier 
    : LETTER (LETTER | NUMBER)* 
    ;
    
option
    : OPTION optionName EQUAL constant SEMICOL
    ;

optionName 
    : (identifier | LPARA fullIdentifier RPARA ) ('.' identifier)*
    ;

constant 
    : fullIdentifier 
    | (MINUS | PLUS)? intLiteral
    | (MINUS | PLUS)? floatLiteral
    | ( strLiteral | boolLiteral )
    ;

intLiteral 
    : NUMBER+
    ;

floatLiteral
    : NUMBER+ '.' NUMBER+
    ;

strLiteral
    : '"' LETTER+ '"'
    ;

boolLiteral
    : TRUE | FALSE
    ;

definition 
    : (serviceDef | messageDef | enumDefinition)+
    ;

serviceDef 
    : SERVICE identifier LCBRA rpcDef* RCBRA
    ;

rpcDef 
    : RPC identifier LPARA fullIdentifier RPARA RETURNS LPARA fullIdentifier RPARA SEMICOL
    ;

messageDef
    : MESSAGE identifier messageBody
    ;

messageBody
    : LCBRA (
            field
        |   enumDefinition
        |   messageDef
        |   mapField
        |   emptyStatement
    )* RCBRA
    ;

field
    : REPEATED? fieldType identifier EQUAL NUMBER SEMICOL
    ;

fieldType 
    : type | fullIdentifier
    ;

type 
    : DOUBLE 
    | FLOAT 
    | INT32 
    | INT64
    | UINT32 
    | UINT64 
    | SINT32 
    | SINT64 
    | FIXED32 
    | FIXED64 
    | SFIXED32 
    | SFIXED64  
    | BOOL
    | STRING
    | BYTE
    ;

enumDefinition
    : ENUM identifier enumBody
    ;

enumBody
    : LCBRA (enumField | emptyStatement)* RCBRA
    ;

enumField
    : identifier EQUAL NUMBER SEMICOL
    ;

mapField
    : MAP LT keyType COMMA type GT identifier EQUAL NUMBER SEMICOL
    ;

keyType
    : INT32 
    | INT64
    | UINT32 
    | UINT64 
    | SINT32 
    | SINT64 
    | FIXED32 
    | FIXED64 
    | SFIXED32 
    | SFIXED64  
    | BOOL
    | STRING
    ;

emptyStatement 
    : SEMICOL
    ;

// Whitespace and comments
WS  
    :   [ \t\r\n\u000C]+ -> skip
    ;

COMMENT
    :   '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* -> skip
    ;
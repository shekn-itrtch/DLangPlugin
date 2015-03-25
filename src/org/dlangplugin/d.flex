package org.dlangplugin;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.dlangplugin.psi.DTokenTypes;
import com.intellij.psi.TokenType;

%%

%{
    private int nestedCommentDepth = 0;
%}

%class DLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

WHITE_SPACE_CHAR = [\ \t\f]
NEW_LINE = [\n\r]+

CHARACTER = [^\r\n]
LETTER = [:letter:]
DIGIT = [:digit:]
HEX_DIGIT = [0-9abcdefABCDEF_]
OCTAL_DIGIT = [0-7]
NAMED_CHARACTER_ENTITY = "&" {ID} ";"

BLOCK_COMMENT = "/*" {BLOCK_COMMENT_CONTENT} "*/"
BLOCK_COMMENT_CONTENT = ( [^*] | "*"+ [^/] )*
LINE_COMMENT = "/""/" {CHARACTER}*

/* JFlex doesn't support recursive rules. So NESTING_BLOCK_COMMENT doesn't support nesting now. */
NESTING_BLOCK_COMMENT_START = \/\+
NESTING_BLOCK_COMMENT_END = \+\/
/*
NESTING_BLOCK_COMMENT = "/+" {NESTING_BLOCK_COMMENT_CONTENT} "+/"
NESTING_BLOCK_COMMENT_CONTENT = ( [^+] | "+"+ [^/] )*
*/

ID = (_|{LETTER}) (_|{DIGIT}|{LETTER})*

WYSIWYG_STRING = "r"\" [^\"]* \" {STRING_POSTFIX}?
ALTERNATE_WYSIWYG_STRING = ` [^`]* ` {STRING_POSTFIX}?
DOUBLE_QUOTED_STRING = \" ( [^\\\"] |{ESCAPE_SEQUENCE})* \" {STRING_POSTFIX}?
HEX_STRING = x\" ([0-9a-fA-F][0-9a-fA-F] | [\r\n\s])* \" {STRING_POSTFIX}?
DELIMITED_STRING = ({DELIMITED_STRING_SQ_BR} | {DELIMITED_STRING_PARENTH}
                  | {DELIMITED_STRING_ANGLE_PARENTH} | {DELIMITED_STRING_BRACE}) {STRING_POSTFIX}?
/*TODO: Add TokenString lexer*/

STRING_POSTFIX = [cwd]
ESCAPE_SEQUENCE = {ESCAPE_SEQUENCE_SPEC_CHAR} | {ESCAPE_SEQUENCE_HEX_OCTAL}
                | {ESCAPE_SEQUENCE_UNICODE} | ("\\" {NAMED_CHARACTER_ENTITY})
ESCAPE_SEQUENCE_SPEC_CHAR = "\\\'" | "\\\"" | "\\\?" | "\\\\" | "\\0" | "\\a"
                          | "\\b"  | "\\f"  | "\\n"  | "\\r"  | "\\t" | "\\v"
ESCAPE_SEQUENCE_HEX_OCTAL = ("\\x" {HEX_DIGIT} {HEX_DIGIT}) | ("\\" {OCTAL_DIGIT})
              | ("\\" {OCTAL_DIGIT} {OCTAL_DIGIT}) | ("\\" {OCTAL_DIGIT} {OCTAL_DIGIT} {OCTAL_DIGIT})
ESCAPE_SEQUENCE_UNICODE = ("\\u" {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT})
              | ("\\U" {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT} {HEX_DIGIT})

DELIMITED_STRING_SQ_BR =         q\"\[ ([^\]] | \][^\"])* \]\"
DELIMITED_STRING_PARENTH =       q\"\( ([^\)] | \)[^\"])* \)\"
DELIMITED_STRING_ANGLE_PARENTH = q\"\< ([^\>] | \>[^\"])* \>\"
DELIMITED_STRING_BRACE =         q\"\{ ([^}]  |  }[^\"])* }\"

CHARACTER_LITERAL = \' ( [^\r\n\t\f\\] | {ESCAPE_SEQUENCE} ) \'

INTEGER_LITERAL = ({DECIMAL_INTEGER} | {BINARY_INTEGER} | {HEXADECIMAL_INTEGER}) {INTEGER_SUFFIX}?
INTEGER_SUFFIX =  L | u | U | Lu | LU | uL | UL
DECIMAL_INTEGER = 0 | ([1-9] [0-9_]*)
BINARY_INTEGER = 0[bB][01_]+
HEXADECIMAL_INTEGER = 0[xX] [0-9a-fA-F] [0-9a-fA-F_]*


/* Implement DECIMAL_DIGITS_NO_SINGLE_US, HEX_DIGITS_NO_SINGLE_US */
FLOAT_LITERAL = ( ({DECIMAL_FLOAT} | {HEX_FLOAT}) [fFL]? i? ) | ( ({DECIMAL_INTEGER} | {BINARY_INTEGER} | {HEXADECIMAL_INTEGER}) [fFL]? i)
DECIMAL_FLOAT = ( {DECIMAL_FLOAT_SIMPLE} | {DECIMAL_FLOAT_EXPONENT} | {DECIMAL_FLOAT_FIRST_DOT}
                | {DECIMAL_FLOAT_FIRST_DOT_EXPONENT} | {DECIMAL_FLOAT_NO_DOT_EXPONENT} )
DECIMAL_FLOAT_SIMPLE = [0-9] [0-9_]* \. ([0] | [1-9_] [0-9_]*)
DECIMAL_FLOAT_EXPONENT = [0-9_]+ \. [0-9_]+ {DECIMAL_EXPONENT}
DECIMAL_FLOAT_FIRST_DOT = \. ([0] | [1-9_] [0-9_]*)
DECIMAL_FLOAT_FIRST_DOT_EXPONENT = \. ([0] | [1-9] [0-9]*) {DECIMAL_EXPONENT}
DECIMAL_FLOAT_NO_DOT_EXPONENT = [0-9] [0-9_]* {DECIMAL_EXPONENT}

DECIMAL_EXPONENT = [eE][\+\-]? [0-9_]+

HEX_FLOAT = 0[xX] ([0-9a-fA-F]* \.)? [0-9a-fA-F]+ {HEX_EXPONENT}
HEX_EXPONENT = [pP][\+\-]? [0-9]+


KW_CENT = cent

KW_MACRO = macro
KW_TYPEDEF = typedef
KW_UCENT = ucent
KW_VOLATILE = volatile
KW___VECTOR = __vector

TRAITS_KEYWORD = isAbstractClass | isArithmetic | isAssociativeArray | isFinalClass
               | isPOD | isNested | isFloating | isIntegral | isScalar | isStaticArray
               | isUnsigned | isVirtualFunction | isVirtualMethod | isAbstractFunction
               | isFinalFunction | isStaticFunction | isOverrideFunction | isRef | isOut
               | isLazy | hasMember | identifier | getAliasThis | getAttributes
               | getFunctionAttributes | getMember | getOverloads | getProtection
               | getVirtualFunctions | getVirtualMethods | getUnitTests | parent
               | classInstanceSize | getVirtualIndex | allMembers | derivedMembers
               | isSame | compiles

KEYWORD = {KW_CENT} | {KW_MACRO} | {KW_TYPEDEF} | {KW_UCENT} | {KW_VOLATILE} | {KW___VECTOR}

/*End of rules*/

%state WAITING_VALUE, NESTING_COMMENT_CONTENT

%%

<YYINITIAL> {WHITE_SPACE_CHAR}+ { return TokenType.WHITE_SPACE; }
<YYINITIAL> {NEW_LINE}+         { return TokenType.WHITE_SPACE; }

<YYINITIAL> {BLOCK_COMMENT} { return DTokenTypes.BLOCK_COMMENT; }
<YYINITIAL> {LINE_COMMENT}  { return DTokenTypes.LINE_COMMENT; }
<YYINITIAL> {NESTING_BLOCK_COMMENT_START} {
		yybegin(NESTING_COMMENT_CONTENT);
		nestedCommentDepth = 1;
		return DTokenTypes.NESTING_BLOCK_COMMENT;
	}

<YYINITIAL> {KEYWORD}   { return DTokenTypes.KEYWORD; }
<YYINITIAL> {TRAITS_KEYWORD} { return DTokenTypes.TRAITS_KEYWORD; }
<YYINITIAL> "module"    { return DTokenTypes.KW_MODULE; }
<YYINITIAL> "import"    { return DTokenTypes.KW_IMPORT; }
<YYINITIAL> "static"    { return DTokenTypes.KW_STATIC; }
<YYINITIAL> "bool"      { return DTokenTypes.KW_BOOL; }
<YYINITIAL> "byte"      { return DTokenTypes.KW_BYTE; }
<YYINITIAL> "ubyte"     { return DTokenTypes.KW_UBYTE; }
<YYINITIAL> "short"     { return DTokenTypes.KW_SHORT; }
<YYINITIAL> "ushort"    { return DTokenTypes.KW_USHORT; }
<YYINITIAL> "int"       { return DTokenTypes.KW_INT; }
<YYINITIAL> "uint"      { return DTokenTypes.KW_UINT; }
<YYINITIAL> "long"      { return DTokenTypes.KW_LONG; }
<YYINITIAL> "ulong"     { return DTokenTypes.KW_ULONG; }
<YYINITIAL> "char"      { return DTokenTypes.KW_CHAR; }
<YYINITIAL> "wchar"     { return DTokenTypes.KW_WCHAR; }
<YYINITIAL> "dchar"     { return DTokenTypes.KW_DCHAR; }
<YYINITIAL> "float"     { return DTokenTypes.KW_FLOAT; }
<YYINITIAL> "double"    { return DTokenTypes.KW_DOUBLE; }
<YYINITIAL> "real"      { return DTokenTypes.KW_REAL; }
<YYINITIAL> "ifloat"    { return DTokenTypes.KW_IFLOAT; }
<YYINITIAL> "idouble"   { return DTokenTypes.KW_IDOUBLE; }
<YYINITIAL> "ireal"     { return DTokenTypes.KW_IREAL; }
<YYINITIAL> "cfloat"    { return DTokenTypes.KW_CFLOAT; }
<YYINITIAL> "cdouble"   { return DTokenTypes.KW_CDOUBLE; }
<YYINITIAL> "creal"     { return DTokenTypes.KW_CREAL; }
<YYINITIAL> "void"      { return DTokenTypes.KW_VOID; }
<YYINITIAL> "typeof"    { return DTokenTypes.KW_TYPEOF; }
<YYINITIAL> "const"     { return DTokenTypes.KW_CONST; }
<YYINITIAL> "immutable" { return DTokenTypes.KW_IMMUTABLE; }
<YYINITIAL> "shared"    { return DTokenTypes.KW_SHARED; }
<YYINITIAL> "inout"     { return DTokenTypes.KW_INOUT; }
<YYINITIAL> "delegate"  { return DTokenTypes.KW_DELEGATE; }
<YYINITIAL> "function"  { return DTokenTypes.KW_FUNCTION; }
<YYINITIAL> "nothrow"   { return DTokenTypes.KW_NOTHROW; }
<YYINITIAL> "pure"      { return DTokenTypes.KW_PURE; }
<YYINITIAL> "this"      { return DTokenTypes.KW_THIS; }
<YYINITIAL> "__FILE__"  { return DTokenTypes.KW___FILE__; }
<YYINITIAL> "__MODULE__" { return DTokenTypes.KW___MODULE__; }
<YYINITIAL> "__LINE__"  { return DTokenTypes.KW___LINE__; }
<YYINITIAL> "__FUNCTION__" { return DTokenTypes.KW___FUNCTION__; }
<YYINITIAL> "__PRETTY_FUNCTION__" { return DTokenTypes.KW___PRETTY_FUNCTION__; }
<YYINITIAL> "abstract"  { return DTokenTypes.KW_ABSTRACT; }
<YYINITIAL> "alias"     { return DTokenTypes.KW_ALIAS; }
<YYINITIAL> "auto"      { return DTokenTypes.KW_AUTO; }
<YYINITIAL> "deprecated" { return DTokenTypes.KW_DEPRECATED; }
<YYINITIAL> "enum"      { return DTokenTypes.KW_ENUM; }
<YYINITIAL> "extern"    { return DTokenTypes.KW_EXTERN; }
<YYINITIAL> "final"     { return DTokenTypes.KW_FINAL; }
<YYINITIAL> "override"  { return DTokenTypes.KW_OVERRIDE; }
<YYINITIAL> "__gshared" { return DTokenTypes.KW___GSHARED; }
<YYINITIAL> "scope"     { return DTokenTypes.KW_SCOPE; }
<YYINITIAL> "synchronized" { return DTokenTypes.KW_SYNCHRONIZED; }
<YYINITIAL> "return"    { return DTokenTypes.KW_RETURN; }
<YYINITIAL> "super"     { return DTokenTypes.KW_SUPER; }
<YYINITIAL> "align"     { return DTokenTypes.KW_ALIGN; }
<YYINITIAL> "pragma"    { return DTokenTypes.KW_PRAGMA; }
<YYINITIAL> "package"   { return DTokenTypes.KW_PACKAGE; }
<YYINITIAL> "private"   { return DTokenTypes.KW_PRIVATE; }
<YYINITIAL> "protected" { return DTokenTypes.KW_PROTECTED; }
<YYINITIAL> "public"    { return DTokenTypes.KW_PUBLIC; }
<YYINITIAL> "export"    { return DTokenTypes.KW_EXPORT; }
<YYINITIAL> "property"  { return DTokenTypes.KW_PROPERTY; }
<YYINITIAL> "safe"      { return DTokenTypes.KW_SAFE; }
<YYINITIAL> "trusted"   { return DTokenTypes.KW_TRUSTED; }
<YYINITIAL> "system"    { return DTokenTypes.KW_SYSTEM; }
<YYINITIAL> "disable"   { return DTokenTypes.KW_DISABLE; }
<YYINITIAL> "delete"    { return DTokenTypes.KW_DELETE; }
<YYINITIAL> "null"      { return DTokenTypes.KW_NULL; }
<YYINITIAL> "true"      { return DTokenTypes.KW_TRUE; }
<YYINITIAL> "false"     { return DTokenTypes.KW_FALSE; }
<YYINITIAL> "new"       { return DTokenTypes.KW_NEW; }
<YYINITIAL> "typeid"    { return DTokenTypes.KW_TYPEID; }
<YYINITIAL> "is"        { return DTokenTypes.KW_IS; }
<YYINITIAL> "struct"    { return DTokenTypes.KW_STRUCT; }
<YYINITIAL> "union"     { return DTokenTypes.KW_UNION; }
<YYINITIAL> "class"     { return DTokenTypes.KW_CLASS; }
<YYINITIAL> "interface" { return DTokenTypes.KW_INTERFACE; }
<YYINITIAL> "__parameters" { return DTokenTypes.KW___PARAMETERS; }
<YYINITIAL> "in"        { return DTokenTypes.KW_IN; }
<YYINITIAL> "asm"       { return DTokenTypes.KW_ASM; }
<YYINITIAL> "assert"    { return DTokenTypes.KW_ASSERT; }
<YYINITIAL> "case"      { return DTokenTypes.KW_CASE; }
<YYINITIAL> "cast"      { return DTokenTypes.KW_CAST; }
<YYINITIAL> "ref"       { return DTokenTypes.KW_REF; }
<YYINITIAL> "break"     { return DTokenTypes.KW_BREAK; }
<YYINITIAL> "continue"  { return DTokenTypes.KW_CONTINUE; }
<YYINITIAL> "do"        { return DTokenTypes.KW_DO; }
<YYINITIAL> "else"      { return DTokenTypes.KW_ELSE; }
<YYINITIAL> "for"       { return DTokenTypes.KW_FOR; }
<YYINITIAL> "foreach"   { return DTokenTypes.KW_FOREACH; }
<YYINITIAL> "foreach_reverse" { return DTokenTypes.KW_FOREACH_REVERSE; }
<YYINITIAL> "goto"      { return DTokenTypes.KW_GOTO; }
<YYINITIAL> "if"        { return DTokenTypes.KW_IF; }
<YYINITIAL> "catch"     { return DTokenTypes.KW_CATCH; }
<YYINITIAL> "finally"   { return DTokenTypes.KW_FINALLY; }
<YYINITIAL> "switch"    { return DTokenTypes.KW_SWITCH; }
<YYINITIAL> "throw"     { return DTokenTypes.KW_THROW; }
<YYINITIAL> "try"       { return DTokenTypes.KW_TRY; }
<YYINITIAL> "default"   { return DTokenTypes.KW_DEFAULT; }
<YYINITIAL> "while"     { return DTokenTypes.KW_WHILE; }
<YYINITIAL> "with"      { return DTokenTypes.KW_WITH; }
<YYINITIAL> "version"   { return DTokenTypes.KW_VERSION; }
<YYINITIAL> "debug"     { return DTokenTypes.KW_DEBUG; }
<YYINITIAL> "mixin"     { return DTokenTypes.KW_MIXIN; }
<YYINITIAL> "invariant" { return DTokenTypes.KW_INVARIANT; }
<YYINITIAL> "body"      { return DTokenTypes.KW_BODY; }
<YYINITIAL> "template"  { return DTokenTypes.KW_TEMPLATE; }
<YYINITIAL> "lazy"      { return DTokenTypes.KW_LAZY; }
<YYINITIAL> "out"       { return DTokenTypes.KW_OUT; }
<YYINITIAL> "nogc"      { return DTokenTypes.KW_NOGC; }
<YYINITIAL> "__traits"  { return DTokenTypes.KW___TRAITS;}
<YYINITIAL> "unittest"  { return DTokenTypes.KW_UNITTEST;}


<YYINITIAL> {ID} { return DTokenTypes.ID; }

<YYINITIAL> {WYSIWYG_STRING} { return DTokenTypes.WYSIWYG_STRING; }

<YYINITIAL> {ALTERNATE_WYSIWYG_STRING} { return DTokenTypes.ALTERNATE_WYSIWYG_STRING; }

<YYINITIAL> {DOUBLE_QUOTED_STRING} { return DTokenTypes.DOUBLE_QUOTED_STRING; }

<YYINITIAL> {HEX_STRING} { return DTokenTypes.HEX_STRING; }

<YYINITIAL> {DELIMITED_STRING} { return DTokenTypes.DELIMITED_STRING; }

<NESTING_COMMENT_CONTENT> {
	{NESTING_BLOCK_COMMENT_START}	{
		nestedCommentDepth += 1;
		return DTokenTypes.NESTING_BLOCK_COMMENT;
	}

	{NESTING_BLOCK_COMMENT_END}	{
		nestedCommentDepth -= 1;
		if(nestedCommentDepth == 0) {
			yybegin(YYINITIAL); //Exit nesting comment block
		}
		return DTokenTypes.NESTING_BLOCK_COMMENT;
	}
	\n|\/|\+	{return DTokenTypes.NESTING_BLOCK_COMMENT;}
	[^/+\n]+	{return DTokenTypes.NESTING_BLOCK_COMMENT;}
}

<YYINITIAL> {CHARACTER_LITERAL} { return DTokenTypes.CHARACTER_LITERAL; }

<YYINITIAL> {INTEGER_LITERAL} { return DTokenTypes.INTEGER_LITERAL; }

<YYINITIAL> {FLOAT_LITERAL} { return DTokenTypes.FLOAT_LITERAL; }

<YYINITIAL> ";"       { return DTokenTypes.OP_SCOLON; }
<YYINITIAL> \.        { return DTokenTypes.OP_DOT; }
<YYINITIAL> ":"       { return DTokenTypes.OP_COLON; }
<YYINITIAL> "="       { return DTokenTypes.OP_EQ; }
<YYINITIAL> ","       { return DTokenTypes.OP_COMMA; }
<YYINITIAL> "\("      { return DTokenTypes.OP_PAR_LEFT; }
<YYINITIAL> "\)"      { return DTokenTypes.OP_PAR_RIGHT; }
<YYINITIAL> "\["      { return DTokenTypes.OP_BRACKET_LEFT; }
<YYINITIAL> "\]"      { return DTokenTypes.OP_BRACKET_RIGHT; }
<YYINITIAL> "\{"      { return DTokenTypes.OP_BRACES_LEFT; }
<YYINITIAL> "\}"      { return DTokenTypes.OP_BRACES_RIGHT; }
<YYINITIAL> "\*"      { return DTokenTypes.OP_ASTERISK; }
<YYINITIAL> "\.\."    { return DTokenTypes.OP_DDOT; }
<YYINITIAL> "\.\.\."  { return DTokenTypes.OP_TRIPLEDOT; }
<YYINITIAL> "\@"      { return DTokenTypes.OP_AT; }

<YYINITIAL> "\+="     { return DTokenTypes.OP_PLUS_EQ; }
<YYINITIAL> "\-="     { return DTokenTypes.OP_MINUS_EQ; }
<YYINITIAL> "\*="     { return DTokenTypes.OP_MUL_EQ; }
<YYINITIAL> "\/="     { return DTokenTypes.OP_DIV_EQ; }
<YYINITIAL> "\%="     { return DTokenTypes.OP_MOD_EQ; }
<YYINITIAL> "\&="     { return DTokenTypes.OP_AND_EQ; }
<YYINITIAL> "\|="     { return DTokenTypes.OP_OR_EQ; }
<YYINITIAL> "\^="     { return DTokenTypes.OP_XOR_EQ; }
<YYINITIAL> "\~="     { return DTokenTypes.OP_TILDA_EQ; }
<YYINITIAL> "\<\<="   { return DTokenTypes.OP_SH_LEFT_EQ; }
<YYINITIAL> "\>\>="   { return DTokenTypes.OP_SH_RIGHT_EQ; }
<YYINITIAL> "\>\>\>=" { return DTokenTypes.OP_USH_RIGHT_EQ; }
<YYINITIAL> "\^\^="   { return DTokenTypes.OP_POW_EQ; }

<YYINITIAL> "\?"      { return DTokenTypes.OP_QUEST; }


<YYINITIAL> "\|\|"    { return DTokenTypes.OP_BOOL_OR; }
<YYINITIAL> "\&\&"    { return DTokenTypes.OP_BOOL_AND; }
<YYINITIAL> "\|"      { return DTokenTypes.OP_OR; }
<YYINITIAL> "\^"      { return DTokenTypes.OP_XOR; }
<YYINITIAL> "\<\<"    { return DTokenTypes.OP_SH_LEFT; }
<YYINITIAL> "\>\>"    { return DTokenTypes.OP_SH_RIGHT; }
<YYINITIAL> "\>\>\>"  { return DTokenTypes.OP_USH_RIGHT; }
<YYINITIAL> "\+"      { return DTokenTypes.OP_PLUS; }
<YYINITIAL> "\-"      { return DTokenTypes.OP_MINUS; }
<YYINITIAL> "\~"      { return DTokenTypes.OP_TILDA; }
<YYINITIAL> "\/"      { return DTokenTypes.OP_DIV; }
<YYINITIAL> "\%"      { return DTokenTypes.OP_MOD; }
<YYINITIAL> "\&"      { return DTokenTypes.OP_AND; }
<YYINITIAL> "\+\+"    { return DTokenTypes.OP_PLUS_PLUS; }
<YYINITIAL> "\-\-"    { return DTokenTypes.OP_MINUS_MINUS; }
<YYINITIAL> "\!"      { return DTokenTypes.OP_NOT; }
<YYINITIAL> "\^\^"    { return DTokenTypes.OP_POW; }
<YYINITIAL> "\$"      { return DTokenTypes.OP_DOLLAR; }
<YYINITIAL> "=="      { return DTokenTypes.OP_EQ_EQ; }
<YYINITIAL> "\!="     { return DTokenTypes.OP_NOT_EQ; }
<YYINITIAL> "\<"      { return DTokenTypes.OP_LESS; }
<YYINITIAL> "\<="     { return DTokenTypes.OP_LESS_EQ; }
<YYINITIAL> "\>"      { return DTokenTypes.OP_GT; }
<YYINITIAL> "\>="     { return DTokenTypes.OP_GT_EQ; }
<YYINITIAL> "\!\<\>=" { return DTokenTypes.OP_UNORD; }
<YYINITIAL> "\!\<\>"  { return DTokenTypes.OP_UNORD_EQ; }
<YYINITIAL> "\<\>"    { return DTokenTypes.OP_LESS_GR; }
<YYINITIAL> "\<\>="   { return DTokenTypes.OP_LESS_GR_EQ; }
<YYINITIAL> "\!\>"    { return DTokenTypes.OP_NOT_GR; }
<YYINITIAL> "\!\>="   { return DTokenTypes.OP_NOT_GR_EQ; }
<YYINITIAL> "\!\<"    { return DTokenTypes.OP_NOT_LESS; }
<YYINITIAL> "\!\<="   { return DTokenTypes.OP_NOT_LESS_EQ; }
<YYINITIAL> "=\>"     { return DTokenTypes.OP_LAMBDA_ARROW; }

. { return TokenType.BAD_CHARACTER; }

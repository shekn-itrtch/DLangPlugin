package org.dlangplugin;

import com.intellij.lexer.FlexAdapter;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.dlangplugin.psi.DTokenTypeSets;
import org.dlangplugin.psi.DTokenTypes;
import org.jetbrains.annotations.NotNull;

import java.io.Reader;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/* Rules to highlight D Language source code.
 * Each AST element type could be colored.
 */
public class DSyntaxHighlighter extends SyntaxHighlighterBase {
    public static final TextAttributesKey IDENTIFIER = createTextAttributesKey("DLANG_IDENTIFIER", DefaultLanguageHighlighterColors.IDENTIFIER);
    public static final TextAttributesKey STRING = createTextAttributesKey("DLANG_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("DLANG_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey CHARACTER = createTextAttributesKey("DLANG_CHARACTER", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey INTEGER = createTextAttributesKey("DLANG_INTEGER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey FLOAT = createTextAttributesKey("DLANG_FLOAT", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey KEYWORD = createTextAttributesKey("DLANG_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TRAITS_KEYWORD = createTextAttributesKey("DLANG_TRAITS_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey OPERATOR = createTextAttributesKey("DLANG_OPERATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
    public static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey("DLANG_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] IDENTIFIER_KEYS = new TextAttributesKey[]{IDENTIFIER};
    private static final TextAttributesKey[] STRING_KEYS = new TextAttributesKey[]{STRING};
    private static final TextAttributesKey[] CHARACTER_KEYS = new TextAttributesKey[]{CHARACTER};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{INTEGER, FLOAT};
    private static final TextAttributesKey[] KEYWORD_KEYS = new TextAttributesKey[]{KEYWORD};
    private static final TextAttributesKey[] TRAITS_KEYWORD_KEYS = new TextAttributesKey[]{TRAITS_KEYWORD};
    private static final TextAttributesKey[] OPERATOR_KEYS = new TextAttributesKey[]{OPERATOR};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new FlexAdapter(new DLexer((Reader) null));
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        if (DTokenTypeSets.COMMENTS.contains(tokenType)) {
            return COMMENT_KEYS;
        } else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
            return BAD_CHAR_KEYS;
        } else if (tokenType.equals(DTokenTypes.IDENTIFIER)) {
            return IDENTIFIER_KEYS;
        } else if (DTokenTypeSets.STRINGS.contains(tokenType)) {
            return STRING_KEYS;
        } else if (tokenType.equals(DTokenTypes.CHARACTER_LITERAL)) {
            return CHARACTER_KEYS;
        } else if (DTokenTypeSets.NUMBERS.contains(tokenType)) {
            return NUMBER_KEYS;
        } else if (DTokenTypeSets.KEYWORDS.contains(tokenType)) {
            return KEYWORD_KEYS;
        } else if (tokenType.equals(DTokenTypes.TRAITS_KEYWORD)) {
            return TRAITS_KEYWORD_KEYS;
        } else if (DTokenTypeSets.OPERATORS.contains(tokenType)) {
            return OPERATOR_KEYS;
        } else {
            return EMPTY_KEYS;
        }
    }
}

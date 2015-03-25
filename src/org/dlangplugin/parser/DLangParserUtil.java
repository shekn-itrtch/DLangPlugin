package org.dlangplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiParser;
import com.intellij.lang.parser.GeneratedParserUtilBase;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiFile;
import com.intellij.psi.impl.source.resolve.FileContextUtil;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import gnu.trove.TObjectIntHashMap;
import org.dlangplugin.DFileType;
import org.jetbrains.annotations.NotNull;

import static org.dlangplugin.psi.DTokenTypes.*;

public class DLangParserUtil extends GeneratedParserUtilBase {
  public static boolean isApplicationLanguage(PsiBuilder builder_, @SuppressWarnings("UnusedParameters") int level) {
    PsiFile file = builder_.getUserDataUnprotected(FileContextUtil.CONTAINING_FILE_KEY);
    assert file != null;
    return isApplicationConfigFileType(file);
  }

  public static boolean isApplicationConfigFileType(@NotNull PsiFile file) {
    FileType fileType = file.getViewProvider().getVirtualFile().getFileType();
    return fileType == DFileType.INSTANCE ||
      ApplicationManager.getApplication().isUnitTestMode() && (fileType.getDefaultExtension().equals("app") || fileType.getDefaultExtension().equals("config"));
  }

  private static final Key<TObjectIntHashMap<String>> MODES_KEY = Key.create("MODES_KEY");
  private static TObjectIntHashMap<String> getParsingModes(PsiBuilder builder_) {
    TObjectIntHashMap<String> flags = builder_.getUserDataUnprotected(MODES_KEY);
    if (flags == null) builder_.putUserDataUnprotected(MODES_KEY, flags = new TObjectIntHashMap<String>());
    return flags;
  }

  public static boolean isModeOn(PsiBuilder builder_, @SuppressWarnings("UnusedParameters") int level, String mode) {
    return getParsingModes(builder_).get(mode) > 0;
  }

  public static boolean isModeOff(PsiBuilder builder_, @SuppressWarnings("UnusedParameters") int level, String mode) {
    return getParsingModes(builder_).get(mode) == 0;
  }

  public static boolean enterMode(PsiBuilder builder_, @SuppressWarnings("UnusedParameters") int level, String mode) {
    TObjectIntHashMap<String> flags = getParsingModes(builder_);
    if (!flags.increment(mode)) flags.put(mode, 1);
    return true;
  }

  public static boolean exitMode(PsiBuilder builder_, @SuppressWarnings("UnusedParameters") int level, String mode) {
    TObjectIntHashMap<String> flags = getParsingModes(builder_);
    int count = flags.get(mode);
    if (count == 1) flags.remove(mode);
    else if (count > 1) flags.put(mode, count -1);
    else builder_.error("Could not exit inactive '" + mode + "' mode at offset " + builder_.getCurrentOffset());
    return true;
  }

  @SuppressWarnings("MethodOverridesStaticMethodOfSuperclass")
  public static PsiBuilder adapt_builder_(IElementType root, PsiBuilder builder, PsiParser parser, TokenSet[] tokenSets) {
    PsiBuilder result = GeneratedParserUtilBase.adapt_builder_(root, builder, parser, tokenSets);
    ErrorState.get(result).altMode = true;
    return result;
  }

    //DLang specific parsers:
    public static boolean parseTemplateArgument(PsiBuilder builder, int level)
    {
        if (!recursion_guard_(builder, level, "TemplateArgument")) return false;
        boolean result_ = false;
        PsiBuilder.Marker marker_ = enter_section_(builder);

        result_ = DParser.Type(builder, level + 1);
        if(result_ && !nextTokenIs(builder, OP_COMMA) && !nextTokenIs(builder, OP_PAR_RIGHT))
        {
            result_ = false;
            marker_.rollbackTo();
            marker_ = enter_section_(builder);
        }

        if (!result_) {
            result_ = DParser.Expression(builder, level + 1);
            if(result_ && !nextTokenIs(builder, OP_COMMA) && !nextTokenIs(builder, OP_PAR_RIGHT))
            {
                result_ = false;
                marker_.rollbackTo();
                marker_ = enter_section_(builder);
            }
        }

        if (!result_) {
            result_ = DParser.Symbol(builder, level + 1);
            if(result_ && !nextTokenIs(builder, OP_COMMA) && !nextTokenIs(builder, OP_PAR_RIGHT))
            {
                result_ = false;
                marker_.rollbackTo();
                marker_ = enter_section_(builder);
            }
        }

        exit_section_(builder, marker_, TEMPLATE_ARGUMENT, result_);
        return result_;
    }
}
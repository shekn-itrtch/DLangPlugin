// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangUnaryExpression extends DLangCompositeElement {

  @NotNull
  List<DLangArgumentList> getArgumentListList();

  @Nullable
  DLangArrayLiteral getArrayLiteral();

  @Nullable
  DLangAssertExpression getAssertExpression();

  @Nullable
  DLangAssocArrayLiteral getAssocArrayLiteral();

  @Nullable
  DLangBasicType getBasicType();

  @NotNull
  List<DLangCastPrefix> getCastPrefixList();

  @NotNull
  List<DLangExpression> getExpressionList();

  @Nullable
  DLangFunctionLiteral getFunctionLiteral();

  @Nullable
  DLangImportExpression getImportExpression();

  @Nullable
  DLangIsExpression getIsExpression();

  @Nullable
  DLangLambda getLambda();

  @Nullable
  DLangMixinStatement getMixinStatement();

  @NotNull
  List<DLangNewExpression> getNewExpressionList();

  @Nullable
  DLangNewExpressionWithArgs getNewExpressionWithArgs();

  @Nullable
  DLangString getString();

  @NotNull
  List<DLangTemplateInstance> getTemplateInstanceList();

  @Nullable
  DLangTraitsExpression getTraitsExpression();

  @Nullable
  DLangType getType();

  @Nullable
  DLangTypeCtors getTypeCtors();

  @Nullable
  DLangTypeidExpression getTypeidExpression();

  @Nullable
  DLangTypeof getTypeof();

  @Nullable
  DLangUnaryExpression getUnaryExpression();

}

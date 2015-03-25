// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangTemplateMixinDeclaration extends DLangCompositeElement {

  @Nullable
  DLangConstraint getConstraint();

  @NotNull
  List<DLangDeclDef> getDeclDefList();

  @Nullable
  DLangTemplateParameterList getTemplateParameterList();

}

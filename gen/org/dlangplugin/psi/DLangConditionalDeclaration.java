// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangConditionalDeclaration extends DLangCompositeElement {

  @NotNull
  DLangCondition getCondition();

  @NotNull
  List<DLangDeclDef> getDeclDefList();

  @Nullable
  DLangDeclarationBlock getDeclarationBlock();

}

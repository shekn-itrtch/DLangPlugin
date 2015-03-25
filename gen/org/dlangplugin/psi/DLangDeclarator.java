// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangDeclarator extends DLangCompositeElement {

  @NotNull
  List<DLangBasicType2> getBasicType2List();

  @Nullable
  DLangDeclarator getDeclarator();

  @NotNull
  List<DLangDeclaratorSuffix> getDeclaratorSuffixList();

}

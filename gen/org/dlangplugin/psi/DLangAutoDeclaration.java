// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangAutoDeclaration extends DLangCompositeElement {

  @NotNull
  List<DLangInitializer> getInitializerList();

  @NotNull
  List<DLangStorageClass> getStorageClassList();

  @NotNull
  List<DLangTemplateParameterList> getTemplateParameterListList();

}

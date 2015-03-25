// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DLangCaseStatement extends DLangCompositeElement {

  @NotNull
  DLangArgumentList getArgumentList();

  @NotNull
  List<DLangAsmStatement> getAsmStatementList();

  @NotNull
  List<DLangBlockStatement> getBlockStatementList();

  @NotNull
  List<DLangBreakStatement> getBreakStatementList();

  @NotNull
  List<DLangConditionalStatement> getConditionalStatementList();

  @NotNull
  List<DLangContinueStatement> getContinueStatementList();

  @NotNull
  List<DLangDeclaration> getDeclarationList();

  @NotNull
  List<DLangDoStatement> getDoStatementList();

  @NotNull
  List<DLangExpression> getExpressionList();

  @NotNull
  List<DLangForStatement> getForStatementList();

  @NotNull
  List<DLangForeachRangeStatement> getForeachRangeStatementList();

  @NotNull
  List<DLangForeachStatement> getForeachStatementList();

  @NotNull
  List<DLangGotoStatement> getGotoStatementList();

  @NotNull
  List<DLangIfStatement> getIfStatementList();

  @NotNull
  List<DLangImportDeclaration> getImportDeclarationList();

  @NotNull
  List<DLangMixinStatement> getMixinStatementList();

  @NotNull
  List<DLangPragmaStatement> getPragmaStatementList();

  @NotNull
  List<DLangReturnStatement> getReturnStatementList();

  @NotNull
  List<DLangScopeGuardStatement> getScopeGuardStatementList();

  @NotNull
  List<DLangStaticAssert> getStaticAssertList();

  @NotNull
  List<DLangSwitchStatement> getSwitchStatementList();

  @NotNull
  List<DLangSynchronizedStatement> getSynchronizedStatementList();

  @NotNull
  List<DLangTemplateMixin> getTemplateMixinList();

  @NotNull
  List<DLangThrowStatement> getThrowStatementList();

  @NotNull
  List<DLangTryStatement> getTryStatementList();

  @NotNull
  List<DLangWhileStatement> getWhileStatementList();

  @NotNull
  List<DLangWithStatement> getWithStatementList();

}

// This is a generated file. Not intended for manual editing.
package org.dlangplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.dlangplugin.psi.DTokenTypes.*;
import org.dlangplugin.psi.*;

public class DLangCaseRangeStatementImpl extends DLangCompositeElementImpl implements DLangCaseRangeStatement {

  public DLangCaseRangeStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DLangVisitor) ((DLangVisitor)visitor).visitCaseRangeStatement(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DLangAsmStatement> getAsmStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangAsmStatement.class);
  }

  @Override
  @NotNull
  public List<DLangBlockStatement> getBlockStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangBlockStatement.class);
  }

  @Override
  @NotNull
  public List<DLangBreakStatement> getBreakStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangBreakStatement.class);
  }

  @Override
  @NotNull
  public List<DLangConditionalStatement> getConditionalStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangConditionalStatement.class);
  }

  @Override
  @NotNull
  public List<DLangContinueStatement> getContinueStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangContinueStatement.class);
  }

  @Override
  @NotNull
  public List<DLangDeclaration> getDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangDeclaration.class);
  }

  @Override
  @NotNull
  public List<DLangDoStatement> getDoStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangDoStatement.class);
  }

  @Override
  @NotNull
  public List<DLangExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangExpression.class);
  }

  @Override
  @NotNull
  public List<DLangForStatement> getForStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangForStatement.class);
  }

  @Override
  @NotNull
  public List<DLangForeachRangeStatement> getForeachRangeStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangForeachRangeStatement.class);
  }

  @Override
  @NotNull
  public List<DLangForeachStatement> getForeachStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangForeachStatement.class);
  }

  @Override
  @NotNull
  public List<DLangGotoStatement> getGotoStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangGotoStatement.class);
  }

  @Override
  @NotNull
  public List<DLangIfStatement> getIfStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangIfStatement.class);
  }

  @Override
  @NotNull
  public List<DLangImportDeclaration> getImportDeclarationList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangImportDeclaration.class);
  }

  @Override
  @NotNull
  public List<DLangMixinStatement> getMixinStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangMixinStatement.class);
  }

  @Override
  @NotNull
  public List<DLangPragmaStatement> getPragmaStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangPragmaStatement.class);
  }

  @Override
  @NotNull
  public List<DLangReturnStatement> getReturnStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangReturnStatement.class);
  }

  @Override
  @NotNull
  public List<DLangScopeGuardStatement> getScopeGuardStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangScopeGuardStatement.class);
  }

  @Override
  @NotNull
  public List<DLangStaticAssert> getStaticAssertList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangStaticAssert.class);
  }

  @Override
  @NotNull
  public List<DLangSwitchStatement> getSwitchStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangSwitchStatement.class);
  }

  @Override
  @NotNull
  public List<DLangSynchronizedStatement> getSynchronizedStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangSynchronizedStatement.class);
  }

  @Override
  @NotNull
  public List<DLangTemplateMixin> getTemplateMixinList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangTemplateMixin.class);
  }

  @Override
  @NotNull
  public List<DLangThrowStatement> getThrowStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangThrowStatement.class);
  }

  @Override
  @NotNull
  public List<DLangTryStatement> getTryStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangTryStatement.class);
  }

  @Override
  @NotNull
  public List<DLangWhileStatement> getWhileStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangWhileStatement.class);
  }

  @Override
  @NotNull
  public List<DLangWithStatement> getWithStatementList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DLangWithStatement.class);
  }

}

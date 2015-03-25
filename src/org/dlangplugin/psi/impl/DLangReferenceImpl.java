package org.dlangplugin.psi.impl;

import com.intellij.lang.ASTNode;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.*;
import com.intellij.psi.impl.source.resolve.ResolveCache;
import com.intellij.psi.infos.CandidateInfo;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.util.ArrayUtil;
import com.intellij.util.IncorrectOperationException;
import gnu.trove.THashSet;
import org.dlangplugin.ide.DLangLookupElement;
import org.dlangplugin.psi.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Set;

public class DLangReferenceImpl extends DLangCompositeElementImpl implements DLangReference, PsiPolyVariantReference {

    public DLangReferenceImpl(ASTNode node) {
        super(node);
    }

    @Override
    public PsiElement getElement() {
        return this;
    }

    @Override
    public PsiReference getReference() {
        return this;
    }

    @Override
    public TextRange getRangeInElement() {
        final TextRange textRange = getTextRange();
        return new TextRange(0, textRange.getEndOffset() - textRange.getStartOffset());
    }

    @NotNull
    @Override
    public String getCanonicalText() {
        return getText();
    }

    @Override
    public boolean isReferenceTo(PsiElement element) {
        final PsiElement resolve = resolve();
        if (element instanceof DFile &&
                resolve instanceof DLangComponentName &&
                resolve.getParent() instanceof DLangClassDeclaration) {
            return element == resolve.getContainingFile();
        }
        final DLangReference[] references = PsiTreeUtil.getChildrenOfType(this, DLangReference.class);
        final boolean chain = references != null && references.length == 2;
        return !chain && resolve == element;
    }

    @NotNull
    @Override
    public Object[] getVariants() {
        final Set<DLangComponentName> availableNamespaces = new THashSet<DLangComponentName>();

        final DLangReference[] childReferences = PsiTreeUtil.getChildrenOfType(this, DLangReference.class);
        final boolean isChain = childReferences != null && childReferences.length == 2;
        if (!isChain) {
            PsiTreeUtil.treeWalkUp(new ComponentNameScopeProcessor(availableNamespaces), this, null, new ResolveState());
            addNamespaceVariants(availableNamespaces, PsiTreeUtil.getParentOfType(this, DLangClassDeclaration.class));
        }
        addNamespaceVariants(availableNamespaces, PsiTreeUtil.getParentOfType(this, DFile.class));

        Object[] variants = DLangLookupElement.convert(availableNamespaces).toArray();

        PsiPackage rootPackage = JavaPsiFacade.getInstance(getElement().getProject()).findPackage("");
        return rootPackage == null ? variants : ArrayUtil.mergeArrays(variants, rootPackage.getSubPackages());
    }

    //Look for DLangNamedComponent children of namespaceElement and get its' names.
    private static void addNamespaceVariants(Set<DLangComponentName> suggestedVariants, @Nullable PsiElement namespaceElement) {
        if (namespaceElement == null) {
            return;
        }
        for (DLangNamedComponent namedComponent : DLangResolveUtil.findNamedSubComponents(namespaceElement)) {
            if ( namedComponent.getComponentName() != null) {
                suggestedVariants.add(namedComponent.getComponentName());
            }
        }
    }

    @Override
    public boolean isSoft() {
        return false;
    }

    @Override
    public PsiElement resolve() {
        final ResolveResult[] resolveResults = multiResolve(true);

        return resolveResults.length == 0 ||
               resolveResults.length > 1 ||
               !resolveResults[0].isValidResult() ? null : resolveResults[0].getElement();
    }

    @NotNull
    @Override
    public ResolveResult[] multiResolve(boolean incompleteCode) {
        final List<? extends PsiElement> elements =
                ResolveCache.getInstance(getProject()).resolveWithCaching(this, DLangResolver.INSTANCE, true, incompleteCode);
        return toCandidateInfoArray(elements);
    }

    @NotNull
    private static ResolveResult[] toCandidateInfoArray(List<? extends PsiElement> elements) {
        final ResolveResult[] result = new ResolveResult[elements.size()];
        for (int i = 0, size = elements.size(); i < size; i++) {
            result[i] = new CandidateInfo(elements.get(i), EmptySubstitutor.getInstance());
        }
        return result;
    }

    @Override
    public PsiElement handleElementRename(String newElementName) throws IncorrectOperationException {
        PsiElement element = this;
        if (getText().indexOf('.') != -1) {
            // qName
            final PsiElement lastChild = getLastChild();
            element = lastChild == null ? this : lastChild;
        }
        final DLangIdentifier identifier = PsiTreeUtil.getChildOfType(element, DLangIdentifier.class);
        final DLangIdentifier identifierNew = DLangElementGenerator.createIdentifierFromText(getProject(), newElementName);
        if (identifier != null && identifierNew != null) {
            element.getNode().replaceChild(identifier.getNode(), identifierNew.getNode());
        }
        return this;
    }

    @Override
    public PsiElement bindToElement(@NotNull PsiElement element) throws IncorrectOperationException {
        if (element instanceof DFile) {
            bindToFile(element);
        }
        else if (element instanceof PsiPackage) {
            bindToPackage((PsiPackage)element);
        }
        return this;
    }

    private void bindToFile(PsiElement element) {
        //TODO
    }

    private void bindToPackage(PsiPackage element) {
        //TODO
    }
}

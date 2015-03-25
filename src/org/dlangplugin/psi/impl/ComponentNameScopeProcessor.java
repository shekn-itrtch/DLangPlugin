package org.dlangplugin.psi.impl;

import com.intellij.openapi.util.Key;
import com.intellij.psi.PsiElement;
import com.intellij.psi.ResolveState;
import com.intellij.psi.scope.PsiScopeProcessor;
import org.dlangplugin.psi.DLangComponentName;
import org.dlangplugin.psi.DLangNamedComponent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Set;

public class ComponentNameScopeProcessor implements PsiScopeProcessor {
    private final Set<DLangComponentName> result;

    public ComponentNameScopeProcessor(Set<DLangComponentName> result) {
        this.result = result;
    }

    @Override
    public boolean execute(@NotNull PsiElement element, ResolveState state) {
        if (element instanceof DLangNamedComponent) {
            final DLangNamedComponent namedComponent = (DLangNamedComponent)element;
            if (namedComponent.getComponentName() != null) {
                result.add(namedComponent.getComponentName());
            }
        }
        return true;
    }

    @Override
    public <T> T getHint(@NotNull Key<T> hintKey) {
        return null;
    }

    @Override
    public void handleEvent(Event event, @Nullable Object associated) {
    }

    public Set<DLangComponentName> getResult() {
        return result;
    }
}

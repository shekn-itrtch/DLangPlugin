package org.dlangplugin.ide;

import com.intellij.codeInsight.lookup.LookupElement;
import org.dlangplugin.psi.DLangComponentName;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** Reference to a PsiElement used to navigate in code.
 * When IDE performs "Navigate To Declaration" action for DLang class, or function, or template,
 * etc it performs component lookup. And DLangLookupElement is an element of search result.
 */
public class DLangLookupElement extends LookupElement {
    private final DLangComponentName componentName;

    public static Collection<DLangLookupElement> convert(@NotNull Collection<DLangComponentName> componentNames) {
        final List<DLangLookupElement> result = new ArrayList<DLangLookupElement>(componentNames.size());
        for (DLangComponentName componentName : componentNames) {
            result.add(new DLangLookupElement(componentName));
        }
        return result;
    }

    public DLangLookupElement(DLangComponentName name) {
        super();
        componentName = name;
    }

    @NotNull
    @Override
    public String getLookupString() {
        String result = null;
        if(componentName!=null) {
            result = componentName.getName();
        }
        if(result == null) result = "";
        return result;
    }
}

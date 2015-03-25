package org.dlangplugin.ide;

import com.intellij.navigation.ChooseByNameContributor;
import com.intellij.navigation.NavigationItem;
import com.intellij.openapi.project.Project;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.util.ArrayUtil;
import org.dlangplugin.ide.index.DLangComponentIndex;
import org.dlangplugin.psi.DLangClassDeclaration;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

/** This class is used to find DLang class by it's name or package.
 * It's invoked from "Go to by name..." action (Ctrl + N) and uses index for classes lookup. */
public class DLangClassContributor implements ChooseByNameContributor {
    @NotNull
    @Override
    public String[] getNames(Project project, boolean includeNonProjectItems) {
        final Collection<String> result = DLangComponentIndex.getNames(project);
        return ArrayUtil.toStringArray(result);
    }

    @NotNull
    @Override
    public NavigationItem[] getItemsByName(String name, String pattern, Project project, boolean includeNonProjectItems) {
        final GlobalSearchScope scope = includeNonProjectItems ? GlobalSearchScope.allScope(project) : GlobalSearchScope.projectScope(project);
        final Collection<DLangClassDeclaration> result = DLangComponentIndex.getItemsByName(name, project, scope);
        return result.toArray(new NavigationItem[result.size()]);
    }
}

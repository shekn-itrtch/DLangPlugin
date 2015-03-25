package org.dlangplugin.psi;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleUtilCore;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.search.GlobalSearchScope;
import com.intellij.psi.util.PsiTreeUtil;
import org.dlangplugin.ide.index.DLangComponentIndex;
import org.dlangplugin.psi.impl.DLangClassDeclarationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.*;

/* Some utils to search in PsiTree */
public class DLangResolveUtil {
    @NotNull
    public static String findModuleName(PsiFile psiFile) {
        final DLangModuleDeclaration moduleStatement = PsiTreeUtil.getChildOfType(psiFile, DLangModuleDeclaration.class);
        if(moduleStatement == null) return "";
        return getModuleName(moduleStatement);
    }

    @NotNull
    private static String getModuleName(DLangModuleDeclaration moduleStatement) {
        final DLangModuleFullyQualifiedName packageStatement = PsiTreeUtil.getChildOfType(moduleStatement, DLangModuleFullyQualifiedName.class);
        if(packageStatement==null) return "";
        return packageStatement.getText();
    }

    @Nullable
    public static DLangClassDeclarationImpl findClassDeclaration(PsiFile file, String name) {
        final Collection<DLangClassDeclarationImpl> classes = PsiTreeUtil.findChildrenOfType(file, DLangClassDeclarationImpl.class);
        for(DLangClassDeclarationImpl classDecl : classes) {
            if(name.equals(classDecl.getName())) {
                return classDecl;
            }
        }
        return null;
    }

    @NotNull
    public static List<DLangNamedComponent> findNamedSubComponents(@NotNull PsiElement... rootDLangClasses) {
        return findNamedSubComponents(true, rootDLangClasses);
    }

    @NotNull
    public static List<DLangNamedComponent> findNamedSubComponents(boolean unique, @NotNull PsiElement... rootDLangClasses) {
        final List<DLangNamedComponent> unfilteredResult = new ArrayList<DLangNamedComponent>();
        final LinkedList<PsiElement> classes = new LinkedList<PsiElement>();
        classes.addAll(Arrays.asList(rootDLangClasses));
        while (!classes.isEmpty()) {
            final PsiElement dLangClass = classes.pollFirst();
            for (DLangNamedComponent namedComponent : getNamedSubComponents(dLangClass)) {
                if (namedComponent.getName() != null) {
                    unfilteredResult.add(namedComponent);
                }
            }
        }
        if (!unique) {
            return unfilteredResult;
        }
        return new ArrayList<DLangNamedComponent>(namedElementToMap(unfilteredResult).values());
    }

    @NotNull
    private static List<DLangNamedComponent> getNamedSubComponents(@NotNull PsiElement dLangClass) {
        final List<DLangNamedComponent> unfilteredResult = new ArrayList<DLangNamedComponent>();
        unfilteredResult.addAll(PsiTreeUtil.findChildrenOfType(dLangClass, DLangClassDeclaration.class));
        return unfilteredResult;
    }

    public static Map<String, DLangNamedComponent> namedElementToMap(List<DLangNamedComponent> unfilteredResult) {
        final Map<String, DLangNamedComponent> result = new HashMap<String, DLangNamedComponent>();
        for (DLangNamedComponent namedComponent : unfilteredResult) {
            // need order
            if (result.containsKey(namedComponent.getName())) continue;
            result.put(namedComponent.getName(), namedComponent);
        }
        return result;
    }

    public static DLangClass tryResolveClassByName(PsiElement classNameElement) {
        if (classNameElement == null || classNameElement.getContext() == null) {
            return null;
        }

        String name = classNameElement.getText();
        return findClassByName(name, classNameElement.getContext());
    }

    @Nullable
    public static DLangClass findClassByNameModule(DLangReference classNameElement, String moduleName) {
        if (classNameElement == null || classNameElement.getContext() == null) {
            return null;
        }

        final String className = classNameElement.getText();
        final Project project = classNameElement.getProject();
        final Module projectModule = ModuleUtilCore.findModuleForPsiElement(classNameElement);
        final GlobalSearchScope scope = (projectModule == null) ?
                                        GlobalSearchScope.allScope(project)
                                        : GlobalSearchScope.moduleWithLibrariesScope(projectModule);

        final List<DLangClassDeclaration> classFiles = DLangComponentIndex.getItemsByNameModule(className, moduleName, project, scope);

        for(DLangClassDeclaration dLangClass : classFiles) {
            DLangComponentName componentName = dLangClass.getComponentName();
            if(componentName!=null && className.equals(componentName.getText())) {
                return dLangClass;
            }
        }

        return null;
    }

    @Nullable
    public static DLangClass findClassByName(final @Nullable String qName, final @Nullable PsiElement context) {
        if (context == null || qName == null) {
            return null;
        }

        final Project project = context.getProject();
        final GlobalSearchScope scope = GlobalSearchScope.fileScope(context.getContainingFile());
        return findClassByName(qName, project, scope);
    }

    @Nullable
    public static DLangClass findClassByName(String qName, Project project, GlobalSearchScope scope) {
        final List<DLangClassDeclaration> classFiles = DLangComponentIndex.getItemsByName(qName, project, scope);

        for(DLangClassDeclaration dLangClass : classFiles) {
            DLangComponentName componentName = dLangClass.getComponentName();
            if(componentName!=null && qName.equals(componentName.getText())) {
                return dLangClass;
            }
        }

        return null;
    }

    @NotNull
    private static GlobalSearchScope getScopeForElement(PsiElement context) {
        final Project project = context.getProject();
        if (ApplicationManager.getApplication().isUnitTestMode()) {
            return GlobalSearchScope.allScope(project);
        }
        final Module module = ModuleUtilCore.findModuleForPsiElement(context);
        return module != null ? GlobalSearchScope.moduleWithDependenciesAndLibrariesScope(module) : GlobalSearchScope.allScope(project);
    }
}

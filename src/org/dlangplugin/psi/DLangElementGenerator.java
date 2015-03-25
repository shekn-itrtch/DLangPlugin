package org.dlangplugin.psi;

import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.impl.PsiFileFactoryImpl;
import com.intellij.psi.util.PsiTreeUtil;
import com.intellij.testFramework.LightVirtualFile;
import org.dlangplugin.DFileType;
import org.dlangplugin.DLanguage;
import org.jetbrains.annotations.Nullable;

public class DLangElementGenerator {
    @Nullable
    public static DLangIdentifier createIdentifierFromText(Project myProject, String name) {
        return createClassAndFindChild(myProject, name, DLangIdentifier.class);
    }

    @Nullable
    private static <T extends PsiElement> T createClassAndFindChild(Project myProject, String name, Class<T> aClass) {
        final DLangClassDeclaration classDeclarationStatement = createClassStatementFromPath(myProject, name);
        if (classDeclarationStatement == null) {
            return null;
        }
        return PsiTreeUtil.findChildOfType(classDeclarationStatement, aClass);
    }

    @Nullable
    public static DLangClassDeclaration createClassStatementFromPath(Project myProject, String name) {
        final PsiFile dummyFile = createDummyFile(myProject, "class " + name + " {}");
        return PsiTreeUtil.getChildOfType(dummyFile, DLangClassDeclaration.class);
    }

    public static PsiFile createDummyFile(Project myProject, String text) {
        final PsiFileFactory factory = PsiFileFactory.getInstance(myProject);
        final String name = "dummy." + DFileType.INSTANCE.getDefaultExtension();
        final LightVirtualFile virtualFile = new LightVirtualFile(name, DFileType.INSTANCE, text);
        final PsiFile psiFile = ((PsiFileFactoryImpl)factory).trySetupPsiForFile(virtualFile, DLanguage.INSTANCE, false, true);
        assert psiFile != null;
        return psiFile;
    }
}

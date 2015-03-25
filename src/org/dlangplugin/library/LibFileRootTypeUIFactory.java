package org.dlangplugin.library;

import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.ui.SdkPathEditor;
import com.intellij.openapi.roots.ui.OrderRootTypeUIFactory;
import org.dlangplugin.DLangIcons;

import javax.swing.*;

public class LibFileRootTypeUIFactory implements OrderRootTypeUIFactory{
    @Override
    public SdkPathEditor createPathEditor(Sdk sdk)
    {
        return new SdkPathEditor(getNodeText(), LibFileRootType.getInstance(),
                FileChooserDescriptorFactory.createSingleLocalFileDescriptor());
    }

    @Override
    public Icon getIcon()
    {
        return DLangIcons.LIBRARY;
    }

    @Override
    public String getNodeText()
    {
        return "External Attributes";
    }
}

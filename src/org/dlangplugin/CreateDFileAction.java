package org.dlangplugin;

import com.intellij.ide.actions.CreateFileAction;

/**
 * The "New D File" action.
 */
public class CreateDFileAction extends CreateFileAction {
    public CreateDFileAction() {
        super(DLangBundle.message("action.NewDfile.text"), DLangBundle.message("action.NewDfile.text"), DLangIcons.FILE);
    }

    @Override
    protected String getDefaultExtension() {
        return "d";
    }
}

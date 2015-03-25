package org.dlangplugin.config;

import com.intellij.openapi.components.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.SystemInfo;
import com.intellij.util.xmlb.annotations.Property;
import org.jetbrains.annotations.NotNull;

/* DLang plugin settings are stored here.
 * Parameters:
 * 1. "dubExecutablePath" - path to dub.exe/dub executable.
 */

@State(
    name = "DLang.Settings",
    storages = {@Storage(file = StoragePathMacros.WORKSPACE_FILE)}
)
public class DLangGeneralSettings implements PersistentStateComponent<DLangGeneralSettings.State> {
    @NotNull
    public static DLangGeneralSettings getInstance(@NotNull Project project) {
        DLangGeneralSettings persisted = ServiceManager.getService(project, DLangGeneralSettings.class);
        return persisted != null ? persisted : new DLangGeneralSettings();
    }

    public static class State {
        public String dubExecutablePath;

        public State() {
            dubExecutablePath = SystemInfo.isWindows ? "dub.exe" : "dub";
        }

        @Override
        public boolean equals(Object that) {
            if(that instanceof State) {
                State thatState = (State) that;
                return this.dubExecutablePath.equals(thatState.dubExecutablePath);
            }
            return false;
        }
    }

    private State myState = new State();

    @Property
    @NotNull
    public String getDubExecutablePath() {
        return myState.dubExecutablePath;
    }

    public void setDubExecutablePath(@NotNull final String dmdExecutablePath) {
        if (!this.myState.dubExecutablePath.equals(dmdExecutablePath)) {
            this.myState.dubExecutablePath = dmdExecutablePath;
        }
    }

    public State getState() {
        return myState;
    }

    public void loadState(State state) {
        myState = state;
    }

    @Override
    public boolean equals(Object that) {
        if(that instanceof DLangGeneralSettings) {
            return this.myState.equals(((DLangGeneralSettings)that).myState);
        }
        else {
            return false;
        }
    }
}

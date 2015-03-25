package org.dlangplugin.run.exception;

/* Exception class */
public class NoSourcesException extends Exception {
    private final String sourcesRoot;

    public NoSourcesException(String sourcesRoot) {
        super();
        this.sourcesRoot = sourcesRoot;
    }

    public String getSourcesRoot() {
        return sourcesRoot;
    }
}

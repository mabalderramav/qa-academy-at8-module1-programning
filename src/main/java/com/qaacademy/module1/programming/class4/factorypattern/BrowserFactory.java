package com.qaacademy.module1.programming.class4.factorypattern;

public final class BrowserFactory {
    private BrowserFactory() {
    }

    public static Browser getBrowser(BrowserType browserType) {
        return switch (browserType) {
            case CHROME -> new Chrome();
            case FIREFOX -> new Firefox();
            case SAFARI -> new Safari();
            case EDGE -> new Edge();
        };
    }
}

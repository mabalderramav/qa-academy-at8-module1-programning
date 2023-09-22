package com.qaacademy.module1.programming.class4.factorypattern;

public class Firefox implements Browser, BrowserReset {

    @Override
    public String getDriver() {
        return "Firefox Driver";
    }

    @Override
    public String reset() {
        return "Firefox reset";
    }
}

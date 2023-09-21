package com.qaacademy.module1.programming.class4.factorypattern;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        // Chrome
        Browser browser = BrowserFactory.getBrowser(BrowserType.CHROME);
        System.out.println(browser.getDriver());

        // Firefox
        browser = BrowserFactory.getBrowser(BrowserType.FIREFOX);
        System.out.println(browser.getDriver());

        // Safari
        browser = BrowserFactory.getBrowser(BrowserType.SAFARI);
        System.out.println(browser.getDriver());
    }
}

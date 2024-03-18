package org.phenix.basepatterns.creational.factory;


import org.openqa.selenium.*;

public abstract class DriverManager {
    protected WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }
}

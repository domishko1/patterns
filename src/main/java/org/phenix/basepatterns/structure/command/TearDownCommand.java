package org.phenix.basepatterns.structure.command;

import org.openqa.selenium.*;

public class TearDownCommand implements Command{
    private WebDriver driver;
    public TearDownCommand(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        driver.close();
        driver.quit();
    }
}

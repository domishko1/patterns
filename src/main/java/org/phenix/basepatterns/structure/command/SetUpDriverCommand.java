package org.phenix.basepatterns.structure.command;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class SetUpDriverCommand implements Command{
    private WebDriver driver;

    public SetUpDriverCommand(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void execute() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://doramy.club/");
        driver.manage().window().minimize();
    }
}

package org.phenix.basepatterns.creational.factory;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.firefox.*;

public class FirefoxDriverManager extends DriverManager {
    public FirefoxDriverManager() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
}

package org.phenix.basepatterns.creational.factory;

import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverManager {

    public ChromeDriverManager() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
}

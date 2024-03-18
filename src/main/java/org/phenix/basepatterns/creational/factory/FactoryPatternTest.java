package org.phenix.basepatterns.creational.factory;

import org.junit.*;
import org.openqa.selenium.*;

public class FactoryPatternTest {
    static DriverManager driverManager;
    static WebDriver driver;


    @AfterClass
    public static void afterMethod() {
        driver.quit();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get("http://testautomationguru.com");
        Assert.assertEquals("TestAutomationGuru – A technical blog on test automation", driver.getTitle());
    }

    @Test
    public void launchGoogleTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
        driver = driverManager.getDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google", driver.getTitle());
    }
}

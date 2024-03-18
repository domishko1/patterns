package org.phenix.basepatterns.structure.facade;

import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class FacadeDesignTest {
    static WebDriver driver;
    static LoginFacade facade;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://doramy.club/");
        driver.manage().window().maximize();
        facade=new LoginFacade();
    }

    @Test
    public void loginTest() {
        Assert.assertEquals(facade.login(driver), "");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

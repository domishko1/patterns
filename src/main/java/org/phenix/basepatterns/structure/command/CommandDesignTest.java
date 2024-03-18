package org.phenix.basepatterns.structure.command;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class CommandDesignTest {
    static WebDriver driver;
    static InvokerSwitch s;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        Command setup = new SetUpDriverCommand(driver);
        Command teardown = new TearDownCommand(driver);
        s = new InvokerSwitch(setup, teardown);

        s.setUp();
    }

    @Test
    public void test() {
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/div/div[2]/aside/div/div[1]/ul/li[1]")), "Войти");
    }

    @AfterClass
    public static void tearDown() {
        s.tearDown();
    }
}

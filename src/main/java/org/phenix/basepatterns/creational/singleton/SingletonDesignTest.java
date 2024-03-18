package org.phenix.basepatterns.creational.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.*;
import org.openqa.selenium.*;

import java.util.concurrent.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SingletonDesignTest {

    static WebDriver driver1;

    static WebDriver driver2;

    @BeforeClass

    public static void setUp() {

        SingletonBaseClass.init();

    }

    @Test()
    public void test1() {

        driver1 = SingletonBaseClass.getDriver();

        System.out.println("driver1: " + driver1);

        driver1.get("https://doramy.club/");

        Assert.assertEquals("Дорамы смотреть онлайн с русской озвучкой", driver1.getTitle());

    }

    @Test
    public void test2() {

        driver2 = SingletonBaseClass.getDriver();

        System.out.println("driver2: " + driver2);

        driver2.get("https://doramy.club/");

        WebElement signIn = driver2.findElement(By.xpath("/html/body/div/div[2]/aside/div/div[1]/ul/li[1]/a"));

        driver2.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        Assert.assertTrue(signIn.getText().contains("Войти"));

    }

    @AfterClass

    public static void tearDown() {

        SingletonBaseClass.quit();

    }

}

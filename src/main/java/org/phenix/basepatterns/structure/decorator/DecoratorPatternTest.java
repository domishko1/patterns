package org.phenix.basepatterns.structure.decorator;

import io.github.bonigarcia.wdm.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class DecoratorPatternTest {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://doramy.club/");
        driver.manage().window().maximize();
    }

    @Test
    public void test1() {
        Search standardSearch = new StandardSearch(driver);
        standardSearch.baseSearch();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"genreListTitle\"]")).getText(), "Выбрать жанр");
    }

    @Test
    public void test2() {
        Search searchWithParam = new SearchWithParam(new StandardSearch(driver), driver);
        searchWithParam.baseSearch();
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id=\"genreListTitle\"]")).getText(), "Выбрать жанр (1)");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

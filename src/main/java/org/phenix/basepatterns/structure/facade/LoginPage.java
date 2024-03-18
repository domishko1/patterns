package org.phenix.basepatterns.structure.facade;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id=\"user_login\"]")
    private WebElement email;

    @FindBy(xpath = "//input[@id=\"user_pass\"]")
    private WebElement password;

    @FindBy(xpath = "//input[@id=\"wp-submit\"]")
    private WebElement signInBtn;

    public HomePage login(String user, String pass) {
        email.sendKeys(user);
        password.sendKeys(pass);
        signInBtn.click();

        return new HomePage(driver);
    }
}

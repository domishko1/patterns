package org.phenix.basepatterns.structure.facade;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div/div[2]/aside/div/div[1]/ul/li[1]/a")
    private WebElement signIn;

    @FindBy(xpath = "/html/body/header/div/div/ul/li/a/img")
    private WebElement logo;

    public void goToLoginPage() {
        signIn.click();
    }

    public String getLogoText() {
        return logo.getText();
    }
}

package org.phenix.basepatterns.structure.facade;

import org.openqa.selenium.*;

public class LoginFacade {
    WebDriver driver;
    LoginPage lp;
    HomePage hp;

    public String login(WebDriver driver) {
        lp=new LoginPage(driver);
        hp=new HomePage(driver);
        hp.goToLoginPage();
        lp.login("domishko1", "257274");

        return hp.getLogoText();
    }
}

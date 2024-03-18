package org.phenix.basepatterns.structure.decorator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class StandardSearch implements Search {
    @FindBy(xpath = "/html/body/header/div/div/div[3]/a")

    private WebElement searchBtn;

    public StandardSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Override
    public void baseSearch() {
        searchBtn.click();
    }
}

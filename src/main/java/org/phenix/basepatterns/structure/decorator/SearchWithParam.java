package org.phenix.basepatterns.structure.decorator;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class SearchWithParam implements Search{
    private Search search;

    public SearchWithParam(Search search, WebDriver driver) {
        this.search = search;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"genreListTitle\"]")
    private WebElement genre;

    @FindBy(xpath = "//*[@id=\"genreList\"]/li[1]/label")
    private WebElement boevik;

    @Override
    public void baseSearch() {
        this.search.baseSearch();
        genre.click();
        boevik.click();
    }
}

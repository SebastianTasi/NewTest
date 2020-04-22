package com.NewTest.Pages;

import com.NewTest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class WatchlistPage {

    public WatchlistPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[contains(@class,'cmc-table__column-name')]//a")
    public List<WebElement> watchListAddedCryptoCurrency;
}

package com.NewTest.Pages;

import com.NewTest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoinMarketPage {


    public CoinMarketPage()  {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='cmc-table-listing__pagination']//a[@class='wn9odt-0 bzWQIF cmc-link'][contains(text(),'View All')]" )
    public WebElement ViewAll;

    @FindBy(xpath = "//td[@class='cmc-table__cell cmc-table__cell--sticky cmc-table__cell--sortable cmc-table__cell--left cmc-table__cell--sort-by__rank']//div[contains(text(),'100')]")
    public WebElement position100;
}

package com.NewTest.Pages;

import com.NewTest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FiltersPage {

    public FiltersPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = " //button[@class='cmc-table-listing__filter-button cmc-button cmc-button--color-default wn9odt-0 fuymxV']")
    public WebElement Filters;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement MarketCapDropDown;

    @FindBy(xpath = "//input[@placeholder='999,999,999,999']")
    public WebElement MaxRangeTextBox;

    @FindBy(xpath = "//button[@class='cmc-button cmc-button--color-blue wn9odt-0 egbUcv']")
    public WebElement ApplyMarketCapRange;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
    public WebElement FullListFilters;
}

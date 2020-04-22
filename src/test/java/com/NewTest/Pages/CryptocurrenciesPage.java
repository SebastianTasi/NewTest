package com.NewTest.Pages;

import com.NewTest.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CryptocurrenciesPage {

    public CryptocurrenciesPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = " //li[@class='cmc-tab__trigger cmc-tab__trigger--selected']//li[3]//a[1]")
    public WebElement FullListAllCrypto;

    @FindBy(xpath = " //div[@class='container cmc-main-section']//li[7]//a[1]")
    public WebElement FullListCoinsOnly;

    @FindBy(xpath = " //li[13]//a[1]")
    public WebElement FullListTokensOnly;

}

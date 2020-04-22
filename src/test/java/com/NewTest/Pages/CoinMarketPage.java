package com.NewTest.Pages;

import com.NewTest.Utilities.BrowserUtils;
import com.NewTest.Utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class CoinMarketPage {

    //static final Logger logger = LogManager.getLogger(Client.class);

    public CoinMarketPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//div[@class='cmc-table-listing__pagination']//a[@class='wn9odt-0 bzWQIF cmc-link'][contains(text(),'View All')]")
    public WebElement ViewAll;

    @FindBy(xpath = "//td[@class='cmc-table__cell cmc-table__cell--sticky cmc-table__cell--sortable cmc-table__cell--left cmc-table__cell--sort-by__rank']//div[contains(text(),'100')]")
    public WebElement position100;

    @FindBy(xpath = "//span[@class='cmc-link']")
    public WebElement AddToWatchlist;

    @FindBy(xpath = " //a[contains(text(),'Watchlist')]")
    public WebElement Watchlist;

    @FindBy(xpath = "//div[@class='cmc-popover__trigger']//span[contains(text(),'Cryptocurrencies')]")
    public WebElement CryptoDropDown;







    public void getEllipsisTab(String name, String number) {

        String CryptoName = "//tr[" + name + "]//td[2]//div[1]//a[1]";
        String Ellipsis = "//tr[" + number + "]//td[9]//div[1]//div[1]//div[1]//span[1]//*[local-name()='svg']";

        try {
            BrowserUtils.waitForClickablility(By.xpath(Ellipsis), 2);
            WebElement tabEllipsis = Driver.get().findElement(By.xpath(Ellipsis));
            new Actions(Driver.get()).moveToElement(tabEllipsis).pause(200).click(tabEllipsis).build().perform();


        }catch (Exception e){
            BrowserUtils.waitFor(2);
        }


    }

    public void getAllCryptoInfoRow(){

        for (int i = 1; i<=200; i++){

            String FullInfoRow= Driver.get().findElement(By.xpath("//body//tbody//tr["+i+"]")).getText();

            List<String> rowInfo = Arrays.asList(FullInfoRow);
            ArrayList<String> fullRowInfo = new ArrayList<String>(   );

            fullRowInfo.addAll(rowInfo);

            System.out.print("Filtration given details : " + fullRowInfo);
        }

    }



}

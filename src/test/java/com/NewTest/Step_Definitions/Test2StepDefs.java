package com.NewTest.Step_Definitions;

import com.NewTest.Pages.CoinMarketPage;
import com.NewTest.Pages.WatchlistPage;
import com.NewTest.Utilities.BrowserUtils;
import com.NewTest.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;


public class Test2StepDefs {

    WatchlistPage watchlistPage = new WatchlistPage();
    CoinMarketPage coinMarketPage = new CoinMarketPage();


    @When("select between five and ten random {string}{string}")
    public void select_between_five_and_ten_random(String crypto, String cryptoNumber) {

        BrowserUtils.waitFor(3);
        new CoinMarketPage().getEllipsisTab(crypto, cryptoNumber);

    }

    @When("clicking the ellipsis to display option menu, select Add to Watchlist")
    public void clicking_the_ellipsis_to_display_option_menu_select_Add_to_Watchlist() {

        BrowserUtils.waitFor(2);
        coinMarketPage.AddToWatchlist.click();
    }

    @Then("open the watchlist in a different browser tab")
    public void open_the_watchlist_in_a_different_browser_tab() {

        BrowserUtils.waitFor(3);
        String currentWindowsHandle = Driver.get().getWindowHandle();
        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String handle : windowHandles) {
            if (!currentWindowsHandle.equals(handle)) {
                Driver.get().switchTo().window(handle);
            }

        }

    }

    @Then("click on the Watchlist tab")
    public void click_on_the_Watchlist_tab() {


        BrowserUtils.waitFor(3);
        coinMarketPage.Watchlist.click();

        BrowserUtils.waitFor(5);
        List<WebElement> allRows = Driver.get().findElements(By.xpath("//div[contains(@class,'cmc-table__column-name')]//a"));

        List<String> allRowsAdded = new ArrayList<>();

        for (WebElement example : allRows) {
            allRowsAdded.add(example.getText());
        }

    }

}












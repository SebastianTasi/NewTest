package com.NewTest.Step_Definitions;

import com.NewTest.Pages.CoinMarketPage;
import com.NewTest.Pages.CryptocurrenciesPage;
import com.NewTest.Pages.FiltersPage;
import com.NewTest.Utilities.BrowserUtils;
import com.NewTest.Utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;


public class Test3StepDefs {

    CoinMarketPage coinMarketPage = new CoinMarketPage();
    FiltersPage filtersPage = new FiltersPage();
    CryptocurrenciesPage cryptocurrenciesPage = new CryptocurrenciesPage();

    @When("the it should press on the dropdown menu of the Cryptocurrencies tab")
    public void the_it_should_press_on_the_dropdown_menu_of_the_Cryptocurrencies_tab() {


        coinMarketPage.CryptoDropDown.click();
    }

    @When("click any of the three {string} options on this menu")
    public void click_any_of_the_three_options_on_this_menu(String string) {

        BrowserUtils.waitFor(3);
        if (string.equals("FullListAllCrypto")) {
            cryptocurrenciesPage.FullListAllCrypto.click();

        } else if (string.equals("FullListCoinsOnly")) {
            cryptocurrenciesPage.FullListCoinsOnly.click();

        } else if (string.equals("FullListTokensOnly")) {
            cryptocurrenciesPage.FullListTokensOnly.click();

        }

        BrowserUtils.waitFor(5);
        filtersPage.FullListFilters.click();


    }


    @Then("record the data on the current page")
    public void record_the_data_on_the_current_page() {

        new CoinMarketPage().getAllCryptoInfoRow();
    }

    @Then("apply any combination of filters, displayed in the three dropdown menus above the tabs")
    public void apply_any_compbination_of_filters_displayed_in_the_three_dropdown_menus_above_the_tabs() {

        BrowserUtils.waitFor(5);
        filtersPage.MarketCapDropDown.click();
        filtersPage.MaxRangeTextBox.sendKeys("1");
        filtersPage.ApplyMarketCapRange.click();

        String expected = "No data to display";

        BrowserUtils.waitFor(5);
        String actual = Driver.get().findElement(By.xpath("//span[contains(text(),'No data to display')]")).getText();

        Assert.assertEquals(actual, expected);

        System.out.println("Actual result : " + actual + "  / Expected result : " + expected);


    }


}

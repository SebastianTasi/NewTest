package com.NewTest.Step_Definitions;

import com.NewTest.Pages.CoinMarketPage;
import com.NewTest.Utilities.BrowserUtil;
import com.NewTest.Utilities.ConfigurationReader;
import com.NewTest.Utilities.Driver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Test1StepDefs {

    @Given("the user should open browser page on")
    public void the_user_should_open_browser_page_on() {

        BrowserUtil.waitFor(5);
        System.out.println("Opening the https://coinmarketcap.com/ page");
        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);

    }

    @When("user is clicking View All")
    public void user_is_clicking_View_All() throws InterruptedException {

        BrowserUtil.waitFor(5);
        CoinMarketPage coinMarketPage = new CoinMarketPage();
        coinMarketPage.ViewAll.click();
    }

    @Then("the results displayed = {int}")
    public void the_results_displayed(Integer int1) {

        CoinMarketPage coinMarketPage = new CoinMarketPage();
        String expectedResult = "100";
        String actualResult = coinMarketPage.position100.getText();

        System.out.println("Minimum Displayed Results = " + actualResult);

        Assert.assertEquals(actualResult,expectedResult);
    }

}

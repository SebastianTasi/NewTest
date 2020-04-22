package com.NewTest.Step_Definitions;

import com.NewTest.Pages.CoinMarketPage;
import com.NewTest.Utilities.BrowserUtils;
import com.NewTest.Utilities.ConfigurationReader;
import com.NewTest.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Test1StepDefs {

    CoinMarketPage coinMarketPage = new CoinMarketPage();

    @Given("the user should open browser page on")
    public void the_user_should_open_browser_page_on() {

        BrowserUtils.waitFor(5);
        String url = ConfigurationReader.get("url1");
        Driver.get().get(url);

    }

    @When("user is clicking View All")
    public void user_is_clicking_View_All() throws InterruptedException {

        BrowserUtils.waitFor(5);
        coinMarketPage.ViewAll.click();
    }

    @Then("the results displayed = {int}")
    public void the_results_displayed(Integer int1) {

        String expectedResult = "100";
        String actualResult = coinMarketPage.position100.getText();

        Assert.assertEquals(actualResult, expectedResult);
    }

}

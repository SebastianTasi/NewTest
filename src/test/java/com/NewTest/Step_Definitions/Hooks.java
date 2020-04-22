package com.NewTest.Step_Definitions;

import com.NewTest.Utilities.Driver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Hooks {

    static final Logger logger = LogManager.getLogger(Hooks.class);


    @Before
    public void before(Scenario scenario){
        logger.info("####### SCENARIO: " + scenario.getName() + " ####### ");
    }

    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }
        logger.info("======= " + scenario.getStatus() + " === " + scenario.getName() + " =======");
        Driver.closeDriver();
    }
}

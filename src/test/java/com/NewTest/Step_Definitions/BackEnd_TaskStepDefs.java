package com.NewTest.Step_Definitions;


import com.NewTest.API_Models.cryptocurency.info.InfoResponse;
import com.NewTest.API_Models.cryptocurency.map.Data;
import com.NewTest.API_Models.cryptocurency.map.MapResponse;
import com.NewTest.API_Models.tools.PriceConversionResponse;
import com.NewTest.Utilities.ConfigurationReader;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import java.util.*;
import java.io.*;

import static io.restassured.RestAssured.*;


public class BackEnd_TaskStepDefs {

    private static final Logger logger = LogManager.getLogger(BackEnd_TaskStepDefs.class);
    private final String BASE_URI = ConfigurationReader.get("base_uri");
    private Response response;
    private RequestSpecification requestMapSpecification;
    private RequestSpecification requestToken;
    private MapResponse mapResponse;

    private Response toolResponse;
    private RequestSpecification requestToolSpecification;

    private Response infoResponse;
    private RequestSpecification requestInfoSpecification;

    private ObjectMapper om = new ObjectMapper();

    @Given("User is using the API Key")
    public void user_is_using_the_API_Key() {

        String headerName = ConfigurationReader.get("API_Key");
        String headerValue = ConfigurationReader.get("token");

        requestToken = given().accept(ContentType.JSON)
                .header(headerName, headerValue);

        System.out.println(requestToken.toString());

    }

    @When("User is  performing the map call searching for the desired type of currency {string}")
    public void user_is_performing_the_map_call_searching_for_the_desired_type_of_currency(String desiredCryptoCurrency) {
        requestMapSpecification = given(requestToken).queryParam("symbol", desiredCryptoCurrency);
        response = requestMapSpecification.when()
                .get(BASE_URI + "/v1/cryptocurrency/map");

    }

    @When("the status code for map is {int}")
    public void the_status_code_for_map_is(Integer statusCodeExpected) {

        boolean statusValidation = response.getStatusCode() == statusCodeExpected;
        Assert.assertTrue("Expected status code didn't match!!!",statusValidation);
        logger.info("cryptocurrency/map call was successful with status code: " + response.getStatusCode());
    }

    @Then("the user is retriving the ids of the current type of currency")
    public void the_user_is_retriving_the_ids_of_the_current_type_of_currency(DataTable dataTable) {
        Map<String,Integer> expectedID = dataTable.asMap(String.class,Integer.class);


        try{
            logger.info(response.asString());
           mapResponse = om.readValue(response.asString(), MapResponse.class);
        } catch (IOException e){
            e.printStackTrace();
            logger.error("MAP RESPONSE class was not map properly!!!!!!");
        }

        for(Data singleDataClass : mapResponse.getData()){

            if(expectedID.containsKey(singleDataClass.getSymbol())){
                Assert.assertTrue("ID from cryptoCurrency is not Matching!",expectedID.get(singleDataClass.getSymbol()) == singleDataClass.getId());
            } else {
                logger.error("Expected ID couldn't not be found!!!");
                Assert.fail("Expected ID couldn't not be found!!!");
            }
        }


    }

    @When("the user performs the tool conversion call and converts to desired  currency {string} and amount {int}")
    public void the_user_performs_the_tool_conversion_call_and_converts_to_desired_currency_and_amount(String currencyToConvert, Integer givenAmount) {



        for(Data singleMapDataClass : mapResponse.getData()){
            requestToolSpecification = given(requestToken)
                    .queryParam("id", singleMapDataClass.getId())
                    .queryParam("convert",currencyToConvert)
                    .queryParam("amount",givenAmount);
            toolResponse = requestToolSpecification .when()
                    .get(BASE_URI + "/v1/tools/price-conversion");

            PriceConversionResponse  priceConversionResponse = null;

            try{
                priceConversionResponse  = om.readValue(toolResponse.asString(),PriceConversionResponse.class);
                logger.info(toolResponse.asString());

            } catch (IOException e){
                e.printStackTrace();
                logger.error("TOOLS RESPONSE class was not map properly!!!!!!");
            }

           logger.info(givenAmount + " of " + singleMapDataClass.getSymbol() + " converted to " + currencyToConvert + " has the value of: " + priceConversionResponse.getData()
                   .getQuote().getCurrencySymbols().get(currencyToConvert).getPrice());

        }

    }

    @When("User is performing a info call searching for desired id of currency {int}")
    public void user_is_performing_a_info_call_searching_for_desired_id_of_currency(Integer cryptoID) {
        requestInfoSpecification = given(requestToken).queryParam("id", cryptoID);
        infoResponse =  requestInfoSpecification.when()
                .get(BASE_URI + "/v1/cryptocurrency/info");

        System.out.println(infoResponse.asString());

    }

    @When("the status code for info is {int}")
    public void the_status_code_for_info_is(Integer statusCode) {

        boolean statusValidation = infoResponse.getStatusCode() == statusCode;
        Assert.assertTrue("Expected status code didn't match!!!",statusValidation);
        logger.info("cryptocurrency/info call was successful with status code: " + infoResponse.getStatusCode());
    }

    @Then("the user is verifying the current attributes for the cryptocurency info are matching")
    public void the_user_is_verifying_the_current_attributes_for_the_cryptocurency_info_are_matching(io.cucumber.datatable.DataTable dataTable) {

        Map<String,Object> infoAttributes = dataTable.asMap(String.class,String.class);

        InfoResponse infoData = null;



        try{
            infoData = om.readValue(infoResponse.asString(),InfoResponse.class);
            logger.info(infoResponse.asString());

        } catch (IOException e){
            e.printStackTrace();
            logger.error("INFO RESPONSE class was not map properly!!!!!!");
        }

        System.out.println(infoData.toString());







    }





}

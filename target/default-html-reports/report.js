$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/BackEnd_Task1.feature");
formatter.feature({
  "name": "BackEndTask1",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@task1"
    }
  ]
});
formatter.scenario({
  "name": "Retrieve the ID`s of the currencies converted to Bolivian Boliviano",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@task1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is using the API Key",
  "keyword": "Given "
});
formatter.match({
  "location": "BackEnd_TaskStepDefs.user_is_using_the_API_Key()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is  performing the map call searching for the desired type of currency \"BTC,USDT,ETH\"",
  "keyword": "When "
});
formatter.match({
  "location": "BackEnd_TaskStepDefs.user_is_performing_the_map_call_searching_for_the_desired_type_of_currency(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the status code for map is 200",
  "keyword": "And "
});
formatter.match({
  "location": "BackEnd_TaskStepDefs.the_status_code_for_map_is(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is retriving the ids of the current type of currency",
  "rows": [
    {
      "cells": [
        "BTC",
        "1"
      ]
    },
    {
      "cells": [
        "USDT",
        "825"
      ]
    },
    {
      "cells": [
        "ETH",
        "1027"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "BackEnd_TaskStepDefs.the_user_is_retriving_the_ids_of_the_current_type_of_currency(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user performs the tool conversion call and converts to desired  currency \"BOB\" and amount 1",
  "keyword": "When "
});
formatter.match({
  "location": "BackEnd_TaskStepDefs.the_user_performs_the_tool_conversion_call_and_converts_to_desired_currency_and_amount(String,Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Test1.feature");
formatter.feature({
  "name": "Test1",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify that 100 results are displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user should open browser page on",
  "keyword": "Given "
});
formatter.match({
  "location": "Test1StepDefs.the_user_should_open_browser_page_on()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is clicking View All",
  "keyword": "When "
});
formatter.match({
  "location": "Test1StepDefs.user_is_clicking_View_All()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the results displayed \u003d 100",
  "keyword": "Then "
});
formatter.match({
  "location": "Test1StepDefs.the_results_displayed(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
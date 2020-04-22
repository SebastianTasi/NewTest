@task
Feature: Test1


  Scenario: Verify that 100 results are displayed
    Given the user should open browser page on
    When user is clicking View All
    Then the results displayed = 100


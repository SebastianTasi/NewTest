@task
Feature: Test3


  Scenario Outline: Check against the data recorded
    Given the user should open browser page on
    When the it should press on the dropdown menu of the Cryptocurrencies tab
    And click any of the three "<Full List>" options on this menu
    Then record the data on the current page
    And apply any combination of filters, displayed in the three dropdown menus above the tabs

    Examples: FullList
      | Full List          |
      | FullListAllCrypto  |
      | FullListCoinsOnly  |
      | FullListTokensOnly |
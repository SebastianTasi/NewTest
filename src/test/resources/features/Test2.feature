@task
Feature: Test2


  Scenario Outline: Check as many values as you can, to verify all the options you selected are added to the watchlist
    Given the user should open browser page on
    When select between five and ten random "<cryptocurrencies>""<cryptoNumber>"
    And clicking the ellipsis to display option menu, select Add to Watchlist
    Then open the watchlist in a different browser tab
    And click on the Watchlist tab

    Examples: Cryptos
      | cryptocurrencies | cryptoNumber |
      | Bitcoin          | 1            |
      | Ethereum         | 2            |
      | XRP              | 3            |
      | Tether           | 4            |
      | Bitcoin Cash     | 5            |
      | Bitcoin SV       | 6            |



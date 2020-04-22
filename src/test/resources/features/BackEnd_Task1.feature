@task1
Feature: BackEndTask1


  Scenario: Retrieve the ID`s of the currencies converted to Bolivian Boliviano
    Given User is using the API Key
    When User is  performing the map call searching for the desired type of currency "BTC,USDT,ETH"
    And the status code for map is 200
    Then the user is retriving the ids of the current type of currency
      | BTC  | 1    |
      | USDT | 825  |
      | ETH  | 1027 |
  When the user performs the tool conversion call and converts to desired  currency "BOB" and amount 1


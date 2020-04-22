@task
Feature: BackEndTask2


  Scenario: Validate information on technical documentation when running cryptocurrency info call.
    Given User is using the API Key
    When User is performing a info call searching for desired id of currency 1027
    And the status code for info is 200
    Then the user is verifying the current attributes for the cryptocurency info are matching
      | logo          | https://s2.coinmarketcap.com/static/img/coins/64x64/1.png |
      | technical_doc | https://github.com/ethereum/wiki/wiki/White-Paper         |
      | symbol        | ETH                                                       |
      | date_added    | 2015-08-07T00:00:00.000Z                                  |
      | platform      | null                                                      |
      | tags          | mineable                                                  |

Feature: OrangeHRM Login


  Scenario Outline: Logo Presence on OrangeHRMpage
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify user enters <username> and <password>
    And close browser


    Examples:
    |username|password|
    |Raghav  |1238    |
    |Ragh  |12738    |


  Scenario Outline: Login with credentials on OrangeHRMpage
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify user enters <username> and <password>
    And close browser

    Examples:
      |username|Password|
      |Raghav  |1238    |
      |Ragh  |12738    |

Feature: OrangeHRM Login

  Background:
    Given I launch the chrome browser
    When I open orange the hrm homepage

  Scenario Outline: Logo Presence on OrangeHRMpage
    Then I verify user enters <username> and <password>
    And close browser


    Examples:
      | username | password |
      | Raghav   | 1238     |
      | Ragh     | 12738    |


  Scenario Outline: Login with credentials on OrangeHRMpage
    Then I verify user enters <username> and <password>
    And close browser

    Examples:
      | username | password |
      | Raghav   | 1238     |
      | Ragh     | 12738    |
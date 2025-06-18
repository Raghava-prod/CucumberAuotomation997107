Feature: Orangehrm Login

  Background:
    Given I launch the chrome browser for hrm


  Scenario: Login logo Presence on OrangeHRMpage
    When I open orange the hrm homepage for details
    Then I verify user credentials


#  Scenario: Login with the credentials on OrangeHRMpage
#    When I open orange the hrm homepage for details
#    Then I verify user credentials


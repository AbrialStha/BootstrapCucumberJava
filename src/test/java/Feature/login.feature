Feature: User wants to login to platform
  This feature deals with the login functionality of the platform.

  Scenario: Login with the username and password which is registered
    Given user is in the login page
    And user enter "qa@may5.com" and "test123"
    When user clicks Log In button
    Then user is on Search screen

  Scenario: Login with the username and password which is not valid
    Given user is in the login page
    And user enter "dummy@user.com" and "dummypassword"
    When user clicks Log In button
    Then user sees error message saying "invalid username or password"

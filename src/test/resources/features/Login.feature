@Login
Feature: Login Authorization

  Background:
    Given the user is on the login page

@ValidInfo
  Scenario: User logs in with valid credentials, Account summary page should be displayed
    When User logs in with username "username" and password "password"
    Then Page title "Account Summary" should be displayed
@noInfo
    Scenario: User enter no information on password or username
      And User logs in with username "" and password "password"
      Then User should not be able to login
  @InvalidInfo
      Scenario: User enters invalid information
        When user logs in with username "blah" and password "HitIt"
        Then error message "Login and/or password are wrong." is displayed

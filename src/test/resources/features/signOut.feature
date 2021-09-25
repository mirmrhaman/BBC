Feature: Test Sign out functionalities

  Background:
    Given a user is on the Home page

  @signOut
  Scenario: Check sign in followed by sign out successful with valid credentials
    And user navigate to Sign in page
    When user enters userEmail "mirmrhaman@gmail.com" and password "m12345678"
    And click on signIn button
    When user is navigated to profile home page
    And click on profile name
    When user on sign out page
    And click on sign out
    Then user get a confirmation sign out message
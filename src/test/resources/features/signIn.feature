Feature: Test Sign in functionalities

  Background:
    Given a user is on the Home page
    And user navigate to Sign in page

  @positive_test
  Scenario: Check Sign in is successful with valid credentials
    When user enters userEmail "mirmrhaman@gmail.com" and password "m12345678"
    And click on signIn button
    Then user is navigated to user home page

  @dataDriven_test
  Scenario Outline: Check Sign in is successful with valid credentials
    When user enters userEmail "<emailId>" and password "<password>"
    And click on signIn button
    Then user is navigated to user home page

    Examples:
      | emailId              | password  |
      | mirmrhaman@gmail.com | m12345678 |
      | jimyraj@gmail.com    | Jimy@123  |

  @negative_test
  Scenario: Check Sign in is not successful with invalid credentials
    When user enters userEmail "jimyraj@gmail.com" and password "Jimy@000"
    And click on signIn button
    Then user is failed to login with wrong password

  @negative_test
  Scenario: Check Sign in is not successful with invalid credentials
    When user enters userEmail "jimyraj@gmail.came" and password "Jimy@123"
    And click on signIn button
    Then user is failed to login with wrong Email

  @dataDriven_test
  Scenario: Check Sign in is successful with valid credentials using data table
    When user click on Sign in button entering credentials
    |emailId             |password |
    |mirmrhaman@gmail.com|m12345678|
    Then user is navigated to user home page
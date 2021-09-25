Feature:Search functionalities
  @search
  Scenario: Check search is successful with valid credentials
    Given a user is on the Home page
    When user enter text on search
    |SearchText|
    |education |
    And click on search button
    Then user is navigated to result is education

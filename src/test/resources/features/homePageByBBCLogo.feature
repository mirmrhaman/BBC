Feature: BBC logo functionality

  Background:
    Given a user is on the Home page

  @news
  Scenario: Check BBC Logo returns to home page from news page
    When user navigate to news page
    Then user on news page
    And user click on BBC Logo
    Then user click on BBC Logo from NEWS page

  @sport
  Scenario: Check BBC Logo returns to home page from Sport page
    When user navigate to Sport page
    Then user on sport page
    And user click on BBC Logo
    Then user click on BBC Logo from SPORT page

  @travel
  Scenario: Check BBC Logo returns to home page from Travel page
    When user navigate to Travel page
    Then user on travel page
    And user click on BBC Logo
    Then user click on BBC Logo from TRAVEL page

  @future
  Scenario: Check BBC Logo returns to home page from Future page
    When user navigate to Future page
    Then user on future page
    And user click on BBC Logo
    Then user click on BBC Logo from Future page
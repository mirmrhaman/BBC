Feature: Weather functionality

  Background:
    Given a user is on the Home page

  @weather
  Scenario: user can edit weather broadcast
  And user navigate to edit in weather
  When user enter location and click
    |SearchCity     |
    |New York       |
  Then user find result location options
  And user click on New York, United States
  Then user is on New York weather
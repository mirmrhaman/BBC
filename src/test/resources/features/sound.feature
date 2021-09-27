Feature: Sounds functionality
  Background:
    Given a user is on the Home page

  @sound
  Scenario: user play a radio (Radio relax)
    Given a user is on the Home page
    When user navigate to sounds
    Then user is on the sounds page
    And user navigate and play Radio Relax
    Then Radio relax played
Feature: Share link functionality
  @follow
  Scenario: Share BBC link by email
    Given a user is on the Home page
    And user navigate to travel
    Then user is in travel page
    When user navigate to more
    And user click on faceBook icon
    And user is in new window
    Then user navigated to Face Book page
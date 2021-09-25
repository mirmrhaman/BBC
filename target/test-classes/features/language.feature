Feature: Language conversion service functionality

  Background:
    Given a user is on the Home page

  @bengaliLanguage
  Scenario: Check BBC page directed to Bengali
  When user click on Bangla on language
  Then user on Bengali service page

  @hindiLanguage
  Scenario: Check BBC page directed to Bengali
    When user click on Hindi on language
    Then user on Hindi service page
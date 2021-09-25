
Feature: TV functionality

  Background:
  Given a user is on the Home page

  @tv
  Scenario: Select and play a video from Featured video
  When user navigate to featured video
  And user play feature video and wait a moment
  Then User played featured video from home page
@web @regression @google
  Feature: Google Feature
    Background:
      Given I am on google homepage

      @Google-1
      Scenario: Verify Google Home Page
        When user enters Java in google search box
        Then user is navigated to the Search results page








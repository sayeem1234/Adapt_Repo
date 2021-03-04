@web @regression @Tesla
  Feature: Tesla Features

    Background:
      Given I am on Tesla homePage

      @tesla-1
      Scenario: Verify Tesla Logo is Present
        When I click on ModelX
        Then I verify that the ModelX Logo is present
@web @regression @darksky
Feature: Dark API Login tests

  # Scenario 4
  @darkskyapi
  Scenario: Verify invalid signup error message
    Given I am on the darksky Register page
    When I click on Register button
    Then I verify I am on Register page by asserting Register header

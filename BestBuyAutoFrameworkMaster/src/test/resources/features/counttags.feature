@web @regression @count
  Feature: Count number of tags
    Background:
      Given I am on home page

      @count-1
      Scenario: Verify number of a tags
        Then I verify that the number of a tags is greater than 0
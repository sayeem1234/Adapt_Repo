@web @regression @random
  Feature: Sign Up Feature for new website
    Background:
      Given I am on test project homepage

      @random-1
      Scenario Outline: Verify user registration
        When I enter <name> as first name
        And I enter 12345 into password field
        And I hit enter
        Then I verify I am a registered user
        Examples:
          | name |
          |  Bob |
          |Kamal |

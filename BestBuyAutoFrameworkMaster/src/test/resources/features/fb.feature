@web @regression @fb
  Feature: Fb Feature

    Background:
      Given I am on home page

      @fb-1
      Scenario: Verify FB account logs in
        When I enter shadid@gmail.com into email
        And I enter Test123 into password
        And I click login
        Then I verify that I am on the HomePage

#      // @fb-2
#      Scenario: Verify FB Sign Up
#        When I enter (.+) into firstname
#        And I enter (.+) into lastname
#        And I enter (.+) into mobile/email
#        And I enter (.+) into newpassword
#        And I select my birthday
#        And I select (female|male|custom) as gender
#        And I click Sign Up
#        Then I verify that I have signed up











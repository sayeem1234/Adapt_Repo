@web @regression @todaysTimeline
Feature: Weekly Timeline

  # Scenario 3
  Scenario: Verify individual day temp timeline
    When I expand todays timeline
    Then I verify lowest and highest temp is displayed correctly
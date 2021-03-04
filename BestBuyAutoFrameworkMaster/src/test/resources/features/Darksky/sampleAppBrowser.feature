@web @regression @sampleAppBrowser
Feature: Sample App

  @Browser_01
  Scenario: FF1
    When I open the browser
    Then I confirm that uSDK success init message appears
    And the three editable fields in the UI: email, card Number, backend address exist
    And there is the Perform Transaction Button


  @Browser2
  Scenario Outline: FF2
    When I clear card Number Field
    And I enter Browser Credit Card Number <cardNum>
    And I click Perform Transaction
    Then I verify that Transaction has been complete message with Transaction ID URL is displayed

    Examples:
      | cardNum          |
      | 6011408994613023 |
      | 3532700172162980 |
#      | 374608088737802  |
#      | 4238307157182    |
#      | 374608088737802  |
#      | 4238307157182    |
#      | 344183389574491  |
#      | 4127934925891350 |
#      | 6550509225016519 |
#      | 6550371143894182 |
#      | 340257526561142  |
#      | 4688500293780    |
#      | 348975916840634  |
#      | 6550248339217180 |
#      | 374803906582759  |
#      | 6550540866747435 |
#      | 6550245189832043 |


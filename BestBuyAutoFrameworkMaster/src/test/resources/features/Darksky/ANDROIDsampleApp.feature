@mobile @regression @sampleAppAndroid
Feature: Sample App

  @FrictionlessFlow1Android
  Scenario: FF1
    When I launch the Sample App on Android
   Then I see the permission dialog
    Then I see the SDK initialize Success Alert Android
   And the UI has 3 editable fields: email, card number, and backend server address Android


  @FrictionlessFlow2Android
  Scenario Outline: FF2
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    #Then I see the MAstercard or Cb Logo and the Ok Button Android

    Examples:
      | cardNum          |
      | 6011408994613023 |
      | 3532700172162980 |
      | 374608088737802  |
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

  @DualBrandedCard1Android
  Scenario: DBC1
    When I launch the Sample App on Android
    Then I see the permission dialog
    Then I see the SDK initialize Success Alert Android
    Then the UI has 3 editable fields: email, card number, and backend server address Android
    And I see the submit button and the copy button Android


  @DualBrandedCard2Android
  Scenario Outline: DBC2
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I have the option to select the 2 DS values Android

    Examples:
      | cardNum          |
      | 5530787483220703 |
#      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |

  @DualBrandedCard3Android
  Scenario Outline: DBC3
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I select the DS RSA ANDROID
    And I tap cancel Android DS value
#    Then I see the Sample App main menu and transaction cancelled message Android
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      |5493199263646666|
#      |4036385794151|
#      |5173362445727369|
#      |4365401515254721|


  @DualBrandedCard4Android
  Scenario Outline: DBC4
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I select the DS RSA ANDROID
    And I tap cancel Android DS value
   Then I verify that the email and card number are still populated Android

    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      |5493199263646666|
#      |4036385794151|
#      |5173362445727369|
#      |4365401515254721|

  @DualBrandedCard5Android
  Scenario Outline: DBC5
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I have the option to select the 2 DS values Android

    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |


  @DualBrandedCard6Android
  Scenario Outline: DBC6
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I select the DS RSA ANDROID
    And I tap cancel Android DS value
    Then I see the Sample App main menu and transaction cancelled message Android
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      |5493199263646666|
#      |4036385794151|
#      |5173362445727369|
#      |4365401515254721|

  @DualBrandedCard7Android
  Scenario Outline: DBC7
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I select the DS RSA ANDROID
    And I select OK on DS Menu
    And I tap the OK button for successful transaction Android
    Then I verify that the email and card number are still populated Android
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |

  @DualBrandedCard8Android
  Scenario Outline: DBC8
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I have the option to select the 2 DS values Android

    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |

  @DualBrandedCard9Android
  Scenario Outline: DBC9
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I click Create Transaction Android
    And I select the DS EC ANDROID
    And I select OK on DS Menu
    And I tap the OK button for successful transaction Android
    #Add line here for validation
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      |5493199263646666|
#      |4036385794151|
#      |5173362445727369|
#      |4365401515254721|

  @ChallengeCardSubmissionANDROID
  Scenario: CCS1
    When I launch the Sample App on Android
    Then I see the permission dialog
    Then I see the SDK initialize Success Alert Android
    Then the UI has 3 editable fields: email, card number, and backend server address Android
    And I see the submit button and the copy button Android

  @ChallengeCardSubmission2___QAScenario__2__And__10ANDROID
  Scenario Outline: CCB with Native OTP (QA scenarios 2 and 10)
    When I clear field Android
    And I enter Android Credit Card Number <cardNum>
    And I change the backend server Address to CT QA
    And I click Create Transaction Android
#    Then I verify that the spinner with the Logo appears and the Challenge Screen is present ANDROID
    And I enter NATIVE OTP security code ANDROID
    And I click submit ANDROID
    And I click OK Button Android
    Examples:
      | cardNum          |
      | 5247187320916965 |
      | 4444647939661942 |
      | 3581291696701552 |
#      | 6011900554065503 |
#      | 346036480635850  |
#      | 4254260145873316 |
#      | 6550391503172243 |


  # TEST CASES FOR ANDROID PENDING UPDATE FROM SERGEY FOR SCA/CCS
  # ACCESSIBILITY IDS REQUIRED FOR FURTHER TESTING


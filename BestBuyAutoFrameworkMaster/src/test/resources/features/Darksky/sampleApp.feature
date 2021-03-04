@mobile @regression @sampleAppIOS
Feature: Sample App

  @FrictionlessFlow1iOS
  Scenario: FF1
    When I launch the Sample App
    Then I see the SDK initialize Sucess Alert
    And the UI has 3 editable fields: email, card number, and backend server address
    And I see the  Create transaction and Copy Transaction ID to clipboard button


  @FrictionlessFlow2and2a
  Scenario Outline: FF2
    #valo
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click Create Transaction
    Then I see the "Mastercard" or "CB" Logo and the Ok Button
    And I see the transaction ID

    Examples:
      | cardNum          |
      | 6011408994613023 |
#      | 3532700172162980 |
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

  @DualBrandedCard1
  Scenario: DBC1
    When I launch the Sample App
    And I see the SDK has initialized success message
    Then I see the 3 editable fields email, cardNumber, and backend server address
    And I see the submit button and the copy button

  @DualBrandedCard2
  Scenario Outline: DBC2
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I have the option to select the 2 DS values

    Examples:

      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      | 5493199263646666 |
      | 4036385794151    |
      | 5173362445727369 |
      | 4365401515254721 |

  @DualBrandedCard3
  Scenario Outline: DBC3
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I select the DS
    And I tap cancel
    Then I see the Sample App main menu and transaction cancelled message
    Examples:
      | cardNum          |
      | 5530787483220703 |
#      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |


  @DualBrandedCard4
  Scenario Outline: DBC4
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I select the DS
    And I tap cancel
    And I tap the OK button on the transaction/authentication cancelled
    Then I verify that the email and card number are still populated
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      | 5493199263646666 |
      | 4036385794151    |
      | 5173362445727369 |
      | 4365401515254721 |

  @DualBrandedCard5
  Scenario Outline: DBC5
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I have the option to select the 2 DS values

    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      | 5493199263646666 |
      | 4036385794151    |
      | 5173362445727369 |
      | 4365401515254721 |

  @DualBrandedCard6
  Scenario Outline: DBC6
    #VALO
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I select the RSA DS
    And I grab the transaction Id
    Then I see the "Mastercard" or "CB" Logo and the Ok Button
    And I see the transaction ID
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |

  @DualBrandedCard7
  Scenario Outline: DBC7
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I select the RSA DS
    And I tap the OK button for successful transaction
    Then I verify that the email and card number are still populated
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      | 5493199263646666 |
      | 4036385794151    |
      | 5173362445727369 |
      | 4365401515254721 |

  @DualBrandedCard8
  Scenario Outline: DBC8
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I have the option to select the 2 DS values

    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
      | 5493199263646666 |
      | 4036385794151    |
      | 5173362445727369 |
      | 4365401515254721 |

  @DualBrandedCard9
  Scenario Outline: DBC9
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I select the EC DS
    And I grab the transaction Id
    Then I see the "Mastercard" or "CB" Logo and the Ok Button
    And I see the transaction ID
    Examples:
      | cardNum          |
      | 5530787483220703 |
      | 5299182372536271 |
#      | 5493199263646666 |
#      | 4036385794151    |
#      | 5173362445727369 |
#      | 4365401515254721 |


  @ChallengeCardSubmission1
  Scenario: CCS1
    When I launch the Sample App
    And I see the SDK has initialized success message
    Then I see the 3 editable fields email, cardNumber, and backend server address
    And I see the submit button and the copy button


  @ChallengeCardSubmission2___QAScenario__2__And__10
  Scenario Outline: CCB with Native OTP (QA scenarios 2 and 10)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the Challenge Screen is present
    And I enter NATIVE OTP security code
    And I click submit
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 5247187320916965 |
      | 4444647939661942 |
#      | 3581291696701552 |
#      | 6011900554065503 |
#      | 346036480635850  |
#      | 4254260145873316 |
#      | 6550391503172243 |

  @ChallengeCardSubmission2___QAScenario__3__And__11
  Scenario Outline: CCB with Native OTP (QA scenarios 3 and 11)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the NATIVE_SINGLE_SELECT Challenge Screen is present
    And I select NATIVE_SINGLE_SELECT "Smith"
    And I click submit
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 6011360401393436 |
#      | 373388856866577  |
#      | 5556323956787397 |
#      | 3570261140347107 |
#      | 4479912371013285 |
#      | 6550540553177672 |
#      | 6011198503396646 |
#      | 371575635909809  |
#      | 5143597883863369 |
#      | 3559545153663359 |
#      | 4315742856345    |
#      | 6550287031177821 |

  @ChallengeCardSubmission2___QAScenario__4__And__12
  Scenario Outline: CCB with Native OTP (QA scenarios 4 and 12)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the NATIVE_MULTI_SELECT Challenge Screen is present
    And I select NATIVE_MULTI_SELECT "Chicago"
    And I click submit
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 6011921327893435 |
#      | 3536978637523808 |
#      | 376891970992291  |
#      | 4224433587411740 |
#      | 6550226167389560 |


  @ChallengeCardSubmission2___QAScenario__5__And__13
  Scenario Outline: CCB with HTML OTP (QA scenarios 5 and 13)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the HTML_OTP Challenge Screen is present
    And I enter 6 digit code
    And I click SUBMIT
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 6011628715884559 |
#      | 5354638704372950 |
#      |3552110731880632|
#      |6011404523069100|
#      |5552610722474936|
#      |3585572840524818|
#      |347992130834039|
#      |4438242357968|

  @ChallengeCardSubmission2___QAScenario__6__And__14
  Scenario Outline: CCB with HTML_SINGLE_SELECT OTP (QA scenarios 6 and 14)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the HTML_SINGLE_SELECT Challenge Screen is present
    And I select HTML_SINGLE_SELECT "Smith"
    And I click submit
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 344740284531247  |
      | 6550347565636137 |
#      | 6011351466728590 |
#      | 5458112741455827 |
#      | 3574832888200371 |

  @ChallengeCardSubmission2___QAScenario__7__And__15
  Scenario Outline: CCB with HTML_MULTI_SELECT (QA scenarios 7 and 15[not included for mobile])
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    Then I verify that the spinner with the Logo appears and the HTML_MULTI_SELECT Challenge Screen is present
    And I select HTML_MULTI_SELECT "Chicago"
    And I click submit
    And I get the transaction ID



    Examples:
      | cardNum          |
      | 373334761343443  |
      | 6550588837601215 |

  @ChallengeCardSubmission3
  Scenario Outline: CCB3
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I tap cancel
    And I get the transaction ID
    Then I see the Sample App main menu and transaction cancelled message
    Examples:
      | cardNum          |
      | 373334761343443  |
#      | 6550588837601215 |
#      | 344740284531247  |
#      | 6550347565636137 |
#      | 6011351466728590 |
#      | 5458112741455827 |
#      | 3574832888200371 |
#      | 6011628715884559 |
#      | 5354638704372950 |
#      | 3552110731880632 |
#      | 6011404523069100 |
#      | 5552610722474936 |
#      | 3585572840524818 |
#      | 347992130834039  |
#      | 4438242357968    |
#      | 6011921327893435 |
#      | 3536978637523808 |
#      | 376891970992291  |
#      | 4224433587411740 |
#      | 6550226167389560 |
#      | 6011360401393436 |
#      | 373388856866577  |
#      | 5556323956787397 |
#      | 3570261140347107 |
#      | 4479912371013285 |
#      | 6550540553177672 |
#      | 6011198503396646 |
#      | 371575635909809  |
#      | 5143597883863369 |
#      | 3559545153663359 |
#      | 4315742856345    |
#      | 6550287031177821 |
#      | 5247187320916965 |
#      | 4444647939661942 |
#      | 3581291696701552 |
#      | 6011900554065503 |
#      | 346036480635850  |
#      | 4254260145873316 |
#      | 6550391503172243 |

  @ChallengeCardSubmission4_QA_2_AND_10
  Scenario Outline: CCS4 with QA 2,10
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I enter NATIVE OTP security code
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated
    Examples:
      | cardNum          |
      | 5247187320916965 |
      | 4444647939661942 |
#      | 3581291696701552 |
#      | 6011900554065503 |
#      | 346036480635850  |
#      | 4254260145873316 |
#      | 6550391503172243 |

  @ChallengeCardSubmission4_QA_3_And_11
  Scenario Outline: CCS4 with QA 3,11
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I select NATIVE_SINGLE_SELECT "Smith"
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated
    Examples:
      | cardNum         |
#      | 6011360401393436 |
      | 373388856866577 |
#      | 5556323956787397 |
#      | 3570261140347107 |
#      | 4479912371013285 |
#      | 6550540553177672 |
#      | 6011198503396646 |
#      | 371575635909809  |
#      | 5143597883863369 |
#      | 3559545153663359 |
      | 4315742856345   |
#      | 6550287031177821 |

  @ChallengeCardSubmission4_QA_4_AND_12
  Scenario Outline: CCS4 with QA 4,12
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I select NATIVE_MULTI_SELECT "Chicago"
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated
    Examples:
      | cardNum          |
      | 6011921327893435 |
      | 3536978637523808 |
#      | 376891970992291  |
#      | 4224433587411740 |
#      | 6550226167389560 |

  @ChallengeCardSubmission4_QA_5_AND_13
  Scenario Outline: CCS4 with QA 5,13
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I enter 6 digit code
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated
    Examples:
      | cardNum          |
      | 6011628715884559 |
      | 5354638704372950 |
#      | 3552110731880632 |
#      | 6011404523069100 |
#      | 5552610722474936 |
#      | 3585572840524818 |
#      | 347992130834039  |
#      | 4438242357968    |

  @ChallengeCardSubmission4___QAScenario__6__And__14
  Scenario Outline: CCB with HTML_SINGLE_SELECT OTP (QA scenarios 6 and 14)
    #VALO
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I select HTML_SINGLE_SELECT "Smith"
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated

    Examples:
      | cardNum          |
      | 344740284531247  |
      | 6550347565636137 |
      | 6011351466728590 |
      | 5458112741455827 |
      | 3574832888200371 |

  @ChallengeCardSubmission4___QAScenario__7__And__15
  Scenario Outline: CCB with HTML_MULTI_SELECT (QA scenarios 7 and 15)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I select HTML_MULTI_SELECT "Chicago"
    And I click submit
    Then I tap the OK button on the transaction/authentication cancelled
    And I verify that the email and card number are still populated


    Examples:
      | cardNum          |
      | 373334761343443  |
      | 6550588837601215 |

  @ChallengeCardSubmission5_OTPONLY_QA_2_10
  Scenario Outline: CCS4 with QA 2,10
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I tap resend Code QA210
    Then I see the Resend Code Challenge Screen Again QA210
    And I tap cancel
    Examples:
      | cardNum          |
      | 5247187320916965 |
      | 4444647939661942 |
#      | 3581291696701552 |
#      | 6011900554065503 |
#      | 346036480635850  |
#      | 4254260145873316 |
#      | 6550391503172243 |

  @ChallengeCardSubmission5_OTPONLY_QA_5_13
  Scenario Outline: CCS4 with QA 5,13
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I tap resend Code QA513
    Then I see the Resend Code Challenge Screen Again QA513
    And I tap cancel
    Examples:
      | cardNum          |
      | 6011628715884559 |
      | 5354638704372950 |
      | 3552110731880632 |
      | 6011404523069100 |
      | 5552610722474936 |
      | 3585572840524818 |
      | 347992130834039  |
      | 4438242357968    |


  @ChallengeCardSubmission6___QAScenario__5__And__13
  Scenario Outline: CCB with HTML OTP (QA scenarios 5 and 13)
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click CREATE TRANSACTION
    And I enter 6 digit code
    #if whitelist, select it qa scenario 5, 7, 2
    And I click submit
    Then I verify that the Sample App doesn't crash
    And I tap the OK button for successful transaction
    ##ADD THE EX::



    Examples:
      | cardNum          |
      | 6011628715884559 |
      | 5354638704372950 |
#      |3552110731880632|
#      |6011404523069100|
#      |5552610722474936|
#      |3585572840524818|
#      |347992130834039|
#      |4438242357968|


  @StrongConsumerAuth1
  Scenario: SCA1
    When I launch the Sample App
    And I see the SDK has initialized success message
    Then I see the 3 editable fields email, cardNumber, and backend server address
    And I see the submit button and the copy button

  @StrongConsumerAuth2
  Scenario Outline: SCA2
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I tap the OK button for successful transaction
    And I assert that the app does not crash,a spinner is displayed, and a successful transaction message with OK button appears
    Examples:
      | cardNum          |
      | 6011140638669190 |
      | 5580693914547509 |
#      | 3548500283122028    |
#      | 6011800280931574    |
#      | 5500160015973882    |
#      | 3584448569408015    |
#      | 6011200000003000060 |
#      | 6011200000003000011 |

  @StrongConsumerAuth3
  Scenario Outline: SCA3
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I tap the OK button for successful transaction
    And I assert that the app does not crash,a spinner is displayed, and a successful transaction message with OK button appears
    Examples:
      | cardNum          |
      | 6011140638669190 |
      | 5580693914547509 |
#      | 3548500283122028    |
#      | 6011800280931574    |
#      | 5500160015973882    |
#      | 3584448569408015    |
#      | 6011200000003000060 |
#      | 6011200000003000011 |

  @StrongConsumerAuth4
  Scenario Outline: SCA3 with QA #18
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I tap the OK button for successful transaction
    And I assert that the app does not crash,a spinner is displayed, and a successful transaction message with OK button appears
    Examples:
      | cardNum          |
      | 6011494825650863 |
      | 3530090036565210 |

  @StrongConsumerAuth5pt1
  Scenario Outline: SCA3 with QA #18
    When I click SDK OK ALERT
     #Turn OFF PERMISSION FEATURES
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I click SDK OK ALERT
    And I click create transaction
    And I enter zipCode
    And I tapDone
    Then I click SDK OK ALERT
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 6011494825650863 |

  @StrongConsumerAuth5pt2
  Scenario Outline: SCA3 with QA #18
    When I click SDK OK ALERT
     #Turn OFF PERMISSION FEATURES
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I click SDK OK ALERT
    And I click create transaction
    And I enter zipCode
    And I tapDone
    Then I click SDK OK ALERT
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 3530090036565210 |


  @StrongConsumerAuth6pt1
  Scenario Outline: SCA3 with QA #18
     #Turn OFF PERMISSION FEATURES
    When I click SDK OK ALERT
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I click SDK OK ALERT
    And I click create transaction
    And I enter zipCode
    And I tapDone
    Then I click SDK OK ALERT
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 3530090036565210 |

  @StrongConsumerAuth6pt2
  Scenario Outline: SCA3 with QA #18
     #Turn OFF PERMISSION FEATURES
    When I click SDK OK ALERT
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I click SDK OK ALERT
    And I click create transaction
    And I enter zipCode
    And I tapDone
    Then I click SDK OK ALERT
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 6011494825650863 |

  @StrongConsumerAuth7
  Scenario Outline: SCA7 with QA #19
    #Turn permission back on
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I see the prompt to enter Bank Pin
    And I enter bankPin
    And I tap Submit
    And I grab the transaction Id


    Examples:
      | cardNum          |
      | 6011188533563307 |
      | 3551561525067698 |

  @StrongConsumerAuth8
  Scenario Outline: SCA8 with QA #19
      #Turn permission back on
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I enter bankPin
    And I tap Submit
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 6011188533563307 |
      | 3551561525067698 |

  @StrongConsumerAuth9
  Scenario Outline: SCA8 with QA #19
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I see the prompt to enter Bank Pin
    And I enter bankPin
    And I tap Submit
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 6011188533563307 |
      | 3551561525067698 |

  @StrongConsumerAuth10@SC
  Scenario Outline: SCA8 with QA #19
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I enter bankPin
    And I tap Submit
    And I grab the transaction Id

    Examples:
      | cardNum          |
      | 6011188533563307 |
      | 3551561525067698 |

  @StrongConsumerAuth11@SC
  Scenario Outline: SCA11 with QA #20
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I see the OTP challenge Screen
    And I enter 6 digit OTP Code
    And I tap Submit
    And I grab the transaction Id
    Examples:
      | cardNum          |
      | 6011896707294059 |
      | 3578941422706086 |


  @StrongConsumerAuth12@SC
  Scenario Outline: SCA12 with QA #20
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I enter 6 digit OTP Code
    And I tap Submit
    And I grab the transaction Id
    Examples:
      | cardNum          |
      | 6011896707294059 |
      | 3578941422706086 |

  @StrongConsumerAuth13@SC
  Scenario Outline: SCA11 with QA #20
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    Then I see the OTP challenge Screen
    And I enter 6 digit OTP Code
    And I tap Submit
    And I grab the transaction Id
    Examples:
      | cardNum          |
      | 6011896707294059 |
      | 3578941422706086 |

  @StrongConsumerAuth14@SC
  Scenario Outline: SCA14 with QA #20
    When I clear field
    And I enter Credit Card Number <cardNum>
    And I click create transaction
    And I enter 6 digit OTP Code
    And I tap Submit
    And I grab the transaction Id
    Examples:
      | cardNum          |
      | 6011896707294059 |
      | 3578941422706086 |



















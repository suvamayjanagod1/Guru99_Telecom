Feature: Test Guru99 Application

  #Framework created by Suvamay
  Scenario: Test Add Customer Functionality
    Given User is on Telecom Domain Project Page
    Then Click on Add Customer Link
    And Click on Background radio button
    And User enter firstname lastname email address  and mobileNo
    Then Click on submit button
    And Capture customerID
    And Click on Home button

  #Add Terrif Plan Written by Sarita
  Scenario: Test Add Terif Plan Functionality
    When User click on Add Terif Plan link
    Then enter monthly rental and pre local mins and free international mins and free local free min charges and international min charges and sms per charges
    And click on submit button
    And click on home button

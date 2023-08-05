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

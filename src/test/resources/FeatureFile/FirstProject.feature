Feature: To validate login functionality

  Background: 
    Given User has to be in fb login page.


  Scenario: To validate login using username and password
    When User has to enter  valid username and invalidpassword
    And User has to click login button
    Then User have to be in invalid credential page

  Scenario: To validate login using username and password
    When User has to enter  invalidusername and valid password
    And User has to click login button
    Then User have to be in invalid credential page

  Scenario: To validate login using username and password
    When User has to enter  invalidusername and invalidpassword
    And User has to click login button
    Then User have to be in invalid credential page

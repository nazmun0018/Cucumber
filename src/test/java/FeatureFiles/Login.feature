Feature: login Functionality using both Datadriven and Normal way
  Scenario: login functionality using Username and Password
    Given user is on main page
    When user click on login button
    And user will enter username and password and click submit button
    Then user need to navigate to the Home page


  Scenario Outline: login throw user name and password
    Given user is on Login Page
    When user enters <username> and <password>
    And user click on Login button
    Then user navigate to Landing Page

    Examples:
      |username|password|
      |vinayreddy|Innovapath|
      |Srivastavva|Innovapath221|
      |Srikanth332|Srikanth122|
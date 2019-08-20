Feature: My validation on testme app for demo

  

  Scenario Outline: login validation for multiple users
    Given testme app is launched
    
    When user clicks on Signin inlanding page
    Then user provides valid username "<uname>"
    And user provides the valid password "<pswd>"
    Then user clicks for submission of the data
    And verifies the login status for the account

  

    Examples: 
      | uname   | pswd        |
      | lalitha | password123 |
      | admin   | password456 |



Feature: My Validation on Mercury tools
 


  Scenario: My Login on Mercury tools
    Given user has launched the application
    Then User enters valid credentials
   And user clicks on submit button
  
   
    Then user verifies the login status
 
  Scenario: guest user registration in mercury tours 

    Then user clicks on sign up link
    When the user enters valid data in the form
    And user clicks on submit button available
    Then user verifies the registration status

  
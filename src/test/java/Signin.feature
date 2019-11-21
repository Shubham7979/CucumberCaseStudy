Feature: Sign in functionality
Test the sign in functionality
  
  Scenario: Sign in using valid credentials
  
    Given User must be on the sign in page
    When  user enters  "lmbs59"  as username
    And   user enters "lmbsh12345"  as password
    And   user clicks on the sign in button
    Then  user is signed in successfully

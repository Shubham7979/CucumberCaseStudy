Feature: Sign Up Functionality
Test the signup functionality

Scenario: Sign up using valid credentials

Given user must be on the signup page 
When  user enters "lmbs59" as username
And   user enters "Shubham" as firstname
And   user enters "tambve" as lastname
And   user enters "lmbsh12345" as password
And   user enters "lmbsh12345" as confirm password
And   user selects his/her as gender
And   user enters "lmbs@gmail.com" as mailid
And   user enters "7854963122" as mobno
And   user enters "09/08/2019" as dob
And   user enters "Chennai" as address
And   user selects "2" as security que
And   user enters "MH" as security answer
And   user clicks on the register button
Then  user registers successfully

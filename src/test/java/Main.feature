Feature: Sign Up Functionality
Test the signup functionality

Scenario: Sign up using valid credentials

Given user must be on the signup page 
When user enters "lmbs59" as username
When user enters "Shubham" as firstname
When user enters "tambve" as lastname
When user enters "lmbsh12345" as password
When user enters "lmbsh12345" as confirm password
When user selects "Male" as gender
When user enters "lmbs@gmail.com" as mailid
When user enters "7854963122" as mobno
When user enters "09/08/2019" as dob
When user enters "Chennai" as address
When user selects "birth place " as security que
When user enters "MH" as security answer
When user clicks on the register button
Then user registers successfully

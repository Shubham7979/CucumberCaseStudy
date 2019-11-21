Feature: Case study on false procedure


Scenario: The one where user wants to move to cart without adding any item in it
Given user has registered into testme app
When  User search a product "Headphone"
And   try to proceed to payment without adding any item into the cart
Then  testme app doesnt display cart item




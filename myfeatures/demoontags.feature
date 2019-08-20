
Feature: understanding of tags
@Smoke @Sanity
  Scenario: login validation on flipkart
    Given launch the application
    And enter credentials
 Then click on login
 @Regression
   Scenario: user access to items in portal
   Given user searching the product with code
   Then user able to add it to cart
   @Smoke
    Scenario: user access to remove from cart
    Given user able to see items count in his cart
    Then user can remove items from cart
    @Sanity
    Scenario: user wanted to track the order
   Given user has active order
    Then user verifies the status of order
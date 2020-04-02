@Buy
Feature: Buy a product
  The user will select a product and proceed to buy it

  @1
  Scenario: Select and buy
    Given Login succesful with "test800@hotmail.com" and "test123"
    And User is in homepage
    When User clicks on women category
    And User adds a product to the cart
    And User clicks on Proceed Checkout
    And User clicks on Proceed Checkout
    And User clicks on Proceed Checkout again
    And User accepts terms of service
    And User clicks on Proceed Checkout and again
    And User pays by check
    And User confirms order
    Then User order on My Store is complete.
    
    @2
  Scenario: Select and buy
    Given Login succesful with "test800@hotmail.com" and "test123"
    And User is in homepage
    When User clicks on women category
    And User adds a product to the cart
    And User clicks on Proceed Checkout
    And User clicks on Proceed Checkout
    And User clicks on Proceed Checkout again
    And User accepts terms of service
    And User clicks on Proceed Checkout and again
    And User pays by check
    And User confirms order
    Then User order on My Store is complete.
    

 

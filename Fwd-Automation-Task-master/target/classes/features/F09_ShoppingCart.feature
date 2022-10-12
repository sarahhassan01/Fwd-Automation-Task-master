@smoke
Feature: User can add products to cart
  #Test Scenario
  Scenario: user adds products to cart
    When User click add cart button for two products
    Then System add products to cart  and increase rows of Shopping cart table

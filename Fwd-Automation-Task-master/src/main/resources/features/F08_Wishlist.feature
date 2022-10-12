@smoke
Feature: User can add products to wishlist page
  #Test Scenario
  Scenario: user adds products to wishlist page
    When User click fav-icon for a product
    Then System add them to wishlist page ,display success notification message and increase wishList Quantity
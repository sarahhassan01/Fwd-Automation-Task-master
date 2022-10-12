@smoke
Feature: User can Click on homepage slider
  #Test Scenario
  Scenario: user can see product1 details through the Slider
    When Click on  Slider First picture
    Then System redirects to product-Nokia details page

  Scenario: user can see product2 details through the Slider
    When Click on sub Slider Second picture
    Then System redirects to product-Iphone details page

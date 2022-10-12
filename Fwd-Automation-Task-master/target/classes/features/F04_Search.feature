@smoke
Feature: User can Search for product
  #Test Scenario
  Scenario: user Search for product successfully
    When Search
    Then system redirects to search result page

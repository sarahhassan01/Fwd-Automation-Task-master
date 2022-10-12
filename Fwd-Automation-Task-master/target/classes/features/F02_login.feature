@smoke
Feature: User should be able to Login to the system

  #Test Scenario:
  Scenario: user Login with valid data
    When user Enter valid data in "sarahassan01010@gmail.com" and "12345678"
    #Expected result
    Then system redirects to Home page and system display Account tab
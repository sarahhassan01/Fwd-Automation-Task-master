@smoke
Feature: User should be able to register to the system

  #Test Scenario:
  Scenario: User register with valid data
    When user Enter valid data and click on register button
    #Expected result
    Then system redirects to registration confirmation page and  display success notification
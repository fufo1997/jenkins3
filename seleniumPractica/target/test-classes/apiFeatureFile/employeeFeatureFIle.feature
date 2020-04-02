
@Rest
Feature: Employee feature
  I want to use this template for my feature file

  @GetEmployees
  Scenario: Title of your scenario
    Given User set valid auth key
    When User send a Get request on "user"
    Then User should get status code 200

 
    
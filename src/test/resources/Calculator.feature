Feature: Calculator
  As a user
  I want to perform basic calculator operations
  So that I can verify the correctness of calculations

  Scenario: Addition
    Given I have a calculator
    When I add 5 and 7
    Then the result should be 12

  Scenario: Subtraction
    Given I have a calculator
    When I subtract 5 from 7
    Then the result should be 2
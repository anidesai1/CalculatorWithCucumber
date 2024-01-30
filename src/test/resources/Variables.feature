Feature: Variables
  As a user
  I want to perform basic operation
  So that I can verify the correctness of calculations

  Scenario: Using float and Strings
    Given "Number3" is 5.4332
    And And "Number4" is 6.3223
    Then We know which one is smaller

  Scenario: Using integers and Strings
    Given "Number3" value is 8
    And And "Number4" value is 10
    Then We know which one is bigger
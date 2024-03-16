Feature: I want to test homepage features

  @Test
  Scenario:Adding Web Tables
    Given Open the Web Site 'https://demoqa.com'
    When Click Button and Add Web Table
    Then The new entry with the name should be visible in the table

Feature: Google Searching

  Scenario: validating google search is working
    Given browser is open
    And user is on google search page
    When user enters text in search box
    And hits enters
    Then user is navigated to search results

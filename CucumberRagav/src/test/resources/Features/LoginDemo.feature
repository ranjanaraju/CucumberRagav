Feature: Test Login Feature

  Scenario Outline: Check Login is Successfull with valid Credentials
    Given browser is is open
    And user is on Llogin page
    When user enters <username> and <password>
    Then user is navigated to the homepage
    
    Examples:
    |username|password|
    |Radhakrishna|12345|
    |JaiHanuman|12345|
    
     

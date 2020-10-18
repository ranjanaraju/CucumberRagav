Feature: Launching execute automation

Scenario Outline: Verify login sucessfull 

Given Entering the valid credentials
When Enter "<username>" and "<password>"
Then Click on login

Examples:
		 |username|password|
		 |admin |manager  |
		 
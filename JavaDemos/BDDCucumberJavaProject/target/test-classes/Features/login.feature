Feature: feature to test login functionality

Scenario: Check login is successful with valid credentials one

	Given browser is open for testproject
	And user is on login page for testproject
	When user enters username and password for testproject
	And user clicks on login button
	Then user is navigated to the home page for testproject

#Scenario Outline: Check login is successful with valid credentials
#
#	Given user is on login page
#	When user enters <username> and <password>
#	And clicks on login button
#	Then user is navigated to the home page
#	
#	Examples:
#	| username | password |
#	| user1 | 1234 |
#	| user2 | 1234 |
#	| user3 | 1234 |
#	| user4 | 1234 |
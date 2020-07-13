Feature: feature to test login functionality

Scenario Outline: Check login is successful with valid credentials one

	Given browser is open for testproject
	And user is on login page for testproject
	When user enters <username> and <password> for testproject
	And user clicks on login button
	Then user is navigated to the home page for testproject

#Scenario Outline: Check login is successful with valid credentials
#
#	Given user is on login page
#	When user enters <username> and <password>
#	And clicks on login button
#	Then user is navigated to the home page
#	
	Examples:
	| username | password |
	| Kunal | 12345 |
	| Harsh | 12345 |
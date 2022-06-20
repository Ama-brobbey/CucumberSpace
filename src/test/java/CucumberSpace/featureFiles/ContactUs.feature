Feature: Submit data to webdriveruniversity.com using contact us form

Scenario: Submit valid data via contact us form
	Given I access webdriveruniversity contact us form
	When i enter a valid firstname
	And i enter a valid lastname
	|Brobbey|Premper|Banahene|
	And i enter a valid email address
	And i enter comments
	|example comment one| example comment two|
	When you click on the submit button
	Then the information should be subitted via the contact us form
	
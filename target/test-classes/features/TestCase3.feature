@Test-Case3
Feature: Acceptance testing to validate the errors on populating the mandatory fields with the invalid data
	In order to validate the errors are displayed after populating the mandatory fields with invalid data
	we will do the acceptance testing
 
@TestCase3-Errors-With-Invalid-Data
Scenario: Validate if the Errors are displayed on giving invalid test data 
	Given I am logged on the HomePage as "https://jupiter.cloud.planittesting.com/#/"	
	And I click on the Contact page menu in the HomePage
	Then on the subsequent page I populate the mandatory fields with invalid data	
	And so I will validate the errors displayed
@Test-Case1
Feature: Acceptance testing to validate the errors on the Contact Page 
	In order to validate that the errors are properly validated
	we will do the acceptance testing
 
@TestCase1-Error-Validations
Scenario: Validate Errors on the Contact page 
	Given I am on the HomePage the Jupiter Planit Testing "https://jupiter.cloud.planittesting.com/#/"	
	And click on Contact link 
	And on the resulting page I click on the Submit button
	Then I should be able to validate the error message
	When I populate the mandatory fields
	Then the error message should be gone
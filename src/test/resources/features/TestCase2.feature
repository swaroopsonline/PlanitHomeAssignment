@Test-Case2
Feature: Acceptance testing to validate the successful submission message
	In order to validate that the submission message is displayed after populating the mandatory fields
	we will do the acceptance testing
 
@TestCase2-Submission-Message-Validation
Scenario: Validate if the Submission message is displayed as expected 
	Given I am on the HomePage as "https://jupiter.cloud.planittesting.com/#/"	
	And I click on the Contact page
	Then on the subsequent page I populate the mandatory fields
	And I click on the submit button
	And so I will validate the submission message
@Test-Case4
Feature: Acceptance testing to verify the items in the Cart after shopping for the same
	In order to verify the items are present in the Cart after shopping is done from the Shop page
	we will do the acceptance testing
 
@TestCase4-Items-verification-in-the-cart
Scenario: Verify if all the selected items are present in the cart after choosing them from the Shop page 
	Given I am able to open the home page "https://jupiter.cloud.planittesting.com/#/"	
	And I click on the Shop page menu in the HomePage
	Then on the following page I click for two times on Funny Cow
	And I click on the Fluffy Bunny for one time	
	Then I click on the cart menu
	And so I verify if the items are present on the cart
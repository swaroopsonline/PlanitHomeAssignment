package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.ContactPageActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class TestCase3Steps {
	
	HomePageActions homePageActions = new HomePageActions();
	ContactPageActions contactPageActions = new ContactPageActions();
	
	@Given("I am logged on the HomePage as {string}")
	public void i_am_logged_on_the_HomePage_as(String URL) {
	    
		SeleniumDriver.openPage(URL);
	}

	@And("I click on the Contact page menu in the HomePage")
	public void i_click_on_the_Contact_page_menu_in_the_HomePage() {
	    
		homePageActions.moveToContactMenu();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("on the subsequent page I populate the mandatory fields with invalid data")
	public void on_the_subsequent_page_I_populate_the_mandatory_fields_with_invalid_data() {
	    
		contactPageActions.populateInvalidData();
	}	
	
	@And("so I will validate the errors displayed")
	public void so_I_will_validate_the_errors_displayed() {
	    
		contactPageActions.verifyInvalidErrorMessage();
	}



}

package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.ContactPageActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class TestCase2Steps {
	
	HomePageActions homePageActions = new HomePageActions();
	ContactPageActions contactPageActions = new ContactPageActions();
	
	@Given("I am on the HomePage as {string}")
	public void i_am_on_the_HomePage_as(String URL) {
	    
		SeleniumDriver.openPage(URL);
	}

	@And("I click on the Contact page")
	public void i_click_on_the_Contact_page() {
	    
		homePageActions.moveToContactMenu();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Then("on the subsequent page I populate the mandatory fields")
	public void on_the_subsequent_page_I_populate_the_mandatory_fields() {
	    
		contactPageActions.populateMandatoryFields();
	}

	@And("I click on the submit button")
	public void i_click_on_the_submit_button() {
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
		contactPageActions.submit();
	}

	@And
	("so I will validate the submission message")
	public void so_I_will_validate_the_submission_message() {
	    
		contactPageActions.verifySubmissionMessage();
	}


}

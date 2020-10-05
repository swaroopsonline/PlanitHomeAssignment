package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.ContactPageActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;

public class TestCase1Steps {
	
	
	HomePageActions homePageActions = new HomePageActions();
	ContactPageActions contactPageActions = new ContactPageActions();
	
	@Given("I am on the HomePage the Jupiter Planit Testing {string}")
	public void i_am_on_the_HomePage_the_Jupiter_Planit_Testing(String URL) {
	    SeleniumDriver.openPage(URL);
	}
	
	@And("click on Contact link")
	public void click_on_Contact_link() {
	    
		homePageActions.moveToContactMenu();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@And("on the resulting page I click on the Submit button")
	public void on_the_resulting_page_I_click_on_the_Submit_button() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	    
		contactPageActions.submit();
	}
	

	

	@Then("I should be able to validate the error message")
	public void i_should_be_able_to_validate_the_error_message() {
		
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//contactPageActions.verifyNegativeMessage();
	    contactPageActions.verifyErrorMessage();
	}

	@When("I populate the mandatory fields")
	public void i_populate_the_mandatory_fields() {
	    
		contactPageActions.populateMandatoryFields();
	}

	@Then("the error message should be gone")
	public void the_error_message_should_be_gone() {
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//contactPageActions.verifyPositiveMessage();
	    contactPageActions.verifyErrorMessage();
	}


}

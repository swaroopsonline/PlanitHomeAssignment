package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.locators.ContactPageLocators;

import utils.SeleniumDriver;

/*This Class enlists all the necessary actions, that needed to be executed on the Contact page*/
public class ContactPageActions {

	ContactPageLocators contactPageLocators = null;
	// The ContactPageActions constructor is used to initialize the PageFactory elements of the Contact Page.
	public ContactPageActions() {

		this.contactPageLocators = new ContactPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), contactPageLocators);

	}

	//This method is used to populated the mandatory fields with the required Test data
	public void populateMandatoryFields() {

		contactPageLocators.ForeName.sendKeys("TestFirstname");
		contactPageLocators.SurName.sendKeys("TestSurname");
		contactPageLocators.Email.sendKeys("dummy@gmail.com");
		contactPageLocators.Telephone.sendKeys("0400000000");
		contactPageLocators.Message.sendKeys("This is just and example");

	}
	
	//This method is used to populated the mandatory fields with the required Negative Test data
	public void populateInvalidData() {

		contactPageLocators.ForeName.sendKeys("TestFirstname");
		contactPageLocators.SurName.sendKeys("TestSurname");
		contactPageLocators.Email.sendKeys("dummy#gmail.com");
		contactPageLocators.Telephone.sendKeys("04sdfadf00");
		contactPageLocators.Message.sendKeys("This is just an example of Negative testing");

	}
	
	//This method is used to click on the Submit Button
	public void submit() {

		contactPageLocators.SubmitButton.click();
	}
	
	//This method is used to test the presence of the Error messages after/before populating the
	//mandatory fields of the Contact Page
	public void verifyErrorMessage() {

		boolean ErrorMsgName = contactPageLocators.ErrorForename.isSelected();
		String ErrorMsgEmail = contactPageLocators.ErrorEmail.getText();
		String ErrorMsgBox = contactPageLocators.ErrorForMessageBox.getText();

		if (ErrorMsgName) {
			System.out.println("The error message for Email is : " + ErrorMsgEmail);
			System.out.println("The error message for the Message Box is : " + ErrorMsgBox);
		} else {
			System.out.println("The error messages are gone");
		}
	}
	
	// This method is dedicated to test the Invalid Error messages on populating the mandatory fields
	//with Negative Test data
	public void verifyInvalidErrorMessage() {

		String invalidEmailMsg = contactPageLocators.invalidEmail.getText();
		String invalidTelMsg = contactPageLocators.invalidTelephoneNo.getText();
		
		System.out.println("Invalid Email Message displayed is :" +invalidEmailMsg);
		System.out.println("Invalid Telephone Error message is :" +invalidTelMsg);
		String expectedTelMsg = "Please enter a valid telephone number";
				
		Assert.assertEquals(invalidTelMsg, expectedTelMsg);
		
	}

	//This method is used to verify the presence of the Submission message, after populating the
	//mandatory fields with the positive test data and clicking on submit button.
	public void verifySubmissionMessage() {

		String ActualErrMsg = contactPageLocators.submissionMessage.getText();
		String ExpectedErrMsg = "We welcome your feedback - tell it how it is.";
		Assert.assertEquals(ActualErrMsg, ExpectedErrMsg);
		Assert.assertTrue(true, ExpectedErrMsg);

	}	

}

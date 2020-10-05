package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import pages.locators.ContactPageLocators;

import utils.SeleniumDriver;

public class ContactPageActions {

	ContactPageLocators contactPageLocators = null;
	SoftAssert softAssert = new SoftAssert();

	public ContactPageActions() {

		this.contactPageLocators = new ContactPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), contactPageLocators);

	}

	public void populateMandatoryFields() {

		contactPageLocators.ForeName.sendKeys("TestFirstname");
		contactPageLocators.SurName.sendKeys("TestSurname");
		contactPageLocators.Email.sendKeys("dummy@gmail.com");
		contactPageLocators.Telephone.sendKeys("0400000000");
		contactPageLocators.Message.sendKeys("This is just and example");

	}

	public void populateInvalidData() {

		contactPageLocators.ForeName.sendKeys("TestFirstname");
		contactPageLocators.SurName.sendKeys("TestSurname");
		contactPageLocators.Email.sendKeys("dummy#gmail.com");
		contactPageLocators.Telephone.sendKeys("04sdfadf00");
		contactPageLocators.Message.sendKeys("This is just an example of Negative testing");

	}

	public void submit() {

		contactPageLocators.SubmitButton.click();
	}

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
	
	public void verifyInvalidErrorMessage() {

		String invalidEmailMsg = contactPageLocators.invalidEmail.getText();
		String invalidTelMsg = contactPageLocators.invalidTelephoneNo.getText();
		
		System.out.println("Invalid Email Message displayed is :" +invalidEmailMsg);
		System.out.println("Invalid Telephone Error message is :" +invalidTelMsg);
		String expectedTelMsg = "Please enter a valid telephone number";
				
		Assert.assertEquals(invalidTelMsg, expectedTelMsg);
		
	}

	public void verifySubmissionMessage() {

		String ActualErrMsg = contactPageLocators.submissionMessage.getText();
		String ExpectedErrMsg = "We welcome your feedback - tell it how it is.";
		Assert.assertEquals(ActualErrMsg, ExpectedErrMsg);
		Assert.assertTrue(true, ExpectedErrMsg);

	}	

}

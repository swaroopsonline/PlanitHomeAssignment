package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ContactPageLocators {
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"forename\"]")
	public WebElement ForeName;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"surname\"]")
	public WebElement SurName;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"email\"]")
	public WebElement Email;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"telephone\"]")
	public WebElement Telephone;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"message\"]")
	public WebElement Message;
	
	@FindBy(how=How.LINK_TEXT, using ="Submit")
	public WebElement SubmitButton;
	
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"forename-err\"]")
	public WebElement ErrorForename;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"email-err\"]")
	public WebElement ErrorEmail;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"message-err\"]")
	public WebElement ErrorForMessageBox;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"header-message\"]/div")
	public WebElement submissionMessage;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"email-err\"]")
	public WebElement invalidEmail;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"telephone-err\"]")
	public WebElement invalidTelephoneNo;
	
	//@FindBy(how=How.XPATH, using ="//*[@id=\"header-message\"]/div")
	//public WebElement invalidSubmissionMsg;
	
	
	

}

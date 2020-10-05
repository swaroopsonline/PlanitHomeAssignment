package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

/*This Class enlists all the necessary actions, that needed to be executed on the HomePage*/
public class HomePageActions {

	HomePageLocators homePageLocators = null;
	
// The HomePageActions constructor is used to initialize the PageFactory elements of the HomePage.
	public HomePageActions() {

		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);

	}

	//The below method is used to click on the Contact Menu from the HomePage
	public void moveToContactMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.ContactLink).click().build().perform();
	}
	
	//The below method is used to click on the Shop Menu from the HomePage
	public void moveToShopMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.ShopLink).click().build().perform();
		
	}	

}

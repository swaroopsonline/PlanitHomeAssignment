package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {

	HomePageLocators homePageLocators = null;
	

	public HomePageActions() {

		this.homePageLocators = new HomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators);

	}

	public void moveToContactMenu() {

		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.ContactLink).click().build().perform();
	}
	
	public void moveToShopMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(homePageLocators.ShopLink).click().build().perform();
		
	}	

}

package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ShopPageLocators;
import utils.SeleniumDriver;

/*This Class enlists all the necessary actions, that needed to be executed on the Shop Page*/
public class ShopPageActions {

	ShopPageLocators shopPageLocators = new ShopPageLocators();
	
	// The ShopPageActions constructor is used to initialize the PageFactory elements of the Shop Page.
	public ShopPageActions() {

		this.shopPageLocators = new ShopPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), shopPageLocators);
	}

	// This method will click on the 'Funny Cow' button two times, as per the requirement
	public void clickOnFunnyCow() {
				
		for(int i=0; i<2; i++) {
						
			shopPageLocators.FunnyCow.click();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// This method will click on the 'Fluffy Bunny' button one times
	public void clickOnFluffyBunny() {
						
		shopPageLocators.FluffyBunny.click();
	}
	
	// This method will click on the Cart Button, once the items are selected on the Shop Page.
	// And take us to the Cart Page
	public void clickOnCartButton() {
				
		shopPageLocators.CartButton.click();
	}
}

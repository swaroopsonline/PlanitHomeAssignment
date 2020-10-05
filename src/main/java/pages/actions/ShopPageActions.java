package pages.actions;

import org.openqa.selenium.support.PageFactory;
import pages.locators.ShopPageLocators;
import utils.SeleniumDriver;

public class ShopPageActions {

	ShopPageLocators shopPageLocators = new ShopPageLocators();
	
	public ShopPageActions() {

		this.shopPageLocators = new ShopPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), shopPageLocators);
	}

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

	public void clickOnFluffyBunny() {
						
		shopPageLocators.FluffyBunny.click();
	}
	
	public void clickOnCartButton() {
				
		shopPageLocators.CartButton.click();
	}
}

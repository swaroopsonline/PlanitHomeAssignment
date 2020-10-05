package pages.actions;

import org.testng.Assert;

import utils.SeleniumDriver;

public class CartPageActions {
			
	public void verifyTextOfItems() {
		
		boolean FunnyCowPresent = SeleniumDriver.getDriver().getPageSource().contains("Funny Cow");
		boolean FluffyBunnyPresent = SeleniumDriver.getDriver().getPageSource().contains("Fluffy Bunny");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(FunnyCowPresent);
		Assert.assertTrue(FluffyBunnyPresent);
		
	}	

}

package pages.actions;

import org.testng.Assert;

import utils.SeleniumDriver;

/*This Class enlists all the necessary actions, that needed to be executed on the Cart page*/
/*It is also used as a repository for all the items which needs to be tested for their presence on the Cart Page*/
public class CartPageActions {
	
	//The below items could be modified, as per our requirement
	public String item1 = "Funny Cow";
	public String item2 = "Fluffy Bunny";
			
	// This method will verify the presence of the relevant items, displayed on the Cart page/
	// As per our requirement, the items are 'Funny Cow' and 'Fluffy Bunny'
	public void verifyTextOfItems() {
		
		boolean item1Present = SeleniumDriver.getDriver().getPageSource().contains(item1);
		boolean item2Present = SeleniumDriver.getDriver().getPageSource().contains(item2);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Assert.assertTrue(item1Present);
		Assert.assertTrue(item2Present);
		
	}	

}

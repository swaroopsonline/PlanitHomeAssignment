package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.actions.CartPageActions;
import pages.actions.HomePageActions;
import pages.actions.ShopPageActions;
import utils.SeleniumDriver;

public class TestCase4Steps {
	
	HomePageActions homePageActions = new HomePageActions();
	ShopPageActions shopPageActions = new ShopPageActions();
	CartPageActions cartPageActions = new CartPageActions();
	
	@Given("I am able to open the home page {string}")
	public void i_am_able_to_open_the_home_page(String URL) {
	 
		SeleniumDriver.openPage(URL);
	}

	@And("I click on the Shop page menu in the HomePage")
	public void i_click_on_the_Shop_page_menu_in_the_HomePage() {
	    
		homePageActions.moveToShopMenu();
	}

	@Then("on the following page I click for two times on Funny Cow")
	public void on_the_following_page_I_click_for_two_times_on_Funny_Cow() {
	    
		shopPageActions.clickOnFunnyCow();
	}

	@And("I click on the Fluffy Bunny for one time")
	public void i_click_on_the_Fluffy_Bunny_for_one_time() {
	    
		shopPageActions.clickOnFluffyBunny();
	}

	@Then("I click on the cart menu")
	public void i_click_on_the_cart_menu() {
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		shopPageActions.clickOnCartButton();
	}

	@And("so I verify if the items are present on the cart")
	public void so_I_verify_if_the_items_are_present_on_the_cart() {
	    
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cartPageActions.verifyTextOfItems();
	}


}

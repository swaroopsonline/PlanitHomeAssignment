package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopPageLocators {
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"product-6\"]/div/p/a")
	public WebElement FunnyCow;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"product-4\"]/div/p/a")
	public WebElement FluffyBunny;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"nav-cart\"]/a")
	public WebElement CartButton;
	

}

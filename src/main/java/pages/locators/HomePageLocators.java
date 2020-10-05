package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"nav-shop\"]/a")
	public WebElement ShopLink;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"nav-contact\"]/a")
	public WebElement ContactLink;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"nav-cart\"]/a")
	public WebElement CartLink;	
	

}

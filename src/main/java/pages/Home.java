package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
//1. Constructor
//2. Locators
//3. Methods 
	
	
	//WebElement a=driver.findElement(By.id("dhdj")).click();
	
	//PageFactory 
	
	@FindBy(id = "search_query_top")
	public WebElement searchField;
	
	public void verifySearchField()
	{
		System.out.println("Search field is "+ searchField.isDisplayed());
	}
}

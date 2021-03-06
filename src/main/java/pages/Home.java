package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
//1. Constructor
//2. Locators
//3. Methods 
	
	private WebDriver driver;//Global Variable driver
	
	public Home(WebDriver driver)//Parametric Constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//WebElement a=driver.findElement(By.id("dhdj")).click();
	
	//PageFactory 
	
	@FindBy(id = "search_query_top")
	public WebElement searchField;
	
	public void verifySearchField()
	{
		System.out.println("Search field is "+ searchField.isDisplayed());
	}
}

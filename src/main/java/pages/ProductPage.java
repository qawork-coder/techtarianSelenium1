package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {


	private WebDriver driver;// Global Variable driver
	String parent;
	String child;
	
	public ProductPage(WebDriver driver)// Parametric Constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(className = "icon-facebook")
	public WebElement facebookButton;
	
	@FindBy(name = "email")
	public WebElement emailField;
	
	@FindBy(name = "pass")
	public WebElement passwordField;
	
	
	public void clickFacebookShare()
	{
		facebookButton.click();
	}
	
	public void switchChildWindow()
	{
		Set<String> windowsList = driver.getWindowHandles();
		List<String> stringsList = new ArrayList<String>(windowsList);
		parent = stringsList.get(0);
		child = stringsList.get(1);
		driver.switchTo().window(child);
		
	}
	
	public void enterFBCredentials()
	{
		emailField.sendKeys("gdhsdgh@gmail.com");
		passwordField.sendKeys("dsd");
		driver.close();
		driver.switchTo().window(parent);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

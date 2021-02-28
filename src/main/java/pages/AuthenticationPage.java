package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationPage {

	@FindBy(className = "login")
	public WebElement signInBtn;
	
	@FindBy(id="email_create")
	public WebElement emailNewAccount;
	
	@FindBy(id="SubmitCreate")
	public WebElement createAccBtn;
	
	public void goToAuthenticationPage()
	{
		signInBtn.click();
	}
	
	public void enterNewEmailId()
	{
		emailNewAccount.sendKeys("abccsa@gmail.com");
		createAccBtn.click();
	}
}

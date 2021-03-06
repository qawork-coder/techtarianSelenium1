package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage {

	private WebDriver driver;// Global Variable driver

	public AuthenticationPage(WebDriver driver)// Parametric Constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "login")
	public WebElement signInBtn;

	@FindBy(id = "email_create")
	public WebElement emailNewAccount;

	@FindBy(id = "SubmitCreate")
	public WebElement createAccBtn;

	@FindBy(id = "email")
	public WebElement EmailExistingUser;

	@FindBy(id = "passwd")
	public WebElement PassExistingUser;

	@FindBy(id = "SubmitLogin")
	public WebElement SignInExistingUser;

	public void goToAuthenticationPage() {
		signInBtn.click();
	}

	public void enterNewEmailId() {
		emailNewAccount.sendKeys("ooooo@gmail.com");
		createAccBtn.click();
	}

	public void LoginUser() {
		EmailExistingUser.sendKeys("hushinde@yahoo.com");
		PassExistingUser.sendKeys("Test123");
		SignInExistingUser.click();
	}
}


package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreatAccountPage {

	private WebDriver driver;// Global Variable driver

	public CreatAccountPage(WebDriver driver)// Parametric Constructor
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

	@FindBy(id = "uniform-id_gender2")
	public WebElement genderCreateAcc;

	@FindBy(id = "customer_firstname")
	public WebElement firstNameCreateAcc;

	@FindBy(id = "customer_lastname")
	public WebElement lastNameCreateAcc;

	@FindBy(id = "email")
	public WebElement emailCreateAcc;

	@FindBy(id = "passwd")
	public WebElement PasswdCreateAcc;

	@FindBy(id = "days")
	public WebElement dayCreateAcc;

	@FindBy(id = "months")
	public WebElement monthCreateAcc;

	@FindBy(id = "years")
	public WebElement yearCreateAcc;

	@FindBy(id = "newsletter")
	public WebElement newsLetterCkbx;

	@FindBy(id = "optin")
	public WebElement spOfferCkbx;

	@FindBy(id = "firstname")
	public WebElement firstNameAddrCreateAcc;

	@FindBy(id = "lastname")
	public WebElement lastNameAddrCreateAcc;

	@FindBy(id = "company")
	public WebElement CompanyCreateAcc;

	@FindBy(id = "address1")
	public WebElement AddressCreateAcc;

	@FindBy(id = "city")
	public WebElement CityCreateAcc;

	@FindBy(id = "id_state")
	public WebElement StateCreateAcc;

	@FindBy(id = "postcode")
	public WebElement POCreateAcc;

	@FindBy(id = "id_country")
	public WebElement CountryCreateAcc;

	@FindBy(id = "other")
	public WebElement AddInfoCreateAcc;

	@FindBy(id = "phone")
	public WebElement HphoneCreateAcc;

	@FindBy(id = "phone_mobile")
	public WebElement MphoneCreateAcc;

	@FindBy(id = "alias")
	public WebElement AliasAddCreateAcc;

	@FindBy(id = "submitAccount")
	public WebElement RegisterCreateAcc;

	public void goToAuthenticationPage() {
		signInBtn.click();
	}

	public void enterNewEmailId() {
		emailNewAccount.sendKeys("abc@gmail.com");
		createAccBtn.click();
	}

	public void CorrectFillForm()

	{
		genderCreateAcc.click();
		firstNameCreateAcc.sendKeys("Mini");
		lastNameCreateAcc.sendKeys("Nair");
		emailCreateAcc.sendKeys("abc.gmail.com");
		PasswdCreateAcc.sendKeys("abc");

		// Select day from Days Dropdown for DOB
		Select day = new Select(dayCreateAcc);
		day.selectByValue("6");

		// Select month from months Dropdown for DOB
		Select month = new Select(monthCreateAcc);
		month.selectByValue("4");

		// Select year from year Dropdown for DOB
		Select years = new Select(yearCreateAcc);
		years.selectByValue("2020");

		newsLetterCkbx.click();
		firstNameAddrCreateAcc.sendKeys("Mini");
		lastNameAddrCreateAcc.sendKeys("Nair");
		CompanyCreateAcc.sendKeys("Techterrain");
		AddressCreateAcc.sendKeys("ABC Avenue, Florida");
		CityCreateAcc.sendKeys("Tampa");

		// Select State from dropdown
		Select state = new Select(StateCreateAcc);
		state.selectByValue("Florida");
		POCreateAcc.sendKeys("10090909");

		// Select Country from dropdown
		Select Country = new Select(CountryCreateAcc);
		Country.selectByValue("United States");

		AddInfoCreateAcc.sendKeys("Adding informations here");
		AliasAddCreateAcc.sendKeys("DEF Ave, Globe");
		RegisterCreateAcc.click();

	}

}

package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.AuthenticationPage;
import pages.CreatAccountPage;
import pages.Home;

public class LoginWithValidUser extends Base {

	// 1. Create a driver variable
	// 2. Create the objects for the PageClasses
	// 3. Pass the driver variable from baseClass
	// 4. Initialize the Page Objects
	// 5. Create your TC

	private WebDriver driver;

	AuthenticationPage authPage = null;
	CreatAccountPage createNewAcc = null;
	Home homePage = null;

	@BeforeSuite
	public void initialSetup() {
		driver = getDriver();
		authPage = new AuthenticationPage(driver);
		createNewAcc = new CreatAccountPage(driver);
		homePage = new Home(driver);

	}

	@Test
	public void testCase1() {
		homePage.verifySearchField();
		authPage.goToAuthenticationPage();
		authPage.LoginUser();
	}

}

package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseSetup.Base;
import pages.AuthenticationPage;
import pages.CreatAccountPage;
import pages.Home;

public class AssertionsOnCreateAccountPage extends Base{
	private WebDriver driver;

	AuthenticationPage authPage = null;
	CreatAccountPage createNewAcc = null;
	Home homePage = null;

	@BeforeSuite
	public void initialSetup() throws IOException {
		driver = getDriver();
		authPage = new AuthenticationPage(driver);
		createNewAcc = new CreatAccountPage(driver);
		homePage = new Home(driver);

	}
	
	@Test
	public void testCase2()
	{
		homePage.verifySearchField();
		authPage.goToAuthenticationPage();
		createNewAcc.randomEmail();
		//authPage.enterNewEmailId();
		createNewAcc.InvalidFillForm();
		createNewAcc.assertInavlidCountryErrorMessage();
	}

}


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
import pages.ProductPage;
import pages.WomenPage;

public class FaceBookProductShare extends Base {
	private WebDriver driver;

	AuthenticationPage authPage = null;
	CreatAccountPage createNewAcc = null;
	Home homePage = null;
	WomenPage womenPage=null;
	ProductPage	productPage=null;

	@BeforeSuite
	public void initialSetup() throws IOException {
		driver = getDriver();
		authPage = new AuthenticationPage(driver);
		createNewAcc = new CreatAccountPage(driver);
		homePage = new Home(driver);
		womenPage = new WomenPage(driver);
		productPage=new ProductPage(driver);

	}

	@Test
	public void testCase1() {
		homePage.verifySearchField();
		authPage.goToAuthenticationPage();
		authPage.LoginUser();
		womenPage.goWomenTab();
		womenPage.FirstImage();
		productPage.clickFacebookShare();
		productPage.switchChildWindow();
		productPage.enterFBCredentials();
		
	}

}

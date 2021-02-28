package baseSetup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	@Test
	public void getDriver()
	{
	System.setProperty("webdriver.chrome.driver", "D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_88/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://automationpractice.com/index.php");
	}
}

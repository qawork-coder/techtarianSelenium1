package baseSetup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {

	private WebDriver driver;
	private Properties prop;

	public WebDriver getDriver() throws IOException {
		
		prop=new Properties();
		FileInputStream fs=new FileInputStream(System.getProperty("user.dir")+"./src/main/java/config/config.properties");
		prop.load(fs);
		System.setProperty("webdriver.chrome.driver",
				"D:/SeleniumBrowserDriversJarFiles/chromedriver_win32_88/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("TestURL"));
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		return driver;
	}

	public void closeBrowser() {
		driver.close();
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenPage {

	private WebDriver driver;// Global Variable driver

	public WomenPage(WebDriver driver)// Parametric Constructor
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[@title=\"Women\"])[1]")
	public WebElement WomenTab;

	public void goWomenTab() {
		WomenTab.click();
	}

	@FindBy(xpath = "(//*[@class=\"product_img_link\"]/img)[1]")
	public WebElement FirstImage;

	public void FirstImage() {
		FirstImage.click();
	}

	@FindBy(id = "fancybox-frame1615090080909")
	public WebElement Frame;

	public void Frame() {
		driver.switchTo().frame("Frame");
	}

	@FindBy(xpath = "(//p/button)[2]")
	public WebElement Share;

	public void Share() {
		Share.click();

	}

}

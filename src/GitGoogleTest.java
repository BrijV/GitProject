import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class GitGoogleTest {

	public static void main(String[] args) {

		String Browsers = "Firefox";
		String title = "book - Google Search";
		WebDriver driver = null;

		if (Browsers.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (Browsers.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\WebDriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		//adding this comments to add to git
		driver.get("http://google.com");
		driver.findElement(By.xpath(constants.TEXT_BOX_XPAHT)).sendKeys("book",
				Keys.ENTER);
		Assert.assertEquals(driver.getTitle(), title);
		System.out.println(driver.findElement(
				By.xpath(constants.CLICK_FIRST_LINK)).getText());
		
		
		driver.quit();

	}

}

package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	WebDriver driver= new ChromeDriver();
	
	@BeforeSuite

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver_win32\\chromedriver.exe");

	}
	
	@AfterSuite
	
	public void closeBrowser() {
		
		driver.close();
	}

}

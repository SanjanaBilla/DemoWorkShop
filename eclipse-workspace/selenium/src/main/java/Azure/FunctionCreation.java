package Azure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class FunctionCreation {
	
	@Test
	
	public void FunctionApp() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	WebElement tvandappliances= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[2]"));
	
	
	
	Actions actions= new Actions(driver);
	
	actions.moveToElement(tvandappliances).perform();
	
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[2]/a[1]")).click();
	
	//actions.moveToElement(washingmachine).perform();
	
	//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("sanjana95");
	
	//driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
	
	
	

}
}

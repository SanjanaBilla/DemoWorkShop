package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkartautosuggestion {
	
	@Test
	
	public void validation() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Chromedriver_win32\\chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/bank-terms-and-conditions-store");
		 
		Thread.sleep(2000);
		 
		 //WebElement searchbar= driver.findElement(By.xpath("//input[@type='text']"));
		// searchbar.sendKeys("mobiles");
		// searchbar.sendKeys(Keys.ARROW_DOWN);
		// searchbar.sendKeys(Keys.ENTER);
		 
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]"));
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[1]")).click();
	       
	}

}

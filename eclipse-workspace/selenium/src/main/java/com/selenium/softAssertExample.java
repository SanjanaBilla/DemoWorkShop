package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class softAssertExample {
	
	@Test
	
	public void Pagevalidation() {
		
		SoftAssert softassert= new SoftAssert();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		String expectedTitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedText= "Search";
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.ebay.com/");
		
		String ActualTitle= driver.getTitle();
	softassert.assertEquals(ActualTitle, expectedTitle);
		System.out.println("Title validation Successfull");
		
		String ActualText= driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		softassert.assertEquals(ActualText, expectedText);
		System.out.println("Text validation Successfull");
		
	
		
		driver.close();
		System.out.println("Browser closed");
		
		softassert.assertAll();
		
		
		
		
	}

}

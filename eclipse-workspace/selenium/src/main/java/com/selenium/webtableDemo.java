package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class webtableDemo {
	
	@Test
	
	public void ReadTable() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
		//JavascriptExecutor je= (JavascriptExecutor)driver;
		//je.executeScript("scroll(0,300)");
		
		Thread.sleep(1000);
		
		String element= driver.findElement(By.xpath("//*[@class=\"tsc_table_s13\"]/tbody/tr[1]/td[3]")).getText();
		System.out.println(element);
		
		String element2= driver.findElement(By.xpath("//*[contains(text(),'Mecca')]")).getText();
		
		System.out.println(element2);	
				
		
		
		
		
		 driver.close();
		
	}

}
//*[@id="customers"]/tbody/tr[2]/td[3]
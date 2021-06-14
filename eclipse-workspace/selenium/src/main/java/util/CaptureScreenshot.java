package util;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


import common.BaseTest;

public class CaptureScreenshot extends BaseTest{
	
	 
	
	

	public void getScreenshot() throws IOException{
		
		Date currentdate= new Date(0, 0, 0);
		
		String screenshotfilename = currentdate.toString().replace("", "-").replace(":","-");
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot//"+screenshotfilename+".png"));
		
	}

}

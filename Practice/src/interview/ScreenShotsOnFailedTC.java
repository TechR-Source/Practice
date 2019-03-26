package interview;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;

public class ScreenShotsOnFailedTC {

	

		
		//Another way of capturing screenshot of failed test cases using Selenium WebDriver is to use ITestResult Interface.
		//ITestResult interface provides the test case execution status and test case name
		
	
		WebDriver driver = new ChromeDriver();
		
		public void screenshot(ITestResult result) throws IOException{
			
			if(ITestResult.FAILURE==result.getStatus()){
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(src, new File("d://error.png"));
				
					
				}
			}
			
		}
		



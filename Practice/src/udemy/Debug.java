package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Debug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/"); //Run as "Debug As"   - Click Resume to run till next toggle breakpoint
												  // Click Step Over to execute the next line
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dd = new Select(ele);   // We should pass into the select class
		dd.selectByIndex(2);
		dd.selectByValue("USD");
		dd.selectByVisibleText("INR");
		debugValidation(driver);   //Step into for moved to the next method
		
	}
	
	//Step into option
	
	public static void debugValidation(WebDriver driver){   // This is the separate method for debug validation when hit next int
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select dd = new Select(ele);   // We should pass into the select class
		dd.selectByIndex(2);
		dd.selectByValue("USD");
		dd.selectByVisibleText("INR");
		
	
	}

}

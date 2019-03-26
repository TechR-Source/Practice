package interview;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;

public class Clicks {


	
	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	
	
	//Direct Way:
	driver.findElement(By.xpath("(//input[@name='btnI'])[2]")).click();
	
	
	Thread.sleep(3000);
	//JavascriptExecutor:
		WebElement eleClk = driver.findElement(By.id("archive-link")); 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", eleClk);
		
		
	Thread.sleep(3000);
	//Actions Class:
		WebElement eleMovClk = driver.findElement(By.id("logo"));
		Actions act = new Actions(driver);
		act.moveToElement(eleMovClk).click();
		
		
	Thread.sleep(3000);
	//SendKeys
	driver.findElement(By.xpath("//*[contains(text(),'About')]")).sendKeys(Keys.ENTER);    //Keys.ENTER or Keys.RETURN
	
	
		
		
		
	
	
	}
	
}
		



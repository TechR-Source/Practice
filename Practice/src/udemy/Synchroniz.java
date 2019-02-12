package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.expedia.co.in/");
		
		driver.findElement(By.xpath("(//input[contains(@class,'clear-btn-input')])[7]")).sendKeys("Alaska"); // Dynamically chaning xpath
		driver.findElement(By.xpath("(//input[contains(@class,'clear-btn-input')])[7]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//input[contains(@class,'clear-btn-input')])[7]")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[@class='btn-primary btn-action  gcw-submit']")).click();
		
	
		WebDriverWait waitExp = new WebDriverWait(driver, 5);
		waitExp.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='flex-link'])[1]")));
				
		driver.findElement(By.xpath("(//a[@class='flex-link'])[1]")).click();
		
		
		
			
		
	}
}
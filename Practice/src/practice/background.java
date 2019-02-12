/*package practice;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class background {


	public static void main(String[] args) {
	
   
		System.setProperty("webdriver.chrome.driver","F:/RK/Automation/Selenium/Selenium_Library_Files/Drivers/Chrome/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.guru99.com");
		
		WebElement Link = driver.findElement(By.linkText("Testing"));
		WebElement bg_clr = driver.findElement(By.xpath("//*[@href='/software-testing.html']"));
		System.out.println("bg_clr is passed");
		
		
		
		// Creating Action driver:
		Actions builder = new Actions(driver);
		Action mouseOverHome =	builder.moveToElement(Link).build();
		
		
		String clr = bg_clr.getCssValue("Bg color");
	
		System.out.println("Before Hover: " + clr);
		
		mosueOverHome.perform();
		
		clr = bg_clr.getCssValue("Aft Color");
		System.out.println("After Hover: " + clr);

		
		
		
	
		
	}

}
*/
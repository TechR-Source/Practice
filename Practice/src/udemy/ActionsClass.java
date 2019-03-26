package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Actions actDemo = new Actions(driver);
		WebElement acc = driver.findElement(By.id("nav-link-accountList"));
		actDemo.moveToElement(acc).build().perform();
		
		
		
		
		//Search field
		WebElement src = driver.findElement(By.id("twotabsearchtextbox"));
		
		// Enter the keys in uppercase 
		actDemo.moveToElement(src).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		src.clear();
		
		//Double click action
		actDemo.moveToElement(src).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		//RightClick
		actDemo.moveToElement(acc).contextClick().build().perform();
		
		//DragandDrop 
		
		
		
	}
		
		

}

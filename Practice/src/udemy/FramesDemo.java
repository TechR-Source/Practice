package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		WebElement iframeLocator = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); //iFrame
		driver.switchTo().frame(iframeLocator);   // Switching to frame
		//driver.switchTo().frame(0);    // Find the frame with index concept
		Actions dragDrop = new Actions(driver);    // Actions class for drag and drop
		WebElement source = driver.findElement(By.id("draggable")); 
		WebElement target = driver.findElement(By.id("droppable"));
		dragDrop.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent(); // defaultContent for switching back to the previous block
	
	
		/*
		 * 
		 * 
		 */
	
		
	}
}

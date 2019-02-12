package selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TargetBay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://dev.targetbay.com");
		driver.findElement(By.id("email")).sendKeys("support@targetbay.com");
		driver.findElement(By.id("password")).sendKeys("Targetbay16");
		driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary btn-block btn-signin']")).click();
		driver.findElement(By.xpath("//button[@class='popup-close']")).click();
		driver.findElement(By.xpath("(//span[@class='tb-menu-link'])[6]")).click();
		driver.findElement(By.xpath("(//span[@class='tb-menu-link'])[7]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class='tb-button pull-right'])")).click();
		driver.findElement(By.xpath("(//a[@class='tb-button'])[1]")).click();
		Thread.sleep(5000);
		WebElement draggable = driver.findElement(By.xpath("(//div[@class='lyrow dragitem header-three ui-draggable ui-draggable-handle'])"));
		WebElement droppable = driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-down']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, droppable).perform();
				
		
	}
}

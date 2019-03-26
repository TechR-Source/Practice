package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiversSuppplyDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.divers-supply.com");
	Thread.sleep(5000);
	/*driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
	Thread.sleep(4000);
	JavascriptExecutor scrollDown = (JavascriptExecutor) driver;
	scrollDown.executeScript("window.scrollBy(0,100)");
	Thread.sleep(6000);*/
	/*driver.findElement(By.xpath("(//a[contains(text(),'Sign In')])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='login[username]']")).sendKeys("rajeshkumar.r@innoppl.com");
	driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("Testinno_qa");
	driver.findElement(By.className("action login primary")).click();*/
	driver.findElement(By.xpath("(//*[contains(text(),'Swim')])[1]")).click();
	driver.findElement(By.xpath("//a[@title='Swim Caps']")).click();
	driver.findElement(By.xpath("(//a[@class='product-item-link'])[1]")).click();
	driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
	driver.findElement(By.xpath("//a[@class='action showcart']")).click();
	driver.findElement(By.xpath("//a[@class='action viewcart']")).click();
	driver.findElement(By.xpath("(//button[@class='action primary checkout'])[2]")).click();
	Thread.sleep(3000);
	/*driver.findElement(By.xpath("(//input[@class='input-text'])[3]")).sendKeys("rajeshkumarqa.r@innoppl.com");
	driver.findElement(By.id("SWHHKNU")).sendKeys("Rajesh");
	driver.findElement(By.id("SX3YM7U")).sendKeys("Kumar");
	driver.findElement(By.id("EFQAR3L")).sendKeys("3400 peachtree road");
	driver.findElement(By.id("JITLWB9")).sendKeys("Atlanta");
	driver.findElement(By.id("M7RT1HM")).sendKeys("60003");
	*/
	
	
	
	
	
	
	
	
	}

}

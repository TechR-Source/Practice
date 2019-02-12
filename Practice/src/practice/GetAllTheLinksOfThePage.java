package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetAllTheLinksOfThePage {

	public static void main(String[] args) throws InterruptedException {

		
		//String underConsTitle = "Scuba Gear at Divers-Supply 40 years in business!";
		/*System.setProperty("webdriver.chrome.driver", "D:/TL/Softwares and Videos/Path/Practice/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.divers-supply.com/");
		System.out.println(driver.getTitle());
		
		WebElement txt = driver.findElement(By.id("contentInformation"));
		System.out.println(txt.getText());
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
		*/
		
		/*List<WebElement> linkText = driver.findElements(By.tagName("a"));		
		System.out.println("Total links found in the home page is "+linkText.size());
		
		
		for (WebElement webElement : linkText) {
	        System.out.println(webElement.getText());
	
		
				
	}*/

		System.setProperty("webdriver.chrome.driver", "z");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.divers-supply.com/");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
		
		WebElement ele = driver.findElement(By.xpath("(//a[@class='nav-a relative-level1 level-top nav-a-with-toggler nav-a-level0'])[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();
		WebElement el = driver.findElement(By.xpath("//a[@class='nav-a relative-level1 nav-a-level1 over']"));
		act.click(el).build().perform();
		
		
		

}}
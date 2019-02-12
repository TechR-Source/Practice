package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		
		
		
		System.setProperty("webdriver.chrome.driver", "D:/TL/Softwares and Videos/Path/Practice/driver/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.divers-supply.com/scuba-gear/bags-apparel/stahlsac-mesh-duffle-yellow-22inch.html");
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click(); //Xpath
		driver.findElement(By.id("product-addtocart-button")).click();                      // Id
		driver.findElement(By.xpath("//a[@class='top-link-cart']")).click();               
		driver.findElement(By.linkText("Checkout")).click(); 								//Linktext
		//driver.findElement(By.xpath("//a[@class='top-link-checkout']")).click();
		driver.findElement(By.name("billing[firstname]")).sendKeys("Test");					//Name
		driver.findElement(By.className("input-text")).sendKeys("Innoppl");					//Class Name
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//Tag name will be used when to fetch all the links in the page:
		
		List<WebElement> linkText = driver.findElements(By.tagName("a"));		
		System.out.println("Total links found in the home page is "+linkText.size());
		
		for (WebElement webElement : linkText) {
			System.out.println(webElement.getText());
			
		}
		
		//CSS Selector 
	
		

		
	}

}

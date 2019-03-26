package interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderVlaue {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.findElement(By.xpath("//input[@name='q']")).getAttribute("placeholder"));
		
	}

}

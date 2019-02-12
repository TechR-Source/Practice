package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DSLogin {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {

		/*
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		URL url = new URL("http://localhost:4444/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		*/
		
		System.setProperty("webdriver.chrome.driver", "D:/TL/Softwares and Videos/Path/Practice/driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.divers-supply.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='targetbay_close targetbay_close_center']")).click();
		//Log in
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.xpath("//button[@title='Create an Account']")).click();
		driver.findElement(By.id("firstname")).sendKeys("Test");
		driver.findElement(By.name("lastname")).sendKeys("Data");
		driver.findElement(By.id("email_address")).sendKeys("testdata@test.com");
		driver.findElement(By.id("password")).sendKeys("testdata");
		driver.findElement(By.id("confirmation")).sendKeys("testdata");
		driver.findElement(By.xpath("//button[@title='Submit']")).click();
		System.out.println(driver.getTitle());
	}
 
}

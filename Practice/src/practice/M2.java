package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class M2 {

	public static void main(String[] args) {

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qc-compressorpartsnewm2.enterpriseapplicationdevelopers.com/admin/admin/");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("login")).sendKeys("admin@123");
		driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		
		
	}
}

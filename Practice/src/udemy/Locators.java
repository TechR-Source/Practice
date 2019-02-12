package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


	System.setProperty("webdriver.chrome.driver", "D:/TL/BrowserDrivers/Chrome/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://www.google.com");
	driver.get("http://127.0.0.1/m2ksk/");
	System.out.println(driver.getTitle());
	
	/*//Parent - Child Relationship
	driver.findElement(By.xpath("//div[@id='gbw']/div/div/div/div/a")).click();
	
	//Xpath - //tagname[@attribute='value']
	driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
	
	Thread.sleep(3000);
	//CSS Selector
	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("TestData");
	
	}*/

}}
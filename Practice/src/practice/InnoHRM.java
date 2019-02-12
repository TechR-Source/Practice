 package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InnoHRM {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:/TL/Softwares and Videos/Path/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://innohrm.innoppl.in");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='Close']")).click();
		driver.findElement(By.id("email")).sendKeys("rajeshkumar.r@innoppl.com");
		driver.findElement(By.id("password")).sendKeys("Ralorajesh");
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//span[@class='iconfa-calendar']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@href='https://innohrm.innoppl.in/itsupport/ticket_list']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-rounded']")).click();

		Select YourTeam = new Select(driver.findElement(By.id("r_team")));
			YourTeam.selectByVisibleText("Testing");
		Select Type = new Select(driver.findElement(By.id("r_type")));
		Type.selectByIndex(1);
		Select Priority = new Select(driver.findElement(By.id("priority")));
		Priority.selectByIndex(2);
		Thread.sleep(3000);	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		
	}

}

package udemy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("alertbtn")).click();
		//driver.switchTo().alert().accept();
		String txt = driver.switchTo().alert().getText();
		System.out.println(txt);
		
		
		
		
	//driver.switchTo().alert().accept();
	//driver.switchTo().alert().dismiss();
	//driver.switchTo().alert().getText();
		//driver.switchTo().alert().sendKeys("");
	
	}

}

package udemy;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
		driver.findElement(By.id("openwindow")).click();
		System.out.println("Before Switching = " + driver.getTitle());
		
		Set<String> strWin = driver.getWindowHandles();
		Iterator<String> it = strWin.iterator();
		

	/*	
		String parWin = it.next();
		String childWin = it.next();
		driver.switchTo().window(childWin);
		System.out.println("After Switching" + driver.getTitle());
		driver.switchTo().window(parWin);
		System.out.println("Come back again to the parent = "+driver.getTitle());*/
		
		
	}

}

package udemy;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date dt = new Date();
		String str =  dt.toString();
		System.out.println(str);
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		//While loop - if the condition is true then only it will go inside other it will failed so that keep the negation
		
		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May")) {            	
		driver.findElement(By.cssSelector("[class='datepicker-days'] 	[class='next']")).click();
		}	
				
		// To print all the date of the month		
		List<WebElement> lst = driver.findElements(By.className("day"));
		for (WebElement webElement : lst) {
			System.out.println(webElement.getText());	
		}
		
		int dCount = driver.findElements(By.className("day")).size();
		for (int i = 0; i < dCount; i++) {
		String actText = driver.findElements(By.className("day")).get(i).getText();	
			
			if (actText.equalsIgnoreCase("15")) {
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
			
			
		}	
		
	}

}

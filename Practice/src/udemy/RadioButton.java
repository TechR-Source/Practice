package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
		int ddCount = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
		System.out.println(ddCount);
		for (int i = 0; i < ddCount; i++) {
			
			//driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
			String txt = driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value");
			
			if (txt.equals("RoundTrip")) {
				
				
				driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).click();
				
				
				
			}
		}System.out.println("Executed Successfully");
	
	
	}

}

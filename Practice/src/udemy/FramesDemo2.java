package udemy;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo2 {

	public static void main(String[] args) {
		
		

			

				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
			
				//Maximize the browser
				driver.manage().window().maximize();
				
				//Wait for 30 sec
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				//Launch URL
				driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
				System.out.println("Site has been launched");
				
				try {
					driver.switchTo().frame(driver.findElementByXPath("//*[@class='ui-layout-north ui-layout-pane ui-layout-pane-north']"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 ///html/body/iframe[1]
			
				List<WebElement> count = driver.findElementsByTagName("iframe");
				 System.out.println(count.size());
				 driver.switchTo().frame("/html/body/iframe[2]");
				 driver.findElementByLinkText("a").click();
				 
				 	
				/*int totalCount = driver.findElementsByTagName("iframe").size();
				System.out.println(totalCount);
				*/
				/*for (int i = 0; i <=totalCount; i++) {
					driver.switchTo().frame(i);
					List<WebElement> clk = driver.findElementsByXPath("/html/body/div[1]/iframe");
					
					System.out.println(clk.size());*/
					//driver.switchTo().defaultContent();
				
				/*	
				driver.switchTo().parentFrame();
				List<WebElement> totalCount = driver.findElementsByTagName("iframe");
				System.out.println(totalCount.size());

				for (WebElement moveToOtherFrame: totalCount) {
					driver.switchTo().frame(moveToOtherFrame);
					driver.getTitle();
					
				}
			
		}*/


	}
}

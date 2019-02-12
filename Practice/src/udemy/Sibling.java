package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


				System.setProperty("webdriver.chrome.driver", "D:/TL/BrowserDrivers/Chrome/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://qaclickacademy.com");
				Thread.sleep(3000);
				driver.findElement(By.linkText("Interview Guide")).click();
				System.out.println("Element is clickable");
				
				//Sibling concept
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id='tablist1-tab1']")).click();
				Thread.sleep(3000);
				System.out.println("Appium");
				driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
				Thread.sleep(3000);
				System.out.println("Selenium");
				driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
				Thread.sleep(3000);
				System.out.println("SoupUI");
				driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
				System.out.println("Testing");
				
	
				//Form child to parent : syntax- //*[@id='tablist1-tab1']/parent::ul
				
				// Find the xpath with the text -	//*[text()=' Selenium '] 
				
				
				/*
				 driver.get("http://www.qaclickacademy.com/interview.php");
				driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

				driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

				System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
				
				 */
				
				
				
				
	}

}

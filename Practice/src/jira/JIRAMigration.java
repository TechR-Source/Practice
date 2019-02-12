package jira;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JIRAMigration {


	public static void main(String[] args) throws InterruptedException{
		
	
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://innoppl.atlassian.net");
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("srinivasan.d@innoppl.com");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//input[@class='sc-iAyFgw jsqFeE']")).sendKeys("atlassian");
		driver.findElement(By.id("login-submit")).click();
		
		
		driver.findElement(By.xpath("(//*[text()='Projects'])[1]")).click();
		
		driver.findElement(By.xpath("//*[text()='SouthernParts']")).click();
		
		//int  tickCount = driver.findElements(By.xpath("//*[@class='sc-bZVNgQ iKgqvf']")).size();
		int  tickCount = driver.findElements(By.xpath("//*[@class='sc-dCzMmV ieExMf']")).size();
		System.out.println("Total tickets are = "+tickCount);
		
		for (int i = 0; i <tickCount; i++) {
			driver.findElements(By.xpath("//*[@class='sc-dCzMmV ieExMf']")).get(i).click();
			
			driver.findElement(By.xpath("(//*[@class='sc-jlyJG jEAPvb'])[3]")).click();
			driver.findElement(By.xpath("//*[contains(text(),'Move')]")).click();
			
			WebElement strPro =  driver.findElement(By.xpath("//input[@id='project-field']"));
			strPro.sendKeys("SPECO Maintenance (SPCO)");
			strPro.sendKeys(Keys.ENTER);
					
			String str = driver.findElement(By.xpath("(//*[@class='nowrap'])[5]")).getText();
			System.out.println(str);
			driver.findElement(By.xpath("//input[@id='issuetype-field']")).sendKeys(str);		
			driver.findElement(By.id("next_submit")).click();
			
			String curStatus = driver.findElement(By.xpath("(//*[contains(text(),'In Progress')])[1]")).getText();
			System.out.println("Current Status is = "+ curStatus);
			
			int  newStDD = driver.findElements(By.xpath("//select[@name='beanTargetStatusId']")).size();
			WebElement newStatus = driver.findElement(By.xpath("//select[@name='beanTargetStatusId']"));
			String newSta = newStatus.getText();
					
			for (int j = 0; j <newStDD; j++) {
				if (curStatus.equalsIgnoreCase(newSta)) {
					driver.findElements(By.xpath("(//*[@class='nowrap'])[2]")).get(j).click();
				}	else if (curStatus.equalsIgnoreCase("TO DO"))  {
					WebElement newSt = driver.findElement(By.xpath("//select[@name='beanTargetStatusId']"));
					Select newStat = new Select(newSt);
					newStat.selectByVisibleText("Backlog");					
					
				} else if (curStatus.equalsIgnoreCase("In Progress")) {
					WebElement newStatu = driver.findElement(By.xpath("//select[@name='beanTargetStatusId']"));
					Select newStat = new Select(newStatu);
					newStat.selectByIndex(2);
					
				}
					
						
			}
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='next_submit']")).click();		
				driver.findElement(By.xpath("//input[@name='Next >>']")).click();
				driver.findElement(By.xpath("//input[@id='move_submit']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//a[@class='css-1t5na7c'])[2]")).click();
				Thread.sleep(3000);
			
			
		}
			
		
	}
}

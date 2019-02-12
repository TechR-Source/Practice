package udemy;

import java.awt.List;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FramesRunTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
	    int fraSize = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames =" + fraSize);
	    
		// prints the total number of frames 
		driver.switchTo().frame(0); // Switching the Outer Frame    		
	    System.out.println (driver.findElement(By.id("frame1")).getText()); 
	

		//Printing the text in outer frame
		int size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
                                                                                                          
	    System.out.println("Total Frames --" + size);
	    driver.switchTo().frame(0); // Switching to innerframe
	    System.out.println(driver.findElement(By.xpath("iframe")).getText());
		
		//Printing the text in inner frame
		driver.switchTo().defaultContent();
	    
	    WebElement frameEle = driver.findElement(By.id("frame2"));
	    
	    driver.switchTo().frame(frameEle);
	    WebElement ele = driver.findElement(By.id("animals"));
	    Select slt = new Select(ele);
	    slt.selectByIndex(1);
	    
	    	
	    	
		
	
	
	}
	
}

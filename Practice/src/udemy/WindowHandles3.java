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

public class WindowHandles3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.get("http://demo.guru99.com/popup.php");			  
		    driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();			
		        		
		        
		    
		    	String mainWindow=driver.getWindowHandle();		
		    	 	
		        // To handle all new opened window.				
		        Set<String> winMul=driver.getWindowHandles();		
		        Iterator<String> it=winMul.iterator();		
		        
		        
		        		
		        while(it.hasNext())			
		        {		
		            String childWindow=it.next();	
		      
		         
		            		
		            if(!mainWindow.equalsIgnoreCase(childWindow))			
		            {    		
		                   // Switching to Child window
		                    driver.switchTo().window(childWindow);	                                                                                                           
		                    driver.findElement(By.name("emailid")).sendKeys("testdata@test.com");                			
		                    driver.findElement(By.name("btnLogin")).click();			
		                                 
					// Closing the Child Window.
		                        //driver.close();		
		            }		
		        }		
		        // Switching to Parent window i.e Main Window.
		            driver.switchTo().window(mainWindow);				
		    }

}

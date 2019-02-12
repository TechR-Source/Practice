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

public class WindowHandles4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://qaclickacademy.com/practice.php");
	

		String parWin = driver.getWindowHandle();
		System.out.println("Parent window is Id is  = " + parWin);
		System.out.println("Parent window Tab Name is = " + driver.getTitle());
		
		
		System.out.println("All the links in the page =  "+driver.findElements(By.tagName("a")).size());	
		
		// 2
		WebElement footerLinks = driver.findElement(By.id("gf-BIG"));
		System.out.println("Links from the footer = "+footerLinks.findElements(By.tagName("a")).size());
		
		// 3
		int szFooterClm = footerLinks.findElements(By.xpath("//table/tbody/tr/td/ul")).size();
		System.out.println("Links from the Paticular column  = " + szFooterClm);

		for (int i = 1; i < szFooterClm; i++) {

			String clickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			footerLinks.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);

		}
		
			
			Set<String> chlWin = driver.getWindowHandles();
			//Iterator<String> it= chlWin.iterator();
		
		    
		for (String string : chlWin) {
			driver.switchTo().window(string);
			String pgeTitle = driver.getTitle();

			if (pgeTitle.equalsIgnoreCase("The World's Most Popular API Testing Tool | SoapUI")) {
				driver.findElement(By.xpath("//a[@class='nav navbar-nav navbar-right secondary CMSListMenuLink']")).click();
				System.out.println(driver.getTitle());
				break;
				
			}

		}
		
	}
	
}
		
	           
	            
	       //---------------------------Method----------------------------------- 
	       
	            		
			/*ArrayList<String> allWin = new ArrayList<>(chlWin); 	//Convert set into list to switch into the particular window
			allWin.get(0);
			allWin.get(1);*/
			
			//Iterator<String> it= chlWin.iterator();
		/*	String win1 =it.next();
			String win2 = it.next();
			String win3 = it.next();
			driver.switchTo().window(win2);
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//img[@class='img-fluid img-responsive center-block']")).click();*/
				
	        
			
	

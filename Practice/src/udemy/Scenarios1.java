package udemy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenarios1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scenarios:
		// 1. Get all the links in the page
		// 2. Get the links only in the footer
		// 3. Get the links only in the particular column
		// 4. Print all the windows/tab title
		
		
		// 1
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qaclickacademy.com/practice.php");
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
		// 4
		Set<String> str = driver.getWindowHandles();
		Iterator<String> it = str.iterator();

		while (it.hasNext()) { 					// hasNext helps to check whether any other window is found
				String chWin = it.next();
				
			driver.switchTo().window(chWin);     // next helps to move to the next window/tab
			System.out.println(driver.getTitle());
			
			

		}

	}

}



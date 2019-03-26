package udemy;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.compressorparts.com/");
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int cntLinks = links.size();
		System.out.println("Total links are = " + cntLinks);
		Iterator<WebElement> it = links.iterator();
		
		while(it.hasNext()){
			String url = it.next().getAttribute("href");
			System.out.println("Current URl =" + url);
			
			if (url == null || url.isEmpty()) {
				System.out.println("Url is not found = "+url);		
			}
		}		
	}

}

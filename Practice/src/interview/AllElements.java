package interview;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllElements {
	
	
	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		List<WebElement> allEle = driver.findElements(By.xpath("//a"));
		System.out.println(allEle.size());
		
		/*//int i=0;
		for (WebElement webElement : allEle) {
		//	i=i+1;
			System.out.println(webElement.getText());
			//System.out.println(webElement.getTagName());
		}*/
		
		

	}
	

}

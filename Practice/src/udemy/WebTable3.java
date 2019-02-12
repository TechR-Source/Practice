package udemy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {

	public static void main(String[] args) {

		

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/20307/aus-vs-ind-3rd-odi-india-tour-of-australia-2018-19");
		
		WebElement table = driver.findElement(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
		
		/*List<WebElement> table2 = driver.findElements(By.xpath("(//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr'])[1]"));
		for (WebElement string : table2) {
			System.out.println(string.getText());
			
		}*/
		
		
		//Subsection Element 
		int cntSize = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		for (int i = 0; i <cntSize-2; i++) {

			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(1)")).get(i).getText());
			
			
			
		}
	}
		
		
		
	}
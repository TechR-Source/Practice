package udemy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		
		
		List<WebElement> rowTotal = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		int cntRow = rowTotal.size();
		System.out.println(cntRow);
		
		for (WebElement webElement : rowTotal) {
		System.out.println(webElement.getText());
		
		
		
		}
	}
}

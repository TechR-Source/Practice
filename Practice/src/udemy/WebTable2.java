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
		
	/*	WebElement table = driver.findElement(By.className("dataTable"));
		
		List<WebElement> allRows = table.findElements(By.tagName("tr")); 

		// And iterate over them, getting the cells 
		for (WebElement row : allRows) { 
		    List<WebElement> cells = row.findElements(By.tagName("td")); 

		    // Print the contents of each cell
		    for (WebElement cell : cells) { 
		        System.out.println(cell.getText());
		    }
		}*/
		
		
		
		}
	}
}

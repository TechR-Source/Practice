package udemy;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		/*WebElement ele = driver.findElement(By.xpath("//*[@id='content']/table"));
		
		List<WebElement>rows = ele.findElements(By.tagName("tr"));
		
		//Row Count
		System.out.println("Row count is = " +rows.size());  	
		
		//entered into first row
		WebElement firstRow = rows.get(1);
		
		List<WebElement> columns = firstRow.findElements(By.tagName("td"));
	
		System.out.println("Column count is = "+columns.size());
	
		
		System.out.println(columns.get(0).getText());
		//System.out.println(columns.get(1).getText());
		//System.out.println(columns.get(2).getText());
		//System.out.println(columns.get(4).getText());
*/		
		
		//--------------------Print the header ----------------------------------------
		List<WebElement> eleHead = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr"));
		int cInt = eleHead.size();
		System.out.println(cInt);
		for (WebElement hCol : eleHead) {
			System.out.println(hCol.getText());
		}
		
		for (int i = 0; i <=cInt; i++) {
			WebElement auName = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td[2]"));
			if (auName.getText().equalsIgnoreCase("Mecca")) {
				WebElement country = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td[1]"));
				System.out.println(country.getText());
				
			}
			
		}
		
		
		
		//--------------------number of columns----------------------------------------
		
			
		/*for (int i = 0; i <= cInt; i++) {
			List<WebElement> colCnt = driver.findElements(By.xpath("//table[@summary='Sample Table']/tbody/tr["+i+"]/td"));
			System.out.println(colCnt.size());
			
			
		}*/
		
		
		
		
		
	}

}

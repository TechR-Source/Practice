package udemy;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
	
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();		
				driver.manage().window().maximize();
				driver.get("https://erail.in/");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementById("txtStationFrom").clear();
				driver.findElementById("txtStationFrom").sendKeys("MS",Keys.TAB);
				driver.findElementById("txtStationTo").clear();
				driver.findElementById("txtStationTo").sendKeys("SCT",Keys.TAB);
				
				WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList']");
				
				List<WebElement>rows = table.findElements(By.tagName("tr"));
				
				for (WebElement webElement : rows) {
					System.out.println(webElement.getText());
				}
				
				/*for(int i=0; i<rows.size(); i++){
					String ele = table.findElements(By.tagName("tr")).get(i).getText();
					System.out.println("The first " + i + "row values is "+ ele);
				}*/
				
				
				
				
				/*//Row Count
				System.out.println("Row size is = "+rows.size());
				
				//entered into first row
				WebElement firstRow = rows.get(0);
				
				List<WebElement> columns = firstRow.findElements(By.tagName("td"));
			
				System.out.println("Column size is = "+columns.size());
				
				System.out.println("1st Cell Value is = "+columns.get(0).getText());
				System.out.println("2nd Cell value is = "+columns.get(1).getText());
				System.out.println(rows.get(2).getText());
			}*/
	}}



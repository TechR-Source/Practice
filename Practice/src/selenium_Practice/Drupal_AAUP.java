package selenium_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drupal_AAUP {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://inhighereddev.prod.acquia-sites.com/aaup-compensation-survey");
		driver.findElement(By.xpath("//*[contains(text(),'ASSOCIATE PROFESSORS ')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='edit-institution-name']")).sendKeys("Auburn University");
		Thread.sleep(5000);
		JavascriptExecutor sd = (JavascriptExecutor) driver;
		sd.executeScript("window.scrollBy(0,200)");
 		
		String flePath = "C:/Users/innoppl/workspace/TargetBay/Drupal/data/TC001.xlsx";
		FileInputStream fle = new FileInputStream(flePath);
		//Workbook wb = Workbook.getWorkbook(fle);

			
			
			
		}
}
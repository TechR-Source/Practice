package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandleDealersPage{
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyundai.com/in/en/buy-a-car/find-a-dealer-and-website");
		
		FileOutputStream fleOut = new FileOutputStream("d:\\testdata1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sht = wb.createSheet();
		
	    XSSFRow row=null ;    
	    XSSFCell cell=null;
	    wb.setSheetName(0, "Testdata");
	    
	    row = sht.createRow(0);
	    row.createCell(0).setCellValue("Select A Dealer");
	    row.createCell(1).setCellValue("State");
	    row.createCell(2).setCellValue("City");
	    row.createCell(3).setCellValue("Total Dealers Count");
	    row.createCell(4).setCellValue("Name Of The Dealers");

			
		List<WebElement> dealerShipDD = driver.findElements(By.xpath("//select[@id='searchIdSelector']/option"));		
		try {
			int count=1;
			
			for (WebElement dShipVal : dealerShipDD) {
				if(!dShipVal.getText().contains("Select Dealership")){
					dShipVal.click();
					Thread.sleep(4000);
					String dealerShip =dShipVal.getText();
					
					List<WebElement> stateDD = driver.findElements(By.xpath("//select[@id='State']/option"));
					for(WebElement staDDVal : stateDD ){
						if(!staDDVal.getText().contains("Select a State")){
						staDDVal.click();
						Thread.sleep(4000);
						 String state = staDDVal.getText();
						 
						List<WebElement> cityDD = driver.findElements(By.xpath("//select[@id='City']/option"));
						
						
						for(WebElement cityDDVal : cityDD){
							if(!cityDDVal.getText().contains("Select a City")){
							cityDDVal.click();
							Thread.sleep(4000);
							String city = cityDDVal.getText();
							
							System.out.println("DealerShip Type = "+dShipVal.getText()+"- Select a State = " + staDDVal.getText() + "- Select a City = "+ cityDDVal.getText()  );
							
							Thread.sleep(4000);
							
							driver.findElement(By.xpath("(//button[@class='btn txt_white alignC'])[1]")).click();
							
							Thread.sleep(5000);
							
							int tolDeaCnt = driver.findElements(By.id("dealerCnt")).size();
							System.out.println("Total dealers count in the city is = " + tolDeaCnt);
							
							
							List<WebElement> totDea = driver.findElements(By.xpath("//span[@class='listT1']"));
							for (WebElement dealersList : totDea) {
								System.out.println("Dealers Name = "+dealersList.getText());
								String dealersLst = dealersList.getText();
							
							row = sht.createRow(count);
							row.createCell(0).setCellValue(dealerShip);
							row.createCell(1).setCellValue(state);
							row.createCell(2).setCellValue(city);
							row.createCell(3).setCellValue(tolDeaCnt);
							row.createCell(4).setCellValue(dealersLst);
							
							count++;
							if(count == 3)
							{
								wb.write(fleOut);
								System.exit(1);
							}
								
							}
							
							}
						}
					}
				}
			}
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		
	}

}

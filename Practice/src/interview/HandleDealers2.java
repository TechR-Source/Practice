package interview;

import java.io.File;
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


public class HandleDealers2 extends ExcelHand{
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyundai.com/in/en/buy-a-car/find-a-dealer-and-website");
		
		
		//ExcelHand exHand = new ExcelHand();
		
		
		
		List<WebElement> dShipVal = driver.findElements(By.xpath("//select[@id='searchIdSelector']/option"));
		List<WebElement> staDDVal = driver.findElements(By.xpath("//select[@id='State']/option"));
		List<WebElement> cityDDVal = driver.findElements(By.xpath("//select[@id='City']/option"));
		

			
		int dealerShipDD = driver.findElements(By.xpath("//select[@id='searchIdSelector']/option")).size();
		int StateDD = driver.findElements(By.xpath("//select[@id='State']/option")).size();
		int cityDD = driver.findElements(By.xpath("//select[@id='City']/option")).size();
		
		for(int i=0; i<dealerShipDD; i++){
			String dealVal = driver.findElements(By.xpath("//select[@id='searchIdSelector']/option")).get(i).getText();
			if(!dealVal.equalsIgnoreCase("Select Dealership")){
				driver.findElements(By.xpath("//select[@id='searchIdSelector']/option")).get(i).click();
			}
			
			
	
			for(int j=0; j<StateDD; j++){
				for(int k=0; k<cityDD; k++){
					

					

					
					//System.out.println("DealerShip Type = "+dShipVal.getText()+"- Select a State = " + staDDVal.getText() + "- Select a City = "+ cityDDVal.getText()  );
					
					Thread.sleep(4000);
					
					driver.findElement(By.xpath("(//button[@class='btn txt_white alignC'])[1]")).click();
					
					Thread.sleep(5000);
					
					int tolDeaCnt = driver.findElements(By.id("dealerCnt")).size();
					System.out.println("Total dealers count in the city is = " + tolDeaCnt);
					
					
					List<WebElement> totDea = driver.findElements(By.xpath("//span[@class='listT1']"));
					for (WebElement dealersList : totDea) {
						System.out.println("Dealers Name = "+dealersList.getText());
						String dealdersList = dealersList.getText();
					}
				}
			}
			
		}
		
		
		
		
		
		
		/*try {
			for (WebElement dShipVal : dealerShipDD) {
				if(!dShipVal.getText().contains("Select Dealership")){
					dShipVal.click();
					Thread.sleep(4000);
					String dealerShip =dShipVal.getText();
					
					exHand.hand();
					
				
		
					
					
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
								String dealdersList = dealersList.getText();
								
										
								
							}
							
							
							
							}
						}
					}
				}
			}
		}
			
		} catch (Exception e) {
			e.printStackTrace();
		}*/
	
		
	}

}

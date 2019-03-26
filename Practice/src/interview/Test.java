package interview;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class Test {
	public static void main(String[] args) throws IOException, InterruptedException {
			
			

			File src = new File("D:\\test.xlsx");
			FileInputStream fis = new FileInputStream (src);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			XSSFSheet sheet1= wb.getSheet("test");
			int rownum= sheet1.getLastRowNum()-sheet1.getFirstRowNum();
			for(int i=1; i<=rownum; i++)
			{
				String Client_name = sheet1.getRow(i).getCell(0).getStringCellValue();
				
				//String username = sheet1.getRow(i).getCell(0).getStringCellValue();
				String Email_id = sheet1.getRow(i).getCell(1).getStringCellValue();
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				Thread.sleep(2000);
				driver.manage().window().maximize();
				driver.get("https://app.targetbay.com/spark/kiosk");
				Thread.sleep(2000);
				driver.findElement(By.id("email")).sendKeys("contactus@targetbay.com");
				driver.findElement(By.id("password")).sendKeys("Targetbay@16");
				driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/button")).click();//click submit
				//driver.findElement(By.linkText("Product Reviews")).click();
				Thread.sleep(3000);
				
				/*driver.findElement(By.xpath("//span[@class='client-name-hold']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("(//i[@class='fa fa-cog'])[2]")).click();
				Thread.sleep(5000);*/
				
				driver.findElement(By.xpath("//a[@aria-controls='users']")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("kiosk-users-search")).sendKeys(Email_id);
				Thread.sleep(3000);
				driver.findElement(By.id("kiosk-users-search")).sendKeys(Keys.ENTER); //Press enter
				Thread.sleep(3000);
				driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("(//i[@class='fa fa-user-secret'])[2]")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"spark-app\"]/div[1]/div/div[1]/a/img")).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath("//button[@class='popup-close']")).click();
				Thread.sleep(2000);
				
				 WebElement element = driver.findElement(By.xpath("(//a[@class='dropdown-toggle main-menu'])[6]"));
				 
			        Actions action = new Actions(driver);
			        action.moveToElement(element).build().perform();
			        driver.findElement(By.linkText("Reviews")).click();			
				
				//Select drop = new Select(driver.findElement(By.xpath("(//a[@class='dropdown-toggle main-menu'])[6]")));
				Thread.sleep(4000);
				//hover over report and open reviews
				driver.findElement(By.linkText("Product Reviews")).click();
				//check if last 7 days is the default time
				//set date range
				Thread.sleep(3000);
				
				System.out.println(Client_name);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				String a = driver.findElement(By.xpath("(//h1[@id='workflowCount'])[1]")).getText();//Total email sent
				System.out.println(a + " Total email sent");
				
				String b = driver.findElement(By.xpath("(//span[@id='trigger-count'])[1]")).getText();//Reviews Collected
				System.out.println(b + " Reviews Collected");
				Thread.sleep(2000);
				
				js.executeScript("window.scrollBy(0,500)");
				
				String c = driver.findElement(By.xpath("//span[@id='clicks']")).getText();//Reviewed users
				System.out.println(c + " Reviewed users");
				
				String d = driver.findElement(By.xpath("(//h1[@id='workflowCount'])[2]")).getText();//Reviews collected from mail
				System.out.println(d +" Reviews collected from mail");
				
				String e = driver.findElement(By.xpath("(//span[@id='trigger-count'])[2]")).getText();//Reviews from widget
				System.out.println(e + " Reviews from widget");
				
				String f = driver.findElement(By.xpath("(//h1[@id='workflowCount'])[3]")).getText();//MAS opened
				System.out.println(f + " MAS opened");
				Thread.sleep(2000);
				WebElement Element = driver.findElement(By.xpath("//span[@class='client-name-hold']"));
				js.executeScript("arguments[0].scrollIntoView();", Element);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//span[@class='client-name-hold']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//i[@class='fa fa-sign-out m-r-10']")).click();
				Thread.sleep(2000);
				driver.close();
				
				XSSFSheet sheet2= wb.getSheet("MAS_details");
				sheet2.getRow(i).createCell(2).setCellValue(a);
				sheet2.getRow(i).createCell(3).setCellValue(b);
				sheet2.getRow(i).createCell(4).setCellValue(c);
				sheet2.getRow(i).createCell(5).setCellValue(d);
				sheet2.getRow(i).createCell(6).setCellValue(e);
				sheet2.getRow(i).createCell(7).setCellValue(f);
				FileOutputStream fout = new FileOutputStream(src);

				wb.write(fout);
			
			}
			
		
			
			
		}
	}




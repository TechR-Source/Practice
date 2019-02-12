package queries;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Solutions {

	public static void main(String[] args) throws IOException {

		File src = new File("D:/Selenium Query/25-09-2018/clients_pw.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1= wb.getSheet("MAS_details");
		int rownum= sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		
		for(int i=1; i<=rownum; i++)
		{
			String client = sheet1.getRow(i).getCell(0).getStringCellValue();
			String username = sheet1.getRow(i).getCell(1).getStringCellValue();
			//String password = sheet1.getRow(i).getCell(2).getStringCellValue();
			System.out.println(client);
			System.setProperty("webdriver.chrome.driver", "D:/TL/Browser Drivers/Chrome/21-6-18/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
		}
		
		
		
		
		//String data1 = sheet1.getRow(1).getCell(0).getStringCellValue();
		//System.out.println(data1);
	}

		
		
		
	}



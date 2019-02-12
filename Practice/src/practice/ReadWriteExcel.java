package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel {

	public static void main(String[] args) throws Exception {

		File src = new File("D:\\TL\\TestData\\Data.xlsx");
		
		FileInputStream fle = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fle);
		XSSFSheet sht = wb.getSheetAt(1);
		//int cnt = sht.getLastRowNum();
		//System.out.println(cnt);
		int cnt = sht.getLastRowNum();
		
		for (int i = 1; i <=cnt; i++) {
			System.out.println();
			
		}
		
		
		
		System.out.println(cnt);
		//System.out.println(str);
		
		/*String ele1 = sht.getRow(1).getCell(0).getStringCellValue();
		System.out.println(ele1);
		
		String ele2 = sht.getRow(1).getCell(1).getStringCellValue();
		System.out.println(ele2);
		*/
		

	}

	
	
	
}
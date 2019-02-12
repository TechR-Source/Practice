package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readwritexl {

	public static void main(String[] args) throws IOException {
		int n=2;
		// TODO Auto-generated method stub
			File src = new File("E:\\callme.xlsx");
			FileInputStream c=new FileInputStream(src);
			XSSFWorkbook wb =new XSSFWorkbook(c);
			XSSFSheet  sht= wb.getSheetAt(0);
   
			for(int i=0;i<=n;i++){	
				for(int j=0;j>=i;j++){
		    String a= sht.getRow(i).getCell(j).getStringCellValue();
		    System.out.println(a);}
				
			/*String b= sht.getRow(1).getCell(0).getStringCellValue();
			String e= sht.getRow(0).getCell(1).getStringCellValue();
			String d= sht.getRow(1).getCell(1).getStringCellValue();*/}
			
			//System.out.println(b);
			//System.out.println(e);
			//System.out.println(d);
	}

}

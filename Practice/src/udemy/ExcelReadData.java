package udemy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	public static void main(String[] args) throws IOException {

		
		/*
		FileInputStream fInp = new FileInputStream("E:\\callme.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fInp);
		XSSFSheet sht = wb.getSheetAt(0);
		
		sht.getRow(0).getCell(0).getStringCellValue();
		sht.getRow(0).getCell(1).getStringCellValue();*/
		
		
		FileInputStream fle = new FileInputStream("E:\\callme.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fle);
		int cnt =wb.getNumberOfSheets();
		
		for(int i=0; i<cnt; i++){
			if(wb.getSheetName(i).equalsIgnoreCase("Testcase")){
				XSSFSheet sht =wb.getSheetAt(i);
				Iterator<Row> rows = sht.iterator();
				Row firstRow = rows.next();
				
				Iterator<Cell> cells = firstRow.iterator();
				int col = 0;
				int column=0;
				
				while(cells.hasNext()){
					Cell value = cells.next();
					if(value.getStringCellValue().equalsIgnoreCase("Testcase")){
						column=col;
					}
					col++;
				}
				
				System.out.println(column);			//Print the column in the sheet for the given data
				
				//Moving into the identified column
				while(rows.hasNext()){
					Row curRow = rows.next();
					if(curRow.getCell(column).getStringCellValue().equalsIgnoreCase("Testcase")){
						
						Iterator<Cell> expRow = curRow.cellIterator();
						
						while(expRow.hasNext()){
							System.out.println(expRow.next().getStringCellValue());
							
							/*if(expRow.getCellTypeEnum()==CellType.STRING)
							{

							a.add(expRow.getStringCellValue());
							}
							else{

							a.add(NumberToTextConverter.toText(expRow.getNumericCellValue()));*/
						}
						
					}
				}
			}
			
			
			
			
		}
		
			
	}

}

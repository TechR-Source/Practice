package interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHand {


	public static void main(String[] args) throws IOException{
	
	FileOutputStream fleOut = new FileOutputStream("d:\\exceltestdata.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sht = wb.createSheet();
	
    XSSFRow r = null, titleRow=null ;    
    XSSFCell c = null, titleCell=null;
    wb.setSheetName(0, "Testdata");

    Object[][] datatypes = {
            {"Datatype", "Type", "Size(in bytes)"},
            {"int", "Primitive", 2},
            {"float", "Primitive", 4},
            {"double", "Primitive", 8},
            {"char", "Primitive", 1},
            {"String", "Non-Primitive", "No fixed size"}
    };
    
    titleRow = sht.createRow(0);
    titleRow.createCell(0).setCellValue("Datatype");
    titleRow.createCell(1).setCellValue("Type");
    titleRow.createCell(2).setCellValue("Size(in bytes)");
    
    for(int i=1; i<datatypes.length; i++) {
    	titleRow = sht.createRow(i);
        for(int j=0; j<datatypes[i].length; j++) {
        	titleRow.createCell(j).setCellValue(""+datatypes[i][j]);
        }
    }
    
//    r = sht.createRow(0);
//
//    for (int i = 0; i < 5; i++) {
//        c = r.createCell(i);
//        c.setCellValue("Test" + i);
//    }

    wb.write(fleOut);
	}
}


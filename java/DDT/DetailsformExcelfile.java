package DDT;

import java.io.FileInputStream;


//import java.io.FileNotFoundException;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DetailsformExcelfile {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/GetExcelData.xlsx");
		
		
		// get the access of workbook // 
		
		Workbook wb = WorkbookFactory.create(fis);
		
		// get the access of sheet // 
		
//		Sheet sh = wb.getSheet("GetExcelData");
		Sheet sh = wb.getSheetAt(0);
		
		// get the access of row //  
		
		 Row row  =  sh.getRow(1);	

		 System.out.println(row.getCell(0));
		 System.out.println(row.getCell(1)); 
		 System.out.println(row.getCell(2)); 
		 System.out.println(row.getCell(3)); 
		 
		 // get the access of cell // 
		 
		   Cell cell  = row.getCell(0);
		   
		  // get the data //  
		   
		 String value   =  cell.getStringCellValue();
		 System.out.println(value);
		   
		 wb.close();
		
		
		  
	}
}

package generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FileUtility {

	public String getdataFromJsonFile(String key)throws IOException, ParseException {
		
	
		FileReader Fr =  new FileReader("./src/test/resources/commondata.json");
	    
	     JSONParser 	parser =  new JSONParser();
	     Object obj = parser.parse(Fr);
	    
		JSONObject jobj = (JSONObject) obj;	
		
       String value = jobj.get(key).toString();
		
		return value;	
	}
	
	public String getdatafromexcelfile(String sheetname , int rowindex , int cellindex ) throws IOException{
		 
		FileInputStream fis = new FileInputStream("./src/test/resources/GetExcelData.xlsx");

		
        Workbook wb = WorkbookFactory.create(fis);
		
		
        Sheet sh = wb.getSheetAt(0);

        Row row = sh.getRow(rowindex);

        Cell cell = row.getCell(cellindex);

        String value = cell.getStringCellValue();

        wb.close();
		 
		 
		return value;
	}
		
}

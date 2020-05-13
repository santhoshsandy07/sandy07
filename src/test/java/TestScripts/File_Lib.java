package TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Lib {
	

	public String Fetchingdatafromproperty(String key) throws IOException {   //note pad for the fetching data
		// TODO Auto-generated method stub

		FileInputStream file = new FileInputStream("C:\\Users\\santhosh.ravikumar\\Desktop\\Eclipse\\CommonData.properties.txt");
        Properties probj = new Properties();
        probj.load(file);
        String value = probj.getProperty(key);
        return value;
	}

	public String FetchingdatafromExcel(String Sheet_name,int row_num,int cell_num) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\santhosh.ravikumar\\Desktop\\Eclipse\\Test_Data.xlsx");
		Workbook wb=WorkbookFactory.create(file);
		 Sheet sheet = wb.getSheet(Sheet_name);
		 Row row = sheet.getRow(row_num);
		 Cell cell = row.getCell(cell_num);
		 String data=cell.getStringCellValue();
		return data;
		
	}
	
	
	
}

package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public String ExcelSheet(String c, int a, int b, String d) throws EncryptedDocumentException, IOException
	{
	    FileInputStream file = new FileInputStream("C:\\Users\\subod\\git\\repository\\Sovereigncs\\Test Data\\Testdata.xlsx");
	    String value = WorkbookFactory.create(file).getSheet(c).getRow(a).getCell(b).getStringCellValue();
		return value;
		
	}
	
	public int ExcelSheet(String c, int a, int b, int d) throws EncryptedDocumentException, IOException
	{
	    FileInputStream file = new FileInputStream("C:\\Users\\subod\\git\\repository\\Sovereigncs\\Test Data\\Testdata.xlsx");
	    int value = (int) WorkbookFactory.create(file).getSheet(c).getRow(a).getCell(b).getNumericCellValue();
		return value;
		
	}

}

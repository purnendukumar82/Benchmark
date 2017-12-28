package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XL {
	public String getCellValue(String path, String sheet, int r, int c)
	{   String v1="";
		try {
		Workbook wb1 = WorkbookFactory.create(new FileInputStream(path));
		 v1=wb1.getSheet(sheet).getRow(r).getCell(c).toString();
	        }
		catch(Exception e)
		{
			
		}
		return v1;
		
	}
   
	public int getRowCount(String path,String sheet)
	{   
		int rc=0;
		try {
		Workbook wb2=WorkbookFactory.create(new FileInputStream(path));
		rc=wb2.getSheet(sheet).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
}

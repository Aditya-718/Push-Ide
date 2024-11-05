package Generic_Script_Pom;

import java.io.FileInputStream;

//import org.apache.poi.hwpf.model.FileInformationBlock;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Excel {
	
	public static String getData(String sheet,int cell,int row)
	{
		String val="";
		try
		{
			FileInputStream fis=new FileInputStream("./excel/f1.xlsx");
			Workbook wb=WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		val	=c.getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("Unable to fetch Data");
		}
		return val;
	}

}

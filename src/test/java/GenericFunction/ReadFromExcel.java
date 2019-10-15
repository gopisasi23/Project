package GenericFunction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	
	public static Map<String,String> Configuration= new Hashtable<String,String>();
	public static Map<String,String> UserDetails= new Hashtable<String,String>();

	public static void loaddata(String Filepath,String Filename,String Sheetname,int row) throws IOException {
		
		File file= new File(Filepath+Filename);
		FileInputStream fp= new FileInputStream(file);
		Workbook wb=null;
		String extn=Filename.substring(Filename.lastIndexOf("."));
		if(extn.equals(".xlsx")){wb=new XSSFWorkbook(fp);		}
		else if(extn.equals(".xls")){wb=new HSSFWorkbook(fp);	} 
		Sheet sh =wb.getSheet(Sheetname);
		int colCount=sh.getRow(0).getLastCellNum();	
		
		for (int i=0;i<colCount;i++) {
			String Header=sh.getRow(0).getCell(i).getStringCellValue().trim();
			String Value=sh.getRow(row).getCell(i).getStringCellValue().trim();	
			
			switch (Sheetname) {
			case "Configuration" : Configuration.put(Header, Value);	break;
			case "Data" : UserDetails.put(Header.toString(), Value.toString()); break;}
			
		}		
	}	
}

package Test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	ExcelRead(String path) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
	}
	
	public int getRowCount(int sheetNum)
	{
		int rowCount=wb.getSheetAt(sheetNum).getLastRowNum();
		return rowCount;
	}
	
	public String getData(int sheetNum,int rowNum,int colNum)
	{
		sheet=wb.getSheetAt(sheetNum);
		String data=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		return data;
	}

}

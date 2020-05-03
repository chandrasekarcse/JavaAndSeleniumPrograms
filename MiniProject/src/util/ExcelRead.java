package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	XSSFWorkbook wb;
	XSSFSheet st;
	
	public ExcelRead() throws IOException
	{
		File src = new File("C:\\Users\\Lenovo\\Desktop\\MiniProData.xlsx");
		try {
			FileInputStream fis= new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int getRowNum(int SheetNum)
	{
		int rowcount=wb.getSheetAt(SheetNum).getLastRowNum();
		return rowcount;
	}
	
	
	public String getData(int SheetNum,int Row,int Col)
	{
		st=wb.getSheetAt(SheetNum);
		String data=st.getRow(Row).getCell(Col).getStringCellValue();
		return data;
		
	}
	
	

}

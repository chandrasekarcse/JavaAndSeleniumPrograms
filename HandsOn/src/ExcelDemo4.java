import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo4 {
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	
	static void readExcel() throws IOException
	{
		File src=new File("C:\\Users\\Lenovo\\Desktop\\student.xlsx");
		FileInputStream fis = new FileInputStream(src);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum();
		rowCount=rowCount+1;
		for(int i=0;i<rowCount;i++)
		{
			int colCount = sheet.getRow(i).getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				XSSFCell cell=sheet.getRow(i).getCell(j);
				if(cell.getCellTypeEnum()==CellType.STRING)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
			}
			sheet.getRow(i).createCell(2).setCellValue("Passed");
			FileOutputStream fos=new FileOutputStream(src);
			wb.write(fos);
			System.out.println();
			
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readExcel();

	}

}

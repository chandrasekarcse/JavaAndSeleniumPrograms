import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook sb;
		XSSFSheet sheet;
		XSSFRow row;
		XSSFCell cell;
		File src=new File("C:\\Users\\Lenovo\\Desktop\\student.xlsx");
		FileInputStream fs = new FileInputStream(src);
		sb = new XSSFWorkbook(fs);
		sheet = sb.getSheetAt(0);
		Iterator<Row> iRow =sheet.iterator();
		while(iRow.hasNext())
		{
			Row itRow=iRow.next();
			int colCount=itRow.getLastCellNum();
			for(int j=0;j<colCount;j++)
			{
				Cell itCell=itRow.getCell(j);
				if(itCell.getCellTypeEnum()==CellType.STRING)
				{
				System.out.print(itCell.getStringCellValue()+" ");
				String textVaule=itCell.getStringCellValue();
				}
				else
				{
					System.out.println(itCell.getNumericCellValue()+" ");
					Double d = itCell.getNumericCellValue();
				}
				//itRow.createCell(2).setCellValue("Passed");
				//FileOutputStream fos=new FileOutputStream(src);
				//sb.write(fos);
				
			}
			System.out.println();
			
			
		}

	}

}

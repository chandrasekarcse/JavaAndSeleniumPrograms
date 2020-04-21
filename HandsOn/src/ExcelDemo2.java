import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fis = new File("C:\\Users\\Lenovo\\Desktop\\student.xlsx");
		FileInputStream fr = new FileInputStream(fis);
		XSSFWorkbook wb = new XSSFWorkbook(fr);
		XSSFSheet xs=wb.getSheetAt(0);
		XSSFRow rw=xs.getRow(0);
		XSSFCell cl=rw.getCell(0);
		xs.getRow(0).createCell(2).setCellValue("TEST");
		FileOutputStream out=new FileOutputStream(fis);
		wb.write(out);
		//System.out.println(cl.getStringCellValue());
		
		}
		

	}



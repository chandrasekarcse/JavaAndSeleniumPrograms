
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fs = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\student.xlsx");

		XSSFWorkbook xs = new XSSFWorkbook(fs);

		XSSFSheet sheet = xs.getSheetAt(0);
		
		Iterator<Row> srow = sheet.iterator();
		while (srow.hasNext()) {
			Row rw = srow.next();
			Iterator<Cell> icell = rw.cellIterator();
			while (icell.hasNext()) {
				Cell cl = icell.next();
				
				if(cl.getCellTypeEnum()==CellType.STRING)
				{
					String s=cl.getStringCellValue();
					System.out.print(s+" ");
					System.out.println();
				}
				else
				{
					double i=cl.getNumericCellValue();
					System.out.print(i+" ");
					System.out.println();
				}
			}
		}
		
		
		

	}

}

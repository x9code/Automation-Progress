package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcelFiles3 {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sheet = wb.getSheet("Customer Data"); 
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		short cells = sheet.getRow(1).getLastCellNum();
		//System.out.println(rows +" "+cells);
		for(int r = 0; r<=rows ; r++) {
			//Row currentRow = sheet.getRow(r);
			for(int c = 0 ; c < cells ; c++) {
				System.out.printf("%-35s",sheet.getRow(r).getCell(c).toString());
			}
			System.out.println();
		}
	}
}

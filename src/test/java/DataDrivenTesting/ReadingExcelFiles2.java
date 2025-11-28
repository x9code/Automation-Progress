package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFiles2 {
	public static void main(String[] args) throws IOException {
		String path = "D:\\eclipse\\Automation\\testdata\\customer_data.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Customer Data");
		int rows = sheet.getLastRowNum();
		System.out.println("Last Row Index : "+rows);
		short cells = sheet.getRow(1).getLastCellNum();
		System.out.println("Total no. of Columns : "+cells);
		for(int r = 0; r<=rows ; r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c = 0 ; c < cells ; c++) {
				System.out.printf("%-35s",currentRow.getCell(c).toString());
			}
			System.out.println();
		}
	}
}

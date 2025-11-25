package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcelFiles {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\Book1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rows = sheet.getLastRowNum();
		short cells = sheet.getRow(1).getLastCellNum();
		//System.out.println(rows +" "+cells);
		for(int r = 0;r<=rows;r++) {
			XSSFRow currentRow = sheet.getRow(r);
			for(int c = 0 ; c < cells ; c++) {
				System.out.printf("%-15s",currentRow.getCell(c).toString());
			}
			System.out.println();
		}
	}
}

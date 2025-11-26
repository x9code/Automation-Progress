package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTWorkBookFactory {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Customer Data");
		Row row = sh.getRow(1);
		Cell cell = row.getCell(1);
		String val = cell.getStringCellValue();
		System.out.println(val);
	}
}

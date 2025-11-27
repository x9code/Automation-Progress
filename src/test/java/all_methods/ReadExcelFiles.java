package all_methods;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFiles {
	public String readExcelfile(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
		return data;
	}
}

package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UpdateExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fi = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		wb.getSheet("Customer Data").getRow(2).getCell(1).setCellValue("Alok Patel");
		FileOutputStream fo = new FileOutputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		wb.write(fo);
		wb.close();
		System.out.println("updated...");
	}
}

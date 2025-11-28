package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTWorkBookFactory2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream f = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		Sheet sh = wb.getSheet("Customer Data");
		int rows = sh.getLastRowNum();
//		short cells = sh.getRow(1).getLastCellNum();
//		for(int i = 0 ; i <= rows ; i++) {
//			Row cr = sh.getRow(i);
//			for(int j = 0 ; j <cells ; j++) {
//				String data = cr.getCell(j).toString();
//				System.out.printf("%-35s",data);
//			}
		for(int r = 0;r <= rows;r++) {
			Row cr = sh.getRow(r);
			for(int c = 1 ; c <= 1 ; c++) {
				String un = cr.getCell(c).toString();
				String des = cr.getCell(c+1).toString();
				System.out.println(un+"            "+des);
			}
		}
			System.out.println();
		}
	}


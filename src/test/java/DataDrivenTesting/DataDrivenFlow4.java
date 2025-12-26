package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class DataDrivenFlow4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("./testdata/Famous_Scientists.xlsx");
		Sheet sh =WorkbookFactory.create(file).getSheet("Famous Scientists");
		int lastRow = sh.getLastRowNum();
		String name = sh.getRow(lastRow).getCell(0).toString();
		System.out.println(name);
	}
}

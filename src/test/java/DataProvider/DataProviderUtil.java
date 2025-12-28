package DataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderUtil {
	
	@DataProvider
	public Object[][] readCustomer() throws EncryptedDocumentException, IOException{
		FileInputStream fis = new FileInputStream("./testdata/customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Customer Data");
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(0).getLastCellNum();
		Object[][] data = new Object[rows][cols-1];
		for(int i = 1 ; i <= rows ; i++) {
			for(int j = 1 ; j < cols; j++) {
				data[i-1][j-1] = sh.getRow(i).getCell(j).toString();
			}
		}
		wb.close();
		fis.close();
		return data;
	}
	@Test(dataProvider = "readCustomer")
	public void customerdata(String name, String desc, String status) {
		System.out.println(name+" | "+desc+" | "+status);
	}
}



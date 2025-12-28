package DataProvider;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcelDataProvider {
    public Object[] readExcelData() throws IOException {
        FileInputStream fis = new FileInputStream("./src/test/resources/testdata/Famous_Scientists.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Famous Scientists");
        int rows = sh.getLastRowNum();
        Object[] data = new Object[rows];
        for (int i = 1; i <= rows; i++) {
            data[i-1] = sh.getRow(i).getCell(0).getStringCellValue();
        }
        wb.close();
        fis.close();
        return data;
    }
    @DataProvider
    public Object[] readExcel() throws IOException {
        return readExcelData();
    }
    @Test(dataProvider = "readExcel")
    public void testReadExcelData(String names) {
        System.out.println(names);
    }
}

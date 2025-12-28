package DataProvider;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTestData {
    @DataProvider
    public Object[][] readBookData() throws IOException {
        FileInputStream fis = new FileInputStream("./testdata/Book1.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh = wb.getSheet("Sheet1");
        int rows = sh.getLastRowNum();
        int cols = sh.getRow(0).getLastCellNum();
        Object[][] data = new Object[rows][cols];
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i-1][j] = sh.getRow(i).getCell(j).toString();
            }
        }
        wb.close();
        fis.close();
        return data;
    }
    @Test(dataProvider = "readBookData")
    public void readBookDataTest(String bookname , String Purchase, String Amount, String Location) throws IOException {
        System.out.println(bookname+" | "+Purchase+" | "+Amount+" | "+Location);
    }
}

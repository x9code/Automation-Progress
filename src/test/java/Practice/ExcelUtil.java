package Practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.EncryptedDocumentException;

public class ExcelUtil {

    public static List<String> getScientistNames()
            throws EncryptedDocumentException, IOException {

        List<String> names = new ArrayList<>();

        FileInputStream file =
            new FileInputStream("./src/test/resources/testdata/Famous_Scientists.xlsx");

        Workbook wb = WorkbookFactory.create(file);
        Sheet sheet = wb.getSheet("Famous Scientists");

        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            names.add(row.getCell(0).getStringCellValue());
        }

        wb.close();
        return names;
    }
}

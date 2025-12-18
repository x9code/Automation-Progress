package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import all_methods.Methods1;
import all_methods.ReadExcelFiles;
import all_methods.ReadPropertyFiles;

public class DataDrivenFlow4 {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("./testdata/Famous_Scientists.xlsx");
		Sheet sh =WorkbookFactory.create(file).getSheet("Famous Scientists");
		int lastRow = sh.getLastRowNum();
		String name = sh.getRow(lastRow).getCell(0).toString();
		System.out.println(name);
	}
}

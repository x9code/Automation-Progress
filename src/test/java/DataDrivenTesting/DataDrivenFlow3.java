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

//import all_methods.Methods1;
import all_methods.ReadExcelFiles;
import all_methods.ReadPropertyFiles;

public class DataDrivenFlow3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ReadExcelFiles ex = new ReadExcelFiles();
		String serialNo = ex.readExcelfile("Customer Data", 2, 0);
		String name = ex.readExcelfile("Customer Data", 2, 1);
		System.out.println((int)Double.parseDouble(serialNo)+"  "+name);
	}
}

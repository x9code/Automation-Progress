package com.ActiTime.GenericLibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * THIS IS A GENERIC CLASS CREATED BY @author DEEPAK TO READ DATA FROM PROPERTY AND EXCEL FILE USING THE GENERIC METHODS 
 */
public class FileUtility {
		/**
		 * readExcelfile() will read all type of data from specified row and cell 
		 * @param sheet
		 * @param row
		 * @param cell
		 * @return String
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public String readExcelfile(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			String data = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			return data;
		}
		/**
		 * readDataFromProperty() will read the values in the property file 
		 * @param key
		 * @return String
		 * @throws IOException
		 */
		public String readDataFromProperty(String key) throws IOException {
			FileInputStream f = new FileInputStream("D:\\eclipse\\Automation\\testdata\\commondataDDT.property");
			Properties p = new Properties();
			p.load(f);
			return p.getProperty(key);
		}
		/**
		 * readExcelFileNumeric() will read the numeric data from excel file
		 * @param sheet
		 * @param row
		 * @param cell
		 * @return double
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public double readExcelfileNumeric(String sheet, int row, int cell ) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			double data = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
			return data;
		}
		/**
		 * updateExcelData() will update the string value a particular cell  
		 * @param newData
		 * @param row
		 * @param cell
		 * @throws EncryptedDocumentException
		 * @throws IOException
		 */
		public void updateExcelData(String newData, int row, int cell) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			wb.getSheet("Customer Data").getRow(row).getCell(cell).setCellValue(newData);
			FileOutputStream fo = new FileOutputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
			wb.write(fo);
			wb.close();
		}
		public void readWholeExcelFile(String sheet) throws EncryptedDocumentException, IOException {
			FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh = wb.getSheet(sheet);
			int rows = sh.getLastRowNum();
			short cells = sh.getRow(1).getLastCellNum();
			for(int r = 0; r<=rows ; r++) {
				for(int c = 0 ; c < cells ; c++) {
					System.out.printf("%-35s",sh.getRow(r).getCell(c).toString());
				}
				System.out.println();
			}
		}
}

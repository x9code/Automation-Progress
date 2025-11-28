package DataDrivenTesting;

import java.io.IOException;
import com.ActiTime.GenericLibrary.FileUtility;
/**
 * Utilizing all generic methods of FileUtility class
 */
public class Utilization2 {
	public static void main(String[] args) throws IOException {
		FileUtility f = new FileUtility();
		String un = f.readDataFromProperty("username");
		String ex1 = f.readExcelfile("Customer Data", 2, 1);
		f.readWholeExcelFile("Customer Data");
		double num = f.readExcelfileNumeric("Customer Data", 1, 0);
		f.updateExcelData("Anjana Singh", 2, 1);
		System.out.println(num);
		System.out.println(ex1);
		System.out.println(un);
	}
}

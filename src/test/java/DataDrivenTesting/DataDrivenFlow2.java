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

public class DataDrivenFlow2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ReadPropertyFiles m = new ReadPropertyFiles();
		String url = m.readDataFromProperty("url");
		String un = m.readDataFromProperty("username");
		String pwd = m.readDataFromProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Tasks']")).click();
		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
		driver.findElement(By.xpath("//div[.='New Customer']")).click();
		
		ReadExcelFiles ex = new ReadExcelFiles();
		String name = ex.readExcelfile("Customer Data", 2, 1);
		driver.findElement(By.xpath("//div[@class='customerNameDiv']/child::input[@placeholder='Enter Customer Name']")).sendKeys(name);
		Thread.sleep(2000);
		String des = ex.readExcelfile("Customer Data", 2, 2);
		driver.findElement(By.xpath("//div[@class='inputContainer']/child::textarea[@placeholder='Enter Customer Description']")).sendKeys(des);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

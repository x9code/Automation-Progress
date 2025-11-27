package DataDrivenTesting;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import all_methods.Methods1;
import all_methods.ReadPropertyFiles;

public class DataDrivenFlowDaily2 {
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
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
//		driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
//		driver.findElement(By.xpath("//div[.='New Customer']")).click();
		
		FileInputStream file = new FileInputStream("D:\\eclipse\\Automation\\testdata\\customer_data.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Customer Data");
		int allrows = sh.getLastRowNum();
		Thread.sleep(2000);
		Robot r = new Robot();
		for(int r1 = 1;r1 <= allrows;r1++) {
			Row cr = sh.getRow(r1);
			driver.findElement(By.xpath("//div[@class='addNewButton']")).click();
			driver.findElement(By.xpath("//div[.='New Customer']")).click();
			for(int c = 1 ; c <= 1 ; c++) {
				String username = cr.getCell(c).toString();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='customerNameDiv']/child::input[@placeholder='Enter Customer Name']")).sendKeys(username);
				String desc = cr.getCell(c+1).toString();
				//System.out.println(username+"            "+desc);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='inputContainer']/child::textarea[@placeholder='Enter Customer Description']")).sendKeys(desc);
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//div[@class='components_button_label'])[9]")).click();
				Thread.sleep(2000);
//				r.keyPress(KeyEvent.VK_CONTROL);
//				r.keyPress(KeyEvent.VK_A);
//				r.keyRelease(KeyEvent.VK_CONTROL);
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//div[@class='customerNameDiv']/child::input[@placeholder='Enter Customer Name']")).clear();
//				r.keyPress(KeyEvent.VK_BACK_SPACE);
//				Thread.sleep(1000);
//				//driver.findElement(By.xpath("//div[@class='inputContainer']/child::textarea[@placeholder='Enter Customer Description']")).clear();
			}
		}
		//driver.findElement(By.xpath("//div[@class='components_button_label']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

package testng_scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void connectToDatabase() {
		Reporter.log("database connected successfully",true);
	}
	@BeforeTest
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://online.actitime.com/student5/login.do");
		Reporter.log("browser launched",true);
	}
	@BeforeMethod
	public void logInToActitime() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("ballayaautomation@yopmail.com");
		driver.findElement(By.name("pwd")).sendKeys("ASeYPebD");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		Reporter.log("logged in",true);
	}
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//div[text()='BB']/parent::div/parent::button")).click();
		driver.findElement(By.xpath("//div[text()='Logout']")).click();
		Reporter.log("logged out successfully",true);
	}
	@AfterTest
	public void closeBrowser() {
		if(driver!=null) {
			driver.quit();
			Reporter.log("browser closed",true);
		}
		
	}
	@AfterSuite
	public void disconnectFromDatabase() {
		Reporter.log("database disconnected",true);
	}
}

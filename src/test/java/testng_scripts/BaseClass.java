package testng_scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.ActiTime.GenericLibrary.FileUtility;
import com.beust.jcommander.Parameter;

public class BaseClass {
	public WebDriver driver;
	FileUtility f = new FileUtility();
	@BeforeSuite
	public void connectToDatabase() {
		Reporter.log("database connected successfully",true);
	}
	@Parameters("browser")
	@BeforeTest
	public void launchBrowser(String browser) throws IOException {
		if(browser.equals("chrome")) {
		    driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			driver = new EdgeDriver();
		}else {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String url = f.readDataFromProperty("url");
		driver.get(url);
		Reporter.log("browser launched",true);
	}
	@BeforeMethod
	public void logInToActitime() throws InterruptedException, IOException {
		String un = f.readDataFromProperty("username");
		String pwd = f.readDataFromProperty("password");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
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

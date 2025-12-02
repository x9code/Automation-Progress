package testng_scripts;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	
	@BeforeSuite
	public void connectToDatabase() {
		Reporter.log("database connected...",true);
	}
	@BeforeTest
	public void launchBrowser() {
		Reporter.log("browser launched.....",true);
	}
	@BeforeMethod
	public void logIn() {
		Reporter.log("logged in...",true);
	}
	@Test
	public void createCustomer() {
		Reporter.log("customer created...",true);
	}
	@Test
	public void addCustomer() {
		Reporter.log("added customer....",true);
	}
	@Test
	public void deleteCustomer() {
		Reporter.log("deleted customer",true);
	}
	@AfterMethod
	public void logOut() {
		Reporter.log("logged out",true);
	}
	@AfterTest
	public void closeBrowser() {
		Reporter.log("closed browser",true); 
	}
	@AfterSuite
	public void disconnectFromDatabase() {
		Reporter.log("disconnected from database",true);
	}
}

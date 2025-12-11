package testng_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class AddCustomer {
	@Test (priority = 2, groups = "smoke")
	public void createCustomer() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("created Customer",true);
	}
	@Test(priority = 4 , groups = "regression")
	public void deleteCustomer() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.x.com");
		Thread.sleep(2000);
		driver.quit();
		//Assert.fail();
		Reporter.log("deleted Customer",true);
	}
	@Test (priority = 3, invocationCount = 3, groups = "functionality")
	public void updateCustomer() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("updated Customer",true);
	}
	@Test(priority = 1, groups = {"regression","smoke"})
	public void addCustomer() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.quit();
		Reporter.log("added Customer",true);
	}
	
}

package testng_scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class CreateCustomer {
	@Test (priority = 2 , groups = "smoke")
	public void createCustomer() {
		Reporter.log("created Customer",true);
	}
	@Test(priority = 4 , groups = "regression")
	public void deleteCustomer() {
		//Assert.fail();
		Reporter.log("deleted Customer",true);
	}
	@Test (priority = 3, invocationCount = 3, groups = "functionality")
	public void updateCustomer() {
		Reporter.log("updated Customer",true);
	}
	@Test(priority = 1, groups = {"regression","smoke"})
	public void addCustomer() {
		Reporter.log("added Customer",true);
	}
	
}

package testng_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class CreateCustomer {
	@Test (priority = 2)
	public void createCustomer() {
		Reporter.log("created Customer",true);
	}
	@Test(priority = 4)
	public void deleteCustomer() {
		Reporter.log("deleted Customer",true);
	}
	@Test (priority = 3)
	public void updateCustomer() {
		Reporter.log("updated Customer",true);
	}
	@Test(priority = 1)
	public void addCustomer() {
		Reporter.log("added Customer",true);
	}
	
}

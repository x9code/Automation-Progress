package testng_scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateCustomer {
	@Test
	public void createCustomer() {
		System.out.println("sop..");
		Reporter.log("reporter...",true);
		Reporter.log("reporter...",false);
		Reporter.log("reporter...");
	}
	
	
}

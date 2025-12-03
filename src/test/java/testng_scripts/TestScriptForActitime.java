package testng_scripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptForActitime extends BaseClass {
	@Test
	public void createCustomer() {
		driver.findElement(By.xpath("//span[text()='Tasks']")).click();
		Reporter.log("test 1",true);
	}
	@Test
	public void addCustomer() {
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		Reporter.log("test 2",true);
	}
}

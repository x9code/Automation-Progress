package listenersQ;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testng_scripts.BaseClass;
@Listeners(ListenerImplementation.class)
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

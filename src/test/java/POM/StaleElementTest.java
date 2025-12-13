package POM;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class StaleElementTest {

	@Test
	public void facebook() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.facebook.com/");
		driver.navigate().refresh();
		FacebookLoginPage f = new FacebookLoginPage(driver);
		f.getEmailField().sendKeys("abc@gmail.com");
		f.getPassword().sendKeys("abc@123");
		f.getLogin().click();
		Thread.sleep(2000);
		driver.quit();
	}
}

package daily;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.orangehrm.utilities.WebDriverFactory;

public class Concept1 {
	public static void main(String[] args) {
		Properties p = new Properties();
		String browser = "chrome";//p.getProperty("browser");
		WebDriver driver = WebDriverFactory.createDriver(browser);
		driver.get("https://www.youtube.com/");
		
	}
}

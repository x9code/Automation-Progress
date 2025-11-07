package daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class View {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://github.com/x9code");
		for (int i = 0; i <50000; i++) {
			driver.navigate().refresh();
			Thread.sleep(1500);
		}
		driver.quit();
	}
}

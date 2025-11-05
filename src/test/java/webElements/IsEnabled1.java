package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean output = driver.findElement(By.name("login")).isEnabled();
		if (output) {
			System.out.println("login button is enabled");
		} else {
			System.out.println("login button is not enabled");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

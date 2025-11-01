package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoClear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("bollywood songs 90s");
		Thread.sleep(4000);
		driver.findElement(By.name("search_query")).clear();
		Thread.sleep(4000);
		driver.quit();
	}
}

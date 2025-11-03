package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String value = driver.findElement(By.xpath("//img[@alt='Facebook']")).getCssValue("height");
		System.out.println(value);
		Thread.sleep(3000);
		driver.quit();
	}
}

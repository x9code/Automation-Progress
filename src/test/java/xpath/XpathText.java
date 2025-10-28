package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathText {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("hp laptops");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(5000);
		WebElement text = driver.findElement(By.xpath("//div[text()='HP Intel Celeron Dual Core N4500 - (8 GB/512 GB SSD/Windows 11 Home) 14s-dq3149TU / 14s-dq3141TU Thin ...']"));
		text.click();
		Thread.sleep(1000);
		String laptop = text.getText();
		System.out.println(laptop);
		Thread.sleep(5000);
		driver.quit();
	}

}

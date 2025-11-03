package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAccess {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("IPhone 17");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(2000);
		String price = driver.findElement(By.xpath("//div[text()='Apple iPhone 17 (Black, 256 GB)']/ancestor::a/descendant::div[@class='Nx9bqj _4b5DiR']")).getText();
		System.out.println("price of Apple iPhone 17 (Black, 256 GB): "+ price);
		Thread.sleep(5000);
		driver.quit();
	}
}

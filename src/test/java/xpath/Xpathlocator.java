package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("IPhone 17");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type ='submit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("//div[text() ='Apple iPhone 17 Pro (Deep Blue, 256 GB)']")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.close();
	}
}

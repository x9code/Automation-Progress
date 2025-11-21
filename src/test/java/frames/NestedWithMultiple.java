package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedWithMultiple {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Nested wit')]")).click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("hello@world.com");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//section[text()='Synchronization']")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}

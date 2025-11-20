package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames?sublist=0");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("username")).sendKeys("deepak");
		driver.findElement(By.id("password")).sendKeys("deepak123");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}

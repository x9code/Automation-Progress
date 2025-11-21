package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/progress/timer?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("4");
		//span[@class='text-xs font-semibold inline-block text-black']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Start']")).click();
		//String per = driver.findElement(By.xpath("//span[@class='text-xs font-semibold inline-block text-black']")).getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='100%']")));
		driver.quit();
	}
}

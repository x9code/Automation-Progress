package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopUpDemoApps {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
		driver.findElement(By.xpath("//button[text()='Add Customer']")).click();
		driver.findElement(By.id("customerName")).sendKeys("hello world");
		driver.findElement(By.id("customerEmail")).sendKeys("hello@world.com");
		WebElement prod = driver.findElement(By.id("prod"));
		Select s1 = new Select(prod);
		s1.selectByValue("Mobile");
		Thread.sleep(2000);
		driver.findElement(By.id("message")).sendKeys("bought the iphone");
		driver.findElement(By.xpath("//button[text()='Submit']")).submit();
		Thread.sleep(4000);
		driver.quit();
	}
}

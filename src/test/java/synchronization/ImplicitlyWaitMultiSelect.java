package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitlyWaitMultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(multiSelect);
		s1.selectByIndex(0);
		s1.selectByValue("Mens Cotton Jacket");
		Thread.sleep(500);
		s1.selectByContainsVisibleText("Mens Casual Slim");
		Thread.sleep(500);
		s1.selectByVisibleText("Solid Gold Petite Mi...");
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		System.out.println("D.O.N.E");
		driver.quit();
	}
}

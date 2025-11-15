package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		driver.findElement(By.xpath("//td[text()='APPLEIPhone']/preceding-sibling::td/child::input")).click();
		driver.findElement(By.id("deleteButton")).click();
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		System.out.println("Deleted.....");
		driver.quit();
	}
}

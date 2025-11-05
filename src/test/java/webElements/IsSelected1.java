package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Check Box']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("domain_a")).click();
		Thread.sleep(2000);
		boolean output = driver.findElement(By.id("domain_a")).isSelected();
		if (output) {
			System.out.println("selected");
		} else {
			System.out.println("not selected");
		}
		Thread.sleep(3000);
		driver.quit();
	}
}

package tabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTabs1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itr = winids.iterator();
		String p1 = itr.next();
		String c1 = itr.next();
		String c2 = itr.next();
		String c3 = itr.next();
		driver.switchTo().window(c2);
		driver.findElement(By.xpath("//p[text()='A high-performance laptop with Retina display.']/following-sibling::button")).click();
		System.out.println("clicked on 2nd tab.......");
		driver.switchTo().window(c1);
		driver.findElement(By.xpath("//h1[text()='Luxury Watch']/following-sibling::button")).click();
		System.out.println("clicked on 1st tab.......");
		driver.switchTo().window(c3);
		driver.findElement(By.xpath("//h1[text()='High-End Mobile Phone']/following-sibling::button")).click();
		System.out.println("clicked on 3rd tab.......");
		Thread.sleep(5000);
		driver.switchTo().window(p1);
		driver.quit();
	}
}

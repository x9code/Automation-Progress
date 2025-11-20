package tabs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Watches']/parent::div/child::button")).click();
		Set<String> winids = driver.getWindowHandles();
		Iterator<String> itr = winids.iterator();
		String pwin = itr.next();
		String cwin = itr.next();
		driver.switchTo().window(cwin);
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		System.out.println("clicked");
		driver.quit();
		
	}
}

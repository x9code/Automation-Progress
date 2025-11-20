package tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabs1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser/newTab?sublist=1");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h2[text()='Watches']/parent::div/child::button")).click();
		String parent = driver.getWindowHandle();
		 Set<String> winid = driver.getWindowHandles();
		 for (String win : winid) {
			if(!win.equals(parent)) {
				driver.switchTo().window(win);
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		System.out.println("clicked");
		driver.quit();
		
	}
}

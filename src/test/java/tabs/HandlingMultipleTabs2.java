package tabs;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTabs2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("ROYAL ENFIELD Classic 350");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='ROYAL ENFIELD Classic 350 Booking for Ex-Showroom Price']")).click();
		Set<String> wids = driver.getWindowHandles();
		Iterator<String> itr = wids.iterator();
		String p1 = itr.next();
		String c1 = itr.next();
		driver.switchTo().window(c1);
		Thread.sleep(3000);
		String txt = driver.findElement(By.xpath("//div[@class='C7fEHH']/child::div[@class='x+7QT1']/child::div[1]/child::div/child::div")).getText();
		System.out.println(txt);
		driver.quit();
		
	}
}

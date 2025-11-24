package mouse_actions;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HorizontalScroll1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/scroll/newHorizontal?scenario=1");
		driver.findElement(By.linkText("Open In New Tab")).click();
		Set<String> wids = driver.getWindowHandles();
		Iterator<String> itr = wids.iterator();
		itr.next();
		String tab = itr.next();
		driver.switchTo().window(tab);
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(3000);
		driver.quit();
	}
}

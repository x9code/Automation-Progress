package mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click2 {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		WebElement min = driver.findElement(By.xpath("//img[@alt='Minutes']"));
		Actions a = new Actions(driver);
		a.contextClick(min).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_T);
		Thread.sleep(2000);
		Set<String> wins = driver.getWindowHandles();
		Iterator<String> itr = wins.iterator();
		String p1 = itr.next();
		String c1 = itr.next();
		driver.switchTo().window(c1);
		Thread.sleep(3000);
		driver.switchTo().window(p1);
		Thread.sleep(4000);
		driver.quit();
	}
}

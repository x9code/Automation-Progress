package daily;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mind1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/Link.html");
		WebElement yt = driver.findElement(By.id("yt"));
		Actions a = new Actions(driver);
		Robot r = new Robot();
		for(int i = 0 ; i <=4; i++) {
		a.contextClick(yt).perform();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_T);
		}
		Set<String> wids = driver.getWindowHandles();
		Iterator<String> itr = wids.iterator();
		String parent = itr.next();
		System.out.println(parent);
		itr.next();
		itr.next();
		String c3 = itr.next();
		itr.next();
		itr.next();
		Thread.sleep(2000);
		driver.switchTo().window(c3);
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
	}
}

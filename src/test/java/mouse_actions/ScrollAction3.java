package mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollAction3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(2000);
		int y = driver.findElement(By.linkText("Content Index")).getLocation().getY();
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		//j.executeScript("window.scrollBy(0,"+y+")");
		j.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j.executeScript("window.scrollTo(0,0)");
		Thread.sleep(4000);
		driver.quit();
	}
}

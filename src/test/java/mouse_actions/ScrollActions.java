package mouse_actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scrollBy(0,5000)");//scroll-down along the y-axis 5000pxls
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-5000)");//scroll-up along the y-axis 5000pxls
		Thread.sleep(2000);
		driver.quit();
	}
}

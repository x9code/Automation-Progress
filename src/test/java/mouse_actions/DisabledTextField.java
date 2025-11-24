package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextField {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement name = driver.findElement(By.id("name"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		Thread.sleep(3000);
		j.executeScript("arguments[0].value='deepak@gmail.com'", name);
		Thread.sleep(5000);
		driver.quit();
	}
}

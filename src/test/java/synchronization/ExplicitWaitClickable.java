package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClickable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/dynamic_controls");

		// Click the Enable button
		driver.findElement(By.xpath("//form[@id='input-example']/button")).click();

		// Create Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Wait for the input field to become clickable
		WebElement inputBox = wait.until(
		        ExpectedConditions.elementToBeClickable(By.xpath("//form[@id='input-example']/input"))
		);

		inputBox.sendKeys("Yes! It became clickable!");

		System.out.println("The element is now clickable and input entered!");
		Thread.sleep(2000);
		driver.quit();
	}
}

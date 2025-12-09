package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitUrlContains {
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/");

	// click on Form Authentication link
	driver.findElement(By.linkText("Dropdown")).click();

	// Explicit wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.urlContains("dropdown"));

	System.out.println("YES! URL now contains 'Dropdown'. The page has navigated successfully!");
	
	driver.quit();
	}
}

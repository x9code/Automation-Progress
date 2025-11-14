package daily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWait1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='desktop-searchBar']")));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shorts");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys(Keys.ENTER);
		driver.quit();
	}
}

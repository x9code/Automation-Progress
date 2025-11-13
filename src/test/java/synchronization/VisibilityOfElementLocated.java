package synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityOfElementLocated {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.titleContains("Text"));
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Multi Select")));
		driver.findElement(By.linkText("Multi Select")).click();
		System.out.println("Waited for the element");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("select-multiple-native")));
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Thread.sleep(2000);
		Select s1 = new Select(multiSelect);
		s1.selectByIndex(0);
		s1.selectByValue("Mens Cotton Jacket");
		s1.selectByVisibleText("Solid Gold Petite Mi...");
		List<WebElement> opt = s1.getAllSelectedOptions();
		for (WebElement webElement : opt) {
			System.out.println(webElement.getText());
		}
		driver.quit();
	}
}

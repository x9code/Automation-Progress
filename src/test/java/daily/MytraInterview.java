package daily;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MytraInterview {
	@Test
	public void mytra() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']"));
		Actions a = new Actions(driver);
		a.moveToElement(men).perform();
		driver.findElement(By.linkText("T-Shirts")).click();
		WebElement rightbar = driver.findElement(By.id("rootRailThumbRight"));
		//a.dragAndDropBy(rightbar, -180, 0).perform();
		a.clickAndHold(rightbar).moveByOffset(-180, 0).release().perform();
		Thread.sleep(3000);
		driver.quit();
	}
}

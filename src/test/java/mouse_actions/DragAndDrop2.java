package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions a = new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(men).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("T-Shirts")).click();
		WebElement src = driver.findElement(By.id("rootRailThumbRight"));
		int xaxis = 98;
		
		
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.dragAndDropBy(src,xaxis,0).perform();
		Thread.sleep(3000);
		//driver.quit();
	}
}

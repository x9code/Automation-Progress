package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");
		WebElement src1 = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement src2 = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement src3 = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement src4 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement dest1 = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement dest2 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a = new Actions(driver);
		Thread.sleep(1000);
		a.dragAndDrop(src1, dest1).perform();
		Thread.sleep(1000);
		a.dragAndDrop(src2, dest2).perform();
		Thread.sleep(1000);
		a.dragAndDrop(src3, dest1).perform();
		Thread.sleep(1000);
		a.dragAndDrop(src4, dest2).perform();
		Thread.sleep(4000);
		driver.quit();
		
	}
}

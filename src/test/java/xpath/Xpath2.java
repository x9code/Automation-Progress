package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("stranger things season 5 trailer");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("video-title")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@data-tooltip-title='Full screen (f)']")).click();
		Thread.sleep(3000);
		driver.quit();
	}

}

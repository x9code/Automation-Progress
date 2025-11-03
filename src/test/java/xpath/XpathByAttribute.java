package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		driver.findElement(By.name("search_query")).sendKeys("bollywood songs 90s");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='video-title']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@data-tooltip-title='Full screen (f)']")).click();
		Thread.sleep(5000);
		driver.close();
	}
}

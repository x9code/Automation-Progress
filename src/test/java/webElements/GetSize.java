package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		int height = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getSize().getHeight();
		System.out.println("height is :"+height);
		int width = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getSize().getWidth();
		System.out.println("width is :"+width);
		Thread.sleep(3000);
		driver.quit();
	}
}

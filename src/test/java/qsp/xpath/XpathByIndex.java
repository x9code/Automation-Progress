package qsp.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByIndex {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("tshirt");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Roadster']")).click();
		Thread.sleep(1000);
		String text = driver.findElement(By.xpath("(//h3[text()='Roadster'])[4]")).getText();
		Thread.sleep(3000);
		System.out.println(text);
		driver.quit();
	}

}

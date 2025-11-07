package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone 17");
		Thread.sleep(2000);
		List<WebElement> sugg = driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		for(WebElement s : sugg) {
			System.out.println(s.getText());
			Thread.sleep(1000);
		}
		driver.quit();
	}
}

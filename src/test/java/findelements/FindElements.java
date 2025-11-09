package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for(int i = 0;i<count;i++) {
			System.out.println(i+"-"+allLinks.get(i).getText());
			Thread.sleep(20);
		}
		driver.quit();
		
	}
}

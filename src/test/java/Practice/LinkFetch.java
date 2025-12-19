package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkFetch {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(2000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement s : links) {
		System.out.println(s.getText());
	}
	driver.quit();
  }
}
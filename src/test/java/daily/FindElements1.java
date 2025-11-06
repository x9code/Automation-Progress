package daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for(WebElement s : links) {
			System.out.println(s.getText());
			Thread.sleep(70);
		}
		driver.quit();
	}
}

package daily;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.collect.Lists;

public class day1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://quotes.toscrape.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Deepak");
		Thread.sleep(1000);
		driver.findElement(By.id("password")).sendKeys("Deepak@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		List<WebElement> quotes = driver.findElements(By.xpath("//div[@class='quote']"));
		String text="";
		String author="";
		for(WebElement quote : quotes) {
			text = quote.findElement(By.xpath("//span[@class='text']")).getText();
			author = quote.findElement(By.xpath("//small[@class='author']")).getText();
		}
		System.out.println(text+" - "+author);
		if (author.equals("Albert Einstein")) {
            System.out.println(text);
        }
		Thread.sleep(5000);
		driver.quit();
		
	}

}

package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraShoes {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("shoes");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='desktop-submit']")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//h3[text()='OFF LIMITS'])[2]/../../div[2]/div/span[1]/span[1]")).getText();
		System.out.println(text);
		Thread.sleep(4000);
		driver.quit();
	}

}

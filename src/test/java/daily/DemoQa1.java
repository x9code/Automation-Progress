package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(5000);
//		driver.navigate().refresh();
//		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//span[text()='Web Tables']")).click();
		String salary = driver.findElement(By.xpath("//div[text()='cierra@example.com']/following-sibling::div[contains(@class, 'rt-td')][1]")).getText();
		System.out.println("salary of cierra is :"+salary);
		driver.quit();
	}
}

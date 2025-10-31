package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Dynamic Web Table")).click();
		Thread.sleep(3000);
		String price =  driver.findElement(By.xpath("//th[text()='Samsung Galaxy']/../td[4]")).getText();
		System.out.println(price);
		Thread.sleep(5000);
		driver.quit();
	}

}

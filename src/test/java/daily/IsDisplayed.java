package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		Thread.sleep(2000);
		boolean disp = driver.findElement(By.id("checkbox")).isDisplayed();
		System.out.println("checkBox is displayed : "+disp);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Remove']")).click();
		Thread.sleep(5100);
		String message = driver.findElement(By.id("message")).getText();
		System.out.println(message);
		Thread.sleep(2000);
		driver.quit();
	}
}

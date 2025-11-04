package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.instagram.com/");
		int x_axis = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getLocation().getX();
		System.out.println("x-axis location is :"+x_axis);
		int y_axis = driver.findElement(By.xpath("//i[@aria-label='Instagram']")).getLocation().getY();
		System.out.println("y-axis location is :"+y_axis);
		Thread.sleep(3000);
		driver.quit();
	}
}

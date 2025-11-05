package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationFacebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		int x_axis = driver.findElement(By.xpath("//img[@alt='Facebook']")).getLocation().getX();
		System.out.println("x-axis location is :"+x_axis);
		int y_axis = driver.findElement(By.xpath("//img[@alt='Facebook']")).getLocation().getY();
		System.out.println("y-axis location is :"+y_axis);
		Thread.sleep(4999);
		driver.quit();
	}
}

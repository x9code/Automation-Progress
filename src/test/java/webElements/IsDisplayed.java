package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapchat.com/");
		Thread.sleep(4000);
		boolean output = driver.findElement(By.xpath("//a[@data-testid='navItem-SPOTLIGHT']")).isDisplayed();
		if (output) {
			System.out.println("element is displayed");
		} else {
			System.out.println("element is not displayed");
		}
		Thread.sleep(4000);
		driver.quit();
		
	}
}

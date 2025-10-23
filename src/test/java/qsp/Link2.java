package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.get("file:///D:/coding/Html-css-javascript/htmlclass/Link.html");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.className("link")).click();
		Thread.sleep(4000);
		driver.close();
	}

}

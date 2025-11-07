package findelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 17");
		Thread.sleep(2000);
		List<WebElement> suggestion = driver.findElements(By.xpath("//div[@role='row']"));
		int a=1;
		for(WebElement d : suggestion) {
			System.out.println(a+" : "+d.getText());
			Thread.sleep(20);
			a++;
		}
		driver.quit();
}
}
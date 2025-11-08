package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListDropCombobox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//click on create new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		Select s1 = new Select(day);
		s1.selectByIndex(12);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select s2 = new Select(month);
		s2.selectByIndex(11);
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select s3 = new Select(year);
		for(int i = 0;i<=50;i++) {
		s3.selectByIndex(i);
		Thread.sleep(20);
		
		}
		Thread.sleep(5000);
		driver.quit();
	}
}

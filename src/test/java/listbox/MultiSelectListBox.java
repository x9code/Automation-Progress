package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(multiSelect);
		s1.selectByIndex(0);
		Thread.sleep(500);
		s1.selectByValue("Mens Cotton Jacket");
		Thread.sleep(500);
		s1.selectByContainsVisibleText("Mens Casual Slim");
		Thread.sleep(500);
		s1.selectByVisibleText("Solid Gold Petite Mi...");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

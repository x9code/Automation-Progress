package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFIrstSelectedOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(multiSelect);
		Thread.sleep(500);
		s1.selectByValue("Mens Cotton Jacket");
		Thread.sleep(500);
		s1.selectByContainsVisibleText("Mens Casual Slim");
		Thread.sleep(500);
		s1.selectByIndex(0);
		Thread.sleep(500);
		s1.selectByVisibleText("Solid Gold Petite Mi...");
		
		String opt = s1.getFirstSelectedOption().getText();
		System.out.println(opt);
		Thread.sleep(2000);
		List<WebElement> opts = s1.getAllSelectedOptions();
		for(WebElement s : opts) {
			System.out.println(s.getText());
			Thread.sleep(2000);
		}
		 
		driver.quit();
	}
}

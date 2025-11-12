package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(multiSelect);
		boolean p = s1.isMultiple();
		if(p) {
			System.out.println("multi select");
		}else {
			System.out.println("single select");
		}
		driver.quit();
	}
}

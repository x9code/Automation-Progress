package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithSearch {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		Thread.sleep(4000);
		driver.findElement(By.id("react-select-10-placeholder")).click();
		driver.findElement(By.id("react-select-10-placeholder")).sendKeys("india");
		
	}
}

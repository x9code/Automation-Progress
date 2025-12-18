package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DropDownWithSearch {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		Thread.sleep(4000);
		WebElement search1 = driver.findElement(By.id("react-select-4-input"));
		search1.click();
		search1.sendKeys("india");
		Thread.sleep(2000);
		search1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement search2 = driver.findElement(By.id("react-select-5-input"));
		search2.click();
		search2.sendKeys("odisha");
		Thread.sleep(2000);
		search2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement s3 = driver.findElement(By.id("react-select-6-input"));
		s3.click();
		s3.sendKeys("Balasore");
		Thread.sleep(2000);
		s3.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		driver.quit();
		
	}
}

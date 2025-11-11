package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownWithSearchAll {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/search?sublist=2");
		Thread.sleep(4000);
		WebElement n1 = driver.findElement(By.id("react-select-2-input"));
		n1.click();
		n1.sendKeys("91");
		n1.sendKeys(Keys.ENTER);
		driver.findElement(By.id("selectPhone")).sendKeys("7077109463");
		Thread.sleep(2000);
		WebElement g1 = driver.findElement(By.id("react-select-3-input"));
		g1.click();
		g1.sendKeys("male");
		g1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement s1 = driver.findElement(By.id("react-select-4-input"));
		s1.click();
		s1.sendKeys("india");
		Thread.sleep(2000);
		s1.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement s2 = driver.findElement(By.id("react-select-5-input"));
		s2.click();
		s2.sendKeys("odisha");
		Thread.sleep(2000);
		s2.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement s3 = driver.findElement(By.id("react-select-6-input"));
		s3.click();
		s3.sendKeys("Balasore");
		Thread.sleep(2000);
		s3.sendKeys(Keys.ENTER);
		WebElement n2 = driver.findElement(By.id("react-select-7-input"));
		n2.click();
		n2.sendKeys("4");
		n2.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}

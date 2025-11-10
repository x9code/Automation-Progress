package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(4000);
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select countryOPT = new Select(country);
		countryOPT.selectByValue("India");
		Thread.sleep(2000);
		WebElement state = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select stateOPT = new Select(state);
		stateOPT.selectByVisibleText("Odisha");
		Thread.sleep(2000);
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select cityOPT = new Select(city);
		cityOPT.selectByVisibleText("Balasore");
		Thread.sleep(5000);
		driver.quit();
	}
}

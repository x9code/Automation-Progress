package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitlyWaitSingleSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select countryOPT = new Select(country);
		countryOPT.selectByValue("India");
		WebElement state = driver.findElement(By.xpath("//label[text()='State']/following-sibling::select"));
		Select stateOPT = new Select(state);
		stateOPT.selectByVisibleText("Odisha");
		WebElement city = driver.findElement(By.xpath("//label[text()='City']/following-sibling::select"));
		Select cityOPT = new Select(city);
		cityOPT.selectByVisibleText("Balasore");
		System.out.println(" D.O.N.E ");
		driver.quit();
	}
}

package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(4000);
		WebElement country = driver.findElement(By.xpath("//label[text()='Country']/following-sibling::select"));
		Select countryOPT = new Select(country);
		boolean p = countryOPT.isMultiple();
		if(p) {
			System.out.println("multi select");
		}else {
			System.out.println("single select");
		}
		driver.quit();
	}
}

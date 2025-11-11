package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAppsCitySelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown?sublist=0");
		Thread.sleep(4000);
		WebElement country = driver.findElement(By.id("select3"));
		Select s1 = new Select(country);
		s1.selectByValue("India");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.id("select5"));
		Select s2 = new Select(state);
		s2.selectByValue("Odisha");
		Thread.sleep(3000);
		WebElement city = driver.findElement(By.xpath("(//select[@class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring w-full ease-linear transition-all duration-150'])[3]"));
		Select s3 = new Select(city);
		s3.selectByVisibleText("Balasore");
		Thread.sleep(4000);
		driver.quit();
	}
}

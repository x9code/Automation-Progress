package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDependent1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone 17 Pro 256 GB: 15.93 cm (6.3″)");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[contains(text(),'iPhone 17 Pro 256 GB: 15.93 cm (6.3″)')])[1]")).click();
		System.out.println("iphone clicked");
		Thread.sleep(5000);
		System.out.println("going to locate the element");
		WebElement text = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
		System.out.println("located");
		System.out.println(text.getText());
		Thread.sleep(3000);
		driver.quit();
	}

}

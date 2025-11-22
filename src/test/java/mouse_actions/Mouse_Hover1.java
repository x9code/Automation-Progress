package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.vtiger.com/");
		WebElement comp = driver.findElement(By.id("companyDropdown"));
		Actions a = new Actions(driver);
		a.moveToElement(comp).perform();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		String cont = driver.findElement(By.xpath("(//div[@class='text-reset text-decoration-none'])[2]")).getText();
		System.out.println(cont);
		Thread.sleep(2000);
		driver.quit();
	}
}

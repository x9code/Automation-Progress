package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		WebElement but = driver.findElement(By.xpath("//button[text()='No']"));
		Actions q = new Actions(driver);
		q.doubleClick(but).perform();
		Thread.sleep(2000);
		String txt = driver.findElement(By.xpath("//span[contains(@class,'md')]")).getText();
		System.out.println(txt);
		driver.quit();
	}
}

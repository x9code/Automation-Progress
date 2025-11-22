package mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		WebElement img = driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));
		Actions a = new Actions(driver);
		a.moveToElement(img).perform();
		Thread.sleep(1000);
		String txt = driver.findElement(By.xpath("//ul[@class='p-4']")).getText();
		System.out.println(txt);
		Thread.sleep(2000);
		driver.quit();
	}
}

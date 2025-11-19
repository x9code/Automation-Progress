package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowPopUp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		String winid = driver.getWindowHandle();
		System.out.println(winid);
		driver.findElement(By.xpath("(//p[@class='text-gray-500 mt-2']/following-sibling::button)[1]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		for (String win : allWindows) {
			if(!win.equals(winid)) {
				driver.switchTo().window(win);
				break;
			}
		}
		driver.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}

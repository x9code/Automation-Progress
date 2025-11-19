package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowPopUp3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		String winid = driver.getWindowHandle();
		System.out.println("PARENT WINDOW ID : "+winid);
		driver.findElement(By.linkText("Multiple Windows")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Shop Now']")).click();
		Thread.sleep(1000);
		Set<String> allWindows = driver.getWindowHandles();
		int a =1;
		System.out.println("CHILD WINDOW IDS :");
		for (String win : allWindows) {
			if(!win.equals(winid)) {
				driver.switchTo().window(win);
			    System.out.println(a +" - "+win);
			    driver.close();
			    a++;
			    Thread.sleep(200);
			}
		}
		driver.switchTo().window(winid);
		driver.quit();
	}
}

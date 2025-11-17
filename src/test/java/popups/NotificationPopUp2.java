package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopUp2 {
	public static void main(String[] args) throws InterruptedException {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			WebDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("https://www.yatra.com/");
			Thread.sleep(3000);
			System.out.println("handled notification popup");
			driver.quit();
		}

	}


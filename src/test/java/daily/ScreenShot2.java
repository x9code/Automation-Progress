package daily;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ScreenShot2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(2000);
		File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\bbc.png");
        FileHandler.copy(src, dest);
        driver.quit();
	}
}

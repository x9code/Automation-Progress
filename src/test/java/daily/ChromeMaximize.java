package daily;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class ChromeMaximize {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--start-fullscreen");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.x.com/");
		File t = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(t, new File("./Screenshots/test.png"));
		Thread.sleep(4000);
		driver.quit();
	}

}

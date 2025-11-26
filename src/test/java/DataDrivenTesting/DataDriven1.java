package DataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import all_methods.Methods1;
import all_methods.ReadPropertyFiles;

public class DataDriven1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ReadPropertyFiles m = new ReadPropertyFiles();
		String url = m.readDataFromProperty("url");
		String un = m.readDataFromProperty("username");
		String pwd = m.readDataFromProperty("password");
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}

package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		driver.findElement(By.linkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		String email = driver.findElement(By.xpath("(//p[.='Default Email']/following-sibling::p[@class='para'])[1]")).getText();
		System.out.println("Email :"+email);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		String pass = driver.findElement(By.xpath("(//p[.='Default Password']/following-sibling::p[@class='para'])[1]")).getText();
		System.out.println("Password :"+pass);
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.id("confirm-password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(4000);
		driver.quit();
	}
}

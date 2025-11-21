package frames;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrames1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
		Thread.sleep(1000);
		String pass = driver.findElement(By.xpath("//p[.='Password : Admin@1234']")).getText();
		String[] ss = pass.split(": ", 2);
		String p1 = ss[1];
		System.out.println(p1);
		String email = driver.findElement(By.xpath("//p[.='Email:Admin@gmail.com']")).getText();
		driver.switchTo().frame(0);
		String[] ss1 = email.split(":", 2);
		String e1 = ss1[1];
		System.out.println(e1);
		driver.findElement(By.id("email")).sendKeys(e1);
		driver.findElement(By.id("password")).sendKeys(p1);
		Thread.sleep(1000);
		driver.switchTo().parentFrame();
		String email2 = driver.findElement(By.xpath("//p[.='Email:SuperAdmin@gmail.com']")).getText();
		String[] ss3 = email2.split(":", 2);
		String e2 = ss3[1];
		System.out.println(e2);
		String pass2 = driver.findElement(By.xpath("//p[.='Password : SuperAdmin@1234']")).getText();
		String[] ss4 = pass2.split(": ", 2);
		String p2 = ss4[1];
		System.out.println(p2);
		driver.switchTo().frame(1);
		driver.findElement(By.id("username")).sendKeys(e2);
		driver.findElement(By.id("password")).sendKeys(p2);
		Thread.sleep(3000);
		driver.quit();
		
	}
}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLink {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Deepak");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Rana");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("kumardeepak@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Deepak@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

	}

}

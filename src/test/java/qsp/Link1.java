package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(1000);
		d.navigate().to("D:\\Link.html");
		Thread.sleep(2000);
//		d.findElement(By.id("yt")).click();
//		Thread.sleep(3000);
//		d.navigate().back();
//		Thread.sleep(3000);
		d.findElement(By.id("fb")).click();
		Thread.sleep(3000);
		d.findElement(By.id("email")).sendKeys("abc@gamil.com");
		Thread.sleep(3000);
		d.findElement(By.id("passContainer")).sendKeys("password");
		Thread.sleep(3000);
		d.findElement(By.id("u_0_5_jH")).click();
		d.navigate().back();
		Thread.sleep(3000);
		d.navigate().forward();
		Thread.sleep(3000);
		d.navigate().refresh();
		Thread.sleep(3000);
		d.close();
	}

}

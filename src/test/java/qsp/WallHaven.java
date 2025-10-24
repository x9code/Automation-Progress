package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WallHaven {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver  = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.get("https://wallhaven.cc/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("Toplist")).click();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("username")).sendKeys("Gone65478");
	Thread.sleep(1000);
	driver.findElement(By.name("password")).sendKeys("hispeed");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@alt='wallhaven']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//img[@src='https://th.wallhaven.cc/lg/je/jexkwm.jpg']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class='username usergroup-2']")).click();
	Thread.sleep(6000);
	driver.close();
}
}

package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

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
		WebElement drop1 = driver.findElement(By.id("day"));
		Select select1 = new Select(drop1);
		select1.selectByVisibleText("13");
		Thread.sleep(1000);
		WebElement drop2 = driver.findElement(By.name("birthday_month"));
		Select select2 = new Select(drop2);
		select2.selectByVisibleText("Dec");
		Thread.sleep(1000);
		WebElement drop3 = driver.findElement(By.id("year"));
		Select select3 = new Select(drop3);
		select3.selectByVisibleText("2002");
		Thread.sleep(1000);
		WebElement maleRadio = driver.findElement(By.xpath("//span[2]//label[1]"));
        maleRadio.click();
        Thread.sleep(3000);
		driver.findElement(By.name("reg_email__")).sendKeys("kumardeepak@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password_step_input")).sendKeys("Deepak@1234");
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(30000);
		driver.close();

	}

}

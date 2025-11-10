package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		boolean cb1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		if (cb1) {
			System.out.println("checkbox 1 is selected");
		} else {
			System.out.println("checkbox 1 not is selected");
		}
		boolean cb2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).isSelected();
		if (cb2) {
			System.out.println("checkbox 2 is selected");
		} else {
			System.out.println("checkbox 2 not is selected");
		}
		System.out.println("clicking on checkbox 1");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		boolean cb3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		if (cb3) {
			System.out.println("checkbox 1 is selected");
		} else {
			System.out.println("checkbox 1 not is selected");
		}
		Thread.sleep(2000);
		driver.quit();
		
	}
}

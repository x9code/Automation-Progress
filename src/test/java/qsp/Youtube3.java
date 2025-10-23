package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube3 {

	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = ()->{
			ChromeDriver driver = new ChromeDriver();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			driver.get("file:///D:/coding/Html-css-javascript/htmlclass/Link.html");
			WebElement add = driver.findElement(By.id("fb"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			add.click();
			driver.close();
		};
		Runnable task2 = ()->{
			ChromeDriver driver = new ChromeDriver();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.manage().window().maximize();
			driver.get("file:///D:/coding/Html-css-javascript/htmlclass/Link.html");
			WebElement add2 = driver.findElement(By.id("yt"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			add2.click();
			driver.close();
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start()
;
		t2.start();
		Thread.sleep(5000);
		//driver.close();

	}

}

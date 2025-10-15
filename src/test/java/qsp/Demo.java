package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException{
			System.out.println("java");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.get("https://www.youtube.com");
			Thread.sleep(3000);
			WebElement search = driver.findElement(By.name("search_query"));
			search.sendKeys("bollywood songs");
			search.submit();
			
			Thread.sleep(6000);
			driver.close();
		}

	}


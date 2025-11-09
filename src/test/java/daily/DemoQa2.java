package daily;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQa2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		@Nullable
		String placeholder = driver.findElement(By.id("userName")).getAttribute("placeholder");
			if (placeholder.equals("Full Name")) {
				System.out.println("matching with attribute value : "+placeholder);
			} else {
				System.out.println("not matching");
			}	
			Thread.sleep(2000);
			@Nullable
			String classAttribute = driver.findElement(By.id("userName")).getAttribute("class");
			if (classAttribute.equals(" mr-sm-2 form-control")) {
				System.out.println("matching with attribute value : "+classAttribute);
			} else {
				System.out.println("not matching");
			}
			Thread.sleep(2000);
			driver.quit();
	}
}

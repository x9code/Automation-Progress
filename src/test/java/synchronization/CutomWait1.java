package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CutomWait1 {
	public static WebElement customWaitForElement(WebDriver driver, By locator, int timeoutInSeconds) {
	    WebElement element = null;
	    int time = 0;

	    while (time < timeoutInSeconds) {
	        try {
	            element = driver.findElement(locator);
	            if (element.isDisplayed()) {
	                return element; // element found and visible
	            }
	        } catch (Exception e) {
	            // ignore and retry
	        }

	        try {
	            Thread.sleep(1000); // polling interval = 1 sec
	        } catch (InterruptedException e) {}

	        time++;
	    }

	    throw new RuntimeException("Element not found in given time!");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement btn = customWaitForElement(driver, By.xpath("//div[@class='_6ltg']/child::a"), 5);
		btn.click();
		System.out.println("button clicked");
		driver.quit();
	}
}

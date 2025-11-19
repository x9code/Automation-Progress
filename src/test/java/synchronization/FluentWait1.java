package synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {
	public static void main(String[] args) {
		// 1. Setup WebDriver (Ensure chromedriver is in your path)
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/dynamic-content");

        // 2. Define the Fluent Wait
        // We declare the Wait interface with the type of object we are waiting on (WebDriver)
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))    // Max time to wait
                .pollingEvery(Duration.ofSeconds(5))    // Check every 5 seconds
                .ignoring(NoSuchElementException.class); // Don't throw error if not found yet

        // 3. Define the action/condition to wait for
        // We use a Function to define what successful retrieval looks like
        WebElement dynamicElement = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = driver.findElement(By.id("dynamicElementId"));
                
                // Optional: Add logic to return the element only if it meets a condition
                if (element.isDisplayed()) {
                    return element;
                }
                return null; // Returning null tells FluentWait to keep trying
            }
        });

        // 4. Interact with the element once found
        dynamicElement.click();

        driver.quit();
	}
}

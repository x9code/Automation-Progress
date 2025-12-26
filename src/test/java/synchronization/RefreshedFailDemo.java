package synchronization;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RefreshedFailDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkbox = driver.findElement(By.xpath("//input[@label='blah']")); // OLD reference
        driver.navigate().refresh();
        // ❌ This fails with StaleElementReferenceException
        wait.until(ExpectedConditions.visibilityOf(checkbox));
        System.out.println("viewed");
        driver.quit();
    }
}

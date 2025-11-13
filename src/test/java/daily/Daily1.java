package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Daily1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://demoapps.qspiders.com/ui/captcha?sublist=0");

        WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
        name.sendKeys("Deepak");

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        email.sendKeys("deepak@gmail.com");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("deepak@123");

        // switch to captcha iframe then click checkbox (frame selector may vary)
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[title='recaptcha']")));
        WebElement checkbox = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//div[@class='recaptcha-checkbox-border']")));
        checkbox.click();z
        driver.switchTo().defaultContent();

        driver.quit();
    }
}

package Practice;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WikipediaScreenshotTest {

    public static void main(String[] args) throws Exception {

        List<String> scientists = ExcelUtil.getScientistNames();

        for (String name : scientists) {

            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.manage().window().maximize();
            driver.get("https://www.wikipedia.org/");

            // Search scientist
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("searchInput")));
            searchBox.sendKeys(name);
            searchBox.sendKeys(Keys.ENTER);

            // Wait for heading
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy policy")));

            // Full page screenshot (Firefox only)
            byte[] screenshot =
                    ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.BYTES);

            Path path = Paths.get("./Screenshots/" + name.replace(" ", "_") + ".png");
            Files.createDirectories(path.getParent());
            Files.write(path, screenshot);

            driver.quit();
        }
    }
}

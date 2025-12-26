package Practice;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.List;
import java.nio.file.Files;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WikipediaScientists {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
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

            // Wait
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy policy")));

            // Extract scientist text
            WebElement content = driver.findElement(By.id("mw-content-text"));
            List<WebElement> paragraphs = content.findElements(By.tagName("p"));

            StringBuilder scientistText = new StringBuilder();

            for (WebElement p : paragraphs) {
                String text = p.getText().trim();
                if (!text.isEmpty()) {
                    scientistText.append(text).append("\n\n");
                }
            }

            // Save text file
            Path txtPath =
                    Paths.get("./Scientist_Text/" + name.replace(" ", "_") + ".txt");

            Files.createDirectories(txtPath.getParent());
            //Files.writeString(txtPath, scientistText.toString());
            driver.quit();
        }
	}
}

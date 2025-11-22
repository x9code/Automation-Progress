package daily;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");

        WebElement img = driver.findElement(By.xpath("//img[@class='w-5 h-5 mt-5 ml-3 cursor-pointer ']"));

        // Mouse Hover
        Actions a = new Actions(driver);
        a.moveToElement(img).perform();
        Thread.sleep(1000);

        // Take screenshot of element
        File src = ((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("D:\\assss.png");
        FileHandler.copy(src, dest);

        // Get text after hover
        String txt = driver.findElement(By.xpath("//ul[@class='p-4']")).getText();
        System.out.println(txt);

        Thread.sleep(2000);
        driver.quit();
    }
}


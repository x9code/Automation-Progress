package robotclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class FileUpload {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("drag-drop-upload")).click();
        String filePath = "D:/Resume";
        Robot r = new Robot();
        r.delay(1000);
        StringSelection ss = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

        r.keyPress(KeyEvent.VK_ALT);
        r.keyPress(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_D);
        r.keyRelease(KeyEvent.VK_ALT);
        r.delay(500);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_V);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.delay(500);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.delay(500);
        for (int i = 1 ; i <= 5; i++) {
            r.keyPress(KeyEvent.VK_TAB);
        }
        r.delay(500);
        r.keyRelease(KeyEvent.VK_TAB);
        r.delay(500);
        for (int i = 1; i <= 5; i++) {
            r.keyPress(KeyEvent.VK_DOWN);
        }
        r.delay(500);
        r.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        System.out.println("file uploaded");
        driver.quit();

    }
}

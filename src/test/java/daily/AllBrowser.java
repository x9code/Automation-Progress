package daily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {
    public static void main(String[] args) {

        WebDriver driver;

        System.out.println("Launching Chrome...");
        driver = new ChromeDriver();
        driver.quit();

        System.out.println("Launching Firefox...");
        driver = new FirefoxDriver();
        driver.quit();

//        System.out.println("Launching Edge...");
//        driver = new EdgeDriver(); 
//        driver.quit();
    }
}

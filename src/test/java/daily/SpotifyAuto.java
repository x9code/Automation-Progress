package daily;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpotifyAuto {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://open.spotify.com/");
		driver.findElement(By.xpath("//input[@data-testid='search-input']")).sendKeys("lana del ray");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Young And Beautiful']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@data-testid='play-button'])[2]")).click();
		Thread.sleep(6000);
		driver.quit();
	}
}

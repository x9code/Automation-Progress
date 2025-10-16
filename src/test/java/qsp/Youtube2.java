package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https:/www.youtube.com");
		Thread.sleep(3000);
		String source = driver.getPageSource();
		System.out.println(source);
		driver.close();
	}
}

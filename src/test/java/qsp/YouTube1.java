package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube1 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(2000);
		driver.close();
	}
}

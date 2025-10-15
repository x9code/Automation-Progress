package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.instagram.com/");
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		String actual = driver.getTitle();
		String exp = "Instagram";
		if(exp.equals(actual)) {
			System.out.println("title is matched");
		}else {
			System.out.println("title is not matched");
		}
		Thread.sleep(3000);
		driver.close();
	}

}

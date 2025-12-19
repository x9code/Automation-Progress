package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompareText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		String expectedPlaceholder = "Email address or phone number";
		String actualPlaceholder = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		if(expectedPlaceholder.equals(actualPlaceholder)) {
			System.out.println("placeholder text matched");
		}else{
			System.out.println("placeholder text not matched");
		}
		driver.quit();
	}

}

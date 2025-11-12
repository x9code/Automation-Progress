package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(3000);
		WebElement multiSelect = driver.findElement(By.id("select-multiple-native"));
		Select s1 = new Select(multiSelect);
		List<WebElement> allopts = s1.getOptions();
		System.out.println("No. of options :"+allopts.size());
		int a=1;
		for (WebElement webElement : allopts) {
			System.out.println(a+" - "+webElement.getText());
			a++;
			Thread.sleep(200);
		}
		driver.quit();
	}
}

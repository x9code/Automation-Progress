package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopUp1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("1234567");
		driver.findElement(By.id("dob")).click();
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
		Select s2 = new Select(year);
		s2.selectByVisibleText("2011");
		driver.findElement(By.linkText("11")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("72767228737");
		driver.quit();
		
	}
}

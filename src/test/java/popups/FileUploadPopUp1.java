package popups;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		
		File f=new File("./src/test/resources/testdata/Deepaknew3.pdf");
		
		String path = f.getAbsolutePath();
		driver.findElement(By.id("resume")).sendKeys( path );
         Thread.sleep(3000);
         driver.quit();
	}

}

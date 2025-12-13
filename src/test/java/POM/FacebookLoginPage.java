package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class FacebookLoginPage {
	
	@FindBy(id="email")
	private WebElement emailField;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

	public FacebookLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);//lazy initialization - only initialized during runtime
    }

	public WebElement getEmailField() {
		return emailField;
	}

	public WebElement getPassword() {
		return password;
	}
}

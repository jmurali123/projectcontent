package pages;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Base {
	//WebDriver driver;
	//WebDriverWait wait;
	
	@FindBy(css=".ico-login")
	WebElement loginlnk;

	@FindBy(css="#Email")
	WebElement userName;
	
	@FindBy(css="#Password")
	WebElement password;

	@FindBy(css=".login-button")
	WebElement loginBtn;
	
//	By loginlnk=By.cssSelector(".ico-login");
//  By loginBtn=By.cssSelector(".login-button");
	
	public void LoadURL(String url) {
		driver.get(url);
	}
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(20));
	}
	
	public void loginNavigation() {
		wait.until(ExpectedConditions.visibilityOf(loginlnk)).click();
		
	}

	public void enterUserName(String usrName) {		
		wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(usrName);
			}
	
	public void enterPassword(String passwd) {		
		wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(passwd);
	}
	
	public void login() {		
		wait.until(ExpectedConditions.visibilityOf(loginBtn)).click();
	}
}

package drivertest;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;
import pages.LoginPage;
import utils.PropertyUtils;

public class SeleniumTest1 {

	public static void main(String[] args) {
		
		Properties p=PropertyUtils.propertyLoader("src/test/resources/Test.properties");
		WebDriver driver=DriverFactory.initializeDriver(p.getProperty("browser"));
	
		LoginPage loginPage=new LoginPage(driver);
		loginPage.LoadURL(p.getProperty("baseUrl"));
		loginPage.loginNavigation();
		loginPage.enterUserName(p.getProperty("username"));
		loginPage.enterPassword(p.getProperty("password"));		
		loginPage.login();
		driver.close();
		
	}

}

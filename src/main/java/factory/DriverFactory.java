package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static WebDriver initializeDriver(String browser) {
		WebDriver driver=null;
		
		switch(browser) {
		case "chrome": 
			WebDriverManager.firefoxdriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		 break;	
		case "firefox":
			WebDriverManager.firefoxdriver().clearDriverCache().setup();
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		 break;
	    default:
	    	throw new IllegalStateException("INVALID BROWSER: "+ browser);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		return driver;
		
	}

}

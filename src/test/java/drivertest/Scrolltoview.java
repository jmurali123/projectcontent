package drivertest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolltoview {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		WebElement ele;
		//try {
			WebDriverManager.chromedriver();
			driver =new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.tutorialspoint.com/index.htm");
			
			 ele=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
			driver.navigate().refresh();
			
			 ele=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
			
	//	}
//		catch(StaleElementReferenceException  ex) {
//			ele=driver.findElement(By.xpath("//*[text()='ABOUT US']"));
//			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",ele);
//			
//		}
	
		
				// "//*[text()='ABOUT US']

				
	}

}

package drivertest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest {
	
 public static void main(String arg[]) throws InterruptedException {
	
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
	 driver.get("https://www.practo.com/bangalore/dentist?utm_source=consumer-home&utm_medium=dweb");
	 String doctorname="Dr. Ganesh Shetty";
	 driver.findElement(By.xpath("//*[text()='"+doctorname+"']/parent::div/parent::a/parent::div/parent::div/parent::div/child::div[2]//button[@data-qa-id='book_button']")).click();
	 driver.findElement(By.xpath("//span[text()='11:00 AM']")).click();
	 
 }
}

package drivertest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriverManager.chromedriver();
     WebDriver driver= new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
     WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
     driver.get("https://demowebshop.tricentis.com/login");
     
     try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ico-login"))).click();
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#Email"))).sendKeys("planittest78@gmail.com");
    WebElement e1=driver.findElement(By.cssSelector("#Password"));
    wait.until(ExpectedConditions.visibilityOf(e1)).sendKeys("123456");
  //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".login-button"))).click();
    FluentWait<WebDriver> wait1=new FluentWait<WebDriver>(driver)
    .withTimeout(Duration.ofSeconds(10))
    .pollingEvery(Duration.ofMillis(200))
    .ignoring(NoSuchElementException.class);
    wait1.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".login-button"))).click();
   //  driver.findElement(By.cssSelector(".ico-login")).click();
     
//     List<WebElement> links=driver.findElements(By.xpath("//a"));
//     for(WebElement ele: links) {
//    	 System.out.println(ele.getAttribute("href"));
//     }
//     
     
     
	}

}

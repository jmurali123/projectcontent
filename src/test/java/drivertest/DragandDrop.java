package drivertest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement source=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='credit2']/a")));
		
		
		WebElement destination=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='bank']/li")));
		
		Actions action= new Actions(driver);
		
		action.dragAndDrop(source, destination).build().perform();
		
		
		
		
	}

}

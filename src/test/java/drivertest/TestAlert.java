package drivertest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver();
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
      driver.findElement(By.cssSelector("#confirmBox")).click();
      Alert a= driver.switchTo().alert();
      String txt=a.getText();
      System.out.println(txt);
      a.accept();
      
	}

}

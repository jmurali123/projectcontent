package drivertest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testwindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		String parent=driver.getWindowHandle();
		System.out.println("Parent window id "+parent);
		driver.findElement(By.cssSelector("#newWindowBtn")).click();
		Set<String>allhandles=driver.getWindowHandles();
		System.out.println("All window id "+allhandles);
		for(String str:allhandles) {
			System.out.println("Windows in the loop "+str);
			if(!str.equalsIgnoreCase(parent)) {
				driver.switchTo().window(str);
				driver.findElement(By.cssSelector("#firstName")).sendKeys("Testfirstname");
				driver.findElement(By.cssSelector("#lastName")).sendKeys("Testsecondname");
				driver.close();
				
			}
		}
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#name")).sendKeys("Parent window");
		driver.quit();
		
		
	}

}

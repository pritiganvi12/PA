package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		 driver.findElement(By.id("prompt")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("priti");
		String information = alert.getText(); //capturing info in alert
		System.out.println(information);
		alert.accept();
	
		
		
	}
}
	

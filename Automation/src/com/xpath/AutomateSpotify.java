package com.xpath;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.Actions;

public class AutomateSpotify {
	 public static void main(String[] args)   {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://accounts.spotify.com/en/login");
		 WebElement emil = driver.findElement(By.id("login-username"));
				 emil.sendKeys("pritiganvir12@gmail.com",Keys.ENTER);
		WebElement pass = driver.findElement(By.id("login-password"));
		pass.sendKeys("Gud@123456",Keys.ENTER);
		driver.findElement(By.xpath("//span[text()='Log In']")).click();
		driver.findElement(By.xpath("//button[@data-testid='web-player-link']")).click();
driver.findElement(By.xpath("//a[@aria-label=\"Search\"]")).click();
driver.findElement(By.xpath("//input[@data-testid='search-input']"));
driver.get("https://open.spotify.com/track/4VsP4Dm8gsibRxB5I2hEkw");

//driver.findElement(By.xpath("//div[@data-testid='action-bar-row']")).click();
driver.findElement(By.xpath("//button[@aria-label='Play'][2]")).click();
//driver.findElement(By.xpath("//div[@data-testid='player-controls']//button[@data-testid='control-button-playpause']")).click();






		
		
		
		
		
		
		
	}

}

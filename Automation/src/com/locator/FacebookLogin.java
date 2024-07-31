package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	public static void main(String[] args) {
		
		// to launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://Facebook.com");
		
		//driver.findElement(By.linkText("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("pritiganvir12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pri@1234");
		
		driver.findElement(By.tagName("button")).click();
		
		
		
	
	}

}

package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCssSelector {
	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch the web application
		driver.get("https://Facebook.com");
		
		//driver.findElement(By.linkText("login")).click();
		
		driver.findElement(By.id("email")).sendKeys("pritiganvir12@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Pri@1234");
		driver.findElement(By.cssSelector("button")).click();
		
		
		
	
	}


	}



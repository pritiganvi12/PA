package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformLogin {
	public static void main(String[] args) {
		
		// to launch the browser
		ChromeDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		
		// to launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("admin02@gmail.com",Keys.TAB,"Admin02",Keys.ENTER);
		
	}

}

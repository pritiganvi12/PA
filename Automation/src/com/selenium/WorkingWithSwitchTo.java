package com.selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSwitchTo {
	public static void main(String[] args) {
		// to launch browser
		WebDriver driver=new ChromeDriver();
		
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		
		// to launch web application
		driver.get("https://www.google.com");
		
		// to switch on active element
		driver.switchTo().activeElement().sendKeys("pasta", Keys.ENTER);
		driver.close();
	}

}

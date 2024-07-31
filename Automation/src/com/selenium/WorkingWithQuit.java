package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuit {
	public static void main(String[] args) {
		// to launch browser
		WebDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://www.omayo.blogspot.com/");
		
		// to click on open a new window
		driver.findElement(By.linkText("open a popup window")).click();
		driver.quit();
	}

}

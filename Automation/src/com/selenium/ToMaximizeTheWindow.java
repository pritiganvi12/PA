package com.selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class ToMaximizeTheWindow {
	public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	
	
	
	
	// to launch web application
	
	driver.get("https://www.zomato.com/");
	
	// to maximize the window
		driver.manage().window().maximize();
		
		
	
	
	}
}

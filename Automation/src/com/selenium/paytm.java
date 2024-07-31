package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 // to maximize the browser 
		driver.manage().window().maximize();
		 
		// to launch web application
		driver.get("https://paytm.com/");
		
		
		// to fetch url
		String actual_url=driver.getCurrentUrl();
		
		// to close the browser
		driver.close();
	

}

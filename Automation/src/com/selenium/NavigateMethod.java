package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Swiggy.com");
		//Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com");
		//Thread.sleep(2000);
		
		
		//to go back
		driver.navigate().back();
		//Thread.sleep(2000);
		
		// to go forward
		driver.navigate().forward();
		
		// to refresh the browser
		driver.navigate().refresh();
		
		
		
		
		
	}

}

package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentMethod {
	public static void main(String[] args) {
		
		
		// to launch browser
		WebDriver driver=new ChromeDriver();
		
		// to maximiza browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://www.airvistara.com/in/en");
		
		// fetch the url
		String actuaLUrl=driver.getCurrentUrl();
		String expectedUrl="https://www.airvistara.com/in/en";
		if (actuaLUrl.equals(expectedUrl)) {
		System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is wrong");
			
		}
		
		
	}

}

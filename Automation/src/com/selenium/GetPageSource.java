package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) throws InterruptedException {
		//to launch browser
		WebDriver driver = new ChromeDriver();
		
		// to launch web application
		driver.get("https://www.google.com/");
		
		String source = driver.getPageSource();
		System.out.println(source);

		 //driver.switchTo().activeElement().sendKeys("poha");
		
		
		

	}

}

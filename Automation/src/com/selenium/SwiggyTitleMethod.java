package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyTitleMethod {
	public static void main(String[] args) {
		// to launch the browser
		
		WebDriver driver=new ChromeDriver();
		  
		// launch web application using get method
		 driver.get("https://www.swiggy.com/");
		 
		 
		 // Actual_Title
		 String actual_title=driver.getTitle();
		 
		 
		 //Expected_Title
		 String expected_title="Swiggy";
				 
				 //Verifying the title 
				 if(actual_title.equals(expected_title)) 
				 {
					 
					 System.out.println("Title is correct");
				 }
				 else
				 {
					 System.out.println("Title is wrong");
					 
		 
				 }
		 
		 
		
	}

}

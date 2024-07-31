package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://Demowebshop.tricentis.com");
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin02");
		driver.findElement(By.id("RememberMe")).click();
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		
		
		
	}

}

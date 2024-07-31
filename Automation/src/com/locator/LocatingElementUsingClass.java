package com.locator;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElementUsingClass {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		
		// to launch the browser
		driver.get("https://demowebshop.tricentis.com/");
		
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("admin02@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Admin02");
		driver.findElement(By.className("login-button")).click();
	}

}

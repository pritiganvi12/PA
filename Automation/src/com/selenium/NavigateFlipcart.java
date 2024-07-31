package com.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateFlipcart
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		String parentWindowId=driver.getWindowHandle();
		
		
		driver.findElement(By.name("q")).sendKeys("iphone 15",Keys.ENTER);
		
		
	
		
		driver.findElement(By.partialLinkText("Apple iPhone 15 (Green, 128 GB)")).click();
		Set<String> allWindowsIds=driver.getWindowHandles();
		allWindowsIds.remove(parentWindowId);
		for(String windowId:allWindowsIds ) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("pincodeId")).sendKeys("411002",Keys.ENTER); 
		}
		
		
		
		
	}


;
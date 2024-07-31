package com.locator;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingSbiBank {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		// to maximize the browser
		driver.manage().window().maximize();
		
		// to launch web application
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		String parentWindowId=driver.getWindowHandle();
		
		
		driver.findElement(By.linkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
		
		Set<String> allWindowIds=driver.getWindowHandles();
		
		allWindowIds.remove(parentWindowId);
		
		for(String windowId:allWindowIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		driver.findElement(By.id("userName")).sendKeys("Priti");
		driver.findElement(By.id("accountNo")).sendKeys("3263980034267");
		driver.findElement(By.id("mobileNo")).sendKeys("7263960072");
		driver.findElement(By.id("datepickers5")).sendKeys("11/07/1999");
		driver.findElement(By.id("go")).click();
	}

}

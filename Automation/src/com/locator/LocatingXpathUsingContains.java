package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingXpathUsingContains {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://demowebshop.tricentis.com/register");
		//driver.findElement(By.xpath("//a[contains(text(), 'Electronics')]")).click();
		
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//img[contains(@alt,'Mobiles')]")).click();
		
	}

}

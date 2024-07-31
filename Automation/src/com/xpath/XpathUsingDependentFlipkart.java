package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependentFlipkart {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.partialLinkText("Mobiles")).click();
		driver.findElement(By.partialLinkText("Electronics")).click();
	
		//driver.findElement(By.partialLinkText()).click();
		//driver.findElement(By.partialLinkText("//a[text()='realme C51 (Mint Green, 64 GB)']/../../..")).click();
				
	}

}

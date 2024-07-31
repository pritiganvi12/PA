package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingPriceUsingXpath {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 15",Keys.ENTER);
		String price=driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Green, 128 GB)']/../..//div[contains(text(),'₹')])"[1])).getText();
		System.out.println(price);
	}

}

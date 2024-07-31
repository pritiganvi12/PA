package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAxes {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Karishma/OneDrive/Desktop/XpathByAxess.html");
		String text=driver.findElement(By.xpath("div[@class='Mammals']/ancestor::div[@class='Mammals']")).getText();
	    System.out.println(text);
	}

}

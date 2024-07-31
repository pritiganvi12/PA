package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingIndex {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	driver.findElement(By.partialLinkText("Cell phones")).click();
	driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).getText();
}
}

package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathUsingDependentAndIndependent {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	   driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		//driver.findElement(By.partialLinkText("Cell phones")).click();
		//driver.findElement(By.xpath("//a[text()='Phone Cover']/../..//input[@value='Add to cart']")).click();
	   
	   driver.findElement(By.partialLinkText("COMPUTERS")).click();
	   driver.findElement(By.partialLinkText("Desktops")).click();
	   driver.findElement(By.xpath("//a[text()='Build your own expensive computer']/../..//input[@value='Add to cart']")).click();
	   		
	}

}

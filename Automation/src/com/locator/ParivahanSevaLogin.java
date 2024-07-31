package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParivahanSevaLogin {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://parivahan.gov.in/");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("")).sendKeys("admin02@gmail.com");
	}

}

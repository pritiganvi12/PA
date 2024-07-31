package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;




public class SecondMockPractice {
	

	public static void main(String[] args) throws IOException  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email_box = driver.findElement(By.id("email"));
		WebElement pass_box = driver.findElement(By.id("pass"));
		Rectangle email = email_box.getRect();
		Rectangle password = pass_box.getRect();
				System.out.println(email.getHeight()+"  "+password.getHeight());
	System.out.println( email.getWidth()+"  "+password.getWidth());
	System.out.println( email.getX()+"  "+password.getX());
	System.out.println( email.getY()+"  "+password.getY());
	System.out.println();
	

	}		
	}
	
	



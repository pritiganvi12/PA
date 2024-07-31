package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockPractice {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords")).sendKeys("iphone 15 plus", Keys.ENTER);
		
	    driver.findElement(By.cssSelector("img[alt='Sponsored Ad - Apple iPhone 15 Plus (128 GB) - Blue']")).click();
	    
	}
}
		
	
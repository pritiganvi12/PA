package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformSwitchingToFramedreame11 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		// to perform frame(int index) method
		//driver.switchTo().frame(0);
		
		WebElement frame=driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("regEmail")).sendKeys("1234567890");
		
	}

}

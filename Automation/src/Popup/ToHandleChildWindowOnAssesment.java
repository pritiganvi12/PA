package Popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleChildWindowOnAssesment {
	 public static void main(String[] args)  {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get("file:///C:/Users/Karishma/Downloads/Assessment1.html");
			driver.findElement(By.xpath("//button[text()=' Click Me !!!']")).click();
		Set<String> allWindowId = driver.getWindowHandles();
		for(String windowId:allWindowId ) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("Burgerking")) {
				break;
			}
		}
		driver.manage().window().maximize();

}
}

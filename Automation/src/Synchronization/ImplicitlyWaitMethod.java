package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitlyWaitMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("wzrk-cancel")).click();
	
		Actions action=new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//div[text()='Home Appliances']"));
		action.moveToElement(ele).perform();
		
		WebElement link = driver.findElement(By.partialLinkText("Robotic Vacuum Cleaners"));
		action.moveToElement(link).click().perform();

}
}

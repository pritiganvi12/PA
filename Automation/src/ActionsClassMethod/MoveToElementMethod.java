package ActionsClassMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		Thread.sleep(5000);
		driver.findElement(By.id("wzrk-cancel")).click();
		
		Actions action=new Actions(driver);
		 WebElement = driver.findElement(By.xpath("//div[text()='Home Appliances']")).click();
		action.moveToElement(ele).per
		
	}

}

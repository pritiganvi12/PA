package WebElementMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyUserInterfaceOfFacebook {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Meesho Logo']"));
		WebElement emailTexBox = driver.findElement(By.id("email"));
		WebElement passwordTexBox = driver.findElement(By.id("passContainer"));
		
		
	}

}

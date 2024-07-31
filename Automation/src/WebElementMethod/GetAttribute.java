package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/login");
	WebElement emailTexBox = driver.findElement(By.id("Email"));
	emailTexBox.sendKeys("AdminO2");
	System.out.println(emailTexBox.getAttribute("value"));
}
}
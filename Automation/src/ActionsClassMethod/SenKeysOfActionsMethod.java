package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SenKeysOfActionsMethod {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement textBox = driver.findElement(By.name("q"));
		Actions action=new Actions(driver);
		//action.sendKeys(textBox,"KGF chapter 1").perform();
		action.moveToElement(textBox).sendKeys("KGF chapter 2.").perform();
		action.keyDown(Keys.ENTER).perform();
		

		
	}
	
}

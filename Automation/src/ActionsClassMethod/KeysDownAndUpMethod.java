package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeysDownAndUpMethod {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement textBox = driver.findElement(By.name("q"));
		Actions action=new Actions(driver);
		
		action.moveToElement(textBox).sendKeys("KGF chapter 2.").perform();
		
		
		action.keyUp(Keys.ENTER).perform();
		//action.keyDown(Keys.ENTER).perform();

		
	}
	

}

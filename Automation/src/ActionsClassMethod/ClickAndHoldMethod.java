package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
		WebElement capitals = driver.findElement(By.id("box2"));
		 WebElement country = driver.findElement(By.id("box101"));
		 Actions action=new Actions(driver);
		 
		 
		// we can hold all 4 way
		 
		 
		// action.clickAndHold(capitals).release(country).perform();
		 //action.moveToElement(capitals).clickAndHold().moveToElement(country).release().perform();
		 //action.clickAndHold(capitals).moveToElement(country).release().perform();
		 action.moveToElement(capitals).clickAndHold().release(country).perform();
		 
	}

}
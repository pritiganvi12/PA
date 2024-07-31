package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethodUsingActions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=testing");
		WebElement plusButton = driver.findElement(By.id("add"));
		Actions action=new Actions(driver);
		action.doubleClick(plusButton).perform();
	//action.moveToElement(plusButton).doubleClick().perform();
		
	}

}

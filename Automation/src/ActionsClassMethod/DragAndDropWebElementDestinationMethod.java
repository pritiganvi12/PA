package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropWebElementDestinationMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action=new Actions(driver);
		for(int i=1;i<=7;i++) {
		WebElement capitals = driver.findElement(By.id("box"+i));
		WebElement country = driver.findElement(By.id("box10"+i));
		
		action.dragAndDrop(capitals, country).perform();
		Thread.sleep(4000);
		}
	}

}

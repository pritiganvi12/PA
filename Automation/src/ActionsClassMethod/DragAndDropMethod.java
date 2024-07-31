package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.paiinternational.in/shop/categories/furniture-2/");
		WebElement slider1 = driver.findElement(By.xpath("//span[contains(@class,'irs-slider from')]"));
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		action.dragAndDropBy(slider1, 60, 0).perform();
		
		
		
		
		//Return so take -30
		Thread.sleep(5000);
		action.dragAndDropBy(slider1, -60, 0).perform();
		
	}

}

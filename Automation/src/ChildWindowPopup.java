import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {
	 public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	Set<String> parentwindowIds = driver.getWindowHandles();
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		driver.findElement(By.partialLinkText("Forgot Username / Login Password")).click();
     Set<String> allwindowIds = driver.getWindowHandles();
     allwindowIds.remove( parentwindowIds);
		for(String windowId:allwindowIds) {
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.id("nextStep")).click();
		WebElement user = driver.findElement(By.id("userName"));
		user.sendKeys("priti@gmail.com", Keys.ENTER);
		WebElement account = driver.findElement(By.id("accountNo"));
		account.sendKeys("12345678", Keys.ENTER);
		}
		
	}



package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConfirmationAlert {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://licindia.in/web/guest/careers");
		driver.findElement(By.partialLinkText("Pay Premium")).click();
		Alert alert = driver.switchTo().alert();
		String information = alert.getText();
		System.out.println(information );
		Thread.sleep(4000);
		alert.accept();
		//alert.dismiss();
		
		
		
		
	}

}

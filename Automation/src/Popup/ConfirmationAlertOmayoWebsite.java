package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationAlertOmayoWebsite {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://omayo.blogspot.com/");
		driver.findElement(By.id("confirm")).click();
		//Actions ac=new Actions(driver);
		//ac.contextClick().perform();
		Alert alert = driver.switchTo().alert();
		String information = alert.getText(); //capturing info in alert
		System.out.println(information);

		Thread.sleep(4000);
		alert.accept();
		


}
}

package Popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AvoidingNotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options=new ChromeOptions();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.easemytrip.com/");
	
	}	
}

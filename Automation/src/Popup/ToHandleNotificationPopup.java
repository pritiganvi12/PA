package Popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleNotificationPopup {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.get("https://www.easemytrip.com/");
       Thread.sleep(3000);
       Robot robot=new  Robot();
       robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       robot.keyPress(KeyEvent.VK_TAB);
       robot.keyRelease(KeyEvent.VK_TAB);
       Thread.sleep(3000);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       
       
	}
}

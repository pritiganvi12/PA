package Synchronization;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;


public class FluentWaitMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//to create object
        FluentWait fl=new  FluentWait(driver);
        
        //to change the polling period
        fl.pollingEvery(Duration.ofMillis(250));
        //ignoring noSuchElement
        fl.ignoring(NoSuchElementException.class);
        fl.withTimeout(Duration.ofSeconds(15));
        fl.until(ExpectedConditions.alertIsPresent());
        
        
        
	}

}

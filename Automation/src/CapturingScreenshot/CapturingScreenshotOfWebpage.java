package CapturingScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebpage {
	public static void main(String[] args) throws IOException {
		
		//System.out.println(time);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.primevideo.com/");
		TakesScreenshot ts=(TakesScreenshot) driver;
		 File screenshot = ts.getScreenshotAs(OutputType.FILE);
		 File dest = new File("C:\\Users\\Karishma\\OneDrive\\Desktop\\image.png");
		 FileHandler.copy(screenshot, dest);
		 
		
	}

}

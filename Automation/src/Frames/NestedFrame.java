package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demoqa.com/nestedframes");
		driver.findElement(By.id("frame1"));
		driver.findElement(By.xpath("//body[text()='Parent frame']"));
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		driver.quit();
	}

}

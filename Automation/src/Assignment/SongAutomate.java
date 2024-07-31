package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SongAutomate {
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com");
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("kahani suno 2.0",Keys.ENTER);
driver.findElement(By.xpath("//div[@id='thumbnail-container']"));


	//driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
	//driver.findElement(By.className("style-scope ytd-video-renderer"));
	
	//driver.switchTo().activeElement().sendKeys("kahani suno song", Keys.ENTER);
	//driver.findElement(By.className("srp")).click();

}
}

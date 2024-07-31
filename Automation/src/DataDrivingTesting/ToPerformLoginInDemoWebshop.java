package DataDrivingTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformLoginInDemoWebshop {
	public static void main(String[] args) throws IOException {
		File f=new File(".\\Test Data\\Demo WebShop.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties pop=new Properties();
		pop.load(fis);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(pop.getProperty("url"));
		driver.findElement(By.partialLinkText("Log in")).click();
		driver.findElement(By.id("Email")).
		sendKeys(pop.getProperty("email"));
		driver.findElement(By.id("Password")).
		sendKeys(pop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();

	}
}

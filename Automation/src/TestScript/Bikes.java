package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bikes {
	@Test
	public void BMW() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw-motorrad.in/en/models/sport/s1000rr.html");
		driver.quit();
	}
	
	@Test
	public void hayabusa() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Suzuki_Hayabusal");
		driver.quit();
	}
	
	@Test(priority=-1, invocationCount=3)
	public void shine() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bajajauto.com/bikes/pulsar");
		driver.quit();
	}
	
	}



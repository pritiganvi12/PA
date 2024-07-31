package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EnabledAtrribute {
	@Test
	public void bmw() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bmw-motorrad.in/en/models/sport/s1000rr.html");
		driver.quit();
	}
	

		@Test
		public void shine() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bikewale.com/honda-bikes/shine/colours/");
			driver.quit();
		}
		
		@Test(enabled = false)
		public void pulsar() {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bajajauto.com/bikes/pulsar");
			driver.quit();
		}

}

package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public  class DependsOnMethodAtrribute {
	@Test
	public void pasta() {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.shutterstock.com/image-photo/bowl-instant-noodles-pasta-delicious-hot-2266679807");
	driver.quit();
	}
	
	@Test(dependsOnMethods = {"pasta", "biryani"})
	public void noodles() {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.shutterstock.com/image-photo/close-delicious-chinese-noodles-served-traditional-2455279231");
		driver.quit();
	}
	
	@Test
	public void biryani () {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.recipetineats.com/biryani/");
		driver.quit();
	}
	
	

}

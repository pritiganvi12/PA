package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgXmlFile1 {
	@Test
	public void amrutarao() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Amrita_Rao#/media/File:Amrita_Rao_Indian_Female_Actor.jpg");
		driver.quit();
	}
	
	
	
	
	
	

}

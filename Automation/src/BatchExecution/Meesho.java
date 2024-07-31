package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
	@Test
	public void meesho() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.meesho.com/");
		driver.quit();
	}
	

}

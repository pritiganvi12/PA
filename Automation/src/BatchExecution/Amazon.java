package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon {
	@Test
	public void amazon() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
	

}

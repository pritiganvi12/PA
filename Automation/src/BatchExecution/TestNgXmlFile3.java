package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgXmlFile3 {
	@Test
	public void saipallavi() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Sai_Pallavi#/media/File:Sai_Pallavi_at_Mca-pre-release-event.jpg");
	}

}

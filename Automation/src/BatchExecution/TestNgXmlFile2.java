package BatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgXmlFile2 {
	@Test
	public void shahidkapoor() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://en.wikipedia.org/wiki/Shahid_Kapoor_filmography#/media/File:Shahid_promotes_'Teri_Meri_Kahaani'_03.jpg");
		driver.quit();
	}

}

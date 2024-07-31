package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeoutMethodAttribute {
	@Test
	public void  redlipstick() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.tirabeauty.com/product/mac-retro-matte-lipstick---ruby-woo-3g-gh-4zsczemib");
	driver.quit();
}
	
	
	@Test
	public void  blacklipstick()  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/RENEE-Madness-lipstick-delivers-enriched/dp/B09RK7SCMD/ref=sr_1_1_sspa");

	driver.quit();
}
	
	@Test(timeOut = 8000)
	public void  greenlipstick() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/Lipstick-LPaige-long-lasting-mosturizing-AloeVera/dp/B0001K55RM");
	driver.quit();
}

}

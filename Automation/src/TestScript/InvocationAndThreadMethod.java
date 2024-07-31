package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationAndThreadMethod {
	
	
	@Test
	public void  lehanga()  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fayonkids.com/products/lehenga-choli-mirror-embroidered-neon-pink");
	driver.quit();
}
	
	
	@Test(invocationCount = 3, threadPoolSize = 2)
	public void saree ()   {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://swtantra.com/products/grandeur-dual-shade-satin-saree?variant=43721916448995");
	driver.quit();
}
	
	@Test
	public void  sharara()  {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.aachho.com/collections/sharara/products/baageecha-shibori-sharara-set");
	
	driver.quit();
}

}

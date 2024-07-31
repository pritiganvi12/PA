package TestScript;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class TestScript001 extends BaseClass {
@Test
public void executeScript() {
	Reporter.log("ExecuteScript1", true);
}
    else if(browserName.equalsIgnoreCase("firefox")) {
	driver=new FirefoxDriver();

}
else if(browserName.equalsIgnoreCase("edge")) {
	 driver = new EdgeDriver();
}
else
{
	Reporter.log("Invalid browser name");
}
driver.manage().window().maximize();
driver.get("https://www.bmw-motorrad.in/en/models/sport/s1000rr.html");
}



	
		
	}


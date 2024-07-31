package WebDriverMethod;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	public static void main(String[] args) {
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to create the object of point class
		
		Point point=new Point(100, 500);
		
		
		// to set the position
		driver.manage().window().setPosition(point);
		
		//launch the application
		driver.get("https://www.google.com");
		
		
	}

}

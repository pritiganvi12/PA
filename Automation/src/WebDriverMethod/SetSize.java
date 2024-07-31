package WebDriverMethod;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	public static void main(String[] args) {
		// launch the browser
		WebDriver driver=new ChromeDriver();
		
		//create the object of dimension class
		 Dimension dimension=new Dimension(100, 20000);
		//set the size
		driver.manage().window().setSize(dimension);
		
		// launch the application 
		driver.get("https://www.google.com");
		
		
	}
	

}

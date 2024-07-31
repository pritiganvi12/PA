package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingAttributesValue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.shaadi.com/");
		//WebElement logo = driver.findElement(By.xpath("//img[@data-testid='shaadi_logo']"));
		//String value = logo.getAttribute("alt");//we can write any attribute here)
		//System.out.println(value);
		driver.get("https://www.purplle.com/");
		WebElement logo = driver.findElement(By.xpath("//img[@alt='Purplle Logo']"));
			String value = logo.getAttribute("loading");
			System.out.println(value);
	}

}

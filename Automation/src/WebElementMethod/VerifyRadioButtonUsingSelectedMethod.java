package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyRadioButtonUsingSelectedMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		WebElement maleradiobutton = driver.findElement(By.id("gender-male"));
		//System.out.println(maleradiobutton.isSelected());
		if (maleradiobutton.isSelected()) {
			System.out.println("It is selected");
		}
		else {
			System.out.println("Now we are selecting");
			maleradiobutton.click();
			
		}
		driver.findElement(By.partialLinkText("Log in")).click();
		WebElement RemembermeCheckBox = driver.findElement(By.id("RememberMe"));
		System.out.println(RemembermeCheckBox.isSelected());
		
		
	}

}

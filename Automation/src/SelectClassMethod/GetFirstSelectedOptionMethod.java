package SelectClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select sl=new Select(dropdown);
		sl.selectByIndex(0);
		sl.selectByIndex(2);
		sl.selectByIndex(4);
		System.out.println(sl.getFirstSelectedOption().getText());
	}

}

package SelectClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingInsingleSelectDropdown {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select select = new Select(yeardropdown);
		System.out.println(select.isMultiple());
		select.selectByIndex(2);
		select.selectByValue("3");
		//select.selectByVisibleText("3");
	}

}

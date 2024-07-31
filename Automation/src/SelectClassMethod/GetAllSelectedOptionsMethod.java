package SelectClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsMethod {
public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select=new Select(dropdown);
		List<WebElement> opt= select.getOptions();
		for(WebElement option:opt) {
			select.selectByValue(option.getAttribute("value"));
		}
		Thread.sleep(2000);
		List<WebElement> selectedOption = select.getAllSelectedOptions();
		for(WebElement selectedOption1:selectedOption) {
			System.out.println(selectedOption1.getText());
		}
		}
}


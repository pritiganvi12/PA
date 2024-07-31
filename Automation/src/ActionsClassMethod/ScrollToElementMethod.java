package ActionsClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		Actions action=new Actions(driver);
		WebElement resumeWritingLink = driver.findElement(By.xpath("//span[text()='Resume writing"));
		action.scrollToElement(resumeWritingLink).perform();
		
	}
}

package TestScript;

import org.openqa.selenium.support.PageFactory;

import ElementRepository.BasePage;
import GenericUtility.BaseClass;

public class TC001 extends  BaseClass{
	public static void main(String[] args) {
		openBrowser();
	driver.get("https://demowebshop.tricentis.com/");
	BasePage bp=new BasePage(driver);
	
	PageFactory.initElements(driver, bp);
	bp.getRegisterLink().click();
	
	}

}

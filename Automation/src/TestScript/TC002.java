package TestScript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC002 {//testcase
	
	public void executeScript1() {
	Reporter.log("Execute test case 1", true);
	}
		
		
		
		@Test(priority=-5)//It will execute -ve to +ve so firest execute 2testcase)(lower priority value to hiegher)(pritority same create alphabet order)(pritoity helper attribute)
		public void executeScript2() {
			Reporter.log("Excecute test case 2", true);
     //System.out.println("hello");//test step
	}
}

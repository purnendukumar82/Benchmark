package Script;

import org.junit.Test;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Demo{
		
	@Test
	public void testA()
	{
		Reporter.log("Run testA",true);
	}
	
	@Test
	public void testB()
	{
		Reporter.log("Run testB",true);
	}
	
}
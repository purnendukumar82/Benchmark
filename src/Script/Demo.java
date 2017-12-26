package Script;

import org.junit.Test;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Demo{
	@BeforeMethod
	public void openTest()
	{
		Reporter.log("Open test",true);
	}
	
	
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
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		String name=res.getName();
		int status=res.getStatus();
		Reporter.log("close test:"+name+"status:"+status,true);
	}


}
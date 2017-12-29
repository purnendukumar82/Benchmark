package Script;

import org.testng.annotations.Test;

import Generic.BaseTest1;
import Generic.XL;
import Page.EnterTimeTrackPage;
import Page.LoginPage;

public class ValidLogin extends BaseTest1{
	@Test(priority=1,groups= {"Login"})
	public void testValidLogin() throws InterruptedException
	{
		String un=XL.getCellValue(XL_PATH,"ValidLogin",1,0);
		String pw=XL.getCellValue(XL_PATH, "ValidLogin", 1, 1);
		String eTitle=XL.getCellValue(XL_PATH, "ValidLogin", 1, 2);
		
		//Enter valid login
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		//Enter valid password
		l.setPassword(pw);
		// click on login button
		l.clickLogin();
		//verify the page is displayed or not
	   EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	   Thread.sleep(4000);
	   e.verifyTitlePage(driver, eTitle);
	  
			   
	}

}

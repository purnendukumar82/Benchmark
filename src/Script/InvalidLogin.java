package Script;

import org.testng.annotations.Test;

import Generic.BaseTest1;
import Generic.XL;
import Page.LoginPage;

public class InvalidLogin extends BaseTest1 {
	@Test(priority=2,groups= {"Login"})
	public void testInvalidLogin()
	{   
		int rc=XL.getRowCount(XL_PATH,"InValidLogin");
	    for(int i=1; i<rc; i++)
	    {
		String un=XL.getCellValue(XL_PATH,"InValidLogin", i, 0);
		String pw=XL.getCellValue(XL_PATH,"InValidLogin", i, 1);
	    	
		
		/*
		String un=XL.getCellValue(XL_PATH,"InValidLogin",1,0);
		String pw=XL.getCellValue(XL_PATH,"InvalidInput", 1, 1);
		String errmsg=XL.getCellValue(XL_PATH,"InvalidInput", 1, 3);
		*/
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		l.verifyErrMsgIsDisplayed(driver);
	    }
	}

}

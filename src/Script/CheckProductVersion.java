package Script;

import org.testng.annotations.Test;

import Generic.BaseTest1;
import Generic.XL;
import Page.EnterTimeTrackPage;
import Page.LoginPage;

public class CheckProductVersion extends BaseTest1{
	@Test(priority=3,groups= {"Version"})
	public void testCheckProductVersion()
	{
		String un=XL.getCellValue(XL_PATH, "CheckProductVersion", 1, 0);
		String pw=XL.getCellValue(XL_PATH, "CheckProductVersion", 1, 1);
		String eVersion=XL.getCellValue(XL_PATH, "CheckProductVersion", 1, 2);
		
		LoginPage l=new LoginPage(driver);
		l.setUserName(un);
		l.setPassword(pw);
		l.clickLogin();
		
		EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
		e.clikHelp();
		e.aboutActiTIME();
		e.verifyVersion(eVersion);
		e.clickCloseBTN();
		e.clickLogout();
	}

}

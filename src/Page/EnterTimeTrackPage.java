package Page;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	
	@FindBy(xpath="(//div[contains(text(),'Help')])[1]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTIME;
	
	@FindBy(xpath="//span[starts-with(.,'actiTIME')]")
	private WebElement version;
	
	@FindBy(id="aboutPopupCloseButtonId")
	private WebElement closeBTN;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitlepage(WebDriver driver, String eTitle)
	{ 
		WebDriverWait wait=new WebDriverWait(driver,10);
		try {
		wait.until(ExpectedConditions.titleContains(eTitle));
		Reporter.log("Pass: title is verified");
		}
		catch(Exception e)
		{
			Reporter.log("Fail: title is not verified");
			Assert.fail();
		}
		
	}
	
	
	public void clikHelp()
	{
		help.click();
	}
	
	public void aboutActiTIME()
	{
		aboutActiTIME.click();
	}
	
	public void verifyVersion(String eVersion)
	{
		String aVersion = version.getText();
		Assert.assertEquals(aVersion, eVersion);
	}
	
	public void clickCloseBTN()
	{
		closeBTN.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}

}

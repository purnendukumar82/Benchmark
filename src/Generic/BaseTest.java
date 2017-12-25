package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	@BeforeMethod
	public void openApp()
	{
	    driver=new ChromeDriver();
		driver.get("http://www.google.co.in/");
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}

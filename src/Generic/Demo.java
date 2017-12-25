package Generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	    SearchContext s;
	    TakesScreenshot t;
	    JavascriptExecutor j;
	    driver.get("http://www.seleniumhq.org/");
	    driver.manage().window().maximize();
	    Thread.sleep(5000);
	    driver.navigate().to("https://www.irctc.co.in/eticketing/loginHome.jsf");
	    Thread.sleep(10000);
        driver.navigate().back();
	    Thread.sleep(10000);
	    driver.navigate().forward();
	    Thread.sleep(5000);
        driver.navigate().refresh();
	    Thread.sleep(5000);

	   driver.close();
	}

}

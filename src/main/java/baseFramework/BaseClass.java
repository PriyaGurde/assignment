package baseFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.CommonUtils;

public class BaseClass
{
	
	public static WebDriver driver;
	
	 @BeforeClass	 
	public void setuoApplication() 
		{
		
		System.setProperty("webdriver.chrome.driver","E:\\drivers\\New folder\\New folder\\New folder\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(CommonUtils.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(CommonUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		}
	 
	 @AfterClass
	 public void closeApplication()
	 {
		 driver.quit();
	 }
}
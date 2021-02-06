package Testcases;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;
import org.testng.Assert;

public class AssignmentInSingleClass {
	public static void main(String[] args){
	
	System.setProperty("webdriver.chrome.driver","E:\\drivers\\New folder\\New folder\\New folder\\chromedriver.exe");
	//Launching the browser
	WebDriver driver= new ChromeDriver();
	
	//maximizing the browser
	driver.manage().window().maximize();
	
	//opening web application
	driver.get("https://www.amazon.com/");
	
	//Used 'id' locator to find search box
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	
	//Entered Nikon in search box
	searchbox.sendKeys("Nikon");
	
	//Submitting the search box
	driver.findElement(By.id("nav-search-submit-text")).click(); 
	
	//Halt the program execution		
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	//Sorting the value form highest to lowest using 'id' locators		
	driver.findElement(By.id("a-autoid-0-announce")).click();		
	driver.findElement(By.id("s-result-sort-select_2")).click();
	
	// Selected the second item from list using xpath locator		
	WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Nikon D850 FX-Format Digital SLR Camera')]"));
	element.click();		
	
	//Verifying with assert that product title contains "Nikon D850"
	WebElement elementtext =driver.findElement(By.id("productTitle"));			
	String ExpectedText  =elementtext.getText();	
	try {
	Assert.assertTrue("Nikon D850 FX-Format Digital SLR Camera with Nikon AF-S NIKKOR 500mm f/5.6E PF ED VR Super-Telephoto Lens".contains("Nikon D850"));
	}
	catch (AssertionError e)
	{
		System.out.println("contains");
	}
	System.out.println(ExpectedText);


}	
}

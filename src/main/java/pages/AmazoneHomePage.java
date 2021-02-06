package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import baseFramework.BaseClass;

public class AmazoneHomePage extends BaseClass {
	
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchBox;
	
	@FindBy(id="nav-search-submit-text")
	WebElement Submit;
	
	
	public void EnterNikoninSerchBox(String nikon) {
		SearchBox.sendKeys("nikon");
	} 
	
	public void ClickHit() {
		Submit.click();
	}
}

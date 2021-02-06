package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AmazoneResultSerachPage {
	
	@FindBy(id="\"a-autoid-0-announce\"")
	WebElement Sort;
	
	@FindBy(id="\"s-result-sort-select_2\"")
	WebElement HighToLow;
	
	@FindBy(xpath="//span[contains(text(),'Nikon D850 FX-Format Digital SLR Camera')]")
	WebElement SelectSecondProductFromList;
	
	@FindBy(id="productTitle")
	WebElement VerifyText;
	
	public void Sort() {
		Sort.click();
	}
		
	public void HighToLow(){
		HighToLow.click();
	}
	
	
	public void SelectingProduct() {
		SelectSecondProductFromList.click();
	}
	
	public void VerifyText() {
		Assert.assertTrue("Nikon D850 FX-Format Digital SLR Camera with Nikon AF-S NIKKOR 500mm f/5.6E PF ED VR Super-Telephoto Lens".contains("Nikon D850"));
	}
	
}

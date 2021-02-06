package Testcases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import baseFramework.BaseClass;


public class AssighnmentUsingTestNG extends BaseClass{
	
	@Test(description="This testcase will enter Nikon in serch Textbox", priority=0)
	public void EnterNikon() 
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nikon");
		driver.findElement(By.id("nav-search-submit-text")).click(); 			
	}
	
	@Test(description="This testcase is to sort price form higest to lowest",priority=1)
	public void Sort()
	{
		driver.findElement(By.id("a-autoid-0-announce")).click();
		driver.findElement(By.id("s-result-sort-select_2")).click();			
	}		
	
	@Test(description="This testcase is to select second product to see the details", priority=2)
	public void SelectSecondProduct() 
	{
		
		WebElement element= driver.findElement(By.xpath("//span[contains(text(),'Nikon D850 FX-Format Digital SLR Camera')]"));
		element.click();		
	}		
	
	@Test(description="This testcase is to verify the text 'Nikon D850'exists in product topic",priority=3)
	public void VerifyText()
	{		
		driver.findElement(By.id("productTitle"));	
		//String ExpectedText  =elementtext.getText();		
		Assert.assertTrue("Nikon D850 FX-Format Digital SLR Camera with Nikon AF-S NIKKOR 500mm f/5.6E PF ED VR Super-Telephoto Lens".contains("Nikon D850"));
		//System.out.println(ExpectedText);
	}		
	

	
	
	
	

}

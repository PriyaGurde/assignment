package stepDefination;

//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import pages.AmazoneHomePage;
import pages.AmazoneResultSerachPage;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	public WebDriver driver;
	
	AmazoneHomePage Amazone = new AmazoneHomePage();
	AmazoneResultSerachPage SerchPageResult = new AmazoneResultSerachPage ();
	
	 @Given("^User is on \"([^\"]*)\" home page$")
	    public void user_is_on_something_home_page(String url) {
		 System.setProperty("webdriver.chrome.driver","E:\\drivers\\New folder\\New folder\\New folder\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
			    
	    }

    @When("^User enters Nikon in serach text box$")
    public void user_enters_nikon_in_serach_text_box(String nikon)  {
    	
    	Amazone.EnterNikoninSerchBox(nikon);
    	Amazone.ClickHit();
        
    }

    @When("^User hits enter button from keybord$")
    public void user_hits_enter_button_from_keybord() {
        Amazone.ClickHit();
    }
    

    @When("^User Sort result from High to low$")
    public void user_sort_result_from_high_to_low() {
    	SerchPageResult.Sort();
    }

    @Then("^User is on search result page and user selects the second product$")
    public void user_is_on_search_result_page_and_user_selects_the_second_product()  {
    	SerchPageResult.HighToLow();
    }

    @Then("^User should see selected product details$")
    public void user_should_see_selected_product_details() {
    	SerchPageResult.SelectingProduct();
    }

    @And("^User should see Nikon product list in search list page$")
    public void user_verify_the_text_present_in_title_of_product() {
    	SerchPageResult.VerifyText();
    
       
    }

}
package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;


 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "C:\\Users\\Balaji\\eclipse-workspace\\SeleniumSctipts\\src\\main\\java\\Features\\Serach.feature"
 ,glue={"stepDefination"}
 )


public class TestRunner {
	

}

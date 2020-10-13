package Trip.ClearTripDemo;


import org.testng.annotations.BeforeClass;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
features = "FeatureFile/TicketBook.feature",
glue = {"com.automation.StepDef","com.automation.Pages","com.automation.Base"},
//dryRun=true,
monochrome = true,
tags = {},
plugin = { "pretty", "json:target/cucumber.json", "html:target/cucumber-reports" })

public class TestRunner extends AbstractTestNGCucumberTests {
	 @BeforeClass
	    public static void setUpSuite() {
	        System.setProperty("jagacy.properties.dir", "FeatureFile");
	        System.setProperty("test.window", "true");
	    }
	    
	   
	
}

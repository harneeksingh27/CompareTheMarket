package ctm.TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/Features/ourSupplier.feature","src/Features/yourEnergy.feature","src/Features/YourDetails.feature"}
		,glue={"src/ctm.stepDefinition/"}
		,plugin = "html:target/selenium-reports"
		,format = {"pretty"}, monochrome=true
		)
public class TestRunner {

	
}

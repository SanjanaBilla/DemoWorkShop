package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Administrator/eclipse-workspace/DemoWorkshop/src/main/java/Feature/bookshop.feature"
		,glue= {"stepDefinition"},
		plugin= {"pretty", "html:test-output"},
		dryRun=false
		
		)
public class TestRunnerDemoShop {

}

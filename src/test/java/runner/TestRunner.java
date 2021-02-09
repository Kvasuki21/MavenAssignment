package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login//Login.feature"},
glue="stepDefinition",
monochrome=true,
dryRun=false,
strict=true,
plugin={"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/jsoncucumber.jsom"}
)
public class TestRunner {
	
}
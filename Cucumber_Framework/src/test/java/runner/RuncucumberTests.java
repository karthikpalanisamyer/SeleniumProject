package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = {"src/test/java/features"},
		glue = {"stepdef","hooks"},
		monochrome = true,
		tags = "@smoke"

)
public class RuncucumberTests extends AbstractTestNGCucumberTests {
	
	
	
}
package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "@Regression",
		glue = "steps"
		
		
		)


public class testRunner extends AbstractTestNGCucumberTests {
	
	

}

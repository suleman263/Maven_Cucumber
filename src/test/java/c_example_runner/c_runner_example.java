package c_example_runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Feauture_parameter",
		glue={"c_example_stepdef"}
				)
public class c_runner_example {
	
}

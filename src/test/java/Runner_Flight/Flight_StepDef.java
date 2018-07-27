package Runner_Flight;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Feature_DemoFlight",glue={"Flight_Step_Def"},plugin={"pretty", "html:target/cucumber-reports"},monochrome=true
				)
public class Flight_StepDef {

}

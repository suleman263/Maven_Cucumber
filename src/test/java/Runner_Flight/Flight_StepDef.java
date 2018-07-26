package Runner_Flight;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "Feature_DemoFlight",glue={"Flight_Step_Def"}
				)
public class Flight_StepDef {

}

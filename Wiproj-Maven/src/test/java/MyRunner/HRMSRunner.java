package MyRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src//test//java//feature//OrangeHRMLogin.feature",
	glue="stepDef",
	plugin={"pretty","html:target/GoogleSearch_Reports"},
	monochrome=true
)

public class HRMSRunner {

}

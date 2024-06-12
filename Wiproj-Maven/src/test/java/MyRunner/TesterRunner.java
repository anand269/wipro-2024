package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features="src//test//java//feature//tester.feature",
	glue="stepDef",
	plugin={"pretty","html:target/HTML_Reports"},
	monochrome=true
)

public class TesterRunner {
	


}

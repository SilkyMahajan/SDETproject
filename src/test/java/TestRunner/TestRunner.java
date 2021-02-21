package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/java/feature/OlaCorp.feature",
glue={"stepdefination", "Utilities"},
dryRun=false,
monochrome=true,
plugin={"pretty", "html:target/Cucumber-pretty"}
//plugin={"pretty", "json:target/Cucumber.json"}
)

public class TestRunner {
	
}

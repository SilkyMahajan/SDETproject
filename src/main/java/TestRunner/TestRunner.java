package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/main/java/feature/OlaCorp.feature", dryRun=false
, monochrome=true,
//tags={"@smoke", "@regression"} , // And condition
//tags={"@smoke, @regression"} , // OR condition
tags= {"~@email"},//Skip condition
plugin={"pretty", "html:target/Cucumber-pretty"},
glue={"stepdefination", "Utilities"}
//plugin={"pretty", "json:target/Cucumber.json"}
)

public class TestRunner {
	
}

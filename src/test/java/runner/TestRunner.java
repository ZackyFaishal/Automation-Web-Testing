package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        publish=true,
        features = "src/test/java/features",
        glue = {"StepDefinitions","utility"},
        plugin = {"pretty", "html:target/cucumber-html-reports.html","json:cucumber-json"}
)

public class TestRunner {

}
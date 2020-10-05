package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features/login.feature",

        glue = {"stepDefinitions"},
        format = {"pretty", "html:test-outout", "json:src/main/java/reports/json_output/cucumber.json", "junit:src/main/java/reports/junit_xml/cucumber.xml"},
        monochrome = true,
        strict = true,
        dryRun = true
)
public class TestCase {
}

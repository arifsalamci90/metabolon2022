package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports", "json:target/cukesreport.json"},
        features = "src/test/resources/features/",
        glue = "step_definitions",
        dryRun = false,
        tags = "@login"
)

public class CukesRunner {


}

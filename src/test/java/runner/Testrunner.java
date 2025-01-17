package runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = "com.stepDefinitions", plugin = {"pretty"},
        tags = "@Regression",monochrome=true)
//plugin = "json:target/cucumber-reports/CucumberTestReport.json")

public class Testrunner  {
}

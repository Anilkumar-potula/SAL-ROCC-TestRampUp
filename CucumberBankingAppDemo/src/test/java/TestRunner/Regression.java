package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"}, glue ={"StepDefinitions"},
        monochrome=true, dryRun = false,
        plugin={"pretty","html:target/HtmlReports/RegressionResults.html",
                "junit:target/JunitReports/RegressionResults.xml",
                "json:target/JsonReports/RegressionResults.json"
        },
        tags = "@Regression"




)
class Regression {

}

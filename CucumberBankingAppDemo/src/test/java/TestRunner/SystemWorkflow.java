package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/Features"}, glue ={"StepDefinitions"},
        monochrome=true, dryRun = false,
        plugin={"pretty","html:target/HtmlReports/SystemWorkflows.html",
                "junit:target/JunitReports/SystemWorkflows.xml",
                "json:target/JsonReports/SystemWorkflows.json"
        },
        tags = "@SystemWorkflow"




)
class SystemWorkflow {

}

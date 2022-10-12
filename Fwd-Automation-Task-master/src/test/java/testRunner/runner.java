package testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions
        (
                features = "D:\\Automation\\E-commerceAppAutomationTesting\\src\\main\\resources\\features",
                glue={"stepDefinition"},
                plugin = { "pretty",
                        "html:target/cucumber.html",
                        "json:target/cucumber.json",
                        "junit:target/cucumber.cukes.xml",
                        "rerun:target/cucumber.rerun.txt"

                },
                tags= "@smoke"
        )
public class runner extends AbstractTestNGCucumberTests {
}

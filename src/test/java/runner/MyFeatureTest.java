package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefinitions"},

        plugin = {"html:target/cucumber/cucumber.html","pretty"}

)
public class MyFeatureTest {

}

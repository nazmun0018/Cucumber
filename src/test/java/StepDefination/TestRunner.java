package StepDefination;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/Nazmun0018/IdeaProjects/Cucumber/src/test/java/FeatureFiles/Login.feature",
        glue={"StepDefination"},plugin = {"pretty", "html:target/cucumber-reports.html"}
)

public class TestRunner {

}

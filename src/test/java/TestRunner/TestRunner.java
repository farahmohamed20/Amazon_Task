package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"D:\\VoisTask\\Task1\\FeaturesFiles"},
        glue = "StepDefinitions")
public class TestRunner {


}

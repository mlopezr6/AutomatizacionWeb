package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features/cucumber3.feature", glue = { "com.cucumber3" })
public class Runner3 extends AbstractTestNGCucumberTests {

}

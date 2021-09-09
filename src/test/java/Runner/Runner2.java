package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features/cucumber2.feature", glue = { "com.cucumber2" })
public class Runner2 extends AbstractTestNGCucumberTests {

}

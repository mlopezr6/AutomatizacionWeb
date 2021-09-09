package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/Features/cucumber.feature", glue =  "com.cucumber1" )
public class Runner extends AbstractTestNGCucumberTests {

}

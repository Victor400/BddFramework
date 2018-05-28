package BddFramework1.BddFramework1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty", "html:target/report.html/"},
    features = { "src/main/java/cucumberfeatures/"})
	
public class RunnerClass {
	
	 

}

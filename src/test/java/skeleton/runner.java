package skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/feature7.feature",
				glue="stepdefinition",
				//tags={"~@select"},
				plugin={"html:target/htmlreport",
						"json:target/jsonreport.json",
						"junit:target/xmlreport.xml"
				})

//AbstractTestNGCucumberTests
public class runner extends AbstractTestNGCucumberTests   {

}

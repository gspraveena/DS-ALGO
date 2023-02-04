package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@RunWith(Cucumber.class)
	@CucumberOptions(

			features = "src/test/resources/features/mainPage.feature",
			glue =  { "StepDefinition", "hooks" },
			plugin = {
					  "pretty",
//					"html:target/cucumber-reports/mainPage.html",
					 },
			dryRun=false,
			monochrome = true
			 
	)

	public class testRunner extends  AbstractTestNGCucumberTests{

		//@Override
		@DataProvider(parallel=false)
		public Object[][] scenarios(){
		return  super.scenarios();
		}
		}



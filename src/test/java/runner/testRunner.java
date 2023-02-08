package runner;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	@RunWith(Cucumber.class)
	@CucumberOptions(

			//features = "src/test/resources/features/mainPage.feature",
			//features = "src/test/resources/features/registerPage.feature",
			features = "src/test/resources/features/collections.feature",
			//features = "src/test/resources/features/dataStructure.feature",
			//features = "src/test/resources/features/array.feature",
			glue =  { "StepDefinition", "hooks" },
			plugin = { "pretty",
//					  "html:target/cucumber-reports/mainPage.html",
					 },
			dryRun=false,
			monochrome = true			 
	)

	public class testRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = true)
		public Object[][] scenarios() {
			return super.scenarios();
	
		}

		}

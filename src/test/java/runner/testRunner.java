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
			//features ="src/test/resources/features/signIn.feature",
			//features = "src/test/resources/features/collections.feature",
			//features = "src/test/resources/features/dataStructure.feature",
			//features = "src/test/resources/features/array.feature",
			//features = "src/test/resources/features/linkedList.feature",
			//features = "src/test/resources/features/stack.feature",
			//features = "src/test/resources/features/queue.feature",
			//features = "src/test/resources/features/graph.feature",
			//features = "src/test/resources/features/tree.feature",
		    features = {
					    //"src/test/resources/features/mainPage.feature",
					    "src/test/resources/features/signIn.feature",
					    "src/test/resources/features/dataStructure.feature",
//				    	"src/test/resources/features/collections.feature",
					    "src/test/resources/features/array.feature",
					    "src/test/resources/features/linkedList.feature",
					    "src/test/resources/features/stack.feature",
					    "src/test/resources/features/queue.feature",					    
					    "src/test/resources/features/tree.feature",
					    "src/test/resources/features/graph.feature"}, 
		   //tags=  "@homepage,@signIn,@dataStructure,@array ,@graph",
			glue =  { "StepDefinition", "hooks" },
			plugin = { "pretty",
            // "html:target/cucumber-reports/mainPage.html",
					 },
			dryRun=false,
			monochrome = true			 
	)

	public class testRunner extends AbstractTestNGCucumberTests {
		@Override
		@DataProvider(parallel = false)
		public Object[][] scenarios() {
			return super.scenarios();
	
		}

		}

package StepDefinition;
import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Code;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CollectionsPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.Loggerload;
import utilities.readExcel;

public class Collections_step {
	
	//WebDriver driver=new FirefoxDriver();
	CollectionsPage collection=new CollectionsPage();
	String Excelpath = ConfigReader.getexcelfilepath();
	static String expectedMesg;
	//******************************  Login  ***************************************
	@Given("user launches login page")
	public void user_launches_login_page() throws IOException {
		Loggerload.info("User launches login page ");
		collection.LoginPage();
	}

	@When("user login using username and password from given {string} and {int}")
	public void user_login_using_username_and_password_from_given_and(String sheetName, Integer rowNumber) throws IOException, InvalidFormatException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		Loggerload.info("User enter login credentials ");
		List<Map<String, String>> testData=reader.getData("C:/Users/Reka/Desktop/NumpyNinja/DS ALGO/LoginDsAlgo.xlsx", 0);
		String User_name=testData.get(rowNumber).get("username");  // heading 
		String Pass_word=testData.get(rowNumber).get("password");  // heading 
		collection.loginWithCredentials(User_name, Pass_word);
		Loggerload.info("User redirected to login page ");
		String Title = collection.login_page();
		Loggerload.info("Title of current page is : " + Title);
		
//		assertEquals(Title, "Login", "Title do not match");
//		String expectedmessage = dataTable.get(rowNumber).get("email");
//		String actualSuccMessg = contactUsPage.getSuccessMessg();
//		Assert.assertEquals(actualSuccMessg, expSuccessMessage);
		}
	
	//******************************  Data Structure  ***************************************
	@Given("user launch datastructure page")
	public void user_launch_datastructure_page() throws IOException 
	{		
		collection.dataStructure();
	}
	
	@When("click on timecomplexity ,tryHere and tryEditor assessment page is open")
	public void click_on_timecomplexity_try_here_and_try_editor_assessment_page_is_open()
	{	
		collection.TryHere();
	}
	
	@Then("user enters code from {int} and {int} then click run , code is printed")
	public void user_enters_code_from_and_then_click_run_code_is_printed(Integer sheetNumber,Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException
	{	
		collection.enterPythonCode(sheetNumber, rowNumber);
		expectedMesg=collection.getExpectedResult(sheetNumber, rowNumber);
	}
	
//	@Then("user enters <code> and click run , code is printed")
//	public void user_enters_code_and_click_run_code_is_printed(DataTable Code)
//	{	
//		List<List<String>>data=Code.cells();
//		signIn.enterCode(data.get(0).get(0));
//	}
	
	@Then("user navigate to homepage")
	public void user_navigate_to_homepage() throws IOException 
	{
		collection.backToHome();
	} 
	
	//******************************  Array  ***************************************


	@Given("user login with username {string} and password {string}")
	public void user_login_with_username_and_password(String username, String password) throws IOException, InterruptedException {
		collection.LoginPage();
		collection.loginWithCredentials(username, password);
	}

	@Given("user clicks {string}  in Array field")
	public void user_clicks_in_array_field(String string) throws IOException {
		
		collection.clickArray();
	}
	@When("user click {string}")
	public void user_click(String string) {
		collection.clickArrayInPython();
	}
	@Then("user clicks {string}")
	public void user_clicks(String string) {
		collection.clicktryHere();
	}
	@Then("user enters code in tryEditor from {string} and {int}  then click run , output is printed")
	public void user_enters_code_in_try_editor_from_sheet_number_and_then_click_run_output_is_printed(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		collection.enterPythonCode(sheetName, rowNumber);
		expectedMesg=collection.getExpectedResult(sheetName, rowNumber);
	}

	

}

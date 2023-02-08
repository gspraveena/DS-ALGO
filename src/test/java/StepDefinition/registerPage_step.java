package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.registerPage;
import utilities.ConfigReader;
import utilities.Loggerload;
import pages.mainPage;

public class registerPage_step {

	//WebDriver driver = new ChromeDriver();

	//String url = "https://dsportalapp.herokuapp.com/register";

	registerPage rp=new registerPage();

	@Given("user open the register page")
	public void user_open_the_register_page() throws IOException {
		rp.getRegisterPage();
		Loggerload.info("user get into the Register page"); 
	}

	
	@When("The user clicks Register button after entering {string}, {string} and {string}")
	public void the_user_clicks_button_after_entering_and(String username,String password,String confirm_password) throws InterruptedException {
		rp.register_link(username, password, confirm_password);	
		Loggerload.info("user   successfully   Registered"); 
		
	}		

//	@Then("User get message {string}")
//	public void user_get_message(String string) 
//	{
//		rp.getErrorMsg();
//	}

	@Then("It should go to homepage and get message  {string}")
	public void it_should_go_to_homepage_and_get_message(String string)
	{
		Loggerload.info("User redirected to login page ");
		String Title = rp.register_page();
		Loggerload.info("Title of current page is : " + Title);
//		assertEquals(Title, "Login", "Title do not match");
		rp.getRegisterAlert();
		rp.getSignIn();
	}
}
